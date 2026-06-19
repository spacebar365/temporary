package com.p033al.dlnaserver.p035b;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: com.al.dlnaserver.b.y */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0371y implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1442a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ Context f1443b;

    ViewOnClickListenerC0371y(C0362p c0362p, Context context) {
        this.f1442a = c0362p;
        this.f1443b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0362p.m1059a(this.f1442a, this.f1443b);
    }
}
