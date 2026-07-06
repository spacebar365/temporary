package com.al.dlnaserver.b;

import android.content.Context;
import android.view.View;
import android.view.View$OnClickListener;
import android.widget.CheckBox;

/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class w implements View$OnClickListener {
    final /* synthetic */ p a;
    private final /* synthetic */ Context b;

    w(p pVar, Context context) {
        this.a = pVar;
        this.b = context;
    }

    @Override // android.view.View$OnClickListener
    public final void onClick(View view) {
        n.a(this.b, "auto_charge", ((CheckBox) view).isChecked());
    }
}
