/**
 * ===========================================================================
 * Copyright Adam Sample code
 * All Rights Reserved
 * ===========================================================================
 * 
 * File Name: ImageFragment.java
 * Brief: 
 * 
 * Author: AdamChen
 * Create Date: 2018/4/20
 */

package com.adam.app.fragmentpagedemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * <h1>ImageFragment</h1>
 * 
 * @autor AdamChen
 * @since 2018/4/20
 */
public class ImageFragment extends Fragment {

    private static final String VALUE = "value";
    private int mFragNum;

    static ImageFragment init(int val) {
        Utils.Info(ImageFragment.class, "[ImageFragment] enter");

        final ImageFragment fragment = new ImageFragment();

        // Save value in Bundle
        final Bundle args = new Bundle();
        args.putInt(VALUE, val);
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Utils.Info(this, "[onCreate] enter");
        // Get value from bundle
        mFragNum = this.getArguments() != null ? this.getArguments().getInt(
                VALUE) : -1;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState) {
        Utils.Info(this, "[onCreateView] enter");

        // Build fragment view
        final View layoutView = inflater.inflate(R.layout.image_fragement,
                container, false);

        final TextView tv = (TextView) layoutView.findViewById(R.id.text);
        tv.setText("Fragment #: " + mFragNum);

        return layoutView;
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
