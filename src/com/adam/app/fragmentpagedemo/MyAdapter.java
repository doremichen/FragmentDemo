/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: MyAdapter.java
 * Brief: 
 * 
 * Author: AdamChen
 * Create Date: 2018/4/20
 */

package com.adam.app.fragmentpagedemo;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * <h1>MyAdapter</h1>
 * 
 * @autor AdamChen
 * @since 2018/4/20
 */
public class MyAdapter extends FragmentStatePagerAdapter {

    private static final int ITEMS = 2;

    public MyAdapter(FragmentManager fm) {
        super(fm);
        Utils.Info(this, "MyAdapter construct enter");
    }

    @Override
    public Fragment getItem(int position) {
        Utils.Info(this, "[getItem] enter position: " + position);

        switch (position) {
        case 0:
        case 1:
            return ImageFragment.init(position);
        }

        return ArrayListFragment.init(position);
    }

    @Override
    public int getCount() {
        Utils.Info(this, "[getCount] enter");
        return ITEMS;
    }

}
