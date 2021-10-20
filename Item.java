/*
Item
 👍 K.S. - NoArgsConstructor
 👍 R.O. - Item(String _name, String _description)
 👍 J.M. - getMagicType()
 👍 W.M. - getName()
 👍 W.M. - getStrength()
 👍 W.M. - setDescription(String d)
 dibs J.M. - setName(String _name)
 👍 R.O. - isBroken() // returns true if strength is 0
 dibs J.M. - toString() // returns the description
 👍 R.O. - weaken() // set strength to strength div by 2

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
    strength = 20;
    description = "";
    magicType = 1;
  }

  public Item(String _name, String _description) {
    name = _name;
    description = _description;
    strength = 20;
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

 public void weaken() {
  strength = (strength/2);
 }
  
 public boolean isBroken() {
  if strength <= 0 {
   return true;
  }
  else if strength > 0 {
   return false;
  }
 }

}
