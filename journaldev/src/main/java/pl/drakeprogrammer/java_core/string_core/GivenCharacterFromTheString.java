package pl.drakeprogrammer.java_core.string_core;

public class GivenCharacterFromTheString {

	public static void main(String[] args) {
		String text1 = "Hello world for given character from the string";

		System.out.println(giveCharacterFromStringByNumber(text1, 0));
	}

	private static String giveCharacterFromStringByNumber(String text, int charNumber) {
		if (text == null) {
			return "";
		} else if (charNumber > text.length() || charNumber < 1) {
			return "";
		}
		return text.substring(charNumber - 1, charNumber);
	}
}
