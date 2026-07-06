package com.al.dlnaserver.servers;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.al.dlnaserver.App;
import java.util.Timer;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class DlnaMediaServer$a extends BroadcastReceiver {
    final /* synthetic */ DlnaMediaServer a;

    private DlnaMediaServer$a(DlnaMediaServer dlnaMediaServer) {
        this.a = dlnaMediaServer;
    }

    /* synthetic */ DlnaMediaServer$a(DlnaMediaServer dlnaMediaServer, byte b) {
        this(dlnaMediaServer);
    }

    static /* synthetic */ DlnaMediaServer a(DlnaMediaServer$a dlnaMediaServer$a) {
        return dlnaMediaServer$a.a;
    }

    @Override // android.content.BroadcastReceiver
    @SuppressLint({"Wakelock"})
    public final void onReceive(Context context, Intent intent) {
        if (DlnaMediaServer.a(this.a) == null) {
            Log.e("DlnaMediaServer", "ServiceChecker: dlnaserver wakelock was release");
            if (App.a) {
                DlnaMediaServer.b(this.a);
                return;
            }
            return;
        }
        if (DlnaMediaServer.a(this.a) != null && !DlnaMediaServer.a(this.a).isHeld()) {
            DlnaMediaServer.a(this.a).acquire();
        } else if (DlnaMediaServer.a(this.a) != null && DlnaMediaServer.a(this.a).isHeld()) {
            DlnaMediaServer.a(this.a).release();
            new Timer().schedule(new i(this), 1500L);
        }
    }
}
