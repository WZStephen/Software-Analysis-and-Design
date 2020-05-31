package Sport_Concussion_Assessment_System;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Athletes {

    List<SymptomRecord> five_games = new ArrayList<>();

    public void collect_sympotoms(){

        //Symptom one_game = new Symptom();
        SymptomRecord one_game = new SymptomRecord();

        Scanner Scanner = new Scanner(System.in);

        String[] symptoms = {
                "Headache", "Pressure in head",
                "Neck pain", "Nausea or vomitting", "Dizziness",
                "Blurred vision", "Balance problems", "Sensitivity to light","Sensitivity to noise",
                "Feeling slowed down", "Feeling like \"in a fog\"", "Don't feel right", "Difficulty concentrating",
                "Difficult remembering", "Fatigue or low energy", "Confusion", "Drowsiness", "Trouble failing asleep",
                "More emotional", "Irritability", "Sadness", "Nervous or anxious"
        };

        String[] temp_symptom_level = new String[symptoms.length];
        for (int i = 0; i < symptoms.length; i++) {
            System.out.printf("%s%-35s%25s", "Please enter your ", symptoms[i] + " score ", " (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
            String current_symptom_level = Scanner.nextLine();

            //check if the entered the symptom level range from 0 - 6
            while(!current_symptom_level.matches("[0123456]")){
                System.out.print("(Invalid) ");
                System.out.printf("%s%-30s%25s", "Please enter your ", symptoms[i] + " score ", " (none (0), mild (1-2), moderate (3-4), severe (5-6)): ");
                current_symptom_level = Scanner.nextLine();
            }
            //add the current symptom to temp array
            temp_symptom_level[i] = current_symptom_level;
        }

        //if there is less than 5 games in record, then continue
        if(five_games.size() < 5){
            one_game.setSymptoms(temp_symptom_level);
            five_games.add(one_game);
        }
        else if(five_games.size()  == 5){
            five_games.remove(0);
            one_game.setSymptoms(temp_symptom_level);
            five_games.add(one_game);
        }
    }
}

