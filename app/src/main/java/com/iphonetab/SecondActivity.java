package com.iphonetab;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by user
 * Date: 8/4/2016
 * Iphone Tab
 */
public class SecondActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tab_test);

        TextView txtView = (TextView) findViewById(R.id.txtDisplayedTab);
        txtView.setText("Second Tab is Selected");
    }
}
