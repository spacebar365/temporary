package com.p033al.dlnaserver.p035b;

import android.view.View;
import android.widget.EditText;

/* JADX INFO: renamed from: com.al.dlnaserver.b.al */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0320al implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1339a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ EditText f1340b;

    ViewOnClickListenerC0320al(C0362p c0362p, EditText editText) {
        this.f1339a = c0362p;
        this.f1340b = editText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f1340b.setText("");
    }
}
