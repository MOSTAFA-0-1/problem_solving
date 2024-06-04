class TreeNode {
  int val;
  TreeNode? left;
  TreeNode? right;
  TreeNode([this.val = 0, this.left, this.right]);
}

class Solution {
  TreeNode? temp = TreeNode();
  List<TreeNode> tree = [];

  TreeNode? invertTreeNode(TreeNode root) {
    temp = root.right;
    root.right = root.left;
    root.left = temp;
  }

  TreeNode? invertTree(TreeNode? root) {
    if (root == null) {
      return root;
    } else {
      tree.add(root);
      for (var i = 0; i < tree.length; i++) {
        if (tree[i].left != null || tree[i].right != null) {
          invertTreeNode(tree[i]);
        }

        if (tree[i].left != null) {
          tree.add(tree[i].left!);
        }
        if (tree[i].right != null) {
          tree.add(tree[i].right!);
        }
      }
      return root;
    }
  }
}

void main(List<String> args) {
  TreeNode root = TreeNode(2,TreeNode(3));
  print(root.left!.val);
  // print(root.left!.val);
  // print(root.right!.val);
  Solution().invertTree(root);
  print(root.right!.val);
  // print(root.left!.val);
  // print(root.right!.val);
  // print(root.left!.left!.val);
  // print(root.left!.right!.val);
  // print(root.right!.left!.val);
  // print(root.right!.right!.val);
}
