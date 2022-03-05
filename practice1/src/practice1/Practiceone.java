package practice1;

public class Practiceone {
	public static void main(String[] args)
	{
		String name="ABcd9$";
		System.out.println(name);
		System.out.println(name.codePointAt(0));
		System.out.println(name.codePointAt(1));
		System.out.println(name.codePointAt(2));
		System.out.println(name.codePointAt(3));
		System.out.println(name.codePointAt(4));
		System.out.println("code point of c:"+name.codePointAt(2));
		System.out.println("codepoint of d:"+name.codePointAt(3));
		System.out.println("codepoint of $:"+name.codePointAt(5));
	}

}
