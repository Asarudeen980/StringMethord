package day3_stringMethod;

public class CheckBooleanFunction {
	public static void main(String[]args) {
		String name="Asarudeen";
		boolean result1=name.contains("R");
		boolean result2=name.startsWith("A");
		boolean result3=name.endsWith("deen");
		boolean result4=name.equals("Asarudee");
		boolean result5=name.equalsIgnoreCase("Aarudeen");
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
		
		
	}

}
