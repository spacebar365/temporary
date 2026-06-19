package com.p033al.dlnaserver.p035b;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;

/* JADX INFO: renamed from: com.al.dlnaserver.b.aj */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0318aj implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1332a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ EditText f1333b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ Context f1334c;

    DialogInterfaceOnClickListenerC0318aj(C0362p c0362p, EditText editText, Context context) {
        this.f1332a = c0362p;
        this.f1333b = editText;
        this.f1334c = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0360n.m1047a(this.f1334c, "wifi_names", this.f1333b.getText().toString());
        dialogInterface.cancel();
    }
}
