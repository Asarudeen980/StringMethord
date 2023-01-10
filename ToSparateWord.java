package day3_stringMethod;

public class ToSparateWord {
	public static void main(String[]args) {
		String word="Hello-World";
		String word1="1Hello.1World";
		String word2="F11race2k";
		String word3="R oll number";
		String word4="2334g34gr343";
		String[] value=word.split("-");
		String[] value1=word1.split("[.]");
		String[] value2=word2.split("\\d+");
		String[] value3=word3.split("\\s+");
		String[] value4=word4.split("[a-z A-Z]");
		System.out.println(value[0]);
		System.out.println(value[1]);
		System.out.println(value1[0]);
		System.out.println(value1[1]);
		System.out.println(value2[0]);
		System.out.println(value2[1]);
		System.out.println(value2[2]);
		System.out.println(value3[0]);
		System.out.println(value3[1]);
		System.out.println(value3[2]);
		System.out.println(value4[0]);
		System.out.println(value4[1]);
		System.out.println(value4[2]);
	}

}
