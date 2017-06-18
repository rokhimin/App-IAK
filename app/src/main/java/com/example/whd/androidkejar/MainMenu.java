package com.example.whd.androidkejar;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;



/*
* 06/06/2017
* by Rokhim Wahid*/

public class MainMenu extends AppCompatActivity {

    /*Contxt deklarasi*/
    private static Context con;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_main);

    }

    //Pindah ke aktivity basketpoint
    public void btnBasket(View v) {

        Intent next = new Intent(MainMenu.this, BasketActivity.class);
        next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(next);
    }


    //Pindah ke aktivity Pratice
    public void btnIO(View v) {

        Intent next = new Intent(MainMenu.this, CobaActivity.class);
        next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(next);
    }

    //Pindah ke aktivity Kalkulator
    public void btnCalc(View v) {

        Intent next = new Intent(MainMenu.this, CalcActivity.class);
        next.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(next);
    }


}
