package com.p033al.dlnaserver.servers;

import com.p033al.dlnaserver.App;
import com.p033al.dlnaserver.C0303R;

/* JADX INFO: renamed from: com.al.dlnaserver.servers.f */
/* JADX INFO: compiled from: DlnaMediaServer.java */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0411f implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DlnaMediaServer f1529a;

    RunnableC0411f(DlnaMediaServer dlnaMediaServer) {
        this.f1529a = dlnaMediaServer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!App.f1272d) {
            return;
        }
        this.f1529a.m1143g(this.f1529a.getString(C0303R.string.notify_large_media));
    }
}
