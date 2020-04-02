package com.chandan.petbio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BioActivity extends AppCompatActivity {
    private ImageView petImage;
    private TextView PetName,PetDescription;
    Bundle extras;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);
        petImage = findViewById(R.id.petImage);
        PetName = findViewById(R.id.petName);
        PetDescription = findViewById(R.id.petDescription);

        extras = getIntent().getExtras();

        if (extras != null ){
       String name = extras.getString("name");
       String bio = extras.getString("bio");
        setUP(name,bio);
        }

    }

    private void setUP(String name, String bio) {
        if (name.equals("Dufus")){
             petImage.setImageDrawable(getResources().getDrawable(R.drawable.dog));
            PetName.setText(name);
            PetDescription.setText(bio);
        }
        else if (name.equals("Jarvis")){
           petImage.setImageDrawable(getResources().getDrawable(R.drawable.cat));
            PetName.setText(name);
            PetDescription.setText(bio);
        }
    }
}
