package com.p033al.dlnaserver.p035b;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: com.al.dlnaserver.b.af */
/* JADX INFO: compiled from: SettingsUtils.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0314af implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0362p f1326a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ Context f1327b;

    ViewOnClickListenerC0314af(C0362p c0362p, Context context) {
        this.f1326a = c0362p;
        this.f1327b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        new C0351e().m1033a(this.f1327b);
    }
}
