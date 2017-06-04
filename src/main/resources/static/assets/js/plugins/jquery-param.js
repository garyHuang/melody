// jQuery.param, pulled out of 1.4.2

(function($){
  
  var r20 = /%20/g;
  
  // Serialize an array of form elements or a set of
  // key/values into a query string
  $.param = function( a, traditional ) {
    var s = [];
    
    // Set traditional to true for jQuery <= 1.3.2 behavior.
    if ( traditional === undefined ) {
      traditional = jQuery.ajaxSettings.traditional;
    }
    
    // If an array was passed in, assume that it is an array of form elements.
    if ( jQuery.isArray(a) || a.jquery ) {
      // Serialize the form elements
      jQuery.each( a, function() {
        add( this.name, this.value );
      });
      
    } else {
      // If traditional, encode the "old" way (the way 1.3.2 or older
      // did it), otherwise encode params recursively.
      for ( var prefix in a ) {
        buildParams( prefix, a[prefix] );
      }
    }

    // Return the resulting serialization
    return s.join("&").replace(r20, "+");

    function buildParams( prefix, obj ) {
      if ( jQuery.isArray(obj) ) {
        // Serialize array item.
        jQuery.each( obj, function( i, v ) {
          if ( traditional || /\[\]$/.test( prefix ) ) {
            // Treat each array item as a scalar.
            add( prefix, v );
          } else {
            // If array item is non-scalar (array or object), encode its
            // numeric index to resolve deserialization ambiguity issues.
            // Note that rack (as of 1.0.0) can't currently deserialize
            // nested arrays properly, and attempting to do so may cause
            // a server error. Possible fixes are to modify rack's
            // deserialization algorithm or to provide an option or flag
            // to force array serialization to be shallow.
            buildParams( prefix + "[" + ( typeof v === "object" || jQuery.isArray(v) ? i : "" ) + "]", v );
          }
        });
          
      } else if ( !traditional && obj != null && typeof obj === "object" ) {
        // Serialize object item.
        jQuery.each( obj, function( k, v ) {
          buildParams( prefix + "[" + k + "]", v );
        });
          
      } else {
        // Serialize scalar item.
        add( prefix, obj );
      }
    }

    function add( key, value ) {
      // If value is a function, invoke it and return its value
      value = jQuery.isFunction(value) ? value() : value;
      s[ s.length ] = encodeURIComponent(key) + "=" + encodeURIComponent(value);
    }
  }

})(jQuery);