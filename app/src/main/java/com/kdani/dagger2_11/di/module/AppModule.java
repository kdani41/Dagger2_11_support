package com.kdani.dagger2_11.di.module;


import android.content.Context;

import com.kdani.dagger2_11.App;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class AppModule {

    @Binds
    abstract Context bindContext(App application);

}
