/**
 * Reduce duplicate characters to a desired minimum
 */
exports.reduceString = function(str, amount) {
    var re = new RegExp("(.)(?=\\1{" + amount + "})","g");

    return str.replace(re, "");
};

/**
 * Wrap lines at a given number of columns without breaking words
 */
exports.wordWrap = function(str, cols) {
};

/**
 * Reverse a String
 */
exports.reverseString = function(str) {
    var split = str.split("");
    var reverse = split.reverse();
    var joinArray = reverse.join("");

    return joinArray;
};

/**
 * Check if String is a palindrome
 */
exports.palindrome = function(str) {
    var len = str.length;

    for (var i = 0; i < len/2; i++) {
        if (str[i] !== str[len - 1 - i]) {
            return false;
        }

        return true;
    }
};
