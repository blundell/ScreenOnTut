package com.blundell.tut.ui.phone;

import com.blundell.tut.R;

import android.app.Activity;
import android.os.Bundle;

/**
 * This activity keeps the screen on using a flag in the XML layout file we are using 'android:keepScreenOn="true"'
 * We don't use a wakelock so no manifest permissions are needed
 *
 * @author paul.blundell
 *
 */
public class ScreenOnXmlActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xml);
    }
}