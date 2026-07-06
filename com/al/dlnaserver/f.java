package com.al.dlnaserver;

import android.view.View;
import android.view.View$OnClickListener;

/* JADX INFO: compiled from: MainActivityTV.java */
/* JADX INFO: loaded from: classes.dex */
final class f implements View$OnClickListener {
    final /* synthetic */ MainActivityTV a;

    f(MainActivityTV mainActivityTV) {
        this.a = mainActivityTV;
    }

    @Override // android.view.View$OnClickListener
    public final void onClick(View view) {
        if (!App.a) {
            MainActivityTV.a(this.a);
        } else if (App.b) {
            App.a = false;
        } else {
            MainActivityTV.b(this.a);
        }
    }
}
