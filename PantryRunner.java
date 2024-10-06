public class PantryRunner {
  public static void main(String[] args) {

    Food burger = new Food("Burger", 24, false);

    System.out.println(burger);

    Sandwich pbj = new Sandwich("Sandwich", 17, false, "Peanut Butter & Jelly", true);

    System.out.println(pbj);

    Shawarma chicken = new Shawarma("Shawarma", 35, false, "Spicy Garlic Chicken", 7.50);

    System.out.println(chicken);

  }
}