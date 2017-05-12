package com.huan.android_xuexi;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

import com.huan.android_xuexi.fragment.fragment1;
import com.huan.android_xuexi.fragment.fragment2;

/**
 * Created by huan on 2017/5/8.
 */

/*
Fragment常用的三个类：
android.app.Fragment 主要用于定义Fragment
android.app.FragmentManager 主要用于在Activity中操作Fragment
android.app.FragmentTransaction 保证一些列Fragment操作的原子性
 */
public class _Fragment extends Activity{
    FragmentManager fm = getFragmentManager();
    fragment1 f1=new fragment1();
    fragment2 f2=new fragment2();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_fragment);
    }

    /**
     * 按钮触发：添加fragment
     *
     * FragmentTransaction.add(int i,Fragment fragment);
     * int i-->添加Fragment所用的布局控件ID
     * Fragment fragment)-->Fragment的java文件
     */
    protected void fragment_button(View view){
        FragmentTransaction ft = fm.beginTransaction();
        ft.add(R.id.framenl,f1);
        ft.commit();
    }

    /**
     * 按钮触发：将布局控件上的替换为新的fragment
     *
     * FragmentTransaction.replace(int i,Fragment fragment);
     * --相当于删除（remove()）布局控件上的所有fragment，然后再添加（add()）新fragment
     * 注：不管布局控件上有没有fragment
     * int i-->替换Fragment所用的布局控件ID
     * Fragment fragment)-->Fragment的java文件
     */
    protected  void fragment_button1(View view){
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.framenl,f2);
        ft.commit();
    }

    /**
     *按钮触发：删除指定Fragment
     */
    protected  void fragment_button2(View view){
        FragmentTransaction ft = fm.beginTransaction();
        ft.remove(f2);
        ft.commit();
    }
}
