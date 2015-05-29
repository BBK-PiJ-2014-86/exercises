package day9;

public class IntegerTreeNodeImpl implements IntegerTreeNode {
	
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;

	@Override
	public void setValue(int value) {
		// TODO Auto-generated method stub
		this.value = value;
	}
	
	public IntegerTreeNodeImpl (int value) {
		this.value = value;
		left = null;
		right = null;
	}

	@Override
	public int getValue() {
		// TODO Auto-generated method stub
		return  this.value;
	}

	@Override
	public void add(int number) {
		// TODO Auto-generated method stub
		
		if(number > this.value) {
			if (right == null) {
				right = new IntegerTreeNodeImpl (number);
			} else {
				right.add(number);
			}
			
		} else {
			if(left == null) {
				left = new IntegerTreeNodeImpl (number);
			} else {
				left.add(number);
			}
		}
	}

	@Override
	public boolean contains(int number) {
		
		
		if (this.value == number) {
			
			return true;
			
		} else {
			
			if (number > this.value) {
				
				if (right == null) {
					return false;
				} else {
					return right.contains(number);
				}
			} else {
				if (left == null) {
					return false;
				} else {
					return left.contains(number);
				}
			}
			
		}
	}

	@Override
	public int getMax() {
		// TODO Auto-generated method stub
		
		int max = 0;
		
		if (right == null) {
		    max = value;
		} else {
			max = right.getMax();
		}
		return max;
		
	}

	@Override
	public int getMin() {
		int min = 0;
		
		if (left == null) {
			min = value;
		} else {
			min = left.getMin();
		}
		
		return min;
	}

}
