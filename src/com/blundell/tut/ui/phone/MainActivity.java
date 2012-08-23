package com.blundell.tut.ui.phone;

import com.blundell.tut.R;
import com.blundell.tut.annotations.FromXML;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @FromXML
    public void onFlagActivityClick(View v){
    	Intent intent = new Intent(this, ScreenOnFlagActivity.class);
    	startActivity(intent);
    }

    @FromXML
    public void onXmlActivityClick(View v){
    	Intent intent = new Intent(this, ScreenOnXmlActivity.class);
    	startActivity(intent);
    }

    @FromXML
    public void onWakeLockActivityClick(View v){
    	Intent intent = new Intent(this, ScreenOnWakeLockActivity.class);
    	startActivity(intent);
    }
}