package com.p033al.dlnaserver.customs;

import android.content.Intent;

/* JADX INFO: renamed from: com.al.dlnaserver.customs.j */
/* JADX INFO: compiled from: DirectoryObserver.java */
/* JADX INFO: loaded from: classes.dex */
final class C0387j extends Thread {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ FileObserverC0386i f1467a;

    C0387j(FileObserverC0386i fileObserverC0386i) {
        this.f1467a = fileObserverC0386i;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (System.currentTimeMillis() - this.f1467a.f1463b < 2000) {
            try {
                sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Intent intent = new Intent();
        intent.setAction(String.valueOf(this.f1467a.f1462a.getPackageName()) + ".mediaUpdated");
        this.f1467a.f1462a.sendBroadcast(intent);
        this.f1467a.f1464c = null;
    }
}
