package com.p033al.dlnaserver.p035b;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;

/* JADX INFO: renamed from: com.al.dlnaserver.b.aw */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0331aw implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1364a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ EditText f1365b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ Context f1366c;

    DialogInterfaceOnClickListenerC0331aw(C0362p c0362p, EditText editText, Context context) {
        this.f1364a = c0362p;
        this.f1365b = editText;
        this.f1366c = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0360n.m1047a(this.f1366c, "custom_fileserver_port", this.f1365b.getText().toString());
        dialogInterface.cancel();
    }
}
