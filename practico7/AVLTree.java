package practico7;


public class AVLTree {
    public Node root;

    public AVLTree(Integer data){
        this.root = new Node(data);
    }
    public boolean isEmpty(){
        return root == null;
    }
    public Node getRoot(){
        return root;
    }
    private int getHeight(Node node){
        if(root == null){
            return 0;
        }else{
            return node.getHeight();
        }
    }
    private int getBalance(Node node){
        if(root == null){
            return 0;
        }else{
            return getHeight(node.getLeft()) - getHeight(node.getRight());
        }
    }
    private void updateHeight(Node node){
        int maxHeight = Math.max(
            getHeight(node.getLeft()),
            getHeight(node.getRight())
        );
        node.setHeight(maxHeight + 1);
    }
    private Node rightRotate(Node node){
        Node leftNode = node.getLeft();
        Node centerNode = leftNode.getRight();
        leftNode.setRight(node);
        node.setLeft(centerNode);
        updateHeight(node);
        updateHeight(leftNode);
        return leftNode;
    }
    private Node leftRotate(Node node){
        Node rightNode = node.getRight();
        Node centerNode = rightNode.getLeft();
        rightNode.setLeft(node);
        node.setRight(centerNode);
        updateHeight(node);
        updateHeight(rightNode);
        return rightNode;
    }
    private Node rotation(Node node){
        int balance = getBalance(node);
        if(balance > 1){
            if(getBalance(node.getLeft()) < 0){
                node.setLeft(leftRotate(node.getLeft()));
            }
            return rightRotate(node);
        }
        if(balance < -1){
            if(getBalance(node.getRight()) > 0){
                node.setRight(rightRotate(node.getRight()));
            }
            return leftRotate(node);
        }
        return node;
    }
    public AVLTree insert(Integer data){
        root = insert(data, root);
        return this;
    }
    public Node insert(Integer data, Node node){
        if(node == null){
            return new Node(data);
        }
        if(data.compareTo(node.getData()) < 0){
            node.setLeft(insert(data, node.getLeft()));
        } else if(data.compareTo(node.getData()) > 0){
            node.setRight(insert(data, node.getRight()));
        } else {
            return node;
        }
        updateHeight(node);
        return rotation(node);
    }
    private int getMax(Node node){
        if(node.getRight()!=null){
            return getMax(node.getRight());
        }
        return node.getData();
    }
    public void delete(Integer data){
        root = delete(data, root);
    }
    private Node delete(Integer data, Node node){
        if(node == null){
            return null;
        }
        if(data.compareTo(node.getData()) < 0){
            node.setLeft(delete(data, node.getLeft()));
        } else if(data.compareTo(node.getData()) > 0){
            node.setRight(delete(data, node.getRight()));
        } else {
            if(node.getLeft() == null){
                return node.getRight();
            }else if(node.getRight() == null){
                return node.getLeft();
            }
            node.setData(getMax(node.getLeft()));
            node.setLeft(delete(node.getData(), node.getLeft()));
        }
        updateHeight(node);
        return rotation(node);
    }
    public void print(){
        printInOrder(root);
    }
    public void printInOrder(Node node){
        if(node != null){
            printInOrder(node.getLeft());
            System.out.println(node.getData()+ "\n");
            printInOrder(node.getRight());
        }
    }
}
