package com.p033al.dlnaserver.p035b;

import android.widget.ScrollView;

/* JADX INFO: renamed from: com.al.dlnaserver.b.f */
/* JADX INFO: compiled from: Logs.java */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0352f implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0351e f1414a;

    /* JADX INFO: renamed from: b */
    private final /* synthetic */ ScrollView f1415b;

    RunnableC0352f(C0351e c0351e, ScrollView scrollView) {
        this.f1414a = c0351e;
        this.f1415b = scrollView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1415b.post(new RunnableC0353g(this, this.f1415b));
    }
}
