package com.al.dlnaserver;

import android.content.Context;
import android.view.View;
import android.view.View$OnClickListener;
import com.al.dlnaserver.b.p;

/* JADX INFO: compiled from: MainActivityTV.java */
/* JADX INFO: loaded from: classes.dex */
final class i implements View$OnClickListener {
    final /* synthetic */ MainActivityTV a;
    private final /* synthetic */ Context b;

    i(MainActivityTV mainActivityTV, Context context) {
        this.a = mainActivityTV;
        this.b = context;
    }

    @Override // android.view.View$OnClickListener
    public final void onClick(View view) {
        new p().a(this.b);
    }
}
