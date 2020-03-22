package leetcode113;

import java.util.ArrayList;
import java.util.List;

public class FindAllArrayOfSumFunction {
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
        List<List<Integer>> result = new ArrayList<>();
        
        backtrack(result, new ArrayList<>(), root, sum);
        
        return result;
    }
    
    private void backtrack(List<List<Integer>> result, List<Integer> tempList, TreeNode root, int sum){
    	// If we reach to the end of one branch, do nothing
        if(root == null){
            return;
        }
        
        // Add to temp list
        tempList.add(root.val);
        
        // If leaf and sum is target
        if(sum == root.val && root.left == null && root.right == null){
            result.add(new ArrayList<>(tempList));
        }else {
        	// Preorder
            backtrack(result, tempList, root.left, sum - root.val);
            backtrack(result, tempList, root.right, sum - root.val);
        }
        
        // Backtracking remember the last element
        tempList.remove(tempList.size() - 1);
    }

}
