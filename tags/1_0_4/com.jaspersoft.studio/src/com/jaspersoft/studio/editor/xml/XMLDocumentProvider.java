/*
 * JasperReports - Free Java Reporting Library. Copyright (C) 2001 - 2009 Jaspersoft Corporation. All rights reserved.
 * http://www.jaspersoft.com
 * 
 * Unless you have purchased a commercial license agreement from Jaspersoft, the following license terms apply:
 * 
 * This program is part of JasperReports.
 * 
 * JasperReports is free software: you can redistribute it and/or modify it under the terms of the GNU Lesser General
 * Public License as published by the Free Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * JasperReports is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied
 * warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU Lesser General Public License along with JasperReports. If not, see
 * <http://www.gnu.org/licenses/>.
 */
package com.jaspersoft.studio.editor.xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnmappableCharacterException;
import java.nio.charset.UnsupportedCharsetException;

import net.sf.jasperreports.engine.JRException;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IDocumentPartitioner;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.editors.text.EditorsUI;
import org.eclipse.ui.editors.text.FileDocumentProvider;
import org.eclipse.ui.ide.FileStoreEditorInput;

import com.jaspersoft.studio.compatibility.JRXmlWriterHelper;
import com.jaspersoft.studio.editor.JrxmlEditor;
import com.jaspersoft.studio.editor.xml.scanners.XMLPartitionScanner;

/*
 * /* The Class XMLDocumentProvider.
 */
public class XMLDocumentProvider extends FileDocumentProvider {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.editors.text.StorageDocumentProvider#createDocument(java.lang.Object)
	 */
	@Override
	protected IDocument createDocument(Object element) throws CoreException {
		IDocument document = super.createDocument(element);
		if (document != null)
    {
			IDocumentPartitioner partitioner = new XMLPartitioner(new XMLPartitionScanner(), new String[]
        {
                XMLPartitionScanner.XML_START_TAG,
                XMLPartitionScanner.XML_PI,
                XMLPartitionScanner.XML_DOCTYPE,
                XMLPartitionScanner.XML_END_TAG,
                XMLPartitionScanner.XML_TEXT,
                XMLPartitionScanner.XML_CDATA,
                XMLPartitionScanner.XML_COMMENT
        });
        partitioner.connect(document);
        document.setDocumentPartitioner(partitioner);
    }
		return document;
	}

	/**
	 * Initializes the given document from the given editor input using the given character encoding.
	 * 
	 * @param document
	 *          the document to be initialized
	 * @param editorInput
	 *          the input from which to derive the content of the document
	 * @param encoding
	 *          the character encoding used to read the editor input
	 * @return if the document content could be set, otherwise
	 * @throws CoreException
	 *           if the given editor input cannot be accessed
	 * @since 2.0
	 */
	@Override
	protected boolean setDocumentContent(IDocument document, IEditorInput editorInput, String encoding)
			throws CoreException {
		InputStream stream = null;
		try {
			if (editorInput instanceof IFileEditorInput) {
				String fileExtention = JrxmlEditor.getFileExtension(editorInput);
				if (fileExtention.equals("jasper")) { //$NON-NLS-1$
					IFile file = ((IFileEditorInput) editorInput).getFile();
					stream = file.getContents(false);
					setDocumentContent(document,
							JrxmlEditor.getXML(editorInput, encoding, stream, JRXmlWriterHelper.LAST_VERSION), encoding);
				} else
					return super.setDocumentContent(document, editorInput, encoding);
			}
		} catch (JRException e) {
			e.printStackTrace();
		} finally {
			try {
				if (stream != null)
					stream.close();
			} catch (IOException x) {
				x.printStackTrace();
			}
		}
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.ui.editors.text.FileDocumentProvider#doSaveDocument(org.eclipse.core.runtime.IProgressMonitor,
	 * java.lang.Object, org.eclipse.jface.text.IDocument, boolean)
	 */
	@Override
	protected void doSaveDocument(IProgressMonitor monitor, Object element, IDocument document, boolean overwrite)
			throws CoreException {
		if (JrxmlEditor.getFileExtension((IEditorInput) element).equals("jasper")) { //$NON-NLS-1$
			return; // do not save .jasper files, they are binary
		}
		if (element instanceof FileStoreEditorInput) {
			FileStoreEditorInput input = (FileStoreEditorInput) element;
			String encoding = null;

			Charset charset;
			try {
				charset = Charset.forName(encoding);
			} catch (UnsupportedCharsetException ex) {
				String message = "unsuported encoding message"; //$NON-NLS-1$
				IStatus s = new Status(IStatus.ERROR, EditorsUI.PLUGIN_ID, IStatus.OK, message, ex);
				throw new CoreException(s);
			} catch (IllegalCharsetNameException ex) {
				String message = "document provider error encoding"; //$NON-NLS-1$
				IStatus s = new Status(IStatus.ERROR, EditorsUI.PLUGIN_ID, IStatus.OK, message, ex);
				throw new CoreException(s);
			}

			CharsetEncoder encoder = charset.newEncoder();
			encoder.onMalformedInput(CodingErrorAction.REPLACE);
			encoder.onUnmappableCharacter(CodingErrorAction.REPORT);
			FileOutputStream stream = null;
			try {
				stream = new FileOutputStream(new File(input.getURI().getPath()));
				byte[] bytes;
				ByteBuffer byteBuffer = encoder.encode(CharBuffer.wrap(document.get()));
				if (byteBuffer.hasArray())
					bytes = byteBuffer.array();
				else {
					bytes = new byte[byteBuffer.limit()];
					byteBuffer.get(bytes);
				}

				stream.write(byteBuffer.array());
				stream.flush();

			} catch (CharacterCodingException ex) {
				Assert.isTrue(ex instanceof UnmappableCharacterException);
				String message = "Error charset mapping"; //$NON-NLS-1$
				IStatus s = new Status(IStatus.ERROR, EditorsUI.PLUGIN_ID, EditorsUI.CHARSET_MAPPING_FAILED, message, null);
				throw new CoreException(s);
			} catch (FileNotFoundException e) {
				String message = "FileNotFoundException"; //$NON-NLS-1$
				IStatus s = new Status(IStatus.ERROR, EditorsUI.PLUGIN_ID, EditorsUI.CHARSET_MAPPING_FAILED, message, null);
				throw new CoreException(s);
			} catch (IOException e) {
				String message = "IOException"; //$NON-NLS-1$
				IStatus s = new Status(IStatus.ERROR, EditorsUI.PLUGIN_ID, EditorsUI.CHARSET_MAPPING_FAILED, message, null);
				throw new CoreException(s);
			} finally {
				if (stream != null)
					try {
						stream.close();
					} catch (IOException e) {
						String message = "IOException"; //$NON-NLS-1$
						IStatus s = new Status(IStatus.ERROR, EditorsUI.PLUGIN_ID, EditorsUI.CHARSET_MAPPING_FAILED, message, null);
						throw new CoreException(s);
					}
			}
		} else {
			super.doSaveDocument(monitor, element, document, overwrite);
		}
	}
}
