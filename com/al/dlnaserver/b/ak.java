package com.al.dlnaserver.b;

import android.app.AlertDialog;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.View$OnKeyListener;
import android.widget.EditText;

/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ak implements View$OnKeyListener {
    final /* synthetic */ p a;
    private final /* synthetic */ EditText b;
    private final /* synthetic */ Context c;
    private final /* synthetic */ AlertDialog d;

    ak(p pVar, EditText editText, Context context, AlertDialog alertDialog) {
        this.a = pVar;
        this.b = editText;
        this.c = context;
        this.d = alertDialog;
    }

    @Override // android.view.View$OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66) {
            n.a(this.c, "wifi_names", this.b.getText().toString());
            this.d.dismiss();
            return false;
        }
        return false;
    }
}
