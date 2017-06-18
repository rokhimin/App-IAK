package com.example.whd.androidkejar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class CalcActivity extends AppCompatActivity {

    /*deklarasi string,character,dan edittext*/
    public String str ="";
    Character op='q';
    float i,num,numtemp;
    EditText showResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        /*identifikasi result*/
        showResult =
                (EditText)findViewById(R.id.resultid);

    }

    /*buat fungsi tombol 0*/
    public void btn0klik(View v){
        insert(0);
    }
    /*buat fungsi tombol 1*/
    public void btn1klik(View v){
        insert(1);
    }
    /*buat fungsi tombol 2*/
    public void btn2klik(View v){
        insert(2);
    }
    /*buat fungsi tombol 3*/
    public void btn3klik(View v){
        insert(3);
    }
    /*buat fungsi tombol 4*/
    public void btn4klik(View v){
        insert(4);
    }
    /*buat fungsi tombol 5*/
    public void btn5klik(View v){
        insert(5);
    }
    /*buat fungsi tombol 6*/
    public void btn6klik(View v){
        insert(6);
    }
    /*buat fungsi tombol 7*/
    public void btn7klik(View v){
        insert(7);
    }
    /*buat fungsi tombol 8*/
    public void btn8klik(View v){
        insert(8);
    }
    /*buat fungsi tombol 9*/
    public void btn9klik(View v){
        insert(9);
    }

    /*Fungsi penjumlahan*/
    public void btnplusklik (View v){
        perform();
        op = '+';
    }
    /*Fungsi pengurangan*/
    public void btnminusklik (View v){
        perform();
        op = '-';
    }
    /*Fungsi penmbagian*/
    public void btnbagiklik (View v){
        perform();
        op = '/';
    }
    /*Fungsi perkalian*/
    public void btnkaliklik (View v){
        perform();
        op = '*';
    }

    /*fungsi kalkulasi*/
    public void btncalcklik(View v){
        calculate();
    }

    /*fungsi hapus*/
    public void btnclearklik(View v){
        reset();
    }

    /*Algoritma reset*/
    private void reset() {
        str ="";
        op ='q';
        num = 0;
        numtemp = 0;
        showResult.setText("");
    }

    /*algoritma insert*/
    private void insert(int j) {
        str = str+Integer.toString(j);
        num = Integer.valueOf(str).intValue();
        showResult.setText(str);
    }

    /*algoritma perform*/
    private void perform() {
        str = "";
        calculateNoShow();
        numtemp = num;
    }

    /*algoritma calculate*/
    public void calculate(){
        if(op =='+')
            num = numtemp+num;
        else if(op =='-')
            num = numtemp-num;
        else if(op =='/')
            num = numtemp/num;
        else if(op =='*')
            num = numtemp*num;
        showResult.setText(""+num);
    }

    /*algoritma calculate noshow*/
    public void calculateNoShow(){
        if(op =='+')
            num = numtemp+num;
        else if(op =='-')
            num = numtemp-num;
        else if(op =='/')
        num = numtemp/num;
        else if(op =='*')
        num = numtemp*num;
    }


}
