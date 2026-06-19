package com.p033al.dlnaserver.p035b;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.al.dlnaserver.b.av */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0330av implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1363a;

    DialogInterfaceOnClickListenerC0330av(C0362p c0362p) {
        this.f1363a = c0362p;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
