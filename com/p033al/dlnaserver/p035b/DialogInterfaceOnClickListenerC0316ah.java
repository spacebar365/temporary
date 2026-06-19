package com.p033al.dlnaserver.p035b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;

/* JADX INFO: renamed from: com.al.dlnaserver.b.ah */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0316ah implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1329a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ Context f1330b;

    DialogInterfaceOnClickListenerC0316ah(C0362p c0362p, Context context) {
        this.f1329a = c0362p;
        this.f1330b = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        ((Activity) this.f1330b).setRequestedOrientation(-1);
        dialogInterface.dismiss();
    }
}
