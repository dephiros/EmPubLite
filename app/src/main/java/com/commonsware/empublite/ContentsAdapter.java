package com.commonsware.empublite;

import android.app.Activity;
import android.app.Fragment;
import android.support.v13.app.FragmentStatePagerAdapter;

public class ContentsAdapter extends FragmentStatePagerAdapter {
    public ContentsAdapter(Activity ctxt) {
        super(ctxt.getFragmentManager());
    }

    @Override
    public Fragment getItem(int arg0) {
        // TODO
        return null;
    }

    @Override
    public int getCount() {
        return 0;
    }

}
