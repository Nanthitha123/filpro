package testng;

import org.testng.annotations.Test;

public class dependon {

	@Test //(enabled=true) //will not execute when (enabled=false)
	public  void switchon() {
		System.out.println("open");
	}
	@Test (dependsOnMethods="switchon")
		public  void speed1() {
			System.out.println("password");
		}
	@Test (dependsOnMethods="speed1")
		public  void speed2() {
			System.out.println("login");
		}
	@Test (dependsOnMethods="speed2")
		public  void speed3() {
			System.out.println("page");

}}
