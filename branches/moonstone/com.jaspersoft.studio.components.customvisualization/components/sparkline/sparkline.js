define('sparkline',['d3'], function (d3) {

	 return function (instanceData) {	
		
	 	var w = instanceData.width,
            h = instanceData.height;

        var margin = 20;
        var diameter = Math.min(w,h) - margin;
        
        // Options:
        // Sparkline interpolation: linear, step-before, step-after, basis, cardinal, monotone
        // line color
        // Fill area color
        // Final circle color
        
        // extend function (similar to jquery)
        function extend(a, b){
			for(var key in b)
				if(b.hasOwnProperty(key))
					a[key] = b[key];
			return a;
		}

        
        var default_options = {
        	interpolation: "basis",
        	lineColor:  "#000000",
        	lineOpacity:  "1",
        	lineStroke: "0.5",
        	fillColor:   "#0000FF",
        	fillOpacity:   "0.1",
        	circleColor: "#0000FF",
        	circleOpacity: "1",
        	circleRadius: 2
        }
        
        
        var options = extend(default_options, instanceData);
        
        options.circleRadius = +options.circleRadius; // cast to number from string.
        
		var svg = d3.select("#" + instanceData.id).insert("svg")
		    .attr("id", instanceData.id + "svg")
		    .attr("width", w)
		    .attr("height", h)
		    .append('g')
            .attr('transform', 'translate(0, 2)');
		 
        var data =  instanceData.series[0]; 
        
        if (data.length > 0)
		{
			var xScale = d3.scale.linear().range([options.circleRadius, w - 2 - options.circleRadius]).domain([0, data.length-1]);
			var yScale = d3.scale.linear().range([ h - 2 - options.circleRadius, options.circleRadius]).domain(d3.extent(data, function(d) { return +d.value; }));
			
			var line = d3.svg.line()
				 .interpolate(options.interpolation)
				 .x(function(d,i) { return xScale(i); })
				 .y(function(d) { return yScale( +d.value); });
			
			var svgPathString = line(data);
			svgPathString = "M" + xScale(0) + "," + yScale(0) + "L" + svgPathString.substring(1) + "L" + xScale(data.length-1) + "," + yScale(0);

            // No line or circle is printed if there is no data.
            if (data.length == 0) return;
            
			svg.append('path')
				 .attr('d', svgPathString)
				 .attr('fill',options.fillColor)
				 .attr('fill-opacity',options.fillOpacity)
				 .attr('stroke','none');
				 
			svg.append('path')
				 .datum(data)
				 .attr('d', line)
				 .attr('fill','none')
				 .attr('stroke','#000000')
				 .attr('stroke-opacity',options.lineOpacity)
				 .attr('stroke-width', options.lineStroke + 'px');	
				 
		
			svg.append('circle')
				 .attr('cx', xScale(data.length-1))
				 .attr('cy', yScale(data[data.length-1].value))
				 .attr('r', options.circleRadius)
				 .attr('fill',options.circleColor)
				 .attr('fill-opacity',options.circleOpacity)
				 .attr('stroke','none');
		}
	};
		
});

