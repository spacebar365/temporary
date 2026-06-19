package com.p033al.dlnaserver.p035b;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: com.al.dlnaserver.b.ac */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0311ac implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1320a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ Context f1321b;

    ViewOnClickListenerC0311ac(C0362p c0362p, Context context) {
        this.f1320a = c0362p;
        this.f1321b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0362p.m1066d(this.f1320a, this.f1321b);
    }
}
