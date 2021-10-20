/*
Room
 👍 S.C. - NoArgsConstructor
 dibs A.S. - Room(String _name)
 dibs A.S. - getCharacter()
 dibs A.S. - getItem()
 - getLocationTo(String direction)
 👍 S.C. - getName()
 👍 Riley - getPossibleDirections()
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
  
  public String getPossibleDirections()
  {
    String result = "";
    if(this.north != null){
      result += "north, ";
    }
    if(this.south != null){
      result += "south, ";
    }
    if(this.east != null){
      result += "north, ";
    }
    if(this.west != null){
      result += "north, ";
    }
    return result;
  }

    // sets the character to a Npc object that you inputed into this method
  public void setCharacter(Npc character)
  {
     this.character = character;
  }
  
  public void setDescription(String newDescription)
  {
    this.description = newDescription;

  }
 
  public void setItem(Item i)
  {
    this.roomItem = i; 
  }
  
  public void setName(String _name)
  {
    this.name = _name;
  }

  


 



}

