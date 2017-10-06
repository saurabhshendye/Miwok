package com.example.saurabh.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> numWords = new ArrayList<>();
        numWords.add(new word("Where are you going?", "minto wuksus"));
        numWords.add(new word("What is your name?", "tinnә oyaase'nә"));
        numWords.add(new word("My name is..", "oyaaset.."));
        numWords.add(new word("Are you coming?", "әәnәs'aa?"));
        numWords.add(new word("Yes, I’m coming", "hәә’ әәnәm"));
        numWords.add(new word("I’m coming.", "kelelli"));
        numWords.add(new word("Let’s go", "yoowutis"));
        numWords.add(new word("Come here", "әnni'nem"));


        ArrayAdapter<word> adapter = new wordAdapter(this, numWords);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
