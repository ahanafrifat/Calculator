package com.aahr.ahanaf.calculator;

import android.os.PersistableBundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.ActionMode;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String sign =  "";
    public String total = "";
    public Double tempDouble1 , tempDouble2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();

        final Button button0= (Button) findViewById(R.id.button0);
        Button button1= (Button) findViewById(R.id.button1);
        Button button2= (Button) findViewById(R.id.button2);
        Button button3= (Button) findViewById(R.id.button3);
        Button button4= (Button) findViewById(R.id.button4);
        Button button5= (Button) findViewById(R.id.button5);
        Button button6= (Button) findViewById(R.id.button6);
        Button button7= (Button) findViewById(R.id.button7);
        Button button8= (Button) findViewById(R.id.button8);
        Button button9= (Button) findViewById(R.id.button9);

        Button buttonC= (Button) findViewById(R.id.buttonCId);
        Button buttonMC= (Button) findViewById(R.id.buttonMCId);
        Button buttonMCP= (Button) findViewById(R.id.buttonMCPlusId);

        Button buttonAdd= (Button) findViewById(R.id.buttonAddId);
        Button buttonSub= (Button) findViewById(R.id.buttonSubId);
        Button buttonMul= (Button) findViewById(R.id.buttonMulId);
        Button buttonDiv= (Button) findViewById(R.id.buttonDivId);

        Button buttonEqual = (Button) findViewById(R.id.buttonEqualId);

        button0.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView output= (TextView)findViewById(R.id.editText);
                        output.append("0");
                    }
                }

        );

        button1.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView output= (TextView)findViewById(R.id.editText);
                        output.append("1");
                    }
                }

        );

        button2.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView output= (TextView)findViewById(R.id.editText);
                        output.append("2");
                    }
                }

        );

        button3.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView output= (TextView)findViewById(R.id.editText);
                        output.append("3");
                    }
                }

        );

        button4.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView output= (TextView)findViewById(R.id.editText);
                        output.append("4");
                    }
                }

        );

        button5.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView output= (TextView)findViewById(R.id.editText);
                        output.append("5");
                    }
                }

        );

        button6.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView output= (TextView)findViewById(R.id.editText);
                        output.append("6");
                    }
                }

        );

        button7.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView output= (TextView)findViewById(R.id.editText);
                        output.append("7");
                    }
                }

        );

        button8.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView output= (TextView)findViewById(R.id.editText);
                        output.append("8");
                    }
                }

        );

        button9.setOnClickListener(
                new Button.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        TextView output= (TextView)findViewById(R.id.editText);
                        output.append("9");
                    }
                }

        );

        buttonC.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        TextView output= (TextView)findViewById(R.id.editText);
                        output.setText("");
                    }
                }
        );

        buttonAdd.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        TextView output= (TextView)findViewById(R.id.editText);
                        tempDouble1 = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "+";
                    }
                }
        );

        buttonSub.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        TextView output= (TextView)findViewById(R.id.editText);
                        tempDouble1 = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "-";
                    }
                }
        );

        buttonMul.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        TextView output= (TextView)findViewById(R.id.editText);
                        tempDouble1 = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "*";
                    }
                }
        );

        buttonDiv.setOnClickListener(
                new Button.OnClickListener(){
                    @Override
                    public void onClick(View v){
                        TextView output= (TextView)findViewById(R.id.editText);
                        tempDouble1 = Double.parseDouble(output.getText().toString());
                        output.setText("");
                        sign = "/";
                    }
                }
        );

        buttonEqual.setOnClickListener(
                new Button.OnClickListener()
                {
                    public void onClick(View v)
                    {
                        TextView output = (TextView)findViewById(R.id.editText);
                        tempDouble2 = Double.parseDouble(output.getText().toString());

                        if (sign == "+")
                        {
                            output.setText(Double.toString(tempDouble1 + tempDouble2));
                        }
                        else if (sign == "-")
                        {
                            output.setText(Double.toString(tempDouble1 - tempDouble2));
                        }
                        else if (sign == "*")
                        {
                            output.setText(Double.toString(tempDouble1 * tempDouble2));
                        }
                        else if (sign == "/")
                        {
                            if (tempDouble2 == 0)
                            {
                                // Cannot Divide By Zero
                                output.setText("Cannot Divide By Zero!");
                            }
                            else
                            {
                                output.setText(Double.toString(tempDouble1 / tempDouble2));
                            }
                        }

                        // Reset the Sign variable
                        sign = "";
                    }
                }
        );




    }

    @Override
    protected void onPause() {
        super.onPause();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
