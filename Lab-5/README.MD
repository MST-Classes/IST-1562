# Lab Exercise 5 - Binary Tree

### Binary Tree Traversal

Given a binary tree {8, 3, 10, 1, 6, #, 14, #, #, 4, 7, 13}, the first data is the root node, followed by the value of the left and right child nodes, and "#" indicates that there is no child node.
```
             8
          /     \
        3         10
      / \           \
     1  6           14
       /  \          /
      4   7         13
```

### Short Answer Question:

1. (2 pts) directly write down the result of preorder traversal of its nodes' values.
> 8, 3, 1, 6, 4, 7, 10, 14, 13
2. (2 pts) directly write down the result of inorder traversal of its nodes' values.
> 1, 3, 4, 6, 7, 8, 10, 13, 14
3. (2 pts) directly write down the result of postorder traversal of its nodes' values.
> 1, 4, 7, 6, 3, 13, 14, 10, 8


### Coding Exercise Question:

4. (2 pts) create a method to traverse a binary tree, return the postorder of its nodes' values.

5. (2 pts) use these two examples to test your method.

Example 1:

Input: {1, 2, 3}

Output: 2, 3, 1

Explanation:

            1

         /      \

      2           3

Example 2:

Input: {1, 2, #, 3, 4}

Output: 3, 4, 2, 1

Explanation:

                       1

                     / 

                2

            /       \

         3           4

6. The method to submit your assignment.

Submit the .java files.

Add comments to answer the short answer questions, and then write codes to traverse the tree.