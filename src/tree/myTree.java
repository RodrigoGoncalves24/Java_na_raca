package tree;

public class myTree {
    private Node root = null;
    private int size = 0;

    public void myTree(){

    }

    /// Insert a value
    public void insert(int value){
        Node node = new Node(value);
        if (root == null) root = node;
        else if(node.value > root.value){
            insert(root.left, node);
        }else{
            insert(root.right, node);
        }
        size++;

    }

    /// insert method private, parameters node right or left and node to add
    private void insert(Node nodeProx, Node node){
        if (nodeProx == null) nodeProx = node;
        else if(node.value < nodeProx.value){
            insert(nodeProx.left, node);
        }else{
            insert(nodeProx.right, node);
        }
    }



    /// print
    public void print(){
        Node rootAuxR = root.right;
        Node rootAuxL = root.left;
        for (int i = 0; i < size; i++) {
            if(i == 0) System.out.println("root: "+root.value);
            else System.out.println("\nleft: "+rootAuxL+"\nright: "+rootAuxR);
            rootAuxR = rootAuxR.right;
            rootAuxL = rootAuxL.left;

        }
    }

}
