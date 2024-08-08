package cognizant.nodes;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    String name;
    List<TreeNode> children;

    public TreeNode(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }

    public void addChild(TreeNode child) {
        children.add(child);
    }
}

public class TreeSearch {

    public static TreeNode findNode(TreeNode node, String name) {
        // Base case: if the node is null, return null
        if (node == null) {
            return null;
        }

        // Iterate over each child of the current node
        for (TreeNode child : node.children) {
            // Check if the parent and child have the same name
            if (node.name.equals(name) && child.name.equals(name)) {
                return child; // Found the child node
            }

            // Recur on the child node
            TreeNode result = findNode(child, name);
            if (result != null) {
                return result; // Found the node in the subtree
            }
        }

        // Return null if not found
        return null;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode("root");
        TreeNode child1 = new TreeNode("child");
        TreeNode child2 = new TreeNode("child");
        TreeNode grandchild = new TreeNode("child");

        root.addChild(child1);
        child1.addChild(grandchild);
        root.addChild(child2);

        TreeNode result = findNode(root, "child");
        if (result != null) {
            System.out.println("Node found: " + result.name);
        } else {
            System.out.println("Node not found.");
        }
    }
}
