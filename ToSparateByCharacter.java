package day3_stringMethod;

public class ToSparateByCharacter {
	public static void main(String[]args) {
		String word="Dog";
		char[] letter=word.toCharArray();
		System.out.println(letter[2]+" "+letter[1]+" "+letter[0]);
	}

}
