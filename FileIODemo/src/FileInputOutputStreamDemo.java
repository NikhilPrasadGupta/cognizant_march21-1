import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputOutputStreamDemo {
	public static void main(String[] args) throws IOException{
		File inputFile=new File("inputTest.txt");
		File ouputFile=new File("outputTest.txt");
		
		FileInputStream in =new FileInputStream(inputFile);
		FileOutputStream out=new FileOutputStream(ouputFile);
		int c;
		while((c=in.read())!=-1) {
			System.out.println(c);
			out.write(c);
		}
		
		System.out.println("FileInputStream is used to read a file and FileOutputStream is used for writing");
		
		in.close();
		out.close();
		
	}

}
