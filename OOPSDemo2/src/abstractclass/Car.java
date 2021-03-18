package abstractclass;

public abstract class Car {

	private int regNo;
	
	//Execution behaviour can be handled from default constructor of Abstract class.
	public Car() {
		fillTank();
		drive();
		stop();
	}
	
	public Car(int regNo) {
		this.regNo=regNo;
	}
	public int getRegNo() {
		return regNo;
	}
	abstract void drive();
	abstract void stop();
	void fillTank() {
		System.out.println("Car is getting fulled.......RegNo : "+regNo);
	}
}
