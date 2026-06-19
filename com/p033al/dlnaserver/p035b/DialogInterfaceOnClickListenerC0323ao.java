package com.p033al.dlnaserver.p035b;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;

/* JADX INFO: renamed from: com.al.dlnaserver.b.ao */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0323ao implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1344a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ EditText f1345b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ Context f1346c;

    DialogInterfaceOnClickListenerC0323ao(C0362p c0362p, EditText editText, Context context) {
        this.f1344a = c0362p;
        this.f1345b = editText;
        this.f1346c = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0360n.m1047a(this.f1346c, "custom_dlna_name", this.f1345b.getText().toString());
        dialogInterface.cancel();
    }
}
