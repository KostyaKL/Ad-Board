package com.tkdroid.ad_board;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MobileAds.initialize(this, initializationStatus -> {
        });

        AdView adViewTopBanner = findViewById(R.id.topBanner);
        AdRequest adRequestTopBanner = new AdRequest.Builder().build();
        adViewTopBanner.loadAd(adRequestTopBanner);
        adViewTopBanner.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {

            }
        });

        AdView adViewBottomBanner = findViewById(R.id.bottomBanner);
        AdRequest adRequestBottomBanner = new AdRequest.Builder().build();
        adViewBottomBanner.loadAd(adRequestBottomBanner);
        adViewBottomBanner.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {

            }
        });
}