/*
Enemy extends Npc
 👍 NoArgsConstructor
 dibs H. - Enemy(String _name, String _description)
 👍 String getAttackName()
 dibs H. - int getHealth
 👍 int getMagicWeakness()
 - void loseHealth(int h)
 dibs H. - void setAttackName()
*/
public class Enemy extends Npc
{
  private int health;
  private int magicWeakness;
  private String attackName;
  
  public Enemy(){
    super();
    health = 100;
    magicWeakness = 1;
    attackName = "SLASH";
    setName("");
    setSpeech("");
    setDescription("");
  }
  
  public String getAttackName(){
    return attackName;
  }
  
  public int getMagicWeakness(){
    return magicWeakness;
  }
}
