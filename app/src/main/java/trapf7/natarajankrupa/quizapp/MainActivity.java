package trapf7.natarajankrupa.quizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.app.ActionBar;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public TextView currentScore, highScore, result;
    public EditText enterNumber;
    public Button button;
    //public ActionBar bar = getActionBar();
    public int answer=0, score = 0;
    //public Color[] colors = new Color[8];
    //public Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        currentScore = findViewById(R.id.currentScore);
        highScore = findViewById(R.id.highScore);
        result = findViewById(R.id.result);
        enterNumber = findViewById(R.id.enterNumber);
        makeQuestion();
        button = findViewById(R.id.submit);
        //colors = new Color [context.getResources().getColor(R.color.colorOne), context.getResources().getColor(R.color.colorTwo), context.getResources().getColor(R.color.colorThree), context.getResources().getColor(R.color.colorFour), context.getResources().getColor(R.color.colorFive)];

        //colors[0] = context.getColor(color.colorOne);
        //bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#E91E63")));




        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#E91E63")));
                int num = Integer.parseInt(enterNumber.getText().toString());
                if(num== answer) {
                    result.setText("correct!");
                    makeQuestion();
                    score++;
                    currentScore.setText("score: " + score);
                    enterNumber.setText("");
                }
                else {
                    if(num>answer)
                        result.setText("too high");
                    else
                        result.setText("too low");

                }
            }
        });

    }

    public void makeQuestion()
    {
        answer= (int) (Math.random() * 20 +1);

    }
}

