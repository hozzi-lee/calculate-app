package com.javaex.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // FIELD
    private TextView formula;
    private Button num0;
    private Button num1;
    private Button num2;
    private Button num3;
    private Button num4;
    private Button num5;
    private Button num6;
    private Button num7;
    private Button num8;
    private Button num9;
    private Button div;
    private Button multi;
    private Button minus;
    private Button plus;
    private Button clear;
    private Button equals;

    // CONSTRUCTORS

    // GETTER:SETTER

    // METHOD - 1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        formula = (TextView)findViewById(R.id.formula);

        View.OnClickListener listener = new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                String formulaText = formula.getText().toString();

//              Log.d("clickCalBtn", "" + view.getId());
                Log.d("formulaText", formulaText);

                switch (view.getId()) {
                    case R.id.num0:
                        formula.setText(formulaText + "0");
                        break;
                    case R.id.num1:
                        formula.setText(formulaText + "1");
                        break;
                    case R.id.num2:
                        formula.setText(formulaText + "2");
                        break;
                    case R.id.num3:
                        formula.setText(formulaText + "3");
                        break;
                    case R.id.num4:
                        formula.setText(formulaText + "4");
                        break;
                    case R.id.num5:
                        formula.setText(formulaText + "5");
                        break;
                    case R.id.num6:
                        formula.setText(formulaText + "6");
                        break;
                    case R.id.num7:
                        formula.setText(formulaText + "7");
                        break;
                    case R.id.num8:
                        formula.setText(formulaText + "8");
                        break;
                    case R.id.num9:
                        formula.setText(formulaText + "9");
                        break;
                    case R.id.div:
                        formula.setText(formulaText + "/");
                        break;
                    case R.id.multi:
                        formula.setText(formulaText + "*");
                        break;
                    case R.id.minus:
                        formula.setText(formulaText + "-");
                        break;
                    case R.id.plus:
                        formula.setText(formulaText + "+");
                        break;
                    case R.id.clear:
                        formula.setText("");
                        break;
                    case R.id.equals:
                        if (formulaText.contains("+")) {
                            String[] number = formulaText.split("\\+");
                            int num1 = Integer.parseInt(number[0]);
                            int num2 = Integer.parseInt(number[1]);
                            int sum = num1 + num2;
                            String result = String.valueOf(sum);
                            formula.setText(result);
                        } else if (formulaText.contains("-")) {
                            String[] number = formulaText.split("-");
                            int num1 = Integer.parseInt(number[0]);
                            int num2 = Integer.parseInt(number[1]);
                            int sum = num1 - num2;
                            String result = String.valueOf(sum);
                            formula.setText(result);
                        } else if (formulaText.contains("*")) {
                            String[] number = formulaText.split("\\*");
                            int num1 = Integer.parseInt(number[0]);
                            int num2 = Integer.parseInt(number[1]);
                            int sum = num1 * num2;
                            String result = String.valueOf(sum);
                            formula.setText(result);
                        } else if (formulaText.contains("/")) {
                            String[] number = formulaText.split("/");
                            int num1 = Integer.parseInt(number[0]);
                            int num2 = Integer.parseInt(number[1]);
                            int sum = num1 / num2;
                            // double sum = (double)num1 / (double)num2;
                            String result = String.valueOf(sum);
                            formula.setText(result);
                        }
                        break;
                }
            }

        };

        num0 = (Button)findViewById(R.id.num0);
        num0.setOnClickListener(listener);

        num1 = (Button)findViewById(R.id.num1);
        num1.setOnClickListener(listener);

        num2 = (Button)findViewById(R.id.num2);
        num2.setOnClickListener(listener);

        num3 = (Button)findViewById(R.id.num3);
        num3.setOnClickListener(listener);

        num4 = (Button)findViewById(R.id.num4);
        num4.setOnClickListener(listener);

        num5 = (Button)findViewById(R.id.num5);
        num5.setOnClickListener(listener);

        num6 = (Button)findViewById(R.id.num6);
        num6.setOnClickListener(listener);

        num7 = (Button)findViewById(R.id.num7);
        num7.setOnClickListener(listener);

        num8 = (Button)findViewById(R.id.num8);
        num8.setOnClickListener(listener);

        num9 = (Button)findViewById(R.id.num9);
        num9.setOnClickListener(listener);

        div = (Button)findViewById(R.id.div);
        div.setOnClickListener(listener);

        multi = (Button)findViewById(R.id.multi);
        multi.setOnClickListener(listener);

        minus = (Button)findViewById(R.id.minus);
        minus.setOnClickListener(listener);

        plus = (Button)findViewById(R.id.plus);
        plus.setOnClickListener(listener);

        clear = (Button)findViewById(R.id.clear);
        clear.setOnClickListener(listener);

        equals = (Button)findViewById(R.id.equals);
        equals.setOnClickListener(listener);
    }
}