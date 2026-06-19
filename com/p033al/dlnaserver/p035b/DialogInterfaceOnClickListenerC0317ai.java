package com.p033al.dlnaserver.p035b;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.al.dlnaserver.b.ai */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0317ai implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1331a;

    DialogInterfaceOnClickListenerC0317ai(C0362p c0362p) {
        this.f1331a = c0362p;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
