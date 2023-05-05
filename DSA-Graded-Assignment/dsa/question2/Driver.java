package dsa.question2; 
public class Driver {

	public static void main(String[] args) {
		

		Service Obj = new Service();
		
		Node tree;
		
		tree = new Node(50);
		tree.left = new Node(30);
		tree.right = new Node(60);
		tree.left.left = new Node(10);
		tree.right.left = new Node(55);

		
		Node rSkewTree = Obj.completeBSTtoSkewed(tree);
		
		System.out.println("The resultant  output is :");
		Obj.traverseRightSkewedTree(rSkewTree);
	}
		
	}
	
