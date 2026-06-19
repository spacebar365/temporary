package com.p033al.dlnaserver.p035b;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;

/* JADX INFO: renamed from: com.al.dlnaserver.b.v */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0368v implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1436a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ Context f1437b;

    ViewOnClickListenerC0368v(C0362p c0362p, Context context) {
        this.f1436a = c0362p;
        this.f1437b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0360n.m1049a(this.f1437b, "auto_wifi", ((CheckBox) view).isChecked());
    }
}
