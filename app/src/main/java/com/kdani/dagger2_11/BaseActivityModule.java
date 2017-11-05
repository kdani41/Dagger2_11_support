package com.kdani.dagger2_11;

import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public abstract class BaseActivityModule {
    public static final String ACTIVITY_FRAGMENT_MANAGER = "ACTIVITY_FRAGMENT_MANAGER";

    @Named(ACTIVITY_FRAGMENT_MANAGER)
    @Provides
    static FragmentManager activityFragmentManager(BaseActivity activity) {
        return activity.getSupportFragmentManager();
    }
}
