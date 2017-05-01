package com.project.lithodemo;

import com.facebook.drawee.backends.pipeline.Fresco;
import com.facebook.soloader.SoLoader;

public class MyApplication extends android.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();

        //  Initialize Fresco
        Fresco.initialize(this);

        //  Initialize Litho
        SoLoader.init(this, false);
    }
}
