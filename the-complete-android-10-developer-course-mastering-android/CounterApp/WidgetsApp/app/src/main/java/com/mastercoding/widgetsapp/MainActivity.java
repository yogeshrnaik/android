package com.mastercoding.widgetsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    TextView welcome_text, counter_text;
    Button increaseCounterBtn;
    Button decreaseCounterBtn;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        increaseCounterBtn = findViewById(R.id.increaseCounterBtn);
        decreaseCounterBtn = findViewById(R.id.decreaseCounterBtn);
        counter_text = findViewById(R.id.counter_text);
        welcome_text = findViewById(R.id.welcome_text);


        // Adding the Functionalities
        increaseCounterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter_text.setText("" + increaseCounter());
                Toast.makeText(MainActivity.this, "Counter increased!", Toast.LENGTH_SHORT).show();
            }
        });


        // Adding the Functionalities
        decreaseCounterBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (counter > 0) {
                    counter_text.setText("" + decreaseCounter());
                    Toast.makeText(MainActivity.this, "Counter decreased!", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Counter is zero and cannot be decreased further!", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    public int increaseCounter() {
        return ++counter;
    }

    public int decreaseCounter() {
        return --counter;
    }


}


//                3- The Counter App
//                4- make a new section with a presentation for the progress    (Progress Presentation)
//                Unit Converter App