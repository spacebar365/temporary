package com.p033al.dlnaserver.p035b;

import android.content.Context;
import android.content.DialogInterface;
import android.widget.EditText;

/* JADX INFO: renamed from: com.al.dlnaserver.b.bb */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class DialogInterfaceOnClickListenerC0337bb implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1377a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ EditText f1378b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ Context f1379c;

    DialogInterfaceOnClickListenerC0337bb(C0362p c0362p, EditText editText, Context context) {
        this.f1377a = c0362p;
        this.f1378b = editText;
        this.f1379c = context;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        C0360n.m1047a(this.f1379c, "ip_white_list", this.f1378b.getText().toString());
        dialogInterface.cancel();
    }
}
