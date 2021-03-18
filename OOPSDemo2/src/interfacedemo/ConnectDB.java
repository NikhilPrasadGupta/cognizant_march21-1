package interfacedemo;

/**
 * This ConnectDB interface is used to perform common operations like connecting, transaction and resource release
 * @author panka
 *
 */
public interface ConnectDB {
	/**
	 * this connect method is used to connect with database
	 */
	void connect();
	/**
	 * This use method is used for transaction
	 */
	void use();
	/**
	 * This disConnect method is used for resourse release
	 */
	void disConnect();

}
