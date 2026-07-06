package com.al.dlnaserver.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.al.dlnaserver.App;
import com.al.dlnaserver.servers.DlnaMediaServer;

/* JADX INFO: loaded from: classes.dex */
public class NotificationReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if ("com.al.dlnaserver.stop".equals(intent.getAction())) {
            if (App.a && !App.b) {
                context.stopService(new Intent(context, (Class<?>) DlnaMediaServer.class));
            }
            if (!App.b) {
                Intent intent2 = new Intent();
                intent2.setAction(String.valueOf(context.getPackageName()) + ".UIupdate");
                context.sendBroadcast(intent2);
            }
        }
    }
}
