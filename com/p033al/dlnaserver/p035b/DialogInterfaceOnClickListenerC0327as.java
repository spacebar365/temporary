package com.p033al.dlnaserver.p035b;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;

/* JADX INFO: renamed from: com.al.dlnaserver.b.as */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0327as implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1354a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ EditText f1355b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ Context f1356c;

    DialogInterfaceOnClickListenerC0327as(C0362p c0362p, EditText editText, Context context) {
        this.f1354a = c0362p;
        this.f1355b = editText;
        this.f1356c = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0360n.m1047a(this.f1356c, "custom_dlna_port", this.f1355b.getText().toString());
        dialogInterface.cancel();
    }
}
