# Lab 6 - Binary Search

Binary Search

Binary search is a faster algorithm for searching a list if the list's elements are sorted and directly accessible (such as an array). Binary search first checks the middle element of the list. If the search key is found, the algorithm returns the matching location. If the search key is not found, the algorithm repeats the search on the remaining left sublist (if the search key was less than the middle element) or the remaining right sublist (if the search key was greater than the middle element).

1. (6 pts) Create and define a binary search method to search a target value in a descending ordered array.

2. (3 pts) Use an array in descending order to test your method.

Example 1:

Descending ordered array: 87 45 32 11 10 7 4 2

Enter a target value: 10

The output would be: Found 10.



Example 2:

Descending ordered array: 87 45 32 11 10 7 4 2

Enter a target value: 14

The output would be: 14 was not found.



3. (1 pt) Submit the .java file.