package com.compet.customswitch;

import android.app.Activity;
import android.os.Bundle;

public class MainActivity extends Activity {

    CustomSwitch customSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        customSwitch = (CustomSwitch)findViewById(R.id.sc_custom);
    }
}
