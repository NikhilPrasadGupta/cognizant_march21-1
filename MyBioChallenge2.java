/**
* Name : Pankaj Sharma
* Description :  Challenge2:  MyBio App using Functions
* Date :  13/3/2021
=========================================
- Create a function and name it as GetInput :  this function should take input as personId,personName,location,contactNumber and email
- Create a function and name it as ShowOutput :  this function should display provided values.
*/

class MyBioChallenge2 {
		 int personId;
		/*String personName;
		String location;
		String contactNumber;
		String email;*/
	//,String personName,String location,String contactNumber , String email
	public static void getInput(int personId){
		this.personId = personId;
	} 
	 public static void main(String[] args){
		 
		getInput(1001);
		
		
		/*System.out.println("id : "+personId);
		System.out.println("Name : "+personName);
		System.out.println("Location : "+location);
		System.out.println("Contact : "+contactNumber);
		System.out.println("Email : "+email);*/
	 }
}