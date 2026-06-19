package com.p033al.dlnaserver.customs;

import android.view.View;

/* JADX INFO: renamed from: com.al.dlnaserver.customs.e */
/* JADX INFO: compiled from: CustomListAdapter.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnFocusChangeListenerC0382e implements View.OnFocusChangeListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0380c f1458a;

    ViewOnFocusChangeListenerC0382e(C0380c c0380c) {
        this.f1458a = c0380c;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        if (!z) {
            C0380c.m1081a(this.f1458a, view);
        }
    }
}
