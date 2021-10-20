/*
Enemy extends Npc
 👍 K.S. - NoArgsConstructor
 dibs H.A. - Enemy(String _name, String _description)
 👍 K.S. - String getAttackName()
 dibs H.A. - int getHealth
 👍 K.S. - int getMagicWeakness()
 - void loseHealth(int h)
 dibs H.A. - void setAttackName()
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
  
  public Enemy(String enemyName, String enemyDescription){
    super();
    health = 100;
    magicWeakness = 1;
    attackName = "SLASH";
    setName(enemyName);
    setSpeech("");
    setDescription(enemyDescription);
  }
  
  public int getHealth(){
    return health;
  }
  
  public void loseHealth(int healthLost){
    health = health - healthLost;
  }
  
  public String getAttackName(){
    return attackName;
  }
  
  public int getMagicWeakness(){
    return magicWeakness;
  }
}
