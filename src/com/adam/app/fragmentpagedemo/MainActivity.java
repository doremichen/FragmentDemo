package com.adam.app.fragmentpagedemo;

/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: MainActivity.java
 * Brief: 
 * 
 * Author: AdamChen
 * Create Date: 2018/4/20
 */

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.view.ViewPager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends FragmentActivity {

    // pager adapter
    private MyAdapter mAdapter;
    // view pager
    private ViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.Info(this, "[onCreate]");
        setContentView(R.layout.fragment_pager);

        this.mAdapter = new MyAdapter(this.getSupportFragmentManager());
        this.mPager = (ViewPager) this.findViewById(R.id.pager);
        this.mPager.setAdapter(mAdapter);

    }

    public void onFirstBtn(View v) {
        Utils.Info(this, "[onFirstBtn]");
        mPager.setCurrentItem(0);
    }

    public void onLastBtn(View v) {
        Utils.Info(this, "[onLastBtn]");
        mPager.setCurrentItem(this.mAdapter.getCount() - 1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        final int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Utils.Info(this, "[onDestroy] enter");
    }

    @Override
    public void onPause() {
        super.onPause();
        Utils.Info(this, "[onPause] enter");
    }

    @Override
    public void onResume() {
        super.onResume();
        Utils.Info(this, "[onResume] enter");
    }

}
