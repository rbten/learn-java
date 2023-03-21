import java.util.Scanner;

public class Lecture07String{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Kieu ky tu

    // char c = sc.nextLine().charAt(0);
    // System.out.println(c);
    // c = '!';
    // System.out.println(c);

    // Kieu chuoi

    // String myName = "";
    // myName = sc.nextLine();
    // System.out.println("Ban vua nhap: " + myName);
    // System.out.println("Do dai: " + myName.length());

    // Gan bang 2 chuoi
    // String name1 = "Robert";
    // String name2 = name1 + "22222";

    // System.out.println("Name 1: " + name1);
    // System.out.println("Name 2: " + name2);
    
    // Truy Xuat 
    // String myName = "Ho Tuan Thanh";
    // System.out.println(myName.charAt(5));

    // StringBuilder builder = new StringBuilder(myName);
    // builder.setCharAt(5, '@');
    // myName = builder.toString();

    // System.out.println(myName);
    // System.out.println(myName.charAt(5));

    // StringBuilder builder1 = new StringBuilder(myName);
    // builder1.setCharAt(1, '0');
    // myName = builder1.toString();
    // System.out.println(myName);

    // Duyet Chuoi
    // String myName = "Ho Tuan Thanh";

    // for(int i = 0; i < myName.length(); i++) {
    //   System.out.printf("%c", myName.charAt(i));
    //   System.out.println();
    // }

    // for(char x : myName.toCharArray()) {
    //   System.out.printf("%c ", x);
    // }

    // loi hay input
    // int n;
    // String s;

    // s = sc.nextLine();
    // n = sc.nextInt();

    // System.out.println("n: " + n);
    // System.out.println("s: " + s);

    //  bang ma ASCII
    // System.out.println((int)'B');
    // System.out.println((int)65);
    // System.out.println((char)65);

    // so sanh hai chuoi
    // String s1 = "Thanh";
    // String s2 = "thanh";
    // System.out.println(s1.compareToIgnoreCase(s2));

    // kiem tra s2 co trong s1 khong
    // String s1 = "Ho Tuan Thanh";
    // String s2 = "Thanh";

    // s1 = s1.toLowerCase();
    // s2 = s2.toLowerCase();

    // System.out.println(s1.indexOf(s2));

    // Tao chuoi moi tu chuoi ban dau
    // String s = "Gr3en22";
    // String newS = "";

    // for(int i = 0 ; i < s.length(); i++) {
    //   if(s.charAt(i) >= '0' && s.charAt(i) <= '9') {
    //     newS += s.charAt(i);
    //   }
    // }

    // System.out.println(newS);

    // Lay chuoi con
    // String s = "Ho Tuan Thanh";

    // String mid = s.substring(3, 7);
    // System.out.println(mid);

    // String midFirst = s.substring(3);
    // System.out.println(midFirst);

    // Tach chuoi
    // String s = "123;456;789";
    // String[] a = s.split(";");
    // for(String ans : a) {
    //   System.out.println(ans);
    // }

  }
}