package com.p033al.dlnaserver.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.util.Log;
import com.p033al.dlnaserver.p035b.C0360n;
import com.p033al.dlnaserver.p035b.C0361o;
import org.cybergarage.p155b.C1637a;

/* JADX INFO: loaded from: classes.dex */
public class NetworkMonitorReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Log.i("NetworkMonitorReceiver", "intent=".concat(String.valueOf(intent)));
        if ("android.net.wifi.WIFI_STATE_CHANGED".equals(action)) {
            int intExtra = intent.getIntExtra("wifi_state", 4);
            if (C1637a.m4707b().contains("wlan")) {
                if (intExtra == 1 || intExtra == 0) {
                    C0361o.m1057c(context);
                    return;
                }
                return;
            }
            return;
        }
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action) && intent.getBooleanExtra("noConnectivity", false)) {
            C0361o.m1057c(context);
            return;
        }
        if ("android.net.wifi.STATE_CHANGE".equals(action) && C0360n.m1050a(context, "auto_wifi")) {
            NetworkInfo networkInfo = (NetworkInfo) intent.getParcelableExtra("networkInfo");
            Log.d("NetworkMonitorReceiver", "wifiNames=".concat(String.valueOf("")));
            String ssid = ((WifiManager) context.getSystemService("wifi")).getConnectionInfo().getSSID();
            if (ssid != null && ssid.startsWith("\"") && ssid.endsWith("\"")) {
                ssid = ssid.substring(1, ssid.length() - 1);
            }
            Log.d("NetworkMonitorReceiver", "ssid=".concat(String.valueOf(ssid)));
            if (networkInfo != null && networkInfo.isConnected()) {
                if (!"".isEmpty() && !"".contains(ssid)) {
                    return;
                }
                new Handler().postDelayed(new RunnableC0397a(this, context), 2000L);
            }
        }
    }
}
