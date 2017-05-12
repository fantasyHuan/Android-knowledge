package com.huan.android_xuexi;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

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
 *当旋转屏幕方向时，将会调用：
 *onPause()-->onSaveInstanceState()-->onStop()-->onDestroy()-->销毁Activity
 * 销毁后生成新Activity-->onCreate()-->onStart()-->onRestoreInstanceState()-->onResume()
 *
 * 旋转屏幕方向系统销毁Activity，并调用onSaveInstanceState()保存状态数据，
 * 在屏幕切换之后重新创建Activity，并调用onRestoreInstanceState()恢复状态数据。
 * 注：onSaveInstanceState()和onRestoreInstanceState()并不属于Activity生命周期的方法
 */

    /**
     *创建：开始
     * 每次启动一个新的Activity，都将会先调用此方法
     * @param savedInstanceState-->指Activity当前状态信息
     * 状态数据以key-value的形式放入到savedInstanceState·中
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity);
        Log.i("Activity生命周期","调用了-->onCreate");
    }

    /**
     *运行：
     *
     */
    protected void onStart() {
        super.onStart();
        Log.i("Activity生命周期","调用了-->onStart");
    }

    /**
     *获取焦点：
     *处于运行状态时便会调用
     */
    protected void onResume() {
        super.onResume();
        Log.i("Activity生命周期","调用了-->onResume");
    }

    /**
     *失去焦点：
     * 处于暂停状态或停止状态时便会调用
     */
    protected void onPause() {
        super.onPause();
        Log.i("Activity生命周期","调用了-->onPause");
    }

    /**
     *暂停：
     * 进入停止状态时调用
     */
    protected void onStop() {
        super.onStop();
        Log.i("Activity生命周期","调用了-->onStop");
    }

    /**
     *销毁：
     * 进入结束状态时调用
     */
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Activity生命周期","调用了-->onDestroy");
    }

    /**
     *恢复：
     * 从停止状态中恢复时会调用
     */
    protected void onRestart() {
        super.onRestart();
        Log.i("Activity生命周期","调用了-->onRestart");
    }

    /**
     *当发生意外，由系统"未经许可"销毁Activity时，此方法会被调用（保存状态数据）
     *方法主要用于保存状态数据（各种UI控件的状态并且前提下控件拥有唯一指定的ID属性）
     * 当屏幕方向切换时，系统会销毁Activity，并调用此方法保存状态数据，在屏幕切换之后重新创建Activity，
     * 并调用onRestoreInstanceState()恢复状态数据。
     * @param outState
     */
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.i("Activity","调用了-->onSaveInstanceState");
    }

    /**
     *恢复状态数据
     * @param savedInstanceState
     */
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.i("Activity","调用了-->onRestoreInstanceState");
    }


}
