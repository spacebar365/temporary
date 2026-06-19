package com.p033al.dlnaserver.servers;

import android.util.Log;

/* JADX INFO: renamed from: com.al.dlnaserver.servers.d */
/* JADX INFO: compiled from: DlnaMediaServer.java */
/* JADX INFO: loaded from: classes.dex */
final class C0409d extends Thread {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DlnaMediaServer f1527a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0409d(DlnaMediaServer dlnaMediaServer, String str) {
        super(str);
        this.f1527a = dlnaMediaServer;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (this.f1527a.f1504p != null) {
            try {
                this.f1527a.f1504p.mo4947q();
                this.f1527a.f1504p.m4949s().m4944d();
            } catch (Exception e) {
                Log.e("DlnaMediaServer", "stopServer()::mediaServer.stop()", e);
            }
            this.f1527a.f1504p = null;
        }
    }
}
