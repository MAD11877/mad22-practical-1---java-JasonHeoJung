import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> numbers = new ArrayList<>();
    System.out.print("No. of numbers: ");
    int count = in.nextInt();
    for (int i = count; i > 0; i--)
    {
      System.out.print(">");
      int num = in.nextInt();
      numbers.add(num);
    }
    int mode = numbers.get(0);
    int maxCount = 0;
    for (int i = 0; i < numbers.size(); i++) 
    {
      int value = numbers.get(i);
      int counter = 0;
      for (int j = 0; j < numbers.size(); j++) 
      {
          if (numbers.get(j) == value) counter++;
          if (counter > maxCount) 
          {
              mode = value;
              maxCount = counter;
          }
      }
    }
    System.out.print("Mode: "+ mode);
  }
}
