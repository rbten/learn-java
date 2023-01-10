public class Reservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;

  public Reservation(int numberOfGuest, int capacity, boolean open) {
    if (numberOfGuest < 1 || numberOfGuest >8) {
      System.out.println("Invalid reservation!");
    }

    guestCount = numberOfGuest;
    restaurantCapacity = capacity;
    isRestaurantOpen = open;
  }

  public void confirmReservation() {
    if (restaurantCapacity >= guestCount && isRestaurantOpen) {
      System.out.println("Reservation confirmed");
      isConfirmed = true;
    } else {
      System.out.println("Reservation denied");
      isConfirmed = false;
    }
  }

  public void informUser() {
    if (!isConfirmed) {
      System.out.println("Unable to confirm reservation, please contact restaurant.");
    } else {
      System.out.println("Please enjoy your meal!");
    }
  }

  public static void main(String[] args){
    Reservation partyOfThree = new Reservation(3, 12, true);
    partyOfThree.confirmReservation();
    partyOfThree.informUser();

    Reservation partyOfFour = new Reservation(4, 3, true);
    partyOfFour.confirmReservation();
    partyOfFour.informUser();
  }
}