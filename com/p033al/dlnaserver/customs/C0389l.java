package com.p033al.dlnaserver.customs;

import android.content.Intent;

/* JADX INFO: renamed from: com.al.dlnaserver.customs.l */
/* JADX INFO: compiled from: MediaObserver.java */
/* JADX INFO: loaded from: classes.dex */
final class C0389l extends Thread {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C0388k f1472a;

    C0389l(C0388k c0388k) {
        this.f1472a = c0388k;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (System.currentTimeMillis() - this.f1472a.f1470c < 2000) {
            try {
                sleep(500L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        Intent intent = new Intent();
        intent.setAction(String.valueOf(this.f1472a.f1468a.getPackageName()) + ".mediaUpdated");
        this.f1472a.f1468a.sendBroadcast(intent);
        this.f1472a.f1471d = null;
    }
}
