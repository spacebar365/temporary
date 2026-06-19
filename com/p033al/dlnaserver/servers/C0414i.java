package com.p033al.dlnaserver.servers;

import android.util.Log;
import com.p033al.dlnaserver.App;
import com.p033al.dlnaserver.servers.DlnaMediaServer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.al.dlnaserver.servers.i */
/* JADX INFO: compiled from: DlnaMediaServer.java */
/* JADX INFO: loaded from: classes.dex */
final class C0414i extends TimerTask {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ DlnaMediaServer.C0398a f1533a;

    C0414i(DlnaMediaServer.C0398a c0398a) {
        this.f1533a = c0398a;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (DlnaMediaServer.this.f1484A != null && App.f1269a) {
            DlnaMediaServer.this.f1484A.acquire();
            Log.i("DlnaMediaServer", "ServiceChecker.Timer: dlnaserver wakelock was updated");
        }
    }
}
