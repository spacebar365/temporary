package com.p033al.dlnaserver;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Build;
import com.p033al.dlnaserver.customs.C0378a;
import com.p033al.dlnaserver.receivers.NetworkMonitorReceiver;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import p000a.p029g.C0215ae;

/* JADX INFO: loaded from: classes.dex */
public class App extends Application {

    /* JADX INFO: renamed from: a */
    public static boolean f1269a = false;

    /* JADX INFO: renamed from: b */
    public static boolean f1270b = false;

    /* JADX INFO: renamed from: c */
    public static boolean f1271c = false;

    /* JADX INFO: renamed from: d */
    public static boolean f1272d = false;

    /* JADX INFO: renamed from: e */
    public static boolean f1273e = false;

    /* JADX INFO: renamed from: f */
    public static volatile Map<String, File> f1274f = new HashMap();

    /* JADX INFO: renamed from: g */
    public static volatile Map<String, Uri> f1275g = new HashMap();

    /* JADX INFO: renamed from: h */
    public static volatile Map<String, C0215ae> f1276h = new HashMap();

    /* JADX INFO: renamed from: i */
    public static volatile Map<String, C0378a> f1277i = new HashMap();

    /* JADX INFO: renamed from: j */
    public static volatile Map<String, String> f1278j = new HashMap();

    /* JADX INFO: renamed from: k */
    public static volatile Map<String, String> f1279k = new HashMap();

    /* JADX INFO: renamed from: l */
    public static int f1280l;

    /* JADX INFO: renamed from: m */
    public static int f1281m;

    /* JADX INFO: renamed from: n */
    public static int f1282n;

    /* JADX INFO: renamed from: o */
    public static int f1283o;

    /* JADX INFO: renamed from: p */
    public static int f1284p;

    /* JADX INFO: renamed from: q */
    public static int f1285q;

    /* JADX INFO: renamed from: r */
    private BroadcastReceiver f1286r;

    /* JADX INFO: renamed from: s */
    private BroadcastReceiver f1287s;

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        if (Build.VERSION.SDK_INT >= 24) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.wifi.STATE_CHANGE");
            intentFilter.addAction("android.net.wifi.WIFI_STATE_CHANGED");
            intentFilter.addAction("android.net.wifi.supplicant.CONNECTION_CHANGE");
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            this.f1286r = new NetworkMonitorReceiver();
            registerReceiver(this.f1286r, intentFilter);
        }
    }

    @Override // android.app.Application
    public void onTerminate() {
        try {
            if (this.f1286r != null) {
                unregisterReceiver(this.f1286r);
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
        try {
            if (this.f1287s != null) {
                unregisterReceiver(this.f1287s);
            }
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
        }
        super.onTerminate();
    }
}
