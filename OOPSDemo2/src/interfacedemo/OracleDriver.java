package interfacedemo;

public class OracleDriver implements ConnectDB {

	@Override
	public void connect() {
		System.out.println("----Connecting Oracle-----");
		
	}

	@Override
	public void use() {
		System.out.println("----Using Oracle-----");
		
	}

	@Override
	public void disConnect() {
		System.out.println("----DisConnecting Oracle-----");
		
	}
}
