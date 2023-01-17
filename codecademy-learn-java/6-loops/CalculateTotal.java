import java.util.ArrayList;

public class CalculateTotal {
  public static void main(String[] args) {
    
    ArrayList<Double> expenses = new ArrayList<Double>();

    expenses.add(1.1);
    expenses.add(2.2);
    expenses.add(3.3);
    expenses.add(4.4);

    double total = 0;

    for (int i = 0; i < expenses.size(); i++) {
      total += expenses.get(i);
    }

    System.out.println(total);
  }
}