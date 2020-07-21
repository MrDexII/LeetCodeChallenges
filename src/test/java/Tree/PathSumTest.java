package Tree;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PathSumTest {

    PathSum pathSum;
    TreeNode tree;

    @Before
    public void before() {
        pathSum = new PathSum();
        tree = new TreeNode(
                5, new TreeNode(
                4, new TreeNode(
                11, new TreeNode(
                7, null, null), new TreeNode(
                2, null, null)), null), new TreeNode(
                8, new TreeNode(
                13, null, null), new TreeNode(
                4, null, new TreeNode(
                1, null, null))));
    }

    @Test
    public void hasPathSum1() {
        int sum = 5 + 4 + 11 + 7;//27
        assertEquals(true, pathSum.hasPathSum(tree, sum));
    }

    @Test
    public void hasPathSum2() {
        int sum = 5 + 4 + 11 + 2;//22
        assertEquals(true, pathSum.hasPathSum(tree, sum));
    }

    @Test
    public void hasPathSum3() {
        int sum = 5 + 8 + 13;//26
        assertEquals(true, pathSum.hasPathSum(tree, sum));
    }

    @Test
    public void hasPathSum4() {
        int sum = 5 + 8 + 4 + 1;//18
        assertEquals(true, pathSum.hasPathSum(tree, sum));
    }
    @Test
    public void hasPathSum5() {
        int sum = 5 + 8 ;//13
        assertEquals(false, pathSum.hasPathSum(tree, sum));
    }
}