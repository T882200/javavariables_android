package com.example.variablesinjava;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        int age = 20;
//         float price = 1.5f; // float, double
//        double userScore = 4.5789321;
//
//        long computerRam = 34545675678676l;
//
//        boolean isDead = false;
//
//        String name = "Morteza";
//
//        char letterA = 'A';
//
//        Log.i("MyTag", computerRam + "");


      //  TextView text = findViewById(R.id.text);

        text = findViewById(R.id.text);
      //  int sumTwoIntegerNumbers = 10 + 5;
      //  text.setText(sumTwoIntegerNumbers + "");

        // () */% +-





    }

    public void hellowWorldClicked(View textView) {

        EditText edtFN = findViewById(R.id.edtFirstNumber);
        EditText edtSN = findViewById(R.id.edtSecondNumber);

        // int mResult = Integer.parseInt(edtFN.getText().toString()) *
        //        Integer.parseInt(edtSN.getText().toString());
        // text.setText(mResult + "");

        float rResult = Float.parseFloat(edtFN.getText().toString()) % Float.parseFloat(edtSN.getText().toString());

        text.setText(rResult + "");
    }


}
