package com.p033al.dlnaserver.p035b;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;

/* JADX INFO: renamed from: com.al.dlnaserver.b.t */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0366t implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1432a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ Context f1433b;

    ViewOnClickListenerC0366t(C0362p c0362p, Context context) {
        this.f1432a = c0362p;
        this.f1433b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0360n.m1049a(this.f1433b, "sort_title", ((CheckBox) view).isChecked());
    }
}
