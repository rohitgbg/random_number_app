package com.first.anonymousghost.randomnumber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import android.util.*;
import android.widget.Toast;

import java.lang.String;

import java.util.*;


public class MainActivity extends AppCompatActivity {

    int randomNum;
    public void onGuess(View view)
    {

        //System.out.println("Button tapped");

        EditText text1 = (EditText) findViewById(R.id.editText);

        String getString = text1.getText().toString();

        int getRand = Integer.parseInt(getString);

        System.out.println(getRand);
        System.out.println(randomNum);


        String message="";


        if(getRand > randomNum)
        {

            message="Too high";

        }
        else if(getRand < randomNum)
        {
            message="Too low";

        }
        else
        {

            message="Well done!";

        }


        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();


    }






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random randomGen = new Random();

        randomNum = randomGen.nextInt(21);


    }
}
