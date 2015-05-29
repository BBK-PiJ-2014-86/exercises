package day9;

public class Script {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntegerTreeNode head = new IntegerTreeNodeImpl (5);
		
		head.add(5);
		head.add(8);
		head.add(9);
		head.add(10);
		head.add(2);
		head.add(4);
		
		System.out.println(head.getMax());
		System.out.println(head.getMin());
		System.out.println(head.contains(3));
	}

}
