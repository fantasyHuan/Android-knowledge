package com.huan.android_xuexi.fragment;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.huan.android_xuexi.R;

/**
 * Created by huan on 2017/5/13.
 */

public class fragment0 extends Fragment {
    /**
     *创建该fragment的View控件
     * 创建该fragment的视图，并返回给调用者Activity
     * @param inflater
     * @param container
     * @param savedInstanceState
     * @return
     */
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_0, container, false);
    }

    /**
     * 添加：
     * 当Fragment被添加到Activity时将会被调用
     * @param context
     */
    public void onAttach(Context context) {
        super.onAttach(context);
        Log.i("Fragment生命周期","调用了-->onAttach");
    }

    /**
     * 在最新的SDK 23中，此方法将过时
     * 新方法采用onAttach(Context context)
     * 如果设备API 小于23，将不会调用新方法
     *
     * 解决方案：
     * 使用support.v4.app.Fragment代替
     * @param activity
     *
    public void onAttach(Activity activity) {
        super.onAttach(activity);
    }
     */

    /**
     * 创建：
     * 创建Fragment时，将会调用
     * @param savedInstanceState
     */
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Fragment生命周期","调用了-->onCreate");
    }

    /**
     * 当Fragment所在的Activity的OnCreate()结束后，会调用此方法
     * @param savedInstanceState
     */
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.i("Fragment生命周期","调用了-->onActivityCreated");
    }

    /**
     * 运行：
     * 当到OnStart()时，Fragment对用户就是可见的了。但用户还未开始与Fragment交互
     */
    public void onStart() {
        super.onStart();
        Log.i("Fragment生命周期","调用了-->onStart");
    }

    /**
     * 获取焦点：
     * 当这个fragment对用户可见并且正在运行时调用。这是Fragment与用户交互之前的最后一个回调。
     */
    public void onResume() {
        super.onResume();
        Log.i("Fragment生命周期","调用了-->onResume");
    }

    /**
     * 失去焦点：
     * 此回调与Activity的OnPause()相绑定，与Activity的OnPause()意义一样。
     */
    public void onPause() {
        super.onPause();
        Log.i("Fragment生命周期","调用了-->onPause");
    }

    /**
     * 暂停：
     * 这个回调与Activity的OnStop()相绑定，与Activity的onStop()意义一样。
     */
    public void onStop() {
        super.onStop();
        Log.i("Fragment生命周期","调用了-->onStop");
    }

    /**
     * 销毁Fragment所包含的View控件
     */
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("Fragment生命周期","调用了-->onDestroyView");
    }

    /**
     * 销毁：
     * 销毁Fragment
     * 进入结束状态时调用
     */
    public void onDestroy() {
        super.onDestroy();
        Log.i("Fragment生命周期","调用了-->onDestroy");
    }

    /**
     * 从Activity中删除Fragment时将会调用
     * 调用后，Fragment就不再与Activity绑定，不再拥有视图层次结构，所有资源将会被释放。
     */
    public void onDetach() {
        super.onDetach();
        Log.i("Fragment生命周期","调用了-->onDetach");
    }
}
