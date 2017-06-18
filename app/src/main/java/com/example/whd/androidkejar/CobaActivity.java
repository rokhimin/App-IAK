package com.example.whd.androidkejar;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


/*
* 06/06/2017
* by Rokhim Wahid*/

public class CobaActivity extends AppCompatActivity {

    /*Deklarasi*/
    EditText editInput;
    Button btnClick;
    TextView textOutput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.coba_main);

       /*Mengubungkan ke id */
        editInput = (EditText) findViewById(R.id.editInput);
        btnClick = (Button) findViewById(R.id.btnInput);
        textOutput = (TextView) findViewById(R.id.txtShow);

        /*Action Ketika button diclick*/
        btnClick.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {

                /*Mengambil teks dari edit teks dlm bentuk button*/
                String text = editInput.getText().toString();

                /*menampilkan string dari edittext ke dlm toast*/
                Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT)
                        .show();

                /*menampilkan string dari edittext ke dlm textview*/
                textOutput.setText(text);

            }
        });

    }


}
