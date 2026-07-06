package com.al.dlnaserver.b;

import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class an implements DialogInterface$OnClickListener {
    final /* synthetic */ p a;

    an(p pVar) {
        this.a = pVar;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        dialogInterface.cancel();
    }
}
