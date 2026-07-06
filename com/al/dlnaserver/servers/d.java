package com.al.dlnaserver.servers;

import android.util.Log;

/* JADX INFO: compiled from: DlnaMediaServer.java */
/* JADX INFO: loaded from: classes.dex */
final class d extends Thread {
    final /* synthetic */ DlnaMediaServer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d(DlnaMediaServer dlnaMediaServer, String str) {
        super(str);
        this.a = dlnaMediaServer;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (DlnaMediaServer.g(this.a) != null) {
            try {
                DlnaMediaServer.g(this.a).q();
                DlnaMediaServer.g(this.a).s().d();
            } catch (Exception e) {
                Log.e("DlnaMediaServer", "stopServer()::mediaServer.stop()", e);
            }
            DlnaMediaServer.h(this.a);
        }
    }
}
