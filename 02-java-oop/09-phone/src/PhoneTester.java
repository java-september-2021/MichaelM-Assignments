public class PhoneTester {
  public static void main(String[] args) {
    Galaxy s8 = new Galaxy("S9", 99, "T-Mobile", "RING RING");
    IPhone iPhone7 = new IPhone("X", 100, "ATT", "Zzz zzz zzz");
    s8.displayInfo();
    iPhone7.displayInfo();
  }
}
