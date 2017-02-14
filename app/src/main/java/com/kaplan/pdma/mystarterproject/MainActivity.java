package com.kaplan.pdma.mystarterproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    int n = 1; //number of times user click on button

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //link the two ui elements
         final TextView textView = (TextView) findViewById(R.id.textView);
        Button button = (Button) findViewById(R.id.button);
        ImageView imageViewMinion = (ImageView) findViewById(R.id.imageViewMinion);
        ImageView imageViewNext = (ImageView) findViewById(R.id.imageViewNext);

        imageViewNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, NextScreen.class);
                startActivity(intent);
            }
        });


        imageViewMinion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "676gg5fgfg4tg", Toast.LENGTH_SHORT).show();
                textView.setText("bananas");

                Intent intent = new Intent(MainActivity.this, ThirdScreen.class);
                startActivity(intent);
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("Clicked " + n + " times");
                n++; //update
                Toast.makeText(MainActivity.this, "hihihihi", Toast.LENGTH_SHORT).show();
            }
        });

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText("textview is tapped");
            }
        });

        textView.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Random r = new Random();
                textView.setBackgroundColor(r.nextInt());

                return true;
            }
        });





    }
}
