package com.example.android.courtcounter;

import android.os.CountDownTimer;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadPresets();

    }

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamA = 0;
    int foulTeamB = 0;
    final String[] teamsArray = {"South Africa", "Zimbabwe", "Nigeria", "Ghana", "Kenya", "Niger", "Chad", "Tunisia", "Egypt", "DRC"};
    final SimpleDateFormat timeFormat = new SimpleDateFormat("mm:ss");


    /**
     * Method called when app is created
     */
    public void loadPresets(){
        Random rand = new Random();
        int value = rand.nextInt(9);

        //Select team A
        String teamA = teamsArray[value];
        TextView teamAName = (TextView) findViewById(R.id.team_a);
        teamAName.setText(teamA);

        //Select team B
        value = rand.nextInt(9);
        String teamB = teamsArray[value];
        TextView teamBName = (TextView) findViewById(R.id.team_b);
        teamBName.setText(teamB);
    }


    /**
     * Kicks off the simulation
     */
    public void simulation(View view){

        reset(); //Reset all components

        timerDisplayVisible(); //Set timer to visible

        final TextView timerView = (TextView) findViewById(R.id.timer);

        CountDownTimer timer = new CountDownTimer(10000, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                timerView.setText(timeFormat.format(millisUntilFinished));
            }

            @Override
            public void onFinish() {
                timerView.setText(timeFormat.format(0));
            }
        }.start();
    }


    /**
     * Displays the given score for Team A.
     */
    public void scoreDisplayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void scoreDisplayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team A.
     */
    public void foulDisplayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given fouls for Team B.
     */
    public void foulDisplayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_fouls);
        scoreView.setText(String.valueOf(score));
    }

    /**
     *
     * Adds a goal for Team A
     */
    public void addGoalForTeamA(View view){
        scoreTeamA += 1;
        scoreDisplayForTeamA(scoreTeamA);
    }

    /**
     *
     * Adds a goal for Team B
     */
    public void addGoalForTeamB(View view){
        scoreTeamB += 1;
        scoreDisplayForTeamB(scoreTeamB);
    }

    /**
     *
     * Adds a foul for Team A
     */
    public void addFoulForTeamA(View view){
        foulTeamA += 1;
        foulDisplayForTeamA(foulTeamA);
    }

    /**
     *
     * Adds a foul for Team B
     */
    public void addFoulForTeamB(View view){
        foulTeamB += 1;
        foulDisplayForTeamB(foulTeamB);
    }

    //Resets team scores
    public void reset(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        scoreDisplayForTeamA(scoreTeamA);
        scoreDisplayForTeamB(scoreTeamB);
        foulDisplayForTeamA(foulTeamA);
        foulDisplayForTeamB(foulTeamB);

    }

    //Resets team scores without the need for a view
    private void reset(){
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        scoreDisplayForTeamA(scoreTeamA);
        scoreDisplayForTeamB(scoreTeamB);
        foulDisplayForTeamA(foulTeamA);
        foulDisplayForTeamB(foulTeamB);
    }

    //Updates team scores and fouls
    private void updateValues(){

        Random rand = new Random();
        int value =                                                                                                                                                                                                             rand.nextInt(39);

    }

    //Turns on the timer display
    private void timerDisplayVisible(){
        TextView timerView = (TextView) findViewById(R.id.timer);
        timerView.setVisibility(View.VISIBLE);
    }
}
