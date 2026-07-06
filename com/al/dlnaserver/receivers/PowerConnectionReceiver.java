package com.al.dlnaserver.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.al.dlnaserver.b.n;
import com.al.dlnaserver.b.o;

/* JADX INFO: loaded from: classes.dex */
public class PowerConnectionReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        boolean zA = n.a(context, "auto_charge");
        if (zA && "android.intent.action.ACTION_POWER_CONNECTED".equals(intent.getAction())) {
            o.d(context);
        } else if (zA && "android.intent.action.ACTION_POWER_DISCONNECTED".equals(intent.getAction())) {
            o.c(context);
        }
    }
}
