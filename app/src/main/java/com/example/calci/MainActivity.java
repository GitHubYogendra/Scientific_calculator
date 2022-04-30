package com.example.calci;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    float number1, number2, sum = 0, sub, mul = 1, div, per;
    boolean divide, multiplying, subraction, addition, percent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clear(View view) {
        EditText clear = (EditText) findViewById(R.id.number111);
        clear.setText(" ");
    }

    public void seven(View view) {
        String st = "7";
        diplay(st);

    }

    @SuppressLint("SetTextI18n")
    private void diplay(String st) {
        EditText num = findViewById(R.id.number111);
        num.setText(num.getText() + st);

    }


    public void eight(View view) {
        String st = "8";
        diplay(st);
    }

    public void nine(View view) {
        String st = "9";
        diplay(st);
    }

    public void four(View view) {
        String st = "4";
        diplay(st);
    }

    public void five(View view) {
        String st = "5";
        diplay(st);
    }

    public void six(View view) {
        String st = "6";
        diplay(st);
    }

    public void one(View view) {
        String st = "1";
        diplay(st);
    }

    public void two(View view) {
        String st = "2";
        diplay(st);
    }

    public void three(View view) {
        String st = "3";
        diplay(st);
    }

    public void divive(View view) {
        EditText num = findViewById(R.id.number111);
        try {
            number1 = Float.parseFloat(num.getText().toString() + "");
            div = number1;
            divide = true;
            num.setText(" ");
        }
        catch (Exception e){
            num.setText("No Number Selected");
        }
    }


    public void multiply(View view) {
        EditText num = findViewById(R.id.number111);
        try {
            number1 = Float.parseFloat(num.getText().toString() + "");
            mul *= number1;
            multiplying = true;
            num.setText(" ");
        }
        catch (Exception e){
            num.setText("No Number Selected");
        }
    }

    public void minus(View view) {
        EditText num = findViewById(R.id.number111);
        try {
            number1 = Float.parseFloat(num.getText().toString() + "");
            sub = number1;
            subraction = true;
            num.setText(" ");
        }
        catch (Exception e){
            num.setText("No Number Selected");
        }
    }

    public void plus(View view) {
        EditText num = findViewById(R.id.number111);
        try {
            number1 = Float.parseFloat(num.getText().toString() + "");
            sum += number1;
            addition = true;
            num.setText(" ");
        }
        catch (Exception e){
            num.setText("No Number Selected");
        }

    }

    public void percentage(View view) {
        EditText num = findViewById(R.id.number111);
        try {
            number1 = Float.parseFloat(num.getText().toString() + "");
            per = number1 / 100;
            num.setText(String.valueOf(per));
        }
        catch (Exception e){
            num.setText("No Number Selected");
        }
    }

    public void zero(View view) {
        String st = "0";
        diplay(st);
    }

    public void dot(View view) {
        String st = ".";
        diplay(st);
    }

    public void equal(View view) {
        EditText num = findViewById(R.id.number111);
        try {
            if (addition) {
                number2 = Float.parseFloat(num.getText().toString() + "");
                float ans = sum + number2;
                num.setText(String.valueOf(ans));
                sum = 0;
                addition = false;
            } else if (subraction) {
                number2 = Float.parseFloat(num.getText().toString() + "");
                float ansub = sub - number2;
                num.setText(String.valueOf(ansub));
                subraction = false;
            } else if (multiplying) {
                number2 = Float.parseFloat(num.getText().toString() + "");
                float anmul = mul * number2;
                num.setText(String.valueOf(anmul));
                mul = 1;
                multiplying = false;
            } else if (divide) {
                number2 = Float.parseFloat(num.getText().toString() + "");
                float andiv = div / number2;
                num.setText(String.valueOf(andiv));
                divide = false;
            }
        } catch (Exception e) {
            num.setText("No Number Selected");
        }
    }

    public void pow2(View view) {
        EditText num = findViewById(R.id.number111);
        try {
            number1 = Float.parseFloat(num.getText().toString() + "");
            per = (float) Math.pow(number1, 2);
            // percent = true;
            num.setText(String.valueOf(per));
        }
        catch (Exception e){
            num.setText("No Number Selected");
        }
    }

    public void pow3(View view) {
        EditText num = findViewById(R.id.number111);
        try {
            number1 = Float.parseFloat(num.getText().toString() + "");
            per = (float) Math.pow(number1, 3);
            // percent = true;
            num.setText(String.valueOf(per));
        }
        catch (Exception e){
            num.setText("No Number Selected");
        }
    }

    public void squareRoot(View view) {
        EditText num = findViewById(R.id.number111);
        try {
            number1 = Float.parseFloat(num.getText().toString() + "");
            per = (float) Math.sqrt(number1);
            // percent = true;
            num.setText(String.valueOf(per));
        }
        catch (Exception e){
            num.setText("No Number Selected");
        }
    }

    public void sintita(View view) {
        EditText num = findViewById(R.id.number111);
        try {
            number1 = Float.parseFloat(num.getText().toString() + "");
            //double sine = Math.toRadians(number1);
            per = (float) Math.sin(number1);
            // percent = true;
            num.setText(String.valueOf(per));
        }
        catch (Exception e){
            num.setText("No Number Selected");
        }
    }

    public void costita(View view) {
        EditText num = findViewById(R.id.number111);
        try {
            number1 = Float.parseFloat(num.getText().toString() + "");
            //double sine = Math.toRadians(number1);
            per = (float) Math.cos(number1);
            // percent = true;
            num.setText(String.valueOf(per));
        }
        catch (Exception e){
            num.setText("No Number Selected");
        }
    }

    public void tantita(View view) {
        EditText num = findViewById(R.id.number111);
        try {
            number1 = Float.parseFloat(num.getText().toString() + "");
            //double sine = Math.toRadians(number1);
            per = (float) Math.tan(number1);
            // percent = true;
            num.setText(String.valueOf(per));
        }
        catch (Exception e){
            num.setText("No Number Selected");
        }
    }

    public void sinhtita(View view) {
        EditText num = findViewById(R.id.number111);
        try {
            number1 = Float.parseFloat(num.getText().toString() + "");
            //double sine = Math.toRadians(number1);
            per = (float) Math.sinh(number1);
            // percent = true;
            num.setText(String.valueOf(per));
        }
        catch (Exception e){
            num.setText("No Number Selected");
        }
    }

    public void coshtita(View view) {
        EditText num = findViewById(R.id.number111);
        try {
            number1 = Float.parseFloat(num.getText().toString() + "");
            //double sine = Math.toRadians(number1);
            per = (float) Math.cosh(number1);
            // percent = true;
            num.setText(String.valueOf(per));
        }catch (Exception e){
            num.setText("No Number Selected");
        }
    }

    public void tanhtita(View view) {
        EditText num = findViewById(R.id.number111);
       // number1 = Float.parseFloat(num.getText().toString() + "");
        try {
            number1 = Float.parseFloat(num.getText().toString() + "");
            per = (float) Math.tanh(number1);
            // percent = true;
            num.setText(String.valueOf(per));
        } catch (Exception e){
            num.setText("No Number Selected");
        }
//        //double sine = Math.toRadians(number1);
//        per = (float) Math.tanh(number1);
//        // percent = true;
//        num.setText(String.valueOf(per));
    }

    public void cbro(View view) {
        EditText num = findViewById(R.id.number111);
        try {
            number1 = Float.parseFloat(num.getText().toString() + "");
            per = (float) Math.cbrt(number1);
            // percent = true;
            num.setText(String.valueOf(per));
        }
        catch (Exception e){
            num.setText("No Number Selected");
        }
    }

    public void factrol(View view) {
        EditText num = findViewById(R.id.number111);
        int fact = 1;
        try {
            number1 = Float.parseFloat(num.getText().toString() + "");
            for(int i = 1; i<= number1;i++){
                fact *=i;
            }
            num.setText(String.valueOf(fact));
        }catch (Exception e){
            num.setText("No Number Selected");
        }

    }

    public void logrithm(View view) {
        EditText num = findViewById(R.id.number111);
        try {
            number1 = Float.parseFloat(num.getText().toString() + "");
            per = (float) Math.log(number1);
            // percent = true;
            num.setText(String.valueOf(per));
        }
        catch (Exception e){
            num.setText("No Number Selected");
        }
    }
}