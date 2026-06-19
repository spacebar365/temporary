package com.p033al.dlnaserver.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.p033al.dlnaserver.p035b.C0360n;
import com.p033al.dlnaserver.p035b.C0361o;

/* JADX INFO: loaded from: classes.dex */
public class PowerConnectionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean zM1050a = C0360n.m1050a(context, "auto_charge");
        if (zM1050a && "android.intent.action.ACTION_POWER_CONNECTED".equals(intent.getAction())) {
            C0361o.m1058d(context);
        } else if (zM1050a && "android.intent.action.ACTION_POWER_DISCONNECTED".equals(intent.getAction())) {
            C0361o.m1057c(context);
        }
    }
}
