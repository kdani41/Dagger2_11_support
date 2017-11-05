package com.kdani.dagger2_11.di.component;

import com.kdani.dagger2_11.App;
import com.kdani.dagger2_11.di.module.ActivityModule;
import com.kdani.dagger2_11.di.module.AppModule;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjector;
import dagger.android.support.AndroidSupportInjectionModule;

@Singleton
@Component(modules = { AppModule.class,
        ActivityModule.class,
        AndroidSupportInjectionModule.class })
public interface AppComponent extends AndroidInjector<App> {

    @Override
    void inject(App application);

    @Component.Builder interface Builder {

        @BindsInstance
        AppComponent.Builder application(App application);

        AppComponent build();
    }
}
