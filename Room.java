/*
Room
 👍 S.C. - NoArgsConstructor
 dibs A.S. - Room(String _name)
 dibs A.S. - getCharacter()
 dibs A.S. - getItem()
 👍 Riley - getLocationTo(String direction)
 👍 S.C. - getName()
 👍 Riley - getPossibleDirections()
 👍 Riley - linkRoom(Room r, String direction)
 👍 M.T. - setCharacter(Npc character)
 👍 S.C. - setDescription(String d)
 👍 M.T. - setItem(Item i)
 👍 M.T.  - setName(String _name)
 👍 Riley - toString() // returns the description
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
  
  // precondition: direction is either "north" or "south" or "east" or "west"
  public Room getLocationTo(String direction)
  {
    direction = direction.toLowerCase();
    if (direction.equals("north"))
    {
      return this.north;
    }
    else if (direction.equals("south"))
    {
      return this.south;
    }
    else if (direction.equals("east"))
    {
      return this.east;
    }
    else if (direction.equals("west"))
    {
      return this.west;
    }
    return null;
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
      result += "east, ";
    }
    if(this.west != null){
      result += "west, ";
    }
    return result;
  }
 
  // precondition: direction is either "north" or "south" or "east" or "west"
  public void linkRoom(Room r, String direction)
  {
    direction = direction.toLowerCase();
    if (direction.equals("north"))
    {
      this.north = r;
    }
    else if (direction.equals("south"))
    {
      this.south = r;
    }
    else if (direction.equals("east"))
    {
      this.east = r;
    }
    else if (direction.equals("west"))
    {
      this.west = r;
    }
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
  public String getCharacter() 
  {
   return character;
  }
 public String getItem()
 {
  return roomitem;
 }
  
  
  
  public void setName(String _name)
  {
    Room();
    this.name = _name;
  }
  public String getCharacter()
  {
   return character;
  }
  public String getItem()
  {
   return item;
  }
  public Room(String name) 
  {
   name=_name;
  }
 
  public String toString()
  {
    return this.description;
  }
 

  


 



}

