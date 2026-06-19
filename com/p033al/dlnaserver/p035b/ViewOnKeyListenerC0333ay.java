package com.p033al.dlnaserver.p035b;

import android.app.AlertDialog;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: com.al.dlnaserver.b.ay */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnKeyListenerC0333ay implements View.OnKeyListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1369a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ EditText f1370b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ Context f1371c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ AlertDialog f1372d;

    ViewOnKeyListenerC0333ay(C0362p c0362p, EditText editText, Context context, AlertDialog alertDialog) {
        this.f1369a = c0362p;
        this.f1370b = editText;
        this.f1371c = context;
        this.f1372d = alertDialog;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66) {
            C0360n.m1047a(this.f1371c, "custom_fileserver_port", this.f1370b.getText().toString());
            this.f1372d.dismiss();
            return false;
        }
        return false;
    }
}
