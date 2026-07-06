package com.al.dlnaserver;

/* JADX INFO: compiled from: MainActivityTV.java */
/* JADX INFO: loaded from: classes.dex */
final class h implements Runnable {
    final /* synthetic */ g a;

    h(g gVar) {
        this.a = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivityTV.f(g.a(this.a)).setSelection(MainActivityTV.f(g.a(this.a)).getCount() - 1);
    }
}
