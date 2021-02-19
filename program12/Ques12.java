import java.util.Arrays;
import java.util.List;

public class Ques12{

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int val = numbers.stream().filter(value -> value % 2 == 0).filter(value -> value > 3).findFirst().get();
    System.out.println("First even number in the integer list which is greater than 3 is "+val);
  }
}
