package com.p033al.dlnaserver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: com.al.dlnaserver.j */
/* JADX INFO: compiled from: MainActivityTV.java */
/* JADX INFO: loaded from: classes.dex */
final class C0396j extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ MainActivityTV f1481a;

    C0396j(MainActivityTV mainActivityTV) {
        this.f1481a = mainActivityTV;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.getBoolean("serviceStarted", false)) {
            this.f1481a.finish();
        }
        MainActivityTV.m994g(this.f1481a);
        this.f1481a.m985b();
    }
}
