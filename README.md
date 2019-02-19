# Using Arrays in Java

For Java practice tonight, implement several sorting functions described below. You can use ArrayLists, Arrays, or other List type data structures for your answers.

1) Bubble Sort

This sorting method loops through the array and compares each value to the next one. If the next value is greater than the current value, swap those two values in the array. Bubble Sort continues this process, repeatedly "bubbling" the maximum value to the end of the array, until the array is entirely sorted. Consider ways you could make this more efficient once you have an answer.

2) Insertion Sort

Insertion Sort begins by thinking of the first value in the array as a smaller, sub-array of "sorted" items. Then, one at a time, it takes the next value and finds its proper place in the "sorted" portion of the array by swapping indices until the new value is properly sorted. The sort continues through the array, throwing each value into the left, "sorted" portion until  that portion is the entire array.

#### Challenge Mode (optional)

3) Write a function called MergeSortedArrays that takes in two arrays and combines them into one, sorted array.

4) Merge Sort

Merge sort works recursively by splitting the array into two smaller arrays, sorting the smaller arrays, then calling MergeSortedArrays on those two halves. Merge Sort works its way down to the base case of two, single-element arrays, at which point they can both be considered "sorted" and have MergeSortedArrays called to recombine them into a larger array.  You will probably want to find a youtube video or five describing the Merge Sort process.
