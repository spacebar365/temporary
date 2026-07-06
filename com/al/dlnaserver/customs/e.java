package com.al.dlnaserver.customs;

import android.view.View;
import android.view.View$OnFocusChangeListener;

/* JADX INFO: compiled from: CustomListAdapter.java */
/* JADX INFO: loaded from: classes.dex */
final class e implements View$OnFocusChangeListener {
    final /* synthetic */ c a;

    e(c cVar) {
        this.a = cVar;
    }

    @Override // android.view.View$OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (!z) {
            c.a(this.a, view);
        }
    }
}
