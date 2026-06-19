package com.p033al.dlnaserver.servers;

import com.p033al.dlnaserver.App;

/* JADX INFO: renamed from: com.al.dlnaserver.servers.g */
/* JADX INFO: compiled from: DlnaMediaServer.java */
/* JADX INFO: loaded from: classes.dex */
final class C0412g extends Thread {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DlnaMediaServer f1530a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0412g(DlnaMediaServer dlnaMediaServer, String str) {
        super(str);
        this.f1530a = dlnaMediaServer;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (App.f1272d && App.f1269a) {
            try {
                sleep(3000L);
            } catch (InterruptedException e) {
            }
            if (App.f1272d && App.f1269a) {
                this.f1530a.m1153n();
            }
        }
    }
}
