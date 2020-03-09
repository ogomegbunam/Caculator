package android.example.caculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     private boolean isOpPressed = false;
     private double firstNunber=0;
     private int secondNumberIndex=0;
     private char currentOp;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylayout);
        final TextView caculatorscreen = findViewById(R.id.caculatorscreen);
        final Button n0 = findViewById(R.id.n0);
        final Button n1 = findViewById(R.id.n1);
        final Button n2 = findViewById(R.id.n2);
        final Button n3 = findViewById(R.id.n3);
        final Button n4 = findViewById(R.id.n4);
        final Button n5 = findViewById(R.id.n5);
        final Button n6 = findViewById(R.id.n6);
        final Button n7 = findViewById(R.id.n7);
        final Button n8 = findViewById(R.id.n8);
        final Button n9 = findViewById(R.id.n9);
        final Button dot = findViewById(R.id.dot);
        final Button division = findViewById(R.id.division);
        final Button multiplication = findViewById(R.id.multiplication);
        final Button equal = findViewById(R.id.equal);
        final Button addition = findViewById(R.id.addition);
        final Button substraction = findViewById(R.id.substraction);


        final View.OnClickListener caculatorlistener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final int id = v.getId();

                switch (id) {
                    case R.id.n0:
                        caculatorscreen.append("0");
                        break;

                    case R.id.n1:
                        caculatorscreen.append("1");

                        break;

                    case R.id.n2:
                        caculatorscreen.append("2");

                        break;

                    case R.id.n3:
                        caculatorscreen.append("3");

                        break;
                    case R.id.n4:
                        caculatorscreen.append("4");

                        break;
                    case R.id.n5:
                        caculatorscreen.append("5");

                        break;
                    case R.id.n6:
                        caculatorscreen.append("6");

                        break;
                    case R.id.n7:
                        caculatorscreen.append("7");

                        break;
                    case R.id.n8:
                        caculatorscreen.append("8");

                        break;
                    case R.id.n9:
                        caculatorscreen.append("9");

                        break;

                    case R.id.dot:
                        break;
                    case R.id.equal:
                        if (isOpPressed) {
                            if (currentOp == '+') {
                                String screenContent = caculatorscreen.getText().toString();
                                String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                double secondNumber = Double.parseDouble(secondNumberString);
                                secondNumber += firstNunber;
                                caculatorscreen.setText(String.valueOf(secondNumber));

                            }
                            if (currentOp == '*') {
                                String screenContent = caculatorscreen.getText().toString();
                                String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                double secondNumber = Double.parseDouble(secondNumberString);
                                secondNumber *= firstNunber;
                                caculatorscreen.setText(String.valueOf(secondNumber));
                            }
                            if (currentOp == '-') {
                                String screenContent = caculatorscreen.getText().toString();
                                String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                double secondNumber = Double.parseDouble(secondNumberString);
                                secondNumber -= firstNunber;
                                caculatorscreen.setText(String.valueOf(secondNumber));

                            }
                            if (currentOp == '/') {
                                String screenContent = caculatorscreen.getText().toString();
                                String secondNumberString = screenContent.substring(secondNumberIndex, screenContent.length());
                                double secondNumber = Double.parseDouble(secondNumberString);
                                secondNumber /= firstNunber;
                                caculatorscreen.setText(String.valueOf(secondNumber));

                            }
                        }

                        break;
                    case R.id.division:
                        String screenContent= caculatorscreen.getText().toString();
                        secondNumberIndex= screenContent.length()/1;
                        firstNunber = Double.parseDouble(screenContent);
                        caculatorscreen.append("/");
                        isOpPressed = true;
                        currentOp = '/';
                        break;
                    case R.id.addition:
                         screenContent= caculatorscreen.getText().toString();
                        secondNumberIndex= screenContent.length()+1;
                        firstNunber = Double.parseDouble(screenContent);
                        caculatorscreen.append("+");
                        isOpPressed = true;
                        currentOp = '+';
                        break;
                    case R.id.multiplication:
                        screenContent= caculatorscreen.getText().toString();
                        secondNumberIndex= screenContent.length()*1;
                        firstNunber = Double.parseDouble(screenContent);
                        caculatorscreen.append("+");
                        isOpPressed = true;
                        currentOp = '*';
                        break;
                    case R.id.substraction:
                        screenContent= caculatorscreen.getText().toString();
                        secondNumberIndex= screenContent.length()-1;
                        firstNunber = Double.parseDouble(screenContent);
                        caculatorscreen.append("+");
                        isOpPressed = true;
                        currentOp = '-';
                        break;

                }


            }
        };


        n0.setOnClickListener(caculatorlistener);
        n1.setOnClickListener(caculatorlistener);
        n2.setOnClickListener(caculatorlistener);
        n3.setOnClickListener(caculatorlistener);
        n4.setOnClickListener(caculatorlistener);
        n5.setOnClickListener(caculatorlistener);
        n6.setOnClickListener(caculatorlistener);
        n7.setOnClickListener(caculatorlistener);
        n8.setOnClickListener(caculatorlistener);
        n9.setOnClickListener(caculatorlistener);
        dot.setOnClickListener(caculatorlistener);
        division.setOnClickListener(caculatorlistener);
        multiplication.setOnClickListener(caculatorlistener);
        addition.setOnClickListener(caculatorlistener);
        substraction.setOnClickListener(caculatorlistener);
        equal.setOnClickListener(caculatorlistener);

        final Button delete = findViewById(R.id.Del);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String displayedElements = caculatorscreen.getText().toString();
                int length = displayedElements.length();
                if (length>0){
                    displayedElements = displayedElements.substring(0,length-1);
                    caculatorscreen.setText(displayedElements);
                }
            }
        });
        final  Button clearEverything= findViewById(R.id.Clear);
        clearEverything.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                caculatorscreen.setText("");
            }
        });
    }


}
