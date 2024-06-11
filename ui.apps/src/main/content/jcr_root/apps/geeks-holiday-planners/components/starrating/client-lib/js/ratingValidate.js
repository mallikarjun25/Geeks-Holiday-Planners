(function() {

    /* Adapting window object to foundation-registry */
    var registry = $(window).adaptTo("foundation-registry");
    /*Validator for TextField - Any Custom logic can go inside validate function - starts */
    registry.register("foundation.validation.validator", {
        selector: "[data-validation=rating-validate]",
        validate: function(el) {
            var element = $(el);
            var pattern = element.data('pattern');
            var value = element.val();
            if (value > 5 || value<=0) {
                return "Please enter less than 5 or greater than 0";
            } else {

                patterns = {

                   integer: /-?\d+/

                }
 /*
                 * Test pattern if set. Pattern can be a preset regex pattern name or
                 * a regular expression such as "^\\d+$".
                 */
                if (pattern) {
                    if (patterns[pattern]) {
                        error = !patterns[pattern].test(value);
                    } else {
                        error = !(new RegExp(pattern)).test(value);
                    }

                    if (error) {
                        return "Enter only " + pattern;
                    }
                }   

            }

        }
    });
})
();