package com.al.dlnaserver.receivers;

import android.content.Context;
import com.al.dlnaserver.b.o;

/* JADX INFO: compiled from: NetworkMonitorReceiver.java */
/* JADX INFO: loaded from: classes.dex */
final class a implements Runnable {
    final /* synthetic */ NetworkMonitorReceiver a;
    private final /* synthetic */ Context b;

    a(NetworkMonitorReceiver networkMonitorReceiver, Context context) {
        this.a = networkMonitorReceiver;
        this.b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        o.d(this.b);
    }
}
