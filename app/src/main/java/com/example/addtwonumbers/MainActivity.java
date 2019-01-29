package com.example.addtwonumbers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button bttnAdd;
    private Button bttnClr;
    private EditText txtNum1, txtNum2;
    private TextView resultText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bttnAdd = findViewById(R.id.buttonAdd);
        bttnClr = findViewById(R.id.buttonClear);
        txtNum1 = findViewById(R.id.textEdit1);
        txtNum2 = findViewById(R.id.textEdit2);
        resultText = findViewById(R.id.textViewResult);

        bttnAdd.setOnClickListener(new ClickButton());
        bttnClr.setOnClickListener(new ClickButton());
    }

    private class ClickButton implements Button.OnClickListener{

        public void onClick(View v){
            if (v.getId() == R.id.buttonAdd){
                double num1, num2, result;
                num1 = Double.parseDouble(txtNum1.getText().toString());
                num2 = Double.parseDouble(txtNum2.getText().toString());
                result = num1 + num2;
                resultText.setText(Double.toString(result));
            }// Addition
            else if (v.getId() == R.id.buttonClear){
                resultText.setText("0");
                txtNum2.setText("0");
                txtNum1.setText("0");
            }
        }// onClick

    }// Click Button Class
}
