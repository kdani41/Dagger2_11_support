package com.kdani.dagger2_11;

import com.kdani.dagger2_11.di.scope.PerActivity;

import dagger.Binds;
import dagger.Module;

/**
 * Created by rawsond on 6/11/17.
 */
@Module(includes = BaseActivityModule.class)
public abstract class MainActivityModule {

    @PerActivity
    @Binds
    abstract BaseActivity baseActivity(MainActivity mainActivity);

}
