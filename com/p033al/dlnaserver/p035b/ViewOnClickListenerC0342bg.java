package com.p033al.dlnaserver.p035b;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;

/* JADX INFO: renamed from: com.al.dlnaserver.b.bg */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0342bg implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1391a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ Context f1392b;

    ViewOnClickListenerC0342bg(C0362p c0362p, Context context) {
        this.f1391a = c0362p;
        this.f1392b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0360n.m1049a(this.f1392b, "no_all_media", ((CheckBox) view).isChecked());
    }
}
