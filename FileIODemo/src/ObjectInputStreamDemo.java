import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectInputStreamDemo {

	public static void main(String[] args) {
		
		try {
			FileInputStream in=new FileInputStream("employeeDetail");
			ObjectInputStream ois =  new ObjectInputStream(in);
			Employee employee =(Employee) ois.readObject();
			System.out.println("Name : "+employee.getName());
			System.out.println("Contact : "+employee.getContact());
			
		} catch(Exception e) {
			System.out.println("Problem is : "+e.getMessage());
		}
		

	}

}
