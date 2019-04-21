package com.example.android.tennisscorecounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.android.tennisscorecounter.R.id.a1;
import static com.example.android.tennisscorecounter.R.id.a2;
import static com.example.android.tennisscorecounter.R.id.a3;
import static com.example.android.tennisscorecounter.R.id.a4;
import static com.example.android.tennisscorecounter.R.id.a5;
import static com.example.android.tennisscorecounter.R.id.b1;
import static com.example.android.tennisscorecounter.R.id.b2;
import static com.example.android.tennisscorecounter.R.id.b3;
import static com.example.android.tennisscorecounter.R.id.b4;
import static com.example.android.tennisscorecounter.R.id.b5;

public class MainActivity extends AppCompatActivity {

    // Two variables for the score of a single round
    int playerAscore = 0;
    int playerBscore = 0;

    // Two variables for increasing number of rounds
    int roundNumber = 0;

    // Making array of TextViews of the rounds (5 rounds for 2 players)
    int[] ArrayA = {a1, a2, a3, a4, a5};
    int[] ArrayB = {b1, b2, b3, b4, b5};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Displays the round score for player A.
    public void displayRoundScoreOfPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(ArrayA[roundNumber]);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Player A.
     */
    public void displayForPlayerA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForPlayerA(String str) {
        TextView scoreView = (TextView) findViewById(R.id.player_a_score);
        scoreView.setText(str);
    }

    public void showFifteenForPlayerA(View v)
    {
        TextView value = (TextView) findViewById(R.id.player_a_score);
        String w = value.getText().toString();
        if(w.equals("0"))
        {
            displayForPlayerA(15);
        }
    }

    public void showThirtyForPlayerA(View v)
    {
        TextView value = (TextView) findViewById(R.id.player_a_score);
        String w = value.getText().toString();
        if(w.equals("15"))
        {
            displayForPlayerA(30);
        }
    }

    public void showFortyForPlayerA(View v)
    {
        TextView value = (TextView) findViewById(R.id.player_a_score);
        String w = value.getText().toString();
        if(w.equals("30"))
        {
            displayForPlayerA(40);
        }
    }

    public void increasePlayerArounds(View v)
    {
        TextView valueA = (TextView) findViewById(R.id.player_a_score);
        String a = valueA.getText().toString();

        TextView valueB = (TextView) findViewById(R.id.player_b_score);
        String b = valueB.getText().toString();

        if((a.equals("40") && (b.equals("0")||b.equals("15")||b.equals("30"))) || (a.equals("Adv.") && b.equals("40")))
        {
            displayForPlayerA(0);
            displayForPlayerB(0);

            playerAscore = playerAscore + 1;

            if(playerAscore >= 0 && playerAscore < 7)
            {
                displayRoundScoreOfPlayerA(playerAscore);
            }
            else if(playerAscore == 7 || playerBscore == 7)
            {
                displayRoundScoreOfPlayerA(playerAscore);
                playerAscore = 0;
                playerBscore = 0;
                roundNumber = roundNumber + 1;
            }
        }
    }


    public void advantageForPlayerA(View v)
    {
        TextView valueA = (TextView) findViewById(R.id.player_a_score);
        String a = valueA.getText().toString();

        TextView valueB = (TextView) findViewById(R.id.player_b_score);
        String b = valueB.getText().toString();

        if(a.equals("40") && b.equals("40"))
        {
            displayForPlayerA("Adv.");
        }
        else if(a.equals("40") && b.equals("Adv."))
        {
            displayForPlayerB("40");
        }
    }


    // Displays the round score for player B.
    public void displayRoundScoreOfPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(ArrayB[roundNumber]);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Player B.
     */
    public void displayForPlayerB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForPlayerB(String str) {
        TextView scoreView = (TextView) findViewById(R.id.player_b_score);
        scoreView.setText(str);
    }

    public void showFifteenForPlayerB(View v)
    {
        TextView value = (TextView) findViewById(R.id.player_b_score);
        String w = value.getText().toString();
        if(w.equals("0"))
        {
            displayForPlayerB(15);
        }
    }

    public void showThirtyForPlayerB(View v)
    {
        TextView value = (TextView) findViewById(R.id.player_b_score);
        String w = value.getText().toString();
        if(w.equals("15"))
        {
            displayForPlayerB(30);
        }
    }

    public void showFortyForPlayerB(View v)
    {
        TextView value = (TextView) findViewById(R.id.player_b_score);
        String w = value.getText().toString();
        if(w.equals("30"))
        {
            displayForPlayerB(40);
        }
    }

    public void increasePlayerBrounds(View v)
    {
        TextView valueB = (TextView) findViewById(R.id.player_b_score);
        String b = valueB.getText().toString();

        TextView valueA = (TextView) findViewById(R.id.player_a_score);
        String a = valueA.getText().toString();

        if((b.equals("40") && (a.equals("0")||a.equals("15")||a.equals("30"))) || (b.equals("Adv.") && a.equals("40")))
        {
            displayForPlayerA(0);
            displayForPlayerB(0);

            playerBscore = playerBscore + 1;

            if(playerBscore >= 0 && playerBscore < 7)
            {
                displayRoundScoreOfPlayerB(playerBscore);
            }
            else if(playerBscore == 7 || playerAscore == 7)
            {
                displayRoundScoreOfPlayerB(playerBscore);
                playerAscore = 0;
                playerBscore = 0;
                roundNumber = roundNumber + 1;
            }
        }
    }

    public void advantageForPlayerB(View v)
    {
        TextView valueB = (TextView) findViewById(R.id.player_b_score);
        String b = valueB.getText().toString();

        TextView valueA = (TextView) findViewById(R.id.player_a_score);
        String a = valueA.getText().toString();

        if(b.equals("40") && a.equals("40"))
        {
            displayForPlayerB("Adv.");
        }
        else if(b.equals("40") && a.equals("Adv."))
        {
            displayForPlayerA("40");
        }
    }

    /**
     * Responsible for resetting data
     */
    public void resetBothScores(View v)
    {
        playerAscore = 0;
        playerBscore = 0;
        roundNumber = 0;

        displayForPlayerA(0);
        displayForPlayerB(0);

        for(roundNumber = 0; roundNumber <= 4; roundNumber++)
        {
            displayRoundScoreOfPlayerA(0);
            displayRoundScoreOfPlayerB(0);
        }
        roundNumber = 0;
    }
}
