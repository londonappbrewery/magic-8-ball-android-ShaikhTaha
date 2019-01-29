package com.londonappbrewery.magiceightball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView  titleText  = (TextView)findViewById(R.id.title);
        final ImageView mainImage  = (ImageView)findViewById(R.id.main_image);
        final Button    askButton  = (Button)findViewById(R.id.ask_button);

        final int dicisionImg[] = {

                R.drawable.yes,
                R.drawable.no,
                R.drawable.positive,
                R.drawable.negative,
        };

        final int effectImg[] = {

                R.drawable.effect1,
                R.drawable.effect2,
                R.drawable.effect3,
                R.drawable.effect4,
                R.drawable.finaleffect1,
                R.drawable.finaleffect2,
        };


        askButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int randomNumber;

                Log.d("MagicBall","Ask Button Pressed");
                Random random = new Random();
                randomNumber = random.nextInt(4);
                mainImage.setImageResource(dicisionImg[randomNumber]);
                Log.d("MagicBall","Image Changed "+randomNumber);



            }
        });

    }
}
