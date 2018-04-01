package com.example.android.thebatmanvssupermanquiz;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

     int totalPoints;
    EditText first_questionAnswerTwo;
    CheckBox second_questionAnswerTwo;
    CheckBox second_questionAnswerOne;
    CheckBox second_questionAnswerThree;
    RadioButton third_questionAnswerOne;
    RadioButton fourth_questionAnswerOne;
    RadioButton fifth_questionAnswerOne;
    RadioButton sixth_questionAnswerOne;
    RadioButton seventh_questionAnswerSecond;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first_questionAnswerTwo = findViewById(R.id.Superm);
        second_questionAnswerTwo = findViewById(R.id.Penguin);
        second_questionAnswerOne = findViewById(R.id.Joker);
        second_questionAnswerThree = findViewById(R.id.Robin);
        third_questionAnswerOne = findViewById(R.id.ManOfSteel_2);
        fourth_questionAnswerOne = findViewById(R.id.Superman);
        fifth_questionAnswerOne = findViewById(R.id.Batman_2);
        sixth_questionAnswerOne = findViewById(R.id.ZackSnyder);
        seventh_questionAnswerSecond = findViewById(R.id.Isfalse);
    }
    
    /**
     * This method is activated when the Submit answers button is pressed
     */

    public int submitAnswers(View view) {

        EditText setResult = findViewById(R.id.Superm);
        if(setResult.getText().toString().trim().equals("Superman")) totalPoints += 1;
        if (second_questionAnswerOne.isChecked() && (second_questionAnswerTwo.isChecked()&& !second_questionAnswerThree.isChecked()))
        totalPoints += 1;
        if (third_questionAnswerOne.isChecked()) totalPoints += 1;

        if (fourth_questionAnswerOne.isChecked()) totalPoints += 1;

        if (fifth_questionAnswerOne.isChecked()) totalPoints += 1;

        if (sixth_questionAnswerOne.isChecked()) totalPoints += 1;

        if (seventh_questionAnswerSecond.isChecked()) totalPoints += 1;


        //** * This method create results message*/

        String Zero =  getResources().getString(R.string.toast0);

        String lessPoints =  getResources().getString(R.string.toast1);

        String Less = String.format(lessPoints, totalPoints);

        String mediumPoints = getResources().getString(R.string.toast2);

        String Medium = String.format(mediumPoints, totalPoints);

        String highPoints =  getResources().getString(R.string.toast3);

        String High = String.format(highPoints, totalPoints);

        String HigherPoints = getResources().getString(R.string.toast4);

        String Higher = String.format(HigherPoints, totalPoints);



        if(totalPoints == 0) Toast.makeText(this, Zero, Toast.LENGTH_LONG).show();
        else if(totalPoints == 1 || totalPoints == 2)
            Toast.makeText(this, Less, Toast.LENGTH_LONG).show();
        else if(totalPoints == 3 || totalPoints == 4)
            Toast.makeText(this, Medium, Toast.LENGTH_LONG).show();
        else if(totalPoints == 5 || totalPoints == 6)
            Toast.makeText(this, High, Toast.LENGTH_LONG).show();
        else if(totalPoints ==7 )
            Toast.makeText(this, Higher, Toast.LENGTH_LONG).show();

        Context context = getApplicationContext();
        CharSequence text = "You got " + totalPoints +  " points";
        text = text + "\n" + getString(R.string.you_have) + " " + totalPoints + " " + getString(R.string.correct_answers);
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        return totalPoints =0;
    }

}
