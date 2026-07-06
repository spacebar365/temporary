package com.al.dlnaserver;

/* JADX INFO: compiled from: MainActivity.java */
/* JADX INFO: loaded from: classes.dex */
final class b implements Runnable {
    final /* synthetic */ MainActivity a;

    b(MainActivity mainActivity) {
        this.a = mainActivity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        MainActivity.c(this.a).setSelection(MainActivity.c(this.a).getCount() - 1);
    }
}
