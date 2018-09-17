package com.robinsingh.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreforTeamA = 0;  //Variable to store score for team A
    int scoreforTeamB = 0;  //Variable to store score for team B

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /*
    * This method is used to display the score for team A
    * */
    private void displayScoreforA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_value_for_A);
        scoreView.setText(String.valueOf(score));
    }
    /*
     * This method is used to Add three points to the score of team A
     * */
    public void threePointsforA(View view) {
        scoreforTeamA = scoreforTeamA + 3;
        displayScoreforA(scoreforTeamA);
    }
    /*
     * This method is used to Add two points to the score of team A
     * */
    public void twoPointsforA(View view) {
        scoreforTeamA = scoreforTeamA + 2;
        displayScoreforA(scoreforTeamA);
    }
    /*
     * This method is used to Add one point to the score of team A
     * */
    public void freeThrowforA(View view) {
        scoreforTeamA = scoreforTeamA + 1;
        displayScoreforA(scoreforTeamA);
    }
    /*
     * This method is used to display the score for team B
     * */
    private void displayScoreforB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.score_value_for_B);
        scoreView.setText(String.valueOf(score));
    }
    /*
     * This method is used to Add three points to the score of team B
     * */
    public void threePointsforB(View view) {
        scoreforTeamB = scoreforTeamB + 3;
        displayScoreforB(scoreforTeamB);
    }
    /*
     * This method is used to Add two points to the score of team B
     * */
    public void twoPointsforB(View view) {
        scoreforTeamB = scoreforTeamB + 2;
        displayScoreforB(scoreforTeamB);
    }
    /*
     * This method is used to Add one point to the score of team B
     * */
    public void freeThrowforB(View view) {
        scoreforTeamB = scoreforTeamB + 1;
        displayScoreforB(scoreforTeamB);
    }
    /*
     * This method is used to reset the score of team A and team B to 0
     * */
    public void reset(View view) {
        displayScoreforA(0);
        displayScoreforB(0);
        scoreforTeamA=0;
        scoreforTeamB=0;
    }

}
