/*
Room
 👍 S.C. - NoArgsConstructor
 - Room(String _name)
 - getCharacter()
 - getItem()
 - getLocationTo(String direction)
 👍 S.C. - getName()
 - getPossibleDirections()
 - linkRoom(Room r, String direction)
 👍 M.T. - setCharacter(Npc character)
 👍 S.C. - setDescription(String d)
 👍 M.T. - setItem(Item i)
 dibs M.T. - setName(String _name)
 - toString() // returns the description
*/
public class Room
{
  private String name;
  private String description;
  private Npc character;
  private Item roomItem;
  private Room north;
  private Room south;
  private Room east;
  private Room west;
 

  
  public Room()
  {
    this.description = "Living Room";
    this.name = "Living Room";
  }
  
  public String getName()
  {
    return name;
  }
  
  public void setDescription(String newDescription)
  {
    this.description = newDescription;

  }

 
  public void setItem(Item i)
  {
    this.roomItem = i; 
  }

  
  // sets the character to a Npc object that you inputed into this method
  public void setCharacter(Npc character)
  {
     this.character = character;
  }

 



}

