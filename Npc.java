/*
Npc
 - NoArgsConstructor
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
 
  public Npc(String newName, String newSpeech){
   this.name = newName;
   this.speech = newSpeech;
  }
  public String getName(){
    return this.name;
 }
  public String getSpeech(){
    return this.speech;
 }
}
