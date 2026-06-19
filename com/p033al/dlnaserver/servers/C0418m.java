package com.p033al.dlnaserver.servers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.al.dlnaserver.servers.m */
/* JADX INFO: compiled from: QuickSettingsService.java */
/* JADX INFO: loaded from: classes.dex */
final class C0418m extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ QuickSettingsService f1541a;

    C0418m(QuickSettingsService quickSettingsService) {
        this.f1541a = quickSettingsService;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent.getExtras() != null) {
            return;
        }
        this.f1541a.m1156a();
    }
}
