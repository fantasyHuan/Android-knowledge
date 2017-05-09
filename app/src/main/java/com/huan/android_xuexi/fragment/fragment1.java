package com.huan.android_xuexi.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.huan.android_xuexi.R;

/**
 * Created by huan on 2017/5/9.
 */

public class fragment1 extends Fragment{
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tian, container, false);
    }
}
