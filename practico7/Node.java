package practico7;

public class Node {
    private int height;
    private Integer data;
    private Node left, right;

    public Node(int data){
        this.data = data;
        this.height = 1;
        this.left = null;
        this.right = null;
    }

    public Node getLeft(){
        return left;
    }

    public void setLeft(Node left){
        this.left = left;
    }

    public Node getRight(){
        return right;
    }

    public void setRight(Node right){
        this.right = right;
    }

    public int getHeight(){
        return height;
    }

    public void setHeight(int balance){
        this.height = balance;
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }
}
