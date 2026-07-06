package com.al.dlnaserver.b;

import android.view.View;
import android.view.View$OnClickListener;
import android.widget.EditText;

/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class al implements View$OnClickListener {
    final /* synthetic */ p a;
    private final /* synthetic */ EditText b;

    al(p pVar, EditText editText) {
        this.a = pVar;
        this.b = editText;
    }

    @Override // android.view.View$OnClickListener
    public final void onClick(View view) {
        this.b.setText("");
    }
}
