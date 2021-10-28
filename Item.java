/*
Item
 👍 K.S. - NoArgsConstructor
 👍 R.O. - Item(String _name, String _description)
 👍 J.M. - getMagicType()
 👍 W.M. - getName()
 👍 W.M. - getStrength()
 👍 W.M. - setDescription(String d)
 👍 J.M. - setName(String _name)
 👍 R.O. - isBroken() // returns true if strength is 0
 👍 J.M. - toString() // returns the description
 👍 R.O. - weaken() // set strength to strength div by 2

 */
import java.util.Random;

public class Item
{
  private String name;
  private int strength;
  private String description;
  private int magicType;
  private Random rng = new Random();
 
  public Item()
  {
    name = "";
    strength = 20;
    description = "";
    magicType = rng.nextInt(3);
  }

  public Item(String _name, String _description) {
    name = _name;
    description = _description;
    strength = 20;
    magicType = 1;
  }
 public String toString(){
  return description;
  }


  public int getMagicType()
  {
    return magicType;
  }

  public String getName()
  {
    return name;
  }
 
  public void setName(String _name){
   this.name = _name;
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
  if (strength <= 0)
  {
   return true;
  }
  else 
  {
   return false;
  }
 }

}
