package ranjith;

public class Swap {

	public static void main(String[] args) {
		int x=100;
		int y=200;
		System.out.println("before Swap");
		System.out.println("x= "+x);
		System.out.println("y= "+y);
		int s=x;
		x=y;
		y=s;
		
		System.out.println("after Swap");
		System.out.println("x= "+x);
		System.out.println("y= "+y);
	}

}
