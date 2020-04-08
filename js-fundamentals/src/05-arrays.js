/**
 * Determine the location of an item in the array
 */
exports.indexOf = function(arr, item) {
    return arr.indexOf(item);
};

/**
 * Sum the items of an array
 */
exports.sum = function(arr) {
    var sum = 0;
    for(var i = 0; i < arr.length; i++ ){
        sum += arr[i]; 
    }
    return sum;
};

/**
 * Remove all instances of an item from an array
 */
exports.remove = function(arr, item) {
    arr2 = arr.filter(a => a != item);
    return arr2;
};

/**
 * Remove all instances of an item from an array by mutating original array
 */
exports.removeWithoutCopy = function(arr, item) {
    for (var i = 0; i < arr.length; i++) {
        arr.splice(arr.indexOf(item), 1);
    }
    return arr;
};

/**
 * Add an item to the end of the array
 */
exports.append = function(arr, item) {
    arr.push(item);
    return arr;
};

/**
 * Remove the last item of an array
 */
exports.truncate = function(arr) {
    arr.pop();
    return arr;
};

/**
 * Add an item to the beginning of an array
 */
exports.prepend = function(arr, item) {
    arr.unshift(item);
    return arr;
};

/**
 * Remove the first item of an array
 */
exports.curtail = function(arr) {
    arr.shift();
    return arr;
};

/**
 * Join two arrays together
 */
exports.concat = function(arr1, arr2) {
    var arr3 = arr1.concat(arr2);
    return arr3;
};

/**
 * Add an item to an array in the specified position
 */
exports.insert = function(arr, item, index) {
    arr.splice(index, 0, item);
    return arr;
};

/**
 * Count the number of occurrences of an item in an array
 */
exports.count = function(arr, item) {
    var count = arr.reduce(function(n, val) {
        return n + (val === item);
    }, 0);
    return count;
};

/**
 * Find all items which container multiple occurrences in the array
 */
exports.duplicates = function(arr) {
    var result = [];

    arr.forEach(function(item, index) {
        if (arr.indexOf(item, index + 1) > -1) {
            if (result.indexOf(item) === -1) {
                result.push(item);
            }
        }
    });
    return result;
};

/**
 * Square each number in the array
 */
exports.square = function(arr) {

    var square = [];

    for (var i = 0; i < arr.length; i++) {
        squareNum = Math.pow(arr[i], 2);
        square.push(squareNum);
    }
    return square;
};

/**
 * Find all occurrences of an item in an array
 */
exports.findAllOccurrences = function(arr, target) {

    var count = 0;

    for (var i = 0; i < arr.length; i++) {
        if (target === arr[i]) {
            count++;
        }
    }
    return count;
};
