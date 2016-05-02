package com.example.wansu.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(8);
    }
    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score  1 for Team A.
     */
    public void OnePOINT(int score) {
        TextView One = (TextView) findViewById(R.id.onepoint);
        One.setText(String.valueOf(One));
    }

    /**
     * Displays the given score  1 for Team A.
     */
    public void TwoPOINT(int score) {
        TextView Two = (TextView) findViewById(R.id.twopoint);
        Two.setText(String.valueOf(Two));
    }

    /**
     * Displays the given score  1 for Team A.
     */
    public void ThreePOINT(int score) {
        TextView Three = (TextView) findViewById(R.id.threepoint);
        Three.setText(String.valueOf(Three));
    }
}
