/** 2.4 **/
import java.util.*;

public class SysDep	{
	public static void main(String[] argv)	{
		String nullDev = null;

		Properties p = System.getProperties();

		String sys = p.getProperty("os.name");

		if (sys == null)	{
			System.out.println("Could not get property \"os.name\"");
			throw new IllegalArgumentException("Could not get OS NAME");
		}

		else if (sys.startsWith("Windows"))
			nullDev = "NUL:";

		else nullDev = "/dev/null";

		System.out.println("OS is: " + sys);
		System.out.println("Null device on this OS is: " + nullDev);
	}
}
