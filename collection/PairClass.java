package collection;

public class PairClass<X,Y> {
	X x;
	Y y;

	public PairClass(X x , Y y) {
		this.x = x;
		this.y = y;
		}
	
	public void description() {
		System.out.println(x+ " and " +y);
	}

}
