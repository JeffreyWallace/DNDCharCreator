import java.util.ArrayList;
import java.util.HashMap;

public class Race {
    public String name;
    public HashMap<String,Integer> abilityScoreImprovements=new HashMap<>();
    public int speed;
    public String size;
    public HashMap<String,Integer> skill_Proficiencies=new HashMap<>();
    public ArrayList<String> other_Proficiencies=new ArrayList<>();
    public ArrayList<String> language_proficiencies=new ArrayList<>();
    public ArrayList<String> resistances=new ArrayList<>();
    public ArrayList<String> spells=new ArrayList<>();
    public String abilityDescription="";
    public int feat=0;
    public String description="";
    public Race() {
        name="human";
        speed=30;
        size="Medium";
        skill_Proficiencies.put("Choose",1);
        language_proficiencies.add("Common");
        language_proficiencies.add("Choose");
        feat=1;
        spells.add("lvl0 Light at level 5");
    }

    public Integer getASI(String asi){

        if(abilityScoreImprovements.get(asi)!=null) {
            return abilityScoreImprovements.get(asi);
        }
        return 0;
    }
}
