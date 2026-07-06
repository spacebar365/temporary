package com.al.dlnaserver.servers;

import android.util.Log;
import com.al.dlnaserver.App;
import java.util.TimerTask;

/* JADX INFO: compiled from: DlnaMediaServer.java */
/* JADX INFO: loaded from: classes.dex */
final class i extends TimerTask {
    final /* synthetic */ DlnaMediaServer$a a;

    i(DlnaMediaServer$a dlnaMediaServer$a) {
        this.a = dlnaMediaServer$a;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        if (DlnaMediaServer.a(DlnaMediaServer$a.a(this.a)) != null && App.a) {
            DlnaMediaServer.a(DlnaMediaServer$a.a(this.a)).acquire();
            Log.i("DlnaMediaServer", "ServiceChecker.Timer: dlnaserver wakelock was updated");
        }
    }
}
