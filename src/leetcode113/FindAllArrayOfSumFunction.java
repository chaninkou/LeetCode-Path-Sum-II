package leetcode113;

import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class FindAllArrayOfSumFunction {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        
        backtrack(result, new ArrayList<>(), root, sum);
        
        return result;
    }
    
    private void backtrack(List<List<Integer>> result, List<Integer> tempList, TreeNode root, int sum){
        if(root == null){
            return;
        }
        
        tempList.add(root.val);
        
        if(sum == root.val && root.left == null && root.right == null){
            result.add(tempList);
            return;
        }
        
        backtrack(result, new ArrayList<>(tempList), root.left, sum - root.val);
        backtrack(result, new ArrayList<>(tempList), root.right, sum - root.val);
    }

}
