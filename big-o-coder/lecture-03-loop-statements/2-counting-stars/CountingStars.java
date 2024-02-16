 import java.util.Scanner;

public class CountingStars{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int count = 0;
    while(true){
      int inputUser = sc.nextInt();
      if(inputUser == 5){
        count++;
      }
      if(inputUser == 0){
        break;
      }
    }
    
    System.out.println(count);
  }
}