package practica5;

public class binaryNode<Anytype> {
    private Anytype elemento;
    private binaryNode<Anytype> left;
    private binaryNode<Anytype> right;

    public binaryNode(){
        this.elemento = null;
        this.left = null;
        this.right = null;
    }
    public binaryNode(Anytype elem, binaryNode<Anytype> lt, binaryNode<Anytype> rt){
        elemento = elem;
        left = lt;
        right = rt;
    }
    public Anytype getElemento(){
        return elemento;
    }
    public binaryNode<Anytype> getLeft(){
        return left;
    }
    public binaryNode<Anytype> getRight(){
        return right;
    }
    public void setElemento(Anytype x){
        elemento = x;
    }
    public void setLeft(binaryNode<Anytype> t){
        left = t;
    }
    public void setRight(binaryNode<Anytype> r){
        right = r;
    }
    public static <Anytype> int size (binaryNode<Anytype> t){ //el tamaño del arbol es la raiz + la cantidad 
        if (t == null){             //de subramas que el arbol tenga tanto por derecha como por izquierda
            return 0;
        }else{
            return 1 + size(t.left) + size(t.right);
        }
    }
    public static <Anytype> int height (binaryNode<Anytype> t){
        if (t == null){
            return -1;
        }else{
            return 1 + Math.max(height(t.left), height(t.right));
        }
    }
    public binaryNode<Anytype> duplicate(){
        binaryNode<Anytype> root = new binaryNode<Anytype>(elemento, null, null);
        if(left != null){
            root.left = left.duplicate();
        }
        if(right != null){
            root.right = right.duplicate();
        }
        return root;
    }
    public void printPreOrder(){
        System.out.println(elemento);    //nodo
        if(left != null){
            left.printPreOrder();       //izquierda
        }
        if(right != null){
            right.printPreOrder();       //derecha
        }
    }
    public void printPostOrder(){
        if(left != null){
            left.printPreOrder();       //izquierda
        }
        if(right != null){
            right.printPreOrder();       //derecha
        }
        System.out.println(elemento);     //nodo
    }
    public void printInOrder(){
        if(left != null){
            left.printPreOrder();       //izquierda
        }
        System.out.println(elemento);   //nodo
        if(right != null){
            right.printPreOrder();       //derecha
        }
    }
}
