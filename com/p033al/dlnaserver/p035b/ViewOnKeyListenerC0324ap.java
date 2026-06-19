package com.p033al.dlnaserver.p035b;

import android.app.AlertDialog;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: com.al.dlnaserver.b.ap */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnKeyListenerC0324ap implements View.OnKeyListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1347a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ EditText f1348b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ Context f1349c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ AlertDialog f1350d;

    ViewOnKeyListenerC0324ap(C0362p c0362p, EditText editText, Context context, AlertDialog alertDialog) {
        this.f1347a = c0362p;
        this.f1348b = editText;
        this.f1349c = context;
        this.f1350d = alertDialog;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66) {
            C0360n.m1047a(this.f1349c, "custom_dlna_name", this.f1348b.getText().toString());
            this.f1350d.dismiss();
            return false;
        }
        return false;
    }
}
