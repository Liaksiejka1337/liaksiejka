package com.liaksiejka.mobile.dev.hw1;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

public class LauncherFragmentCollectionAdapter extends FragmentStatePagerAdapter {
    public LauncherFragmentCollectionAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {

        switch (i) {
            case 0: {
                WelcomePageFragment wpFragment = new WelcomePageFragment();
                return wpFragment;
            }
            case 1: {
                DescriptionPageFragment dpFragment = new DescriptionPageFragment();
                return dpFragment;
            }
            case 2: {
                ThemePageFragment tpFragment = new ThemePageFragment();
                return tpFragment;
            }
            case 3: {
                LayoutPageFragment lpFragment = new LayoutPageFragment();
                return lpFragment;
            }
        }
        return null;
    }

    @Override
    public int getCount() {
        return 4;
    }
}
