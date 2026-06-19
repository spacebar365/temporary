package com.p033al.dlnaserver.servers;

/* JADX INFO: renamed from: com.al.dlnaserver.servers.b */
/* JADX INFO: compiled from: DlnaMediaServer.java */
/* JADX INFO: loaded from: classes.dex */
final class C0407b extends Thread {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DlnaMediaServer f1525a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0407b(DlnaMediaServer dlnaMediaServer, String str) {
        super(str);
        this.f1525a = dlnaMediaServer;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        this.f1525a.m1103a();
        DlnaMediaServer.m1137e(this.f1525a);
    }
}
