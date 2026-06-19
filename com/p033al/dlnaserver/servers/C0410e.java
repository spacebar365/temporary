package com.p033al.dlnaserver.servers;

/* JADX INFO: renamed from: com.al.dlnaserver.servers.e */
/* JADX INFO: compiled from: DlnaMediaServer.java */
/* JADX INFO: loaded from: classes.dex */
final class C0410e extends Thread {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DlnaMediaServer f1528a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0410e(DlnaMediaServer dlnaMediaServer, String str) {
        super(str);
        this.f1528a = dlnaMediaServer;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() throws Throwable {
        DlnaMediaServer.m1147i(this.f1528a);
    }
}
