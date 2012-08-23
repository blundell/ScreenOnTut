package com.blundell.tut.ui.phone;

import com.blundell.tut.R;

import android.app.Activity;
import android.os.Bundle;
import android.view.WindowManager;

/**
 * This Activity keeps the screen on using the window manager, you don't have to worry about managing this
 * it will be kept on for the duration of the Activity life.
 * No permissions are needed in your manifest.
 * @author paul.blundell
 */
public class ScreenOnFlagActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
    }
}