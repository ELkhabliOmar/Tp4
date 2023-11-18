package com.example.tp4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public  class MainActivity extends AppCompatActivity {
    TextView resultat,afficher;
    Button button_clear,button_division,button_multiplication,button_subtraction,button_addition,button_equal;
    Button btnpoint,btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
    float val,res;
    String val2,res2;
    boolean add,sub,div,mul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resultat=findViewById(R.id.resultat);
        afficher=findViewById(R.id.afficher);
        button_clear=findViewById(R.id.button_clear);
        button_division=findViewById(R.id.button_division);
        button_multiplication=findViewById(R.id.button_multiplication);
        button_subtraction=findViewById(R.id.button_subtraction);
        button_addition=findViewById(R.id.button_addition);
        button_equal=findViewById(R.id.button_equal);
        btnpoint=findViewById(R.id.btnpoint);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afficher.setText(afficher.getText()+"0");
                resultat.setText(resultat.getText()+"0");
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afficher.setText(afficher.getText()+"1");
                resultat.setText(resultat.getText()+"1");
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afficher.setText(afficher.getText()+"2");
                resultat.setText(resultat.getText() + "2");
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afficher.setText(afficher.getText()+"3");
                resultat.setText(resultat.getText() + "3");
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afficher.setText(afficher.getText()+"4");
                resultat.setText(resultat.getText() + "4");
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afficher.setText(afficher.getText()+"5");
                resultat.setText(resultat.getText() + "5");
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afficher.setText(afficher.getText()+"6");
                resultat.setText(resultat.getText() + "6");
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afficher.setText(afficher.getText()+"7");
                resultat.setText(resultat.getText() + "7");
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afficher.setText(afficher.getText()+"8");
                resultat.setText(resultat.getText() + "8");
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afficher.setText(afficher.getText()+"9");
                resultat.setText(resultat.getText() + "9");
            }
        });
        btnpoint.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                afficher.setText(afficher.getText()+".");
                resultat.setText(resultat.getText() + ".");
            }
        });
        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                resultat.setText("");
                afficher.setText("");
            }
        });
        button_addition.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(afficher.length()==0){
                    Toast.makeText(MainActivity.this,"erreur",Toast.LENGTH_LONG).show();
                }else{
                val = Float.parseFloat((resultat.getText()+""));
                afficher.setText(afficher.getText()+"+"+"");
                add=true;
                resultat.setText("");}
            }
        });
        button_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(afficher.length()==0){
                    Toast.makeText(MainActivity.this,"erreur",Toast.LENGTH_LONG).show();
                }else{
                val = Float.parseFloat((resultat.getText()+""));
                afficher.setText(afficher.getText()+"/"+"");
                div=true;
                resultat.setText("");}
            }
        });
        button_subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(afficher.length()==0){
                    Toast.makeText(MainActivity.this,"erreur",Toast.LENGTH_LONG).show();
                }else{
                val = Float.parseFloat((resultat.getText()+""));
                afficher.setText(afficher.getText()+"-"+"");
                sub=true;
                resultat.setText("");}
            }
        });
        button_multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(afficher.length()==0){
                    Toast.makeText(MainActivity.this,"erreur",Toast.LENGTH_LONG).show();
                }else{
                val = Float.parseFloat((resultat.getText()+""));
                afficher.setText(afficher.getText()+"x"+"");
                mul=true;
                resultat.setText("");}
            }
        });

        button_equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(afficher.length()==0){
                    Toast.makeText(MainActivity.this,"erreur",Toast.LENGTH_LONG).show();
                }else{
               res=Float.parseFloat(resultat.getText()+"");

                if(add==true){
                    resultat.setText(val+res+"");
                    add=false;
                }
                if(sub==true){
                    resultat.setText(val-res+"");
                    sub=false;
                }
                if(mul==true){
                    resultat.setText(val*res+"");
                    mul=false;
                }
                if(div==true){
                    resultat.setText(val/res+"");
                    div=false;
                }}
            }
        });



    }


}