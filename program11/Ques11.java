import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Ques11{

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    double avg = numbers.stream().mapToDouble(value -> value + value).average().orElse(-1);
    System.out.println("Average of the number inside integer list after doubling it: "+ avg);
  }
}
