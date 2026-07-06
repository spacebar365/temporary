package com.al.dlnaserver.b;

import android.widget.ScrollView;

/* JADX INFO: compiled from: Logs.java */
/* JADX INFO: loaded from: classes.dex */
final class g implements Runnable {
    final /* synthetic */ f a;
    private final /* synthetic */ ScrollView b;

    g(f fVar, ScrollView scrollView) {
        this.a = fVar;
        this.b = scrollView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.fullScroll(130);
    }
}
