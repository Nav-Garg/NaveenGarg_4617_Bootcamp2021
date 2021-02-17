class AlsCustomException extends RuntimeException
{
  public AlsCustomException(String message)
  {
    super(message);
  }
}

class Foo
{
  public String getBar(int i)
  throws AlsCustomException
  {
    if (i == 0)
    {
      throw new AlsCustomException("Anything but zero ...");
    }
    else
    {
      return "Thanks";
    }
  }
}

public class CustomException
{
  public static void main(String[] args)
  {
    Foo foo = new Foo();
    String bar = foo.getBar(0);
  }
}
