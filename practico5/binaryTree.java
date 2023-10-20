package practica5;

public class binaryTree<Anytype> {
    private binaryNode<Anytype> root;

    public binaryTree(){
        root = null;
    }
    public binaryTree(Anytype rootItem){
        root = new binaryNode<Anytype>(rootItem, null, null);
    }
    public binaryNode<Anytype> getRoot(){
        return root;
    }
    public int size(){
        return binaryNode.size(root);
    }
    public int height(){
        return binaryNode.height(root);
    }
    public void printPreOrder(){
        if(root != null){
            root.printPreOrder();
        }
    }
    public void printPostOrder(){
        if(root != null){
            root.printPostOrder();
        }
    }
    public void printInOrder(){
        if(root != null){
            root.printInOrder();
        }
    }
    public void makeEmpty(){
        root = null;
    }
    public boolean isEmpty(){
        return root == null;
    }
    public void merge(Anytype rootItem, binaryTree<Anytype> t1, binaryTree<Anytype> t2){
        //no permite que t1 y t2 sean iguales
        if(t1.root == t2.root && t1.root != null){
            throw new IllegalArgumentException();     
        }
        root = new binaryNode<Anytype>(rootItem, t1.root, t2.root);
        //se asegura que cada nodo esté en un árbol
        if(this != t1){
            t1.root = null;
        }
        if(this != t2){
            t2.root = null;
        }
    }
}
