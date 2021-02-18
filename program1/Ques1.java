import java.util.*;

class Ques1
{
	public static void main(String args[])
	{
		List<Float> al = new ArrayList<Float>();
		al.add(10.4f);
		al.add(20.5f);
		al.add(30.1f);
                al.add(40.7f);
		al.add(50.4f);
                al.add(60.3f);
		
		System.out.println("Floating values in the list:");
		float sum = 0f;
		Iterator i = al.iterator();
		while(i.hasNext())
		{
			float x = (float)i.next();
			System.out.println(x);
			sum = sum + x;
		}

		System.out.println("Total Sum: "+ sum);
	}
}

