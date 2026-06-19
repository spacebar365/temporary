package com.p033al.dlnaserver;

import android.content.Context;
import android.view.View;
import com.p033al.dlnaserver.p035b.C0362p;

/* JADX INFO: renamed from: com.al.dlnaserver.i */
/* JADX INFO: compiled from: MainActivityTV.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnClickListenerC0395i implements View.OnClickListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ MainActivityTV f1479a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ Context f1480b;

    ViewOnClickListenerC0395i(MainActivityTV mainActivityTV, Context context) {
        this.f1479a = mainActivityTV;
        this.f1480b = context;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        new C0362p().m1068a(this.f1480b);
    }
}
