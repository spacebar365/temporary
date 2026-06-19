package com.p033al.dlnaserver.p035b;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: com.al.dlnaserver.b.aa */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0309aa implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1316a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ Context f1317b;

    ViewOnClickListenerC0309aa(C0362p c0362p, Context context) {
        this.f1316a = c0362p;
        this.f1317b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        C0362p.m1064c(this.f1316a, this.f1317b);
    }
}
