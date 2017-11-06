package com.kdani.dagger2_11;

import android.support.annotation.IdRes;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

import javax.inject.Inject;
import javax.inject.Named;

import dagger.android.support.DaggerAppCompatActivity;

import static com.kdani.dagger2_11.BaseActivityModule.ACTIVITY_FRAGMENT_MANAGER;

/**
 * Created by KD on 11/5/17.
 */

public abstract class BaseActivity extends DaggerAppCompatActivity {

    @Named(ACTIVITY_FRAGMENT_MANAGER)
    @Inject
    FragmentManager fragmentManager;

    protected final void addFragment(@IdRes int containerViewId, Fragment fragment) {
        Fragment existingFrag = getSupportFragmentManager().findFragmentById(containerViewId);
        if (existingFrag == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(containerViewId, fragment)
                    .commit();
        }
    }
}
