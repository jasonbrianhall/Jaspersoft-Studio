
		$(document).ready(function(){
				
                var bgSize = Modernizr.backgroundsize;
            
                
                $("#title").css({ opacity: 0});
                $("#title").removeClass("hidden");

                $(".widget").css({ opacity: 0});
                $(".widget").removeClass('hidden');

                $(".widget").css({ 'padding-top': ($(window).height()*2) + 'px'});
                $(".widget").animate({ opacity: 1, 'padding-top': '0px' }, 2000,'easeOutQuart');	
                $("#title").animate({ opacity: 1 }, 2000, function() { 

                    $(".widget").addClass("postAnim");
                    //$(".widget").css({ 'transition': '0.2s ease-in-out'});
                });


                $("#getstarted a").on('click', function(e) {
                        e.preventDefault();

                        var self = $(this);

                        $("#getstarted a").animate({ 'margin-left': '-400px','opacity': 0 },500, function() {
                            window.location=self.attr("href");
                        });
                        $("#learnmore a").animate({ 'margin-top': '400px','opacity': 0 },500);
                        $("#collaborate a").animate({ 'margin-right': '-400px','opacity': 0 },500);

                });
            
                if (!bgSize)
                {
                    $(".getstarted").css("background-image","none");
                    $(".getstarted").append('<img src="images/pen.png" width="297" height="256" border="0">');
                    
                    $(".learn").css("background-image","none");
                    $(".learn").append('<img src="images/learn.png" width="297" height="256" border="0">');
                    
                    $(".collaborate").css("background-image","none");
                    $(".collaborate").append('<img src="images/collaborate.png" width="297" height="256" border="0">');
                }
                
			});