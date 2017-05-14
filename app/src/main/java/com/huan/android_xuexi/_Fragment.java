package com.huan.android_xuexi;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.huan.android_xuexi.fragment.fragment0;
import com.huan.android_xuexi.fragment.fragment00;
import com.huan.android_xuexi.fragment.fragment1;
import com.huan.android_xuexi.fragment.fragment2;
import com.huan.android_xuexi.fragment.fragment3;

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
    TextView tv11;
    TextView tv14;
    fragment2 f2;
    fragment00 f00=new fragment00();
    fragment0 f0=new fragment0();
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_fragment);
        tv11= (TextView) findViewById(R.id.textView11);
        tv14= (TextView) findViewById(R.id.textView14);
    }

    //生命周期
    protected void fragment_button0(View view){
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.framenl,f0);
        ft.commit();
    }

    //事务方法
    protected  void fragment_button00(View view){
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.framenl,f00);
        ft.commit();
    }

    /**
     * 按钮触发：添加fragment
     *
     * FragmentTransaction.add(int i,Fragment fragment);
     * int i-->添加Fragment所用的布局控件ID
     * Fragment fragment)-->Fragment的java文件
     */
    protected  void fragment_button1 (View view) {
        switch (view.getId()){
            case R.id.button11:
                fragment1 f1=new fragment1();
                FragmentTransaction ft1 = fm.beginTransaction();
                ft1.add(R.id.framenl,f1);
                ft1.addToBackStack("fragment1");
                ft1.commit();
                break;
            //易错点：若将 fragment2 f2=new fragment2();放在全局变量中，ft2进行第二次add时将会报错！
            case R.id.button12:
                f2=new fragment2();
                FragmentTransaction ft2 = fm.beginTransaction();
                ft2.add(R.id.framenl,f2);
                ft2.addToBackStack("fragment2");
                ft2.commit();
                break;
            case R.id.button13:
                fragment3 f3=new fragment3();
                FragmentTransaction ft3 = fm.beginTransaction();
                ft3.add(R.id.framenl,f3);
                ft3.addToBackStack("fragment3");
                ft3.commit();
                break;
        }
    }

    protected void fragment_button2(View view){
        FragmentTransaction ft = fm.beginTransaction();
        ft.remove(f2);
        ft.commit();
    }

    protected void fragment_button3(View view){
        fm.popBackStack();
    }

    protected void fragment_button4(View view){
        back_stack();
    }

    protected void back_stack(){
        int b=fm.getBackStackEntryCount();
        StringBuilder stringBuilder=new StringBuilder();
        for (int i=b-1 ; i>=0 ; i--){
            FragmentManager.BackStackEntry bse=fm.getBackStackEntryAt(i);
            stringBuilder.append("|"+bse.getName()+"|"+"\n");
        }
        stringBuilder.append("------------------");
        tv11.setText(stringBuilder.toString());
    }
}
