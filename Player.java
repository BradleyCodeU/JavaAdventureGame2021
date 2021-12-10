/*
Attributes:

health
kickStrength
punchStrength
backpack
enemiesKilled
currentRoom

Methods:

addEnemyKilled()
loseHealth( int hpLost )
pickUpItem( Item newItem )
dropItem()
moveToRoom( Room newRoom )
getHealth()
punch()
kick()
getItem()
getEnemiesKilled()
getCurrentRoom()
*/
public class Player
{
  // instance variables
  private int health;
  private int kickStrength;
  private int punchStrength;
  private Item backpack;
  private int enemiesKilled;
  private Room currentRoom;
  
  // constructor
  
  // methods
  
  public void pickUpItem (Item newItem) {
    backpack = newItem;
  }
  public int getHealth () {
    return health;
  }
  public int getEnemiesKilled (){
    return enemiesKilled;
  }
  
}
