package com.al.dlnaserver.b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface$OnClickListener;
import android.widget.EditText;

/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class aj implements DialogInterface$OnClickListener {
    final /* synthetic */ p a;
    private final /* synthetic */ EditText b;
    private final /* synthetic */ Context c;

    aj(p pVar, EditText editText, Context context) {
        this.a = pVar;
        this.b = editText;
        this.c = context;
    }

    @Override // android.content.DialogInterface$OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        n.a(this.c, "wifi_names", this.b.getText().toString());
        dialogInterface.cancel();
    }
}
