package com.blundell.tut.ui.phone;

import com.blundell.tut.R;

import android.app.Activity;
import android.os.Bundle;
import android.os.PowerManager;
import android.os.PowerManager.WakeLock;

/**
 * This Activity aquires a wakelock to keep the screen on whilst in this activity.
 * This requires a permission in your manifest
 * It is important to manage your wakelocks and always release them when finished
 * @author paul.blundell
 *
 */
public class ScreenOnWakeLockActivity extends Activity {
    private static final String TAG = "com.blundell.tut.ui.phone.ScreenOnWakeLockActivity.WAKE_LOCK_TAG";
	private WakeLock wakeLock;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wake_lock);

        PowerManager powerManager = (PowerManager) getSystemService(POWER_SERVICE);
        wakeLock = powerManager.newWakeLock(PowerManager.SCREEN_DIM_WAKE_LOCK, TAG);
    }

    @Override
    protected void onResume() {
    	super.onResume();
    	wakeLock.acquire();
    }

    @Override
    protected void onPause() {
    	super.onPause();
    	wakeLock.release();
    }
}