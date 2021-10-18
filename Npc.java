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
 
 public Npc(){
  name = "";
  speech = "";
  description = "";
 }
 public void setName(String _name){
  name = _name;
 }
 public void setDesc(String d){
  description = d;
 }
}

/*NoArgsConstructor
setDescription(String d)
setName(String _name)
*/
