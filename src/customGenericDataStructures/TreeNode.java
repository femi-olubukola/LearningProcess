package customGenericDataStructures;

// TreeNode and Tree class declarations for a binary search tree.

// class TreeNode definition
public class TreeNode<T extends Comparable<T>> {

    // package access members
    TreeNode<T> leftNode;
    T data; // node value
    TreeNode<T> rightNode;

    // constructor initializes data and makes this a leaf node
    public TreeNode(T nodeData) {
        data = nodeData;
        leftNode = rightNode = null; // node has no children
    }
}
