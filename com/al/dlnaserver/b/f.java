package com.al.dlnaserver.b;

import android.widget.ScrollView;

/* JADX INFO: compiled from: Logs.java */
/* JADX INFO: loaded from: classes.dex */
final class f implements Runnable {
    final /* synthetic */ e a;
    private final /* synthetic */ ScrollView b;

    f(e eVar, ScrollView scrollView) {
        this.a = eVar;
        this.b = scrollView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.post(new g(this, this.b));
    }
}
