/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import org.junit.Test;

import tree.BinaryTree;
import tree.CalcBinaryTree;

import static org.junit.Assert.*;

public class CalcBinaryTreeTest {
    @Test public void testcalcTree() {
        App app = new App();
        BinaryTree tree = app.populateTree();
        CalcBinaryTree calc = new CalcBinaryTree();
        assertEquals(calc.calcTree(tree), 17);
    }
}
