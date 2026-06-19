package com.p033al.dlnaserver.servers;

import android.widget.Toast;

/* JADX INFO: renamed from: com.al.dlnaserver.servers.h */
/* JADX INFO: compiled from: DlnaMediaServer.java */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0413h implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DlnaMediaServer f1531a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ String f1532b;

    RunnableC0413h(DlnaMediaServer dlnaMediaServer, String str) {
        this.f1531a = dlnaMediaServer;
        this.f1532b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.f1531a.getApplicationContext(), this.f1532b, 1).show();
    }
}
