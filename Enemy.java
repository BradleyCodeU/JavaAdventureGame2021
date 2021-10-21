/*
Enemy extends Npc
 👍 K.S. - NoArgsConstructor
 👍 H.A. - Enemy(String _name, String _description)
 👍 K.S. - String getAttackName()
 👍 H.A. - int getHealth
 👍 K.S. - int getMagicWeakness()
 👍 H.A. - void loseHealth(int h)
 👍 Riley - void setAttackName()
*/
public class Enemy extends Npc
{
  // class variables
  private static int enemyCounter = 0;
  
  // class methods
  public static int getEnemyCounter()
  {
    return enemyCounter;
  }
  
  // instance variables
  private int health;
  private int magicWeakness;
  private String attackName;
  
  public Enemy(){
    super();
    this.health = 100;
    this.magicWeakness = 1;
    this.attackName = "SLASH";
    this.setName("");
    this.setSpeech("");
    this.setDescription("");
    enemyCounter++;
  }
  
  public Enemy(String enemyName, String enemyDescription){
    super();
    health = 100;
    magicWeakness = 1;
    attackName = "SLASH";
    setName(enemyName);
    setSpeech("");
    setDescription(enemyDescription);
    enemyCounter++;
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
  
  public void setAttackName(String _attackName){
    attackName = _attackName;
  }
}
