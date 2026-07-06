package com.al.dlnaserver.servers;

import com.al.dlnaserver.App;

/* JADX INFO: compiled from: DlnaMediaServer.java */
/* JADX INFO: loaded from: classes.dex */
final class g extends Thread {
    final /* synthetic */ DlnaMediaServer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(DlnaMediaServer dlnaMediaServer, String str) {
        super(str);
        this.a = dlnaMediaServer;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (App.d && App.a) {
            try {
                sleep(3000L);
            } catch (InterruptedException e) {
            }
            if (App.d && App.a) {
                DlnaMediaServer.j(this.a);
            }
        }
    }
}
