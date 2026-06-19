package com.p033al.dlnaserver.p035b;

import android.app.AlertDialog;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: com.al.dlnaserver.b.bc */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnKeyListenerC0338bc implements View.OnKeyListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1380a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ EditText f1381b;

    /* JADX INFO: renamed from: c */
    private final /* synthetic */ Context f1382c;

    /* JADX INFO: renamed from: d */
    private final /* synthetic */ AlertDialog f1383d;

    ViewOnKeyListenerC0338bc(C0362p c0362p, EditText editText, Context context, AlertDialog alertDialog) {
        this.f1380a = c0362p;
        this.f1381b = editText;
        this.f1382c = context;
        this.f1383d = alertDialog;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 66) {
            C0360n.m1047a(this.f1382c, "ip_white_list", this.f1381b.getText().toString());
            this.f1383d.dismiss();
            return false;
        }
        return false;
    }
}
