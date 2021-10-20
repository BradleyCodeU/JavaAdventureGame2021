/*
Item
 👍 K.S. - NoArgsConstructor
 - Item(String _name, String _description)
 👍 J.M. - getMagicType()
 👍 W.M. - getName()
 👍 W.M. - getStrength()
 👍 W.M. - setDescription(String d)
 dibs J.M. - setName(String _name)
 - isBroken() // returns true if strength is 0
 dibs J.M. - toString() // returns the description
 - weaken() // set strength to strength div by 2
 */
public class Item
{
  private String name;
  private int strength;
  private String description;
  private int magicType;
 
  public Item()
  {
    name = "";
    strength = 50;
    description = "";
    magicType = 1;
  }

  public int getMagicType()
  {
    return magicType;
  }

  public String getName()
  {
    return name;
  }

  public int getStrength()
  {
    return strength;
  }

  public void setDescription(String _string)
  {
    description = _string;
  }
 

}
