package diceecom.dicee;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton;
        rollbutton = (Button) findViewById(R.id.rollButton);

        final ImageView leftDice = (ImageView) findViewById(R.id.image_leftDice);

        final ImageView rightDice = (ImageView) findViewById(R.id.image_rightDice);

        final int diceArray[]= {
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("Dicee","Button has been Pressed");


                Random randomNumberGenrator = new Random();
                int number = randomNumberGenrator.nextInt(6);

                Log.d("Dicee", " The Random number is " +number);

                leftDice.setImageResource(diceArray[number]);

                number = randomNumberGenrator.nextInt(6);
                Log.d("Dicee", " The Random number is " +number);

                rightDice.setImageResource(diceArray[number]);
            }
        });
    }
}
