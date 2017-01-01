package ntou.chupei;

public class Console 
{
	public static void log(String mesg)
	{
		System.out.println("[Log]: " + mesg);
	}
	public static void warn(String mesg)
	{
		System.out.println("[Warning]: " + mesg);
	}
	public static void err(String mesg)
	{
		System.out.println("[Error]: " + mesg);
	}
}
