package com.example.trycalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Button one,two,three,four,five,six,seven,eight,nine,d_zero,zero,point,equal,plus,dived,maltipal,mins ,ac;
    TextView number;


    int frist_number,second_number;
    char ope;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three=findViewById(R.id.therr);
        four=findViewById(R.id.four);
        five= findViewById(R.id.five);
        six= findViewById(R.id.six);
        seven= findViewById(R.id.seven);
        eight= findViewById(R.id.eigth);
        nine= findViewById(R.id.nine);
        d_zero= findViewById(R.id.d_zero);
        zero= findViewById(R.id.zero);



        // oprter
        plus=findViewById(R.id.plus);
        mins=findViewById(R.id.minz);
        dived=findViewById(R.id.divid);
        maltipal=findViewById(R.id.mitipal);
        equal=findViewById(R.id.equal);
        point=findViewById(R.id.point);
        ac=findViewById(R.id.ac);


        //text

        number=findViewById(R.id.numder);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num = number.getText().toString();
                number.setText(num + "1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String num = number.getText().toString();
                number.setText(num + "2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = number.getText().toString();
                number.setText(num + "3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num = number.getText().toString();
                number.setText(num + "4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num = number.getText().toString();
                number.setText(num + "5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num = number.getText().toString();
                number.setText(num + "6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = number.getText().toString();
                number.setText(num + "7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num = number.getText().toString();
                number.setText(num + "8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = number.getText().toString();
                number.setText(num + "9");
            }
        });
        d_zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String num = number.getText().toString();
                number.setText(num + "00");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String num = number.getText().toString();
                number.setText(num + "0");
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                float num = number.getText().toString();
                number.setText(num + ".");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {

                frist_number = Integer .parseInt(number.getText().toString());
                number.setText("");

                ope = '+';

            }
        });

      mins.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              frist_number = Integer.parseInt(number.getText().toString());
              number.setText("");

              ope = '-';
          }
      });
      maltipal.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
                frist_number = Integer.parseInt(number.getText().toString());
                number.setText("");

                ope = '*';
          }
      });
      dived.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              frist_number = Integer.parseInt(number.getText().toString());
              number.setText("");

              ope = '/';

          }
      });


        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                number.setText(" ");
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (ope == '+') {

                    second_number = Integer.parseInt(number.getText().toString());

                    addition();

                }
                else if (ope == '-'){

                    second_number = Integer.parseInt(number.getText().toString());


                    addition2();
                }
                if(ope == '*'){

                    second_number = Integer.parseInt(number.getText().toString());

                    addition3();
                }
                else if (ope == '/'){

                    second_number = Integer.parseInt(number.getText().toString());

                    addition4();
                }
            }
        });



    }

    void addition(){

        int total = frist_number+second_number;
            number.setText(" "+total);
    }
    void addition2(){

        int total = frist_number-second_number;
           number.setText("" + total);
    }
    void addition3(){

        int total = frist_number * second_number;
        number.setText(""+total);
    }
    void addition4(){

        int total = frist_number / second_number;
        number.setText("" + total);
    }
}