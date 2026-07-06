package com.al.dlnaserver.servers;

import android.widget.Toast;

/* JADX INFO: compiled from: DlnaMediaServer.java */
/* JADX INFO: loaded from: classes.dex */
final class h implements Runnable {
    final /* synthetic */ DlnaMediaServer a;
    private final /* synthetic */ String b;

    h(DlnaMediaServer dlnaMediaServer, String str) {
        this.a = dlnaMediaServer;
        this.b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Toast.makeText(this.a.getApplicationContext(), this.b, 1).show();
    }
}
