package com.al.dlnaserver.servers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* JADX INFO: compiled from: DlnaMediaServer.java */
/* JADX INFO: loaded from: classes.dex */
final class a extends BroadcastReceiver {
    final /* synthetic */ DlnaMediaServer a;

    a(DlnaMediaServer dlnaMediaServer) {
        this.a = dlnaMediaServer;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Log.d("DlnaMediaServer", " Receive broadcast for update media");
        DlnaMediaServer.c(this.a);
    }
}
