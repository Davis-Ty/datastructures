# datastructures
This code defines and implements commonly used data structures in computer science for storing and managing data.

# Binary Search Tree (BST)
- The BinarySearchTree class represents a binary search tree data structure.
- It contains a nested class Node representing a node in the tree, with properties key, left, and right.
- The class provides methods to insert, search, and delete nodes in the BST.
- Nodes are inserted recursively based on their key values.
- Nodes are searched recursively until the key is found or the end of the tree is reached.
- Deleting a node involves finding the node with the given key, replacing it with its successor (smallest value in the right subtree), and deleting the successor.
- The main method is left empty, indicating a placeholder for future use.

# Linked List
- The LinkedList class represents a singly linked list data structure.
- It contains a nested class Node representing a node in the list, with properties data and next.
- The class provides methods to insert nodes at the end of the list and print the contents of the list.
- Nodes are inserted iteratively by traversing to the end of the list.
- The main method is left empty, indicating a placeholder for future use.
  
# Trie
- The Trie class represents a trie data structure for storing strings.
- It contains a nested class TrieNode representing a node in the trie, with an array children for storing child nodes and a boolean isEndOfWord indicating the end of a word.
- The class provides methods to insert and search for strings in the trie.
- Strings are inserted character by character, creating new nodes if necessary.
- The main method is left empty, indicating a placeholder for future use.
