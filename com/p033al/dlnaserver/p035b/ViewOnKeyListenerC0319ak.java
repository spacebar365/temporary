package com.p033al.dlnaserver.p035b;

import android.app.AlertDialog;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: com.al.dlnaserver.b.ak */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnKeyListenerC0319ak implements View.OnKeyListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1335a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ EditText f1336b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ Context f1337c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ AlertDialog f1338d;

    ViewOnKeyListenerC0319ak(C0362p c0362p, EditText editText, Context context, AlertDialog alertDialog) {
        this.f1335a = c0362p;
        this.f1336b = editText;
        this.f1337c = context;
        this.f1338d = alertDialog;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66) {
            C0360n.m1047a(this.f1337c, "wifi_names", this.f1336b.getText().toString());
            this.f1338d.dismiss();
            return false;
        }
        return false;
    }
}
