package day3_stringMethod;

public class Test1 {
	public static void main(String[]args) {
		String firstName="Ram";
		String lastName="Kumar";
		String con=firstName.concat(lastName);
		String capName=con.toUpperCase();
		System.out.println(capName);
		int len=capName.length();
	    System.out.println("Length is "+len);	
	}

}
