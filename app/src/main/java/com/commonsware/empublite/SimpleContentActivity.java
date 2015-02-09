package com.commonsware.empublite;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.security.PublicKey;


public class SimpleContentActivity extends Activity {
    public static final String EXTRA_FILE = "file";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getFragmentManager().findFragmentById(android.R.id.content) == null) {
            String file = getIntent().getStringExtra(EXTRA_FILE);
            Fragment f = SimpleContentFragment.newInstance(file);
            getFragmentManager().beginTransaction()
                    .add(android.R.id.content, f).commit();
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        return true;
    }

}
