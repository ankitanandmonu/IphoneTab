package com.iphonetab;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TabHost;

public class MainActivity extends TabActivity implements TabHost.OnTabChangeListener{

    /** Called when the activity is first created. */
    TabHost tabHost;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost = getTabHost();
        tabHost.setOnTabChangedListener(this);

        TabHost.TabSpec spec;
        Intent intent;

        // Create an Intent to launch an Activity for the tab (to be reused)
        intent = new Intent().setClass(this, FirstActivity.class);
        spec = tabHost.newTabSpec("First").setIndicator("First")
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, SecondActivity.class);
        spec = tabHost.newTabSpec("Second").setIndicator("Second")
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, ThirdActivity.class);
        spec = tabHost.newTabSpec("Third").setIndicator("Third")
                .setContent(intent);
        tabHost.addTab(spec);

        intent = new Intent().setClass(this, FourthActivity.class);
        spec = tabHost.newTabSpec("Fourth").setIndicator("Fourth")
                .setContent(intent);
        tabHost.addTab(spec);

        for(int i=0;i<tabHost.getTabWidget().getChildCount();i++)
        {
            tabHost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#8A4117"));
        }
        tabHost.getTabWidget().setCurrentTab(1);
        tabHost.getTabWidget().getChildAt(1).setBackgroundColor(Color.parseColor("#C35817"));
    }

    @Override
    public void onTabChanged(String tabId) {
        // TODO Auto-generated method stub
        for(int i=0;i<tabHost.getTabWidget().getChildCount();i++)
        {
            tabHost.getTabWidget().getChildAt(i).setBackgroundColor(Color.parseColor("#8A4117"));
        }

        tabHost.getTabWidget().getChildAt(tabHost.getCurrentTab()).setBackgroundColor(Color.parseColor("#C35817"));
    }
}
