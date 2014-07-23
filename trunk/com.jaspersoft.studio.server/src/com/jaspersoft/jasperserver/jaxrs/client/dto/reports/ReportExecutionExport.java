package com.jaspersoft.jasperserver.jaxrs.client.dto.reports;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "exportExecution")
public class ReportExecutionExport {
	private String id;
	private String status;
	private ReportExecutionExportOptions options;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public ReportExecutionExportOptions getOptions() {
		return options;
	}

	public void setOptions(ReportExecutionExportOptions options) {
		this.options = options;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;

		ReportExecutionExport that = (ReportExecutionExport) o;

		if (id != null ? !id.equals(that.id) : that.id != null)
			return false;
		if (status != null ? !status.equals(that.status) : that.status != null)
			return false;
		if (options != null ? !options.equals(that.options) : that.options != null)
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (status != null ? status.hashCode() : 0);
		result = 31 * result + (options != null ? options.hashCode() : 0);
		return result;
	}

	@Override
	public String toString() {
		return "ReportExecutionExport{" + "id='" + id + '\'' + ", status=" + status + ", options=" + options + '}';
	}
}
