package com.al.dlnaserver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: compiled from: MainActivity.java */
/* JADX INFO: loaded from: classes.dex */
final class a extends BroadcastReceiver {
    final /* synthetic */ MainActivity a;

    a(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.getBoolean("serviceStarted", false)) {
            this.a.finish();
        }
        MainActivity.a(this.a);
        MainActivity.b(this.a);
    }
}
