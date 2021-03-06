
import number.CalcNumber;
import tree.BinaryTree;
import tree.CalcBinaryTree;

/*
 * This Java source file was generated by the Gradle 'init' task.
 */
public class App {

    public BinaryTree populateTree(){
        BinaryTree tree = new BinaryTree();
        tree.setValor(5);
        BinaryTree tree2 = new BinaryTree();
        tree2.setValor(2);
        tree.setRight(tree2);
        BinaryTree tree4 = new BinaryTree();
        tree4.setValor(6);
        tree2.setRight(tree4);
        BinaryTree tree3 = new BinaryTree();
        tree3.setValor(3);
        tree.setLeft(tree3);
        BinaryTree tree5 = new BinaryTree();
        tree5.setValor(1);
        tree3.setLeft(tree5);
        return tree;
    }

    public static void main(String[] args) {
        App app = new App();
        BinaryTree tree = app.populateTree();
        CalcBinaryTree calc = new CalcBinaryTree();
        System.out.println(calc.calcTree(tree));

        //CalcNumber calc = new CalcNumber();
        //System.out.println(calc.calcNumber(104, 515));
    }
}
