package com.example.pointgame;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void resetScore (View view) {
            scoreA = 0;
            scoreB = 0;
            displayForTeamA(scoreA);
            displayForTeamB(scoreB);

    }
    /**

     Displays the given score for Team A.
     */
    public void teamA_3_score (View view) {
        scoreA = (scoreA + 3);
        displayForTeamA (scoreA);
    }

    public void teamA_2_score (View view) {
        scoreA = (scoreA + 2);
        displayForTeamA (scoreA);
    }

    public void teamA_1_score (View view) {
        scoreA = (scoreA + 1);
        displayForTeamA (scoreA);
    }

    private void displayForTeamA(int number) {
        TextView quantityTextView = (TextView)
                findViewById(R.id.team_a_score);
        quantityTextView.setText("" + number);
    }
    /**

     Displays the given score for Team B.
     */

    public void teamB_3_score (View view) {
        scoreB = (scoreB + 3);
        displayForTeamB (scoreB);
    }

    public void teamB_2_score (View view) {
        scoreB = (scoreB + 2);
        displayForTeamB (scoreB);
    }

    public void teamB_1_score (View view) {
        scoreB = (scoreB + 1);
        displayForTeamB (scoreB);
    }

    private void displayForTeamB(int number) {
        TextView quantityTextView = (TextView)
                findViewById(R.id.team_b_score);
        quantityTextView.setText("" + number);
    }

}
