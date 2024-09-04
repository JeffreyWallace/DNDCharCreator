import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Player {
    public HashMap<String,Integer> ability_Scores;
    public HashMap<String,Integer> saving_Throws;
    public HashMap<String,Integer> skill_Proficiencies;
    public ArrayList<String> other_Proficiencies;
    public ArrayList<String> language_proficiencies;
    public int speed;
    public String size;
    public ArrayList<String> resistances;
    public String abilityDescription;
    public Race race;
    public ArrayList<Race> avaliableRaces;
    public Player(){
        //initalize all races
    }

    public int selectRace(String race) {
        //verify race exists
        Race currentRace = null;
        for(Race r : avaliableRaces){
            if(r.name.equals(race)){
                currentRace = r;
            }
        }
        if(currentRace==null){return 1;}
        //set race
        this.race = currentRace;
        //set speed
        speed=currentRace.speed;
        //set size
        size=currentRace.size;
        //add resistances
        resistances=currentRace.resistances;
        //add asi by looping through all asi and adding them
        for(String asi:ability_Scores.keySet()) {
            int tempasi=currentRace.getASI(asi);
            System.out.println(asi + " + " + tempasi);
        }

        //add language proficiencies by looping through the races languages and calling the
        //add language method that will add a
        //language if the word is choose it prompts the user to input a language or
        //select from a list of viable languages
        for(String lang:currentRace.language_proficiencies) {
            addLanguageProf(lang);
        }

        return 0;
    }
    public void addLanguageProf(String lang){
        //need to add duplication protection to this function

        if(lang.equalsIgnoreCase("choose")) {
            System.out.println("Choose language proficiency");
            String tempLang="";
            Scanner input = new Scanner(System.in);
            while(tempLang.equalsIgnoreCase("")) {
                tempLang=input.nextLine();
                //validate the language
            }
            language_proficiencies.add(tempLang);
        } else {
            language_proficiencies.add(lang);
        }
    }
}
