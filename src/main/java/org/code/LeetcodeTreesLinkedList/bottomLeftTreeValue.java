package org.code.LeetcodeTreesLinkedList;

import java.util.LinkedList;
import java.util.Queue;

public class bottomLeftTreeValue {

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public int findBottomLeftValue(TreeNode root) {
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);

            while (!queue.isEmpty()) {
                root = queue.poll();
                if (root.right != null)
                    queue.add(root.right);
                if (root.left != null)
                    queue.add(root.left);
            }
            return root.val;
        }
    }
}
