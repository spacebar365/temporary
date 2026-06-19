package com.p033al.dlnaserver.p035b;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;

/* JADX INFO: renamed from: com.al.dlnaserver.b.x */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0370x implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1440a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ Context f1441b;

    ViewOnClickListenerC0370x(C0362p c0362p, Context context) {
        this.f1440a = c0362p;
        this.f1441b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0360n.m1049a(this.f1441b, "add_artist_album", ((CheckBox) view).isChecked());
    }
}
