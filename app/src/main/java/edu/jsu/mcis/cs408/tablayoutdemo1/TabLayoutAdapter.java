package edu.jsu.mcis.cs408.tablayoutdemo1;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class TabLayoutAdapter extends FragmentStateAdapter {

    public static final int NUM_TABS = 4;

    public TabLayoutAdapter(Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        // Create a new fragment (a TabLayoutFragment instance)
        Fragment fragment = new TabLayoutFragment();

        // Create a Bundle to parametrize the new fragment with a numeric ID
        Bundle args = new Bundle();
        args.putInt(TabLayoutFragment.ARG_ID, position + 1);
        fragment.setArguments(args);

        // Return the new fragment
        return fragment;

    }

    @Override
    public int getItemCount() {

        // Return the number of tabs in the layout
        return NUM_TABS;

    }

}