package com.al.dlnaserver.b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;

/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ah implements DialogInterface$OnClickListener {
    final /* synthetic */ p a;
    private final /* synthetic */ Context b;

    ah(p pVar, Context context) {
        this.a = pVar;
        this.b = context;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ((Activity) this.b).setRequestedOrientation(-1);
        dialogInterface.dismiss();
    }
}
