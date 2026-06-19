package com.p033al.dlnaserver.p035b;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: com.al.dlnaserver.b.z */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0372z implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1444a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ Context f1445b;

    ViewOnClickListenerC0372z(C0362p c0362p, Context context) {
        this.f1444a = c0362p;
        this.f1445b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0362p.m1062b(this.f1444a, this.f1445b);
    }
}
