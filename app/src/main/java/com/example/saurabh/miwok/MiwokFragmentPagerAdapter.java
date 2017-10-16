package com.example.saurabh.miwok;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Saurabh on 10/14/2017.
 */

public class MiwokFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "Numbers", "Colors", "Family", "Phrases" };

    public MiwokFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new NumbersFragment();
        } else if (position == 1){
            return new ColorsFragment();
        } else if (position == 2){
            return new FamilyFrag();
        } else {
            return new PhrasesFragment();
        }

    }

    @Override
    public int getCount() {
        return 4;
    }

    public String getPageTitle(int position) {

        return tabTitles[position];
    }

}
