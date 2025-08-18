public class Reservation {
    private boolean isConfirmed;
  
    public Reservation(boolean confirmed) {
      isConfirmed = confirmed;
    }
  
    public void informUser() {
    // Both ways work, first one is easier to maintain/understand
    if (isConfirmed) {
      System.out.println("Please enjoy your meal!");
    }
    else {
      System.out.println("Unable to confirm reservation, please contact restaurant.");
    }

    if (!isConfirmed) {
      System.out.println("Unable to confirm reservation, please contact restaurant.");
    }
    else {
      System.out.println("Please enjoy your meal!");
    }
  }
}
