import java.util.*;

public class CountQueen8 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    int [][]a = new int[n][];
    int []maxRow = new int[n];
    int []maxCol = new int[n];
    int []maxMainDiag = new int[2*n];
    int []maxSubDiag = new int[2*n];

    for(int i = 0; i < n; i++) {
      a[i] = new int[n];
      for(int j = 0; j < n; j++) {
        a[i][j] = sc.nextInt();
      }
    }

    // tim max
    for(int i = 0; i < n; i++) {
      for(int j = 0; j < n; j++) {
        if(a[i][j] > maxRow[i]) {
          maxRow[i] = a[i][j];
        }

        if(a[i][j] > maxCol[j]) {
          maxCol[j] = a[i][j];
        }

        if(a[i][j] > maxMainDiag[i - j + n]) {
          maxMainDiag[i - j + n] = a[i][j];
        }

        if(a[i][j] > maxSubDiag[i + j]) {
          maxSubDiag[i + j] = a[i][j];
        }
      }
    }

    // dem hoang hau
    int queen = 0;

    for(int i = 0; i < n; i++) {
      for(int j= 0; j < n; j ++) {
        if(a[i][j] == maxRow[i] &&
          a[i][j] == maxCol[j] &&
          a[i][j] == maxMainDiag[i - j + n] &&
          a[i][j] == maxSubDiag[i +j]) {
            queen++;
        }
      }
    }

    System.out.println(queen);
  }
}