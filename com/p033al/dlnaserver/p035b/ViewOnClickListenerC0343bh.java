package com.p033al.dlnaserver.p035b;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;

/* JADX INFO: renamed from: com.al.dlnaserver.b.bh */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0343bh implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1393a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ Context f1394b;

    ViewOnClickListenerC0343bh(C0362p c0362p, Context context) {
        this.f1393a = c0362p;
        this.f1394b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0360n.m1049a(this.f1394b, "flat_style", ((CheckBox) view).isChecked());
    }
}
