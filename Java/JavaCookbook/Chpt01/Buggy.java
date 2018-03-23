/** Recipe 1.13 **/
public class Buggy {

	static String	name;

	public static void main( String[] args)	{
	
		int n =	name.length( );	// bug # 1

		System.out.println(n);

		name +=	"; The end.";	// ug #2

		System.out.println(name);	// #3
	}
}
