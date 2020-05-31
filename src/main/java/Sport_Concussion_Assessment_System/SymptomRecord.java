package Sport_Concussion_Assessment_System;

public class SymptomRecord {
//    List<Game_Record.Symptom> five_games = new ArrayList<>();
    private String[] symptoms;

    //Store a list of sympotom level
    public void setSymptoms(String[] symptoms) {
        this.symptoms = symptoms;
    }

    //return a list of sympotom level
    public String[] getSymptoms(){
        return this.symptoms;
    }
}
