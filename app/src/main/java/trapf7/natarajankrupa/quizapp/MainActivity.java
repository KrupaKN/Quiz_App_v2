package trapf7.natarajankrupa.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {
    public Button button;
    public EditText responseText;
    public TextView displayText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.clickButton);
        responseText=findViewById(R.id.nameEditText);
        displayText=findViewById(R.id.textBox);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                System.out.println("Hello mom");
                Log.i("testButton", "Hello dad!");
                displayText.setText(displayText.getText()+" "+responseText.getText());
            }
        });
        responseText.setOnFocusChangeListener(new View.OnFocusChangeListener()
        {
            @Override
            public void onFocusChange(View v, boolean hasFocus)
            {
                if(!hasFocus)
                {
                    if(responseText.getText().toString().equals("TJ"))
                    {
                        displayText.setText("TJ Rocks!");
                        responseText.setText("");
                        responseText.setHint("That's a good name.");
                    }
                }
        }
            });
}}

