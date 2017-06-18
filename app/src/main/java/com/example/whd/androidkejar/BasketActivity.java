package com.example.whd.androidkejar;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/*
* 06/06/2017
* by Rokhim Wahid*/

public class BasketActivity extends AppCompatActivity {

    /*deklarasi nilai score a & b*/
    int scorea;
    int scoreb;

//    /*deklarasi alert dialog keluar*/
//    private AlertDialog.Builder alertDialogBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.basket_main);

    }

    /*Penambah +3 score ke team A*/
    public void teama3(View v)
    {
        scorea = scorea+3;
        displayforteama(scorea);
    }

    /*Penambah +2 score ke team A*/
    public void teama2(View v)
    {
        scorea = scorea+2;
        displayforteama(scorea);
    }

    /*Penambah +1 score ke team A*/
    public void teama1(View v)
    {
        scorea = scorea+1;
        displayforteama(scorea);
    }

    /*menampilkan hasil team A*/
    public void displayforteama(int a)
    {
        TextView scoreView = (TextView) findViewById(R.id.numberTeamA);
        scoreView.setText(String.valueOf(a));
    }

    /*Penambah +3 score ke team B*/
    public void teamb3(View v)
    {
        scoreb = scoreb+3;
        displayforteamb(scoreb);
    }

    /*Penambah +2 score ke team B*/
    public void teamb2(View v)
    {
        scoreb = scoreb+2;
        displayforteamb(scoreb);
    }

    /*Penambah +3 score ke team B*/
    public void teamb1(View v)
    {
        scoreb = scoreb+1;
        displayforteamb(scoreb);
    }

    /*menampilkan hasil team B*/
    public void displayforteamb(int b)
    {
        TextView scoreView = (TextView) findViewById(R.id.numberTeamB);
        scoreView.setText(String.valueOf(b));
    }

    /*Mengulangi Hasil Point Team A dan Team B*/
    public void reset(View v)
    {
        scorea=0;
        scoreb=0;
        displayforteama(scorea);
        displayforteamb(scoreb);
    }

    /*hasil dari pemenang tim a dan b*/
    public void end(View v)
    {
        String pemenangtima = "Pemenang Team A";
        String pemenangtimb = "Pemenang Team B";
        String seri = "Kedua Team Seri";

        if (scorea > scoreb)
            Toast.makeText(getApplicationContext(), pemenangtima, Toast.LENGTH_SHORT)
                    .show();
        if (scorea < scoreb)
            Toast.makeText(getApplicationContext(), pemenangtimb, Toast.LENGTH_SHORT)
                        .show();
        if (scorea == scoreb)
            Toast.makeText(getApplicationContext(), seri, Toast.LENGTH_SHORT)
                    .show();


    }


//    /*Button untuk Keluar dari aplikasi + alert yes no*/
//    public void Exit(View v) {
//        new AlertDialog.Builder(this)
//            .setMessage("Apakah anda yakin ingin menutup aplikasi?")
//            .setCancelable(false)
//            .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
//                public void onClick(DialogInterface dialog, int id) {
//                    BasketActivity.this.finish();
//                }
//            })
//            .setNegativeButton("No", null)
//            .show();
//    }

    /*Peringatan keluar aplikasi saat ditekan back*/
//    @Override
//    public void onBackPressed() {
////        super.onBackPressed();
//
//        alertDialogBuilder.setTitle("Tutup Aplikasi");
//        alertDialogBuilder
//            .setMessage("Apakah anda yakin ingin menutup aplikasi?")
//            .setCancelable(false)
//
//            .setPositiveButton("YA" ,
//                new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog,
//                                         int id) {
//                        Toast.makeText(MainActivity.this, "Anda keluar", Toast.LENGTH_SHORT).show();
//                    }
//                })
//            .setNegativeButton("TIDAK",
//                new DialogInterface.OnClickListener() {
//                    public void onClick(DialogInterface dialog,
//                                        int id) {
//                        dialog.cancel();
//                        Toast.makeText(MainActivity.this, "Anda masih di aplikasi", Toast.LENGTH_SHORT).show();
//                    }
//                })
//            .create().show();
//    }
}
