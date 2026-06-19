package com.p033al.dlnaserver;

/* JADX INFO: renamed from: com.al.dlnaserver.h */
/* JADX INFO: compiled from: MainActivityTV.java */
/* JADX INFO: loaded from: classes.dex */
final class RunnableC0394h implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ ViewOnClickListenerC0393g f1478a;

    RunnableC0394h(ViewOnClickListenerC0393g viewOnClickListenerC0393g) {
        this.f1478a = viewOnClickListenerC0393g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f1478a.f1476a.f1296c.setSelection(this.f1478a.f1476a.f1296c.getCount() - 1);
    }
}
