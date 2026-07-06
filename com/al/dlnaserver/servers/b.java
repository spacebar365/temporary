package com.al.dlnaserver.servers;

/* JADX INFO: compiled from: DlnaMediaServer.java */
/* JADX INFO: loaded from: classes.dex */
final class b extends Thread {
    final /* synthetic */ DlnaMediaServer a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b(DlnaMediaServer dlnaMediaServer, String str) {
        super(str);
        this.a = dlnaMediaServer;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        DlnaMediaServer.d(this.a);
        DlnaMediaServer.e(this.a);
    }
}
