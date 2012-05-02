package com.child;

import org.apache.cordova.DroidGap;

import android.os.Bundle;

public class ChildShareActivity extends DroidGap {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        super.loadUrl("file:///android_asset/html/main.html#login");
    }
}