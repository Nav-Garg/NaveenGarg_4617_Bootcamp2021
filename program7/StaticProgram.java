class StaticProgram
{
	static int age = 24;
	static void lname()
	{
		System.out.println("Last Name: Garg");
	}
	static
	{
		System.out.println("First Name: Naveen");
	}

	public static void main(String args[])
	{
		lname();
		System.out.println("Age: "+ age);
	}
}
