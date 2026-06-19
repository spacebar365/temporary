package com.p033al.dlnaserver.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.p033al.dlnaserver.p035b.C0360n;
import com.p033al.dlnaserver.p035b.C0361o;

/* JADX INFO: loaded from: classes.dex */
public class BootCompleteReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (C0360n.m1050a(context, "run_on_boot")) {
            C0361o.m1058d(context);
        } else {
            Log.i("DlnaMediaServer", "Run on boot is switched off. Exited");
        }
    }
}
