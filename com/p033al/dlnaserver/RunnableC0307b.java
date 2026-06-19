package com.p033al.dlnaserver;

/* JADX INFO: renamed from: com.al.dlnaserver.b */
/* JADX INFO: compiled from: MainActivity.java */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0307b implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ MainActivity f1315a;

    RunnableC0307b(MainActivity mainActivity) {
        this.f1315a = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1315a.f1290c.setSelection(this.f1315a.f1290c.getCount() - 1);
    }
}
