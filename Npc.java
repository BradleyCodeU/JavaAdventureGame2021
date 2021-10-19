/*
Npc
 - NoArgsConstructor
 - Npc(String _name, String _description)
 - getName
 - getSpeech
 - setDescription(String d)
 - setName(String _name)
 - setSpeech
 - toString() // returns the description
*/
public class Npc
{
  private String name;
  private String speech;
  private String description;
 
  public Npc()
  {
    name = "";
    speech = "";
    description = "";
  }
  
  public Npc(String newName, String newDescription)
  {
    this.name = newName;
    this.description = newDescription;
  }
  
  public String getName()
  {
    return this.name;
  }
  public String getSpeech()
  {
    return this.speech;
  }

  public void setDescription(String d)
  {
    description = d;
  }
 
  public void setName(String _name)
  {
    name = _name;
  }
 

 

}
