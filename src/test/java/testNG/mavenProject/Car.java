package testNG.mavenProject;

	import org.testng.annotations.AfterClass;
	//import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeClass;
	//import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;
	import org.testng.annotations.TestInstance;

	public class Car {

		
		@BeforeClass
		public void getCarKey()
		{
			System.out.println("take your car key");
		}
		
		@Test(priority=1)
		public void unlockCar()
		{
			System.out.println("please unclock your car");
		}
		
		
		@Test(priority=6)
		public void openBonet()
		{
			System.out.println("open your bonet");
		}
		
		@Test(priority=5)
		public void fillWindShieldLiquid()
		{
			System.out.println("fill your windshied liquid");
		}
		
		@Test(priority=4)
		public void checkWindShieldLiquidStatus()
		{
			System.out.println("check the level of wind shield liquid ");
		}
		
		@Test(priority=7)
		public void closeBonet()
		{
			System.out.println("close bonet");
		}
		
		@Test(priority=2)
		public void getInsideCar()
		{
			System.out.println("get inside your car");
		}
		
		@Test(priority =3)
		public void pressStartButton()
		{
			System.out.println("press on start button");
		}
		
		@Test(priority=8)
		public void checkBreak()
		{
			System.out.println("check your break");
		}
		
		@Test(priority=9)
		public void checkLights()
		{
			System.out.println("check your headlight and turn to auto mode");
		}
		
		@Test(priority=10)
		public void setTemperature()
		{
			System.out.println("set your required temperature");
		}
		
		@Test(priority=11)
		public void setDestination()
		{
			System.out.println("open your map and set destination");
		}
		
		@Test

		public void trunOnRadio()
		{
			System.out.println("radio on");
		}
		
		@AfterClass
		public void driveCarefully()
		{
			System.out.println("drive safely");
		}
		
		

	}



