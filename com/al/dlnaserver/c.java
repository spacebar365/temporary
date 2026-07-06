package com.al.dlnaserver;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: compiled from: MainActivity.java */
/* JADX INFO: loaded from: classes.dex */
final class c implements DialogInterface$OnClickListener {
    final /* synthetic */ MainActivity a;

    c(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
