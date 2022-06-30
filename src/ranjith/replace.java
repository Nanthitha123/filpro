package ranjith;

public class replace {
	public static void main(String args[]) {
		StringBuilder place= new StringBuilder("rectangular");
				place.replace(1,7,"bad");
				System.out.println(place);
	}

}