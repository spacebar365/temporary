package com.p033al.dlnaserver.p035b;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.al.dlnaserver.b.ba */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0336ba implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1376a;

    DialogInterfaceOnClickListenerC0336ba(C0362p c0362p) {
        this.f1376a = c0362p;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
