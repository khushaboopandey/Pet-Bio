package com.chandan.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    private ImageView Dog,Cat;
    public static final String TAG ="MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(TAG,"hello from main activity");

        Dog = findViewById(R.id.dog);
        Cat = findViewById(R.id.cat);
        Dog.setOnClickListener(this);
        Cat.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cat:
                //Toast.makeText(getApplicationContext(),"cat is clicked",Toast.LENGTH_LONG).show();
                Intent catintent = new Intent(MainActivity.this,BioActivity.class);
                catintent.putExtra("name","Jarvis");
                catintent.putExtra("bio","Great Cat.  Loves people and meows a lot!.");
                startActivity(catintent);
                break;
            case R.id.dog:
               // Toast.makeText(getApplicationContext(),"Dog is clicked",Toast.LENGTH_LONG).show();
                Intent dogintent = new Intent(MainActivity.this,BioActivity.class);
                dogintent.putExtra("name","Dufus");
                dogintent.putExtra("bio","Great Dog.  Loves people and barks and eat a lot!.");
                startActivity(dogintent);
                break;
        }

        }

    }

