package com.kdani.dagger2_11.di.module;

import com.kdani.dagger2_11.MainActivity;
import com.kdani.dagger2_11.MainActivityModule;
import com.kdani.dagger2_11.di.scope.PerActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityModule {

    @PerActivity
    @ContributesAndroidInjector(modules = MainActivityModule.class)
    abstract MainActivity mainActivity();

}
