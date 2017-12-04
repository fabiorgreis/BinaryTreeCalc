package tree;

public class CalcBinaryTree{

    private int calcTreeRight(BinaryTree tree){
        int value = 0;
        BinaryTree temp = tree;            
        while(temp != null){
            value += temp.getValor();
            temp = temp.getRight();
        }
        return value;
    }

    private int calcTreeLeft(BinaryTree tree){
        int value = 0;
        BinaryTree temp = tree;            
        while(temp != null){
            value += temp.getValor();
            temp = temp.getLeft();
        }
        return value;
    }

    public int calcTree(BinaryTree tree){
        int value = tree.getValor();
        value += calcTreeLeft(tree.getLeft());
        value += calcTreeRight(tree.getRight());
        return value;
    }
    
}

