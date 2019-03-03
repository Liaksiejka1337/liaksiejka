package com.liaksiejka.mobile.dev.hw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.ndk.CrashlyticsNdk;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Fabric.with(this, new Crashlytics(), new CrashlyticsNdk());
        getSupportActionBar().hide();
        setContentView(R.layout.welcome_page_first);

        AppCenter.start(getApplication(), "8882ea0b-67da-4ed8-b82c-de60b9914766",
                Analytics.class, Crashes.class);
    }
}
