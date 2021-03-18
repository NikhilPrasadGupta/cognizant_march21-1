package abstractclass;

public class TestDrive {

	public static void main(String[] args) {
//		Car driver;
//		driver=new HondaCity(1234);
//		driver.drive();
//		driver.stop();
//		driver.fillTank();
		
		//new Maruti800();
		//new HondaCity();
		
		Car driver = new Car(1234) {
			
			@Override
			void stop() {
				System.out.println("Dummy car stoped");
				
			}
			
			@Override
			void drive() {
				System.out.println("Dummy Car driven");
				
			}
		};
		driver.fillTank();
		driver.drive();
		driver.stop();
		

	}

}
