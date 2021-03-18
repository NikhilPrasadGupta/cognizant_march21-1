package abstractclass;

public class HondaCity extends Car {

	public HondaCity() {
		
	}
	public HondaCity(int regNo) {
		super(regNo);
	}

	@Override
	void drive() {
		System.out.println("HondaCity is driven by power steering : regNo : "+getRegNo());

	}

	@Override
	void stop() {
		System.out.println("HondaCity is stoped by power break : regNo : "+getRegNo());

	}

}
