/*
 * Represents a sandwich that is put into storage
 * Sandwich is a type of food
 */
public class Sandwich extends Food {

  private String type;
  private boolean hasAllergens;

  /*
   * Sets values in PantryRunner()
   */
  public Sandwich() {
    type = "plain";
    hasAllergens = false;
  }

  /*
   * Constructor
   */
  public Sandwich(String name, int amount, boolean isSpoiled, String type, boolean hasAllergens) {
    super(name, amount, isSpoiled);
    this.type = type;
    this.hasAllergens = hasAllergens;
  }

  /*
   * Return values
   */

  public String getType() {
    return type;
  }
  
  public boolean getHasAllergens() {
    return hasAllergens;
  }

  public void setType(String type) {
    this.type = type;
  }
  
  public void setHasAllergens(boolean hasAllergens) {
    this.hasAllergens = hasAllergens;
  }

  public String toString() {
    return super.toString() + "\nSandwich Type: " + type + "\nDoes this item have any allergens? " + hasAllergens;
  }
}