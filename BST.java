public class BST {
    private Node root;

    private class Node {
        public Employee employee;
        public Node left;
        public Node right;

        public Node(Employee employee) {
            this.employee = employee;
            this.left = null;
            this.right = null;
        }
    }

    public void add(Employee employee) {
        root = add(root, employee);
    }

    private Node add(Node node, Employee employee) {
        if (node == null) {
            return new Node(employee);
        }

        if (employee.id < node.employee.id) {
            node.left = add(node.left, employee);
        } else if (employee.id > node.employee.id) {
            node.right = add(node.right, employee);
        }

        return node;
    }

    public void delete(int id) {
        root = delete(root, id);
    }

    private Node delete(Node node, int id) {
        if (node == null) {
            return null;
        }

        if (id < node.employee.id) {
            node.left = delete(node.left, id);
        } else if (id > node.employee.id) {
            node.right = delete(node.right, id);
        } else {
            if (node.left == null && node.right == null) {
                node = null;
            } else if (node.left == null) {
                node = node.right;
            } else if (node.right == null) {
                node = node.left;
            } else {
                Node minRight = findMin(node.right);
                node.employee = minRight.employee;
                node.right = delete(node.right, minRight.employee.id);
            }
        }

        return node;
    }

    private Node findMin(Node node) {
        if (node == null) {
            return null;
        }

        if (node.left == null) {
            return node;
        }

        return findMin(node.left);
    }

    public void printInOrder() {
        printInOrder(root);
    }

    private void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.left);
            System.out.println(node.employee);
            printInOrder(node.right);
        }
    }

    public void printPreOrder() {
        printPreOrder(root);
    }

    private void printPreOrder(Node node) {
        if (node != null) {
            System.out.println(node.employee);
            printPreOrder(node.left);
            printPreOrder(node.right);
        }
    }

    public void printPostOrder() {
        printPostOrder(root);
    }

    private void printPostOrder(Node node) {
        if (node != null) {
            printPostOrder(node.left);
            printPostOrder(node.right);
            System.out.println(node.employee);
        }
    }
}

//This file defines the BST class, which implements the binary search tree data structure. 
//It has methods for adding, deleting, and printing employee records in pre-order, in-order,
//and post-order traversal.