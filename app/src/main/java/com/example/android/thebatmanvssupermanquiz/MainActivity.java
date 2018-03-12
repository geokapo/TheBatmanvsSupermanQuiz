package com.example.android.thebatmanvssupermanquiz;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int totalPoints;
RadioButton first_questionAnswerTwo;
CheckBox second_questionAnswerTwo;
RadioButton third_questionAnswerOne;
RadioButton fourth_questionAnswerOne;
RadioButton fifth_questionAnswerOne;
CheckBox sixth_questionAnswerOne;
RadioButton seventh_questionAnswerSecond;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first_questionAnswerTwo = (RadioButton) findViewById(R.id.superm);
        second_questionAnswerTwo = (CheckBox) findViewById(R.id.Crusader);
        third_questionAnswerOne = (RadioButton) findViewById(R.id.ManOfSteel_2);
        fourth_questionAnswerOne = (RadioButton) findViewById(R.id.Superman);
        fifth_questionAnswerOne = (RadioButton) findViewById(R.id.Batman_2);
        sixth_questionAnswerOne = (CheckBox) findViewById(R.id.ZackSnyder);
        seventh_questionAnswerSecond = (RadioButton) findViewById(R.id.Isfalse);
    }

    /**
     * This method is activated when the Submit answers button is pressed
     */

    public void submitAnswers(View view)
    { EditText nameField = (EditText) findViewById(R.id.name);
        Editable nameEditable = nameField.getText();
        String name = nameEditable.toString();

        if (first_questionAnswerTwo.isChecked()){
            totalPoints +=1;

        }

        if (second_questionAnswerTwo.isChecked()){
            totalPoints +=1;
        }

        if (third_questionAnswerOne.isChecked()){
            totalPoints +=1;
        }

        if (fourth_questionAnswerOne.isChecked()){
            totalPoints +=1;
        }

        if (fifth_questionAnswerOne.isChecked()){
            totalPoints +=1;
        }

        if (sixth_questionAnswerOne.isChecked()){
            totalPoints +=1;
        }

        if (seventh_questionAnswerSecond.isChecked()){
            totalPoints +=1;
        }


        Context context = getApplicationContext();
        CharSequence text = "Hey " + name + "! \nYou got " + totalPoints + " points";
        text = text + "\n" + getString(R.string.you_have) + " " + totalPoints + " " + getString(R.string.correct_answers);
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();



    }

    }









