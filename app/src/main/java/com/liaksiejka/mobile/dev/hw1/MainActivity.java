package com.liaksiejka.mobile.dev.hw1;

import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.crashlytics.android.Crashlytics;
import com.crashlytics.android.ndk.CrashlyticsNdk;
import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private LauncherFragmentCollectionAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Fabric.with(this, new Crashlytics(), new CrashlyticsNdk());
        AppCenter.start(getApplication(), "8882ea0b-67da-4ed8-b82c-de60b9914766",
                Analytics.class, Crashes.class);
        Log.d("main activity create", "fabric ok");
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.main_activity);
        Log.d("main activity create", "set content ok");
        viewPager = findViewById(R.id.pager);
        adapter = new LauncherFragmentCollectionAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
        Log.d("main activity create", "view page ok");
    }
}
