package com.example.saurabh.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<word> numWords = new ArrayList<>();
        numWords.add(new word("one", "lutti", R.drawable.number_one));
        numWords.add(new word("two", "otiiko", R.drawable.number_two));
        numWords.add(new word("three", "tolookosu", R.drawable.number_three));
        numWords.add(new word("four", "oyyisa", R.drawable.number_four));
        numWords.add(new word("five", "massokka", R.drawable.number_five));
        numWords.add(new word("six", "temmokka", R.drawable.number_six));
        numWords.add(new word("seven", "kenekaku", R.drawable.number_seven));
        numWords.add(new word("eight", "kawinta", R.drawable.number_eight));
        numWords.add(new word("nine", "wo’e", R.drawable.number_nine));
        numWords.add(new word("ten", "na’aacha", R.drawable.number_ten));

        ArrayAdapter<word> adapter = new wordAdapter(this, numWords);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(adapter);
    }
}
