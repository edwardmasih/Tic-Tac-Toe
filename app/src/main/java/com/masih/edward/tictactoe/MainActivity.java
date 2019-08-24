package com.masih.edward.tictactoe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
//STP-HYD18 Project by EDWARD MASIH
//TIC TAC TOE
public class MainActivity extends AppCompatActivity implements OnClickListener {
    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.button);
        getSupportActionBar().setTitle("Developed by Edward Masih");
        b1.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        try{
            Intent i=new Intent(this,game.class);
            startActivity(i);
        }
        catch(Exception e){}


    }
}

