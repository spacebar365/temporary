package com.p033al.dlnaserver.servers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

/* JADX INFO: renamed from: com.al.dlnaserver.servers.a */
/* JADX INFO: compiled from: DlnaMediaServer.java */
/* JADX INFO: loaded from: classes.dex */
final class C0399a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DlnaMediaServer f1517a;

    C0399a(DlnaMediaServer dlnaMediaServer) {
        this.f1517a = dlnaMediaServer;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Log.d("DlnaMediaServer", " Receive broadcast for update media");
        this.f1517a.m1127c();
    }
}
