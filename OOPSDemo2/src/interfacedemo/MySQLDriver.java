package interfacedemo;

public class MySQLDriver implements ConnectDB{

	@Override
	public void connect() {
		System.out.println("----Connecting MySQL-----");
		
	}

	@Override
	public void use() {
		System.out.println("----Using MySQL-----");
		
	}

	@Override
	public void disConnect() {
		System.out.println("----DisConnecting MySQL-----");
		
	}

}
