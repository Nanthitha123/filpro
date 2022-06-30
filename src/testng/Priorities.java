package testng;

import org.testng.annotations.Test;

public class Priorities {
	
	@Test (priority=0)
	public  void browser1() {
		System.out.println("open");
	}
	@Test (priority=2)
		public  void browser() {
			System.out.println("password");
		}
	@Test (priority=1)
		public  void browser2() {
			System.out.println("login");
		}
	@Test (priority=3)
		public  void browser3() {
			System.out.println("page");
}
}
