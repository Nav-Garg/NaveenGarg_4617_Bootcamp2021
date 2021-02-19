import java.util.Arrays;
import java.util.List;
import java.util.*;

public class Ques10{

  public static void main(String[] args) {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    int sum = 0;
    numbers.stream()
           .filter(value -> value > 5)
	   .mapToInt(value -> value).sum()
           .forEach(System.out::println);
  }
}
