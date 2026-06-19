package com.p033al.dlnaserver;

import android.content.DialogInterface;

/* JADX INFO: renamed from: com.al.dlnaserver.c */
/* JADX INFO: compiled from: MainActivity.java */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0373c implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ MainActivity f1446a;

    DialogInterfaceOnClickListenerC0373c(MainActivity mainActivity) {
        this.f1446a = mainActivity;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
