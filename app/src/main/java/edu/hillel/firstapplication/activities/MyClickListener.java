package edu.hillel.firstapplication.activities;

import android.util.Log;
import android.view.View;

/**
 * Created by yuriy on 29.06.16.
 */
public class MyClickListener implements View.OnClickListener {

    @Override
    public void onClick(View v) {
        Log.d("MainActivity", "MyClickListener: Plus button click");
    }
}

