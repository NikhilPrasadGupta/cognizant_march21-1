
public class JaggedArrayDemo {

	public static void main(String[] args) {
		int [][] arr =  new int[2][];
		arr[0]=new int[3];
		arr[1]=new int[5];
		
		arr[0][0] = 10;
		arr[0][1] = 20;
		arr[0][2] = 30;
		
		arr[1][0] = 40;
		arr[1][1] = 50;
		arr[1][2] = 60;
		arr[1][3] = 70;
		arr[1][4] = 80;
		
		System.out.println("length of arr : "+arr.length);
		System.out.println("length of arr[0] : "+arr[0].length);
		System.out.println("length of arr[1] : "+arr[1].length);
		
		System.out.println("--------Output before changes---------");
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		
		int [] temp = {100,200,300,400,500,600,700};
		System.out.println("Hash code of arr[1] : "+arr[1].hashCode());
		System.out.println("Hash code of tempt : "+temp.hashCode());
		
		
		System.out.println("--------Output after changes---------");
		arr[1]=temp;
		System.out.println("Hash code of arr[1] : "+arr[1].hashCode());
		System.out.println("Hash code of tempt : "+temp.hashCode());
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
			
		}
		

	}

}
