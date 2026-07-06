package com.al.dlnaserver.customs;

import android.content.Intent;

/* JADX INFO: compiled from: DirectoryObserver.java */
/* JADX INFO: loaded from: classes.dex */
final class j extends Thread {
    final /* synthetic */ i a;

    j(i iVar) {
        this.a = iVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (System.currentTimeMillis() - i.a(this.a) < 2000) {
            try {
                sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Intent intent = new Intent();
        intent.setAction(String.valueOf(i.b(this.a).getPackageName()) + ".mediaUpdated");
        i.b(this.a).sendBroadcast(intent);
        i.c(this.a);
    }
}
