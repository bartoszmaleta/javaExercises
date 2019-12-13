package examplesFromCodeCademy;

public class Reservation {
  int guestCount;
  int restaurantCapacity;
  boolean isRestaurantOpen;
  boolean isConfirmed;

  public Reservation(int count, int capacity, boolean open) {
    if (count < 1 || count > 8) {
      System.out.println("Invalid reservation!");
    }
    guestCount = count;
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

  public static void main(String[] args) {

    System.out.println();
    Reservation partyForThree = new Reservation(2, 12, true);
    Reservation partyForFour = new Reservation(10, 12, true);
    Reservation partyOfThree = new Reservation(3, 12, true);
    Reservation partyOfFour = new Reservation(4, 3, true);
    System.out.println();

    partyForThree.confirmReservation();
    partyForThree.informUser();
    System.out.println();

    partyForFour.confirmReservation();
    partyForFour.informUser();
    System.out.println();

    partyOfThree.confirmReservation();
    partyOfThree.informUser();
    System.out.println();

    partyOfFour.confirmReservation();
    partyOfFour.informUser();
    System.out.println();

  }
}