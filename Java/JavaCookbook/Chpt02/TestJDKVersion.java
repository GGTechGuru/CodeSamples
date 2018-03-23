/** 2.3 **/
public class TestJDKVersion	{
	public static void main(String[] argv)	{

		// Check for JDK >= 1.1
		try	{
			Class.forName("java.lang.reflect.Constructor");
		} catch (ClassNotFoundException e)	{
			String failure =
				"Sorry, but the tested for class does not exist in " +
				"this version of the JDK.";
				
				System.err.println(failure);
				throw new IllegalArgumentException(failure);
		}

		System.out.println("Found class java.lang.reflect.Constructor");
	}
}
