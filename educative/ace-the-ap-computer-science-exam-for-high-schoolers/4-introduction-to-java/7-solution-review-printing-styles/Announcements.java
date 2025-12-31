class Announcements {
    public static void men100meters(float time, String month, int year) {
        System.out.println("Usain Bolt has broken the world record for men's 100 meters."); 
        System.out.println();
        System.out.print("Time taken: ");
        System.out.println(time);
        System.out.print("Month taken: ");
        System.out.println(month);
        System.out.print("Year taken: ");
        System.out.println(year);
    }

    public static void main(String[] args) {
        men100meters(9.58f, "August", 2009);
    }
}