package com.p033al.dlnaserver.p035b;

import android.content.Context;
import android.view.View;
import android.widget.CheckBox;

/* JADX INFO: renamed from: com.al.dlnaserver.b.be */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0340be implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1386a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ Context f1387b;

    ViewOnClickListenerC0340be(C0362p c0362p, Context context) {
        this.f1386a = c0362p;
        this.f1387b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0360n.m1049a(this.f1387b, "show_thumbs_image", ((CheckBox) view).isChecked());
    }
}
