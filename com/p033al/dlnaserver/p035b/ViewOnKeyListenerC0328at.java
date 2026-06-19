package com.p033al.dlnaserver.p035b;

import android.app.AlertDialog;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: com.al.dlnaserver.b.at */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnKeyListenerC0328at implements View.OnKeyListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1357a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ EditText f1358b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ Context f1359c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ AlertDialog f1360d;

    ViewOnKeyListenerC0328at(C0362p c0362p, EditText editText, Context context, AlertDialog alertDialog) {
        this.f1357a = c0362p;
        this.f1358b = editText;
        this.f1359c = context;
        this.f1360d = alertDialog;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66) {
            C0360n.m1047a(this.f1359c, "custom_dlna_port", this.f1358b.getText().toString());
            this.f1360d.dismiss();
            return false;
        }
        return false;
    }
}
