package com.huan.android_xuexi;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

/**
 * Created by huan on 2017/4/28.
 */

//这里将介绍Activity的生命周期
public class _Activity  extends Activity{
/*
 * 当启动进入这个Activity时，将会调用：
 * 开始-->onCreate()-->onStart()-->onResume()
 * --运行状态（Running）处于可见并与用户交互，处于最前，拥有焦点的状态
 *
 *
 * 当Activity被Dialog样式的Activity覆盖时，将会调用：
 * onPause()-->非最前端
 * --暂停状态（Paused）处于可见却不能与用户交互，处于后面，失去焦点的状态
 *
 * 若关闭Dialog样式的Activity时，将会重新获得焦点：
 * 非最前端-->onResume()
 *
 *
 * 当在当前界面按Home键（切换到桌面）  或  是转到新Activity时,将会调用：
 *onPause()-->onStop()-->后台
 * --停止状态 （Stopped）Activity被完全遮挡，但是保留所有状态和成员信息
 *
 * 当从后台重新打开  或  关闭新Activity返回原来的Activity时，将会调用：
 * 后台-->onRestart()-->onStart()-->onResume()
 *
 *
 *当在当前界面按Back键（返回键）时，将会调用：
 * onPause()-->onStop()-->onDestroy()-->结束
 * --结束状态（Killed）Activity被移除
 *
 *
 */

    /**
     *创建：开始
     * 每次启动一个新的Activity，都将会先调用此方法
     * @param savedInstanceState
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity);
        Log.i("tag","调用了-->onCreate");
    }

    /**
     *运行：
     *
     */
    protected void onStart() {
        super.onStart();
        Log.i("tag","调用了-->onStart");
    }

    /**
     *获取焦点：
     *处于运行状态时便会调用
     */
    protected void onResume() {
        super.onResume();
        Log.i("tag","调用了-->onResume");
    }

    /**
     *失去焦点：
     * 处于暂停状态或停止状态时便会调用
     */
    protected void onPause() {
        super.onPause();
        Log.i("tag","调用了-->onPause");
    }

    /**
     *暂停：
     * 进入停止状态时调用
     */
    protected void onStop() {
        super.onStop();
        Log.i("tag","调用了-->onStop");
    }

    /**
     *销毁：
     * 进入结束状态时调用
     */
    protected void onDestroy() {
        super.onDestroy();
        Log.i("tag","调用了-->onDestroy");
    }

    /**
     *恢复：
     * 从停止状态中恢复时会调用
     */
    protected void onRestart() {
        super.onRestart();
        Log.i("tag","调用了-->onRestart");
    }
    protected void dak(View view){
        Dialog dialog=new AlertDialog.Builder(_Activity.this)
                .setTitle("一个对话框让人失去焦点的←_←")
                .setPositiveButton("哦",null)
                .create();
        dialog.show();

    }
}
