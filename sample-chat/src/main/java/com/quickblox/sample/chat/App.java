package com.quickblox.sample.chat;

import com.makemoji.mojilib.Moji;
import com.quickblox.sample.chat.utils.Consts;
import com.quickblox.sample.core.*;
import com.quickblox.sample.core.BuildConfig;
import com.quickblox.sample.core.utils.ActivityLifecycle;

public class App extends CoreApp {
    private static final String TAG = App.class.getSimpleName();

    @Override
    public void onCreate() {
        super.onCreate();
        ActivityLifecycle.init(this);
        initCredentials(Consts.QB_APP_ID, Consts.QB_AUTH_KEY, Consts.QB_AUTH_SECRET, Consts.QB_ACCOUNT_KEY);
        Moji.initialize(this,BuildConfig.MakeMojiKey);
    }
}