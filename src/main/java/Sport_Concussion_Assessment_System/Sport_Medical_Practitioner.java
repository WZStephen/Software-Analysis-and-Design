package Sport_Concussion_Assessment_System;


import java.util.List;

public class Sport_Medical_Practitioner {

    public void current_symptoms_summary(Athletes athlete) throws IndexOutOfBoundsException{
        try{
            List<SymptomRecord> five_games = athlete.five_games;

            int severity_score_current = 0;
            int severity_score_previous = 0;
            int total_current_symptom = 0;
            int total_previous_symptom = 0;
            String rating = "No overall rating, you only have one game in record";
            boolean flag = false;

            String[] most_recent_game = five_games.get(five_games.size()-1).getSymptoms();
            for(int i=0; i<most_recent_game.length; i++ ){
                if(!most_recent_game[i].equals("0")){
                    total_current_symptom++;
                }
                severity_score_current += Integer.parseInt(most_recent_game[i]);
            }

            if(five_games.size() > 1){
                String[] most_recent_game_previous = five_games.get(five_games.size()-2).getSymptoms();
                for(int i = 0; i<most_recent_game_previous.length; i++){
                    if(!most_recent_game_previous[i].equals("0")){
                        total_previous_symptom++;
                    }
                    severity_score_previous += Integer.parseInt(most_recent_game_previous[i]);
                }
                flag = true;
            }

            int symptom_difference = Math.abs(total_previous_symptom - total_current_symptom);
            int severity_difference = Math.abs(severity_score_previous - severity_score_current);

            if(symptom_difference<3 && severity_difference < 10 && flag){
                rating = "No difference";
            }
            else if(symptom_difference<3 && severity_difference >= 10 && flag){
                rating = "Unsure";
            }
            else if ((symptom_difference >= 3 || severity_difference >= 15) && flag){
                rating = "Very different";
            }

            System.out.println("\nTotal number of symptoms: " + total_current_symptom);
            System.out.println("Symptom severity score: " + severity_score_current);
            System.out.println("Overall rating: " + rating + "\n");

        }catch (Exception e){
            System.out.println("\nYou don't have any game in record!\n");
        }

    }

    public void if_at_risk(Athletes athlete) throws IndexOutOfBoundsException{
        try{
            List<SymptomRecord> five_games = athlete.five_games;

            int severity_score_current = 0;
            int severity_score_previous = 0;
            int total_current_symptom = 0;
            int total_previous_symptom = 0;

            int symptom_difference = 0;
            int severity_difference = 0;


            //compare the symptom for most two successive games
            if(five_games.size() > 1){
                String[] most_recent_game_previous = five_games.get(five_games.size()-2).getSymptoms();
                String[] most_recent_game = five_games.get(five_games.size()-1).getSymptoms();

                //caucalte the secerity score for current game
                //count the total number of symptoms
                for(int i=0; i<most_recent_game.length; i++ ){
                    if(!most_recent_game[i].equals("0")){
                        total_current_symptom++;
                    }
                    severity_score_current += Integer.parseInt(most_recent_game[i]);
                }
                //caucalte the secerity score for previous game
                //count the total number of symptoms
                for(int i = 0; i<most_recent_game_previous.length; i++){
                    if(!most_recent_game_previous[i].equals("0")){
                        total_previous_symptom++;
                    }
                    severity_score_previous += Integer.parseInt(most_recent_game_previous[i]);
                }

                symptom_difference = Math.abs(total_previous_symptom - total_current_symptom);
                severity_difference = Math.abs(severity_score_previous - severity_score_current);

                if(symptom_difference<3 && severity_difference < 10){
                    System.out.println("\nGREEN\n");
                }
                else if(symptom_difference<3 && severity_difference >= 10){
                    System.out.println( "\nYELLOW   \n");
                }
                else if (symptom_difference>=3 || severity_difference >= 15){
                    System.out.println("\nRED\n");
                }
            }
            else {
                System.out.println("\nYou only have one game in record, no indicator to be shown!\n");
            }
        }catch (Exception e){
            System.out.println("\nYou don't have any game in record\n");
        }
    }


}
