package pl.drakeprogrammer.java_core.string_core;

public class RemoveGivenCharacterFromTheString {

	public static void main(String[] args) {
		String text1 = "Hello world for given character from the string";

		System.out.println(removeCharacterFromString(text1, 'h'));
	}

	private static String removeCharacterFromString(String text, Character c) {
		if (text == null) {
			return "";
		}
		return text.replaceAll(c.toString(), "");
	}
}
