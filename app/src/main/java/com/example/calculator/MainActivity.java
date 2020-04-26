package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button0;
    Button buttonDiv,buttonMul,buttonSub,buttonAdd;
    Button buttonEquals,buttonClr;

    TextView result,display;

    boolean flag=false;
    boolean continuity=false;

    int firstNumber=0,secondNumber=0;
    String operator="";

    public void calc()
    {
        if(operator=="+")
        {
            firstNumber+=Integer.parseInt(result.getText().toString());
        }
        if(operator=="-")
        {
            firstNumber-=Integer.parseInt(result.getText().toString());
        }
        if(operator=="*")
        {
            firstNumber*=Integer.parseInt(result.getText().toString());
        }
        if(operator=="/")
        {
            firstNumber/=Integer.parseInt(result.getText().toString());
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0=(Button)findViewById(R.id.button0);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button7=(Button)findViewById(R.id.button7);
        button8=(Button)findViewById(R.id.button8);
        button9=(Button)findViewById(R.id.button9);
        buttonAdd=(Button)findViewById(R.id.buttonAdd);
        buttonSub=(Button)findViewById(R.id.buttonSub);
        buttonMul=(Button)findViewById(R.id.buttonMul);
        buttonDiv=(Button)findViewById(R.id.buttonDiv);
        buttonClr=(Button)findViewById(R.id.buttonClr);
        buttonEquals=(Button)findViewById(R.id.buttonEquals);

        result=(TextView)findViewById(R.id.result);
        display=(TextView)findViewById(R.id.display);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText(result.getText()+"0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false){
                    flag=true;
                    result.setText("1");
                }
                else
                    result.setText(result.getText()+"1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false){
                    flag=true;
                    result.setText("2");
                }
                else
                    result.setText(result.getText()+"2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false){
                    flag=true;
                    result.setText("3");
                }
                else
                    result.setText(result.getText()+"3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false){
                    flag=true;
                    result.setText("4");
                }
                else
                    result.setText(result.getText()+"4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false){
                    flag=true;
                    result.setText("5");
                }
                else
                    result.setText(result.getText()+"5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false){
                    flag=true;
                    result.setText("6");
                }
                else
                    result.setText(result.getText()+"6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false){
                    flag=true;
                    result.setText("7");
                }
                else
                    result.setText(result.getText()+"7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false){
                    flag=true;
                    result.setText("8");
                }
                else
                    result.setText(result.getText()+"8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag==false){
                    flag=true;
                    result.setText("9");
                }
                else
                    result.setText(result.getText()+"9");
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(continuity==true)
                {
                    calc();
                }
                else
                {
                    continuity=true;
                    firstNumber=Integer.parseInt(result.getText().toString());
                }
                operator="+";
                display.setText(Integer.toString(firstNumber));
                result.setText("");
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(continuity==true)
                {
                    calc();
                }
                else
                {
                    continuity=true;
                    firstNumber=Integer.parseInt(result.getText().toString());
                }
                operator="-";
                display.setText(Integer.toString(firstNumber));
                result.setText("");
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(continuity==true)
                {
                    calc();
                }
                else
                {
                    continuity=true;
                    firstNumber=Integer.parseInt(result.getText().toString());
                }
                operator="*";
                display.setText(Integer.toString(firstNumber));
                result.setText("");
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(continuity==true)
                {
                    calc();
                }
                else
                {
                    continuity=true;
                    firstNumber=Integer.parseInt(result.getText().toString());
                }
                operator="/";
                display.setText(Integer.toString(firstNumber));
                result.setText("");
            }
        });

        buttonClr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setText("0");
                display.setText("");
                continuity=false;
                flag=false;
                firstNumber=0;
                secondNumber=0;
                operator="";
            }
        });

        buttonEquals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                continuity=false;
                display.setText("");
                secondNumber=Integer.parseInt(result.getText().toString());
                if(operator=="+")
                {
                    int sum=firstNumber+secondNumber;
                    result.setText(Integer.toString(sum));
                }

                if(operator=="-")
                {
                    int diff=firstNumber-secondNumber;
                    result.setText(Integer.toString(diff));
                }

                if(operator=="*")
                {
                    int mul=firstNumber*secondNumber;
                    result.setText(Integer.toString(mul));
                }

                if(operator=="/")
                {
                    if(secondNumber==0)
                    {
                        result.setText("Can't Divide By 0");
                    }
                    else
                    {
                        int quo=firstNumber/secondNumber;
                        result.setText(Integer.toString(quo));
                    }
                }
                firstNumber=Integer.parseInt(result.getText().toString());
                secondNumber=0;
                operator="";
            }
        });


    }
}
