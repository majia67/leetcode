package medium;

public class Prob314_Binary_Tree_Vertical_Order_Traversal {
    public List<List<Integer>> verticalOrder(TreeNode root) {
        List<List<Integer>> rlt = new ArrayList<List<Integer>>();
        if (root == null) {
            return rlt;
        }
        
        Map<Integer, List<Integer>> trav = new HashMap<>();
        Deque<TreeNode> tQue = new LinkedList<>();
        Deque<Integer> wQue = new LinkedList<>();
        int minWidth = Integer.MAX_VALUE / 2;
        int maxWidth = minWidth;
        
        tQue.add(root);
        wQue.add(minWidth);
        while (tQue.size() > 0) {
            TreeNode node = tQue.poll();
            int width = wQue.poll();
            
            if (width < minWidth) {
                minWidth = width;
            } else if (width > maxWidth) {
                maxWidth = width;
            }
            
            if (trav.containsKey(width)) {
                List<Integer> list = trav.get(width);
                list.add(node.val);
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(node.val);
                trav.put(width, list);
            }
            
            if (node.left != null) {
                tQue.add(node.left);
                wQue.add(width - 1);
            }
            if (node.right != null) {
                tQue.add(node.right);
                wQue.add(width + 1);
            }
        } 
        
        for (int width = minWidth; width <= maxWidth; width++) {
            rlt.add(trav.get(width));
        }
        
        return rlt;
    }
}
