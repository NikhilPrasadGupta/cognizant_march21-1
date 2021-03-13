/**
* Name : Pankaj Sharma
* Description :  Demo of Method
* Date :  13/3/2021
*/

class MethodDemo {
	public static void show(){
		System.out.println("Show Method");
	}
	public static int add(int num1,int num2){
		return num1+num2;
	}
	public static void main(String[] args){
		show();
		show();
		show();
		int result = add(10,20);
		System.out.println("Addition is :"+result);
	}
}