package com.p033al.dlnaserver.servers;

/* JADX INFO: renamed from: com.al.dlnaserver.servers.c */
/* JADX INFO: compiled from: DlnaMediaServer.java */
/* JADX INFO: loaded from: classes.dex */
final class C0408c extends Thread {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DlnaMediaServer f1526a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0408c(DlnaMediaServer dlnaMediaServer, String str) {
        super(str);
        this.f1526a = dlnaMediaServer;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        DlnaMediaServer.m1140f(this.f1526a);
    }
}
