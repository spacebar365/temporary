package com.al.dlnaserver.servers;

import com.al.dlnaserver.App;
import com.al.dlnaserver.R$string;

/* JADX INFO: compiled from: DlnaMediaServer.java */
/* JADX INFO: loaded from: classes.dex */
final class f implements Runnable {
    final /* synthetic */ DlnaMediaServer a;

    f(DlnaMediaServer dlnaMediaServer) {
        this.a = dlnaMediaServer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (App.d) {
            DlnaMediaServer.a(this.a, this.a.getString(R$string.notify_large_media));
        }
    }
}
