package com.al.dlnaserver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* JADX INFO: compiled from: MainActivityTV.java */
/* JADX INFO: loaded from: classes.dex */
final class j extends BroadcastReceiver {
    final /* synthetic */ MainActivityTV a;

    j(MainActivityTV mainActivityTV) {
        this.a = mainActivityTV;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.getBoolean("serviceStarted", false)) {
            this.a.finish();
        }
        MainActivityTV.g(this.a);
        MainActivityTV.h(this.a);
    }
}
