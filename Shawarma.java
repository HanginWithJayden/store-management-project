/*
 * Represents the amount shawarmas in the pantry
 * Shawarma is a type of Food
 */
public class Shawarma extends Food {

  private String flavor;
  private double tortillaLength;
  
  /*
   * Sets default values to PantryRunner()
   */
  public Shawarma() {
    flavor = "plain";
    tortillaLength = 1.50;
  }

  /*
   * Sets the flavor to the specified flavor, and the length to the
   * specified length
   */
  public Shawarma(String name, int amount, boolean isSpoiled, String flavor, double tortillaLength) {
    super(name, amount, isSpoiled);
    this.flavor = flavor;
    this.tortillaLength = tortillaLength;
  }

  /*
   * Returns the values
   */
  public String getFlavor() {
    return flavor;
  }

  public double getTortillaLength() {
    return tortillaLength;
  }

  public void setFlavor(String flavor) {
    this.flavor = flavor;
  }

  public void setTortillaLength(double tortillaLength) {
    this.tortillaLength = tortillaLength;
  }

  public String toString() {
    return super.toString() + "\nFlavor: " + flavor + "\nLength of Tortilla: " + tortillaLength;
  }
}