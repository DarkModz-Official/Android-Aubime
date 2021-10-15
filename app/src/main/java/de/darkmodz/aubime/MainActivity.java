package de.darkmodz.aubime;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * Initialisierung & Deklarirung
         */

        // TextView
        TextView textView = findViewById(R.id.textView);

        // EditText
        EditText editText1 = findViewById(R.id.editText1);
        EditText editText2 = findViewById(R.id.editText2);

        // Switch
        Switch switchModus = findViewById(R.id.switchModus);

        // Button
        Button buttonReload = findViewById(R.id.buttonReload);

        // RatingBar
        RatingBar ratingBar = findViewById(R.id.ratingBar);

        // Setup
        editText1.setVisibility(View.INVISIBLE);
        editText2.setVisibility(View.INVISIBLE);

        buttonReload.setBackgroundColor(Color.CYAN);

        // Initialisierung

        boolean mode[] = new boolean[1];
        boolean reload[] = new boolean[1];

        /**
         * Listeners
         */

        // Switch
        switchModus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mode[0]) {
                    mode[0] = false;
                    editText1.setVisibility(View.INVISIBLE);
                    editText2.setVisibility(View.INVISIBLE);
                } else {
                    mode[0] = true;
                    editText1.setVisibility(View.VISIBLE);
                    editText2.setVisibility(View.VISIBLE);
                }
            }
        });

        // Button
        buttonReload.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mode[0]) {
                    if(reload[0]) {
                        reload[0] = false;
                        textView.setText(editText1.getText().toString());
                    } else {
                        reload[0] = true;
                        textView.setText(editText2.getText().toString());
                    }
                } else {
                    if(reload[0]) {
                        reload[0] = false;
                        textView.setText("Hello World!");
                    } else {
                        reload[0] = true;
                        textView.setText("Ich bin Paul!");
                    }
                }
            }
        });

        // RatingBar
        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean fromUser) {
                textView.setText(String.valueOf(rating));
                if(rating < 2) {
                    textView.setTextColor(Color.RED);
                } else
                if(rating < 3) {
                    textView.setTextColor(Color.YELLOW);

                } else
                if(rating < 4) {
                    textView.setTextColor(Color.GREEN);
                }
            }
        });
    }
}