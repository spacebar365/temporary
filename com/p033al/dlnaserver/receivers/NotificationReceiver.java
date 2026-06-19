package com.p033al.dlnaserver.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.p033al.dlnaserver.App;
import com.p033al.dlnaserver.servers.DlnaMediaServer;

/* JADX INFO: loaded from: classes.dex */
public class NotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("com.al.dlnaserver.stop".equals(intent.getAction())) {
            if (App.f1269a && !App.f1270b) {
                context.stopService(new Intent(context, (Class<?>) DlnaMediaServer.class));
            }
            if (!App.f1270b) {
                Intent intent2 = new Intent();
                intent2.setAction(String.valueOf(context.getPackageName()) + ".UIupdate");
                context.sendBroadcast(intent2);
            }
        }
    }
}
