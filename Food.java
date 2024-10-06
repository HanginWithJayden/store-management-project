/*
 * Represents a food that is stored in a pantry
 */
public class Food {

  private String name;
  private int amount;
  private boolean isSpoiled;
  

  /*
   * Sets values to instance variables
   */
  public Food() {
    this("not in storage", 0, false);
  }

  /*
   * Sets name to the specified name and
   * amount to the specified amount and if
   the answer to if it is spoiled.
   */
  public Food(String name, int amount, boolean isSpoiled) {
    this.name = name;
    this.amount = amount;
    this.isSpoiled = isSpoiled;
    
  }

  /*
   * Returns the value assigned to name
   */
  public String getName() {
    return name;
  }
  
  /*
   * Returns the value assigned to amount
   */
  public int getAmount() {
    return amount;
  }
  
  /*
   * Returns the value assigned if it is spoiled or not
   */
  public boolean getIsSpoiled() {
    return isSpoiled;
  }
  
  /*
  * Mutator method for name
  */
  public void setName(String name) {
    this.name = name;
  }

  /*
  * Mutator method for amount
  */
  public void setAmount(int amount) {
    if (amount < 0) {
      this.amount = 0;
    } else {
      this.amount = amount;
    }
  }

  /*
  * Mutator method for if it is spoiled:
  */
  public void setIsSpoiled(boolean isSpoiled) {
    this.isSpoiled = isSpoiled;
  }

  public String toString() {
    return "Name of food/ingredient: " + name + "\nAmount in pantry: " + amount + "\nIs it spoiled or rotten? " + isSpoiled;
  }
}