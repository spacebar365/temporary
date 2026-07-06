package com.al.dlnaserver.servers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: QuickSettingsService.java */
/* JADX INFO: loaded from: classes.dex */
final class m extends BroadcastReceiver {
    final /* synthetic */ QuickSettingsService a;

    m(QuickSettingsService quickSettingsService) {
        this.a = quickSettingsService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getExtras() == null) {
            QuickSettingsService.a(this.a);
        }
    }
}
