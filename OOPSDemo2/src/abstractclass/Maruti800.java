package abstractclass;

public class Maruti800 extends Car {

	public Maruti800() {
		
	}
	public Maruti800(int regNo) {
		super(regNo);
		
	}

	@Override
	void drive() {
		System.out.println("Maruti 800 is driven by normal steering : regNo : "+getRegNo());

	}

	@Override
	void stop() {
		System.out.println("Maruti 800 is stoped by normal break : regNo :"+getRegNo());

	}

}
