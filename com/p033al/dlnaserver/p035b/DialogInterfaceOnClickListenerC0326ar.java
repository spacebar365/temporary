package com.p033al.dlnaserver.p035b;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.al.dlnaserver.b.ar */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0326ar implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1353a;

    DialogInterfaceOnClickListenerC0326ar(C0362p c0362p) {
        this.f1353a = c0362p;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
