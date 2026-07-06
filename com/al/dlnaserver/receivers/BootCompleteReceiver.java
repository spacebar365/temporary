package com.al.dlnaserver.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.al.dlnaserver.b.n;
import com.al.dlnaserver.b.o;

/* JADX INFO: loaded from: classes.dex */
public class BootCompleteReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (n.a(context, "run_on_boot")) {
            o.d(context);
        } else {
            Log.i("DlnaMediaServer", "Run on boot is switched off. Exited");
        }
    }
}
