import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo {

	public static void main(String[] args) {
		
		try {
			FileOutputStream out=new FileOutputStream("employeeDetail");
			ObjectOutputStream oos =  new ObjectOutputStream(out);
			Employee employee=new Employee(101, "pankaj sharma", "8827611875");
			oos.writeObject(employee);
			System.out.println("Success! Employee Saved");
			oos.flush();
		} catch(Exception e) {
			System.out.println("Problem is : "+e.getMessage());
		}
		

	}

}
