package com.p033al.dlnaserver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: renamed from: com.al.dlnaserver.a */
/* JADX INFO: compiled from: MainActivity.java */
/* JADX INFO: loaded from: classes.dex */
final class C0304a extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ MainActivity f1301a;

    C0304a(MainActivity mainActivity) {
        this.f1301a = mainActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.getBoolean("serviceStarted", false)) {
            this.f1301a.finish();
        }
        this.f1301a.m967a();
        this.f1301a.m975c();
    }
}
