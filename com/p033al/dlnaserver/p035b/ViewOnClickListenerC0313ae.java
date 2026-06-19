package com.p033al.dlnaserver.p035b;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: com.al.dlnaserver.b.ae */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0313ae implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1324a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ Context f1325b;

    ViewOnClickListenerC0313ae(C0362p c0362p, Context context) {
        this.f1324a = c0362p;
        this.f1325b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0362p.m1063c(this.f1325b);
    }
}
