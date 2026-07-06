package com.al.dlnaserver.customs;

import android.view.KeyEvent;
import android.view.View;
import android.view.View$OnKeyListener;

/* JADX INFO: compiled from: CustomListAdapter.java */
/* JADX INFO: loaded from: classes.dex */
final class d implements View$OnKeyListener {
    final /* synthetic */ c a;

    d(c cVar) {
        this.a = cVar;
    }

    @Override // android.view.View$OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66) {
            return false;
        }
        c.a(this.a, view);
        return true;
    }
}
