/** 3.3 Putting strings together with +, StringBuilder, and StringBuilder **/

public class StringBuilderDemo	{

	public static void main(String[] argv)	{

		String s1 =	"Hello" + ", " + "World";
		System.out.println(s1);

		StringBuilder sb2 = new StringBuilder();
		sb2.append("Hello");
		sb2.append(',');
		sb2.append(' ');
		sb2.append("World");

		String s2 = sb2.toString();
		System.out.println(s2);

		StringBuilder sb3 = new StringBuilder().append("Hello").append(',').append(' ').append("World");
		System.out.println(sb3.toString());
	}
}
