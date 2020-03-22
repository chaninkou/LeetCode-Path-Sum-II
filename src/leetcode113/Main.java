package leetcode113;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right.right.right = new TreeNode(1);
		root.right.right.left = new TreeNode(5);
		
		int[] input = {5,4,8,11,13,4,7,2,1};
		
		System.out.println("Binary Tree: " + Arrays.toString(input));
		
		int sum = 22;
		
		System.out.println("Target Sum: " + sum);
		
		FindAllArrayOfSumFunction solution = new FindAllArrayOfSumFunction();
		
		System.out.println("Solution: " + solution.pathSum(root, sum));

	}
	
	
}
