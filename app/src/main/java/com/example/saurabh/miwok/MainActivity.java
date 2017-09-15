package com.example.saurabh.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openNumbersView(View view)
    {
        Intent numberIntent = new Intent(this, NumbersActivity.class);
        startActivity(numberIntent);

    }

    public void openFamilyView(View view)
    {
        Intent familyIntent = new Intent(this, FamilyActivity.class);
        startActivity(familyIntent);
    }

    public void openColorsView(View view)
    {
        Intent colorsIntent = new Intent(this, ColorsActivity.class);
        startActivity(colorsIntent);
    }

    public void openPhrasesView(View view)
    {
        Intent phrasesIntent = new Intent(this, PhrasesActivity.class);
        startActivity(phrasesIntent);
    }

}
