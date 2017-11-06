package com.kdani.dagger2_11;

import com.kdani.dagger2_11.di.scope.PerActivity;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by rawsond on 6/11/17.
 */
@PerActivity
@Subcomponent(modules = BaseActivityModule.class)
public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
}
