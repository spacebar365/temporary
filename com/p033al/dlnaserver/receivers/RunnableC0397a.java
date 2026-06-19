package com.p033al.dlnaserver.receivers;

import android.content.Context;
import com.p033al.dlnaserver.p035b.C0361o;

/* JADX INFO: renamed from: com.al.dlnaserver.receivers.a */
/* JADX INFO: compiled from: NetworkMonitorReceiver.java */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0397a implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ NetworkMonitorReceiver f1482a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ Context f1483b;

    RunnableC0397a(NetworkMonitorReceiver networkMonitorReceiver, Context context) {
        this.f1482a = networkMonitorReceiver;
        this.f1483b = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C0361o.m1058d(this.f1483b);
    }
}
