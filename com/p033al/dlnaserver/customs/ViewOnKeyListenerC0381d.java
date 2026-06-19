package com.p033al.dlnaserver.customs;

import android.view.KeyEvent;
import android.view.View;

/* JADX INFO: renamed from: com.al.dlnaserver.customs.d */
/* JADX INFO: compiled from: CustomListAdapter.java */
/* JADX INFO: loaded from: classes.dex */
final class ViewOnKeyListenerC0381d implements View.OnKeyListener {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0380c f1457a;

    ViewOnKeyListenerC0381d(C0380c c0380c) {
        this.f1457a = c0380c;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66) {
            return false;
        }
        C0380c.m1081a(this.f1457a, view);
        return true;
    }
}
