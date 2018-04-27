package com.example.diyanfang.finalprojectadventuregame;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Inventory extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inventory);

        Intent intent = getIntent();

    }

    TextView scissors = (TextView) findViewById(R.id.scissors);
    TextView junk = (TextView) findViewById(R.id.junk);
    TextView gold = (TextView) findViewById(R.id.gold);
    TextView sandwich = (TextView) findViewById(R.id.sandwich);
    TextView compass = (TextView) findViewById(R.id.compass);
    TextView water = (TextView) findViewById(R.id.water);

    public void scissorsClick(View view){
        Toast.makeText(this, "You freed the dolphin!", Toast.LENGTH_SHORT).show();
    }
    public void junkClick(View view){
        Toast.makeText(this, "You used what first appeared to be junk!", Toast.LENGTH_SHORT).show();
    }
    public void goldClick(View view){
        Toast.makeText(this, "You gave the otter your gold!", Toast.LENGTH_SHORT).show();
    }
    public void sandwichClick(View view){
        Toast.makeText(this, "Turns out you just had to give them a sandwich!", Toast.LENGTH_SHORT).show();
    }
    public void compassClick(View view){
        Toast.makeText(this, "The compass appears to be pointed West.", Toast.LENGTH_SHORT).show();
    }
    public void waterClick(View view){
        Toast.makeText(this, "The water got rid of the fire!", Toast.LENGTH_SHORT).show();
    }

}

