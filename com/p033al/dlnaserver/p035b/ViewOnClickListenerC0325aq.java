package com.p033al.dlnaserver.p035b;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: com.al.dlnaserver.b.aq */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0325aq implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1351a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ EditText f1352b;

    ViewOnClickListenerC0325aq(C0362p c0362p, EditText editText) {
        this.f1351a = c0362p;
        this.f1352b = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1352b.setText("");
    }
}
