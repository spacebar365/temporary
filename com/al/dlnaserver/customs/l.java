package com.al.dlnaserver.customs;

import android.content.Intent;

/* JADX INFO: compiled from: MediaObserver.java */
/* JADX INFO: loaded from: classes.dex */
final class l extends Thread {
    final /* synthetic */ k a;

    l(k kVar) {
        this.a = kVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (System.currentTimeMillis() - k.a(this.a) < 2000) {
            try {
                sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Intent intent = new Intent();
        intent.setAction(String.valueOf(k.b(this.a).getPackageName()) + ".mediaUpdated");
        k.b(this.a).sendBroadcast(intent);
        k.c(this.a);
    }
}
