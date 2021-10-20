/*
Item
 👍 K.S. - NoArgsConstructor
 👍 Riley - Item(String _name, String _description)
 👍 J.M. - getMagicType()
 👍 W.M. - getName()
 👍 W.M. - getStrength()
 👍 W.M. - setDescription(String d)
 dibs J.M. - setName(String _name)
 👍 W.M. - isBroken() // returns true if strength is 0
 dibs J.M. - toString() // returns the description
 👍 W.M. - weaken() // set strength to strength div by 2
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
 
  public Item(String _name, String _description)
  {
    name = _name;
    strength = 20;
    description = _description;
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
 
  public boolean isBroken()
   {
    if (strength <= 0)
    {
     return true;
    }
    return false;
   }


  //If dividing by 2, the item will never reach the "broken" state. So, if the item is weak enough (below .25), it sets itself as 0, making it actually possible to be broken.
  public void weaken()
  {
   if (strength >= .25)
    {
     strength = strength/2;
    }
   else
    {
     strength = 0;
    }
  }

 
}
