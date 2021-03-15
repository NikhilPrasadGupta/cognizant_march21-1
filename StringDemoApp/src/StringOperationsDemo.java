
public class StringOperationsDemo {

	public static void main(String[] args) {
		String str ="Hello Friends";
		System.out.println("charAt() =>"+str.charAt(1));
		System.out.println("indexOf()=>"+str.indexOf("e"));
		System.out.println("lastIndexOf() =>"+str.lastIndexOf("e"));
		System.out.println("startsWith() =>"+str.startsWith("foo"));
		System.out.println("endsWith() =>"+str.endsWith("ends"));
		System.out.println("substring() =>"+str.substring(str.indexOf("F"),9));

	}

}
