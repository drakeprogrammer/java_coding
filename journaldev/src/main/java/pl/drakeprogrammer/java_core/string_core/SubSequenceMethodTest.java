package pl.drakeprogrammer.java_core.string_core;

public class SubSequenceMethodTest {

	public static void main(String[] args) {
		int fromIndex = 2;
		int toIndex = 5;
		String text1 = "Hello world";

		CharSequence charSequence1 = text1.subSequence(fromIndex, toIndex);
		String result1 = charSequence1.toString();
		System.out.println(result1);

		String result2 = text1.substring(fromIndex, toIndex);
		System.out.println(result2);

		System.out.println(result2.equals(result1));

	}
}
