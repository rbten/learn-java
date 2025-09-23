class MyJavaApp {

    int add (int num1, int num2) {
        return num1 + num2;
    }

    int add (int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    int add (int num1, int num2, int num3, int num4) {
        return num1 + num2 + num3 + num4;
    }

    public static void main(String[] args) {
        MyJavaApp cal = new MyJavaApp();

        System.out.println("10 + 20 = " + cal.add(10, 20));
        System.out.println("10 + 20 + 30 = " + cal.add(10, 20, 30));
    }
}

