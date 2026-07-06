package com.al.dlnaserver.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.util.Log;
import com.al.dlnaserver.b.n;
import com.al.dlnaserver.b.o;

/* JADX INFO: loaded from: classes.dex */
public class NetworkMonitorReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action = intent.getAction();
        Log.i("NetworkMonitorReceiver", "intent=".concat(String.valueOf(intent)));
        if ("android.net.wifi.WIFI_STATE_CHANGED".equals(action)) {
            int intExtra = intent.getIntExtra("wifi_state", 4);
            if (org.cybergarage.b.a.b().contains("wlan")) {
                if (intExtra == 1 || intExtra == 0) {
                    o.c(context);
                    return;
                }
                return;
            }
            return;
        }
        if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action) && intent.getBooleanExtra("noConnectivity", false)) {
            o.c(context);
            return;
        }
        if ("android.net.wifi.STATE_CHANGE".equals(action) && n.a(context, "auto_wifi")) {
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
                new Handler().postDelayed(new a(this, context), 2000L);
            }
        }
    }
}
