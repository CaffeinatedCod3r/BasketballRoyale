package com.example.android.basketballroyale;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    String disabledButtonColor = "#FFCAD4DE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
     * Team A Click Methods
     */
    protected void displayScoreTeamA() {
        TextView scoreview = findViewById(R.id.score_Team_A);
        scoreview.setText(String.valueOf(scoreTeamA));
        checkWinner();
    }

    public void addThreeTeamA(View view) {
        scoreTeamA = scoreTeamA + 3;
        displayScoreTeamA();
    }

    public void addTwoTeamA(View view) {
        scoreTeamA = scoreTeamA + 2;
        displayScoreTeamA();
    }

    public void addOneTeamA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayScoreTeamA();
    }

    /*
     * Team B Click Methods
     */
    protected void displayScoreTeamB() {
        TextView scoreview = findViewById(R.id.score_Team_B);
        scoreview.setText(String.valueOf(scoreTeamB));
        checkWinner();
    }

    public void addThreeTeamB(View view) {
        scoreTeamB += 3;
        displayScoreTeamB();
    }

    public void addTwoTeamB(View view) {
        scoreTeamB += 2;
        displayScoreTeamB();
    }

    public void addOneTeamB(View view) {
        scoreTeamB += 1;
        displayScoreTeamB();
    }

    
    /*
     * Winner Calculation
     */
    protected void checkWinner() {
        Button addThreeTeamA = findViewById(R.id.addThreeTeamA);
        Button addTwoTeamA = findViewById(R.id.addTwoTeamA);
        Button addOneTeamA = findViewById(R.id.addOneTeamA);
        Button addThreeTeamB = findViewById(R.id.addThreeTeamB);
        Button addTwoTeamB = findViewById(R.id.addTwoTeamB);
        Button addOneTeamB = findViewById(R.id.addOneTeamB);

        TextView winner = findViewById(R.id.winStatus);
        if (scoreTeamA >= 21) {
            winner.setText(R.string.winA);
            /*
             * Disable button clicks once the game is over
             */
            addThreeTeamA.setClickable(false);
            addTwoTeamA.setClickable(false);
            addOneTeamA.setClickable(false);
            addThreeTeamB.setClickable(false);
            addTwoTeamB.setClickable(false);
            addOneTeamB.setClickable(false);
            
            /*
             * Change background color of disabled button
             */
            addThreeTeamA.setBackgroundColor(Color.parseColor(disabledButtonColor));
            addTwoTeamA.setBackgroundColor(Color.parseColor(disabledButtonColor));
            addOneTeamA.setBackgroundColor(Color.parseColor(disabledButtonColor));
            addThreeTeamB.setBackgroundColor(Color.parseColor(disabledButtonColor));
            addTwoTeamB.setBackgroundColor(Color.parseColor(disabledButtonColor));
            addOneTeamB.setBackgroundColor(Color.parseColor(disabledButtonColor));
        }
        if (scoreTeamB >= 21) {
            winner.setText(R.string.winB);
            /*
             * Disable button clicks once the game is over
             */
            addThreeTeamA.setClickable(false);
            addTwoTeamA.setClickable(false);
            addOneTeamA.setClickable(false);
            addThreeTeamB.setClickable(false);
            addTwoTeamB.setClickable(false);
            addOneTeamB.setClickable(false);
            
            /*
             * Change background color of disabled button
             */
            addThreeTeamA.setBackgroundColor(Color.parseColor(disabledButtonColor));
            addTwoTeamA.setBackgroundColor(Color.parseColor(disabledButtonColor));
            addOneTeamA.setBackgroundColor(Color.parseColor(disabledButtonColor));
            addThreeTeamB.setBackgroundColor(Color.parseColor(disabledButtonColor));
            addTwoTeamB.setBackgroundColor(Color.parseColor(disabledButtonColor));
            addOneTeamB.setBackgroundColor(Color.parseColor(disabledButtonColor));
        }
    }

    /*
     * Reset Button to Restart the game
     */
    public void reset(View view) {
        Button addThreeTeamA = findViewById(R.id.addThreeTeamA);
        Button addTwoTeamA = findViewById(R.id.addTwoTeamA);
        Button addOneTeamA = findViewById(R.id.addOneTeamA);
        Button addThreeTeamB = findViewById(R.id.addThreeTeamB);
        Button addTwoTeamB = findViewById(R.id.addTwoTeamB);
        Button addOneTeamB = findViewById(R.id.addOneTeamB);

        scoreTeamA = 0; //Initialize the score
        scoreTeamB = 0; //Initialize the score

        /*
         * Set score to 0.
         */
        displayScoreTeamA();
        displayScoreTeamB();
        
        /*
         * Set every button clickable.
         */
        addThreeTeamA.setClickable(true);
        addTwoTeamA.setClickable(true);
        addOneTeamA.setClickable(true);
        addThreeTeamB.setClickable(true);
        addTwoTeamB.setClickable(true);
        addOneTeamB.setClickable(true);
        
        /*
         * Set result as undecided.
         */
        TextView winner = findViewById(R.id.winStatus);
        winner.setText(R.string.winText);
        
        /*
         * Set button's default color.
         */
        addThreeTeamA.setBackgroundColor(Color.parseColor("#FF9800"));
        addTwoTeamA.setBackgroundColor(Color.parseColor("#FF9800"));
        addOneTeamA.setBackgroundColor(Color.parseColor("#FF9800"));
        addThreeTeamB.setBackgroundColor(Color.parseColor("#FF9800"));
        addTwoTeamB.setBackgroundColor(Color.parseColor("#FF9800"));
        addOneTeamB.setBackgroundColor(Color.parseColor("#FF9800"));
    }

}
