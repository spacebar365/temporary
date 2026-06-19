package com.p033al.dlnaserver.p035b;

import android.widget.ScrollView;

/* JADX INFO: renamed from: com.al.dlnaserver.b.g */
/* JADX INFO: compiled from: Logs.java */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0353g implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ RunnableC0352f f1416a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ ScrollView f1417b;

    RunnableC0353g(RunnableC0352f runnableC0352f, ScrollView scrollView) {
        this.f1416a = runnableC0352f;
        this.f1417b = scrollView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1417b.fullScroll(130);
    }
}
