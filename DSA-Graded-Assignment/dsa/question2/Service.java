package dsa.question2;

public class Service {

		public static Node node;
		static Node prevNode = null;
		static Node headNode = null;

		static Node completeBSTtoSkewed(Node root) {

			if (root == null) {
				return null;
			}

			completeBSTtoSkewed(root.left);
			Node rightNode = root.right;
			Node leftNode = root.left;

			if (headNode == null) {
				headNode = root;
				root.left = null;
				prevNode = root;
			} else {
				prevNode.right = root;
				root.left = null;
				prevNode = root;
			}

			completeBSTtoSkewed(rightNode);
			return headNode;
		}

		static void traverseRightSkewedTree(Node root) {
			if (root == null) {
				return;
			}
			System.out.print(root.value_of_node + " ");
			traverseRightSkewedTree(root.right);
		}


	
	
}
