package com.al.dlnaserver;

import a.g.ae;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build$VERSION;
import com.al.dlnaserver.receivers.NetworkMonitorReceiver;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class App extends Application {
    public static boolean a = false;
    public static boolean b = false;
    public static boolean c = false;
    public static boolean d = false;
    public static boolean e = false;
    public static volatile Map<String, File> f = new HashMap();
    public static volatile Map<String, Uri> g = new HashMap();
    public static volatile Map<String, ae> h = new HashMap();
    public static volatile Map<String, com.al.dlnaserver.customs.a> i = new HashMap();
    public static volatile Map<String, String> j = new HashMap();
    public static volatile Map<String, String> k = new HashMap();
    public static int l;
    public static int m;
    public static int n;
    public static int o;
    public static int p;
    public static int q;
    private BroadcastReceiver r;
    private BroadcastReceiver s;

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        if (Build$VERSION.SDK_INT >= 24) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.supplicant.CONNECTION_CHANGE");
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.r = new NetworkMonitorReceiver();
            registerReceiver(this.r, intentFilter);
        }
    }

    @Override // android.app.Application
    public void onTerminate() {
        try {
            if (this.r != null) {
                unregisterReceiver(this.r);
            }
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        }
        try {
            if (this.s != null) {
                unregisterReceiver(this.s);
            }
        } catch (IllegalArgumentException e3) {
            e3.printStackTrace();
        }
        super.onTerminate();
    }
}
