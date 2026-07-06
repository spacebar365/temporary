package org.cybergarage.e;

/* JADX INFO: compiled from: TimerUtil.java */
/* JADX INFO: loaded from: classes.dex */
public final class f {
    public static final void a(int i) {
        try {
            Thread.sleep((int) (Math.random() * ((double) i)));
        } catch (Exception e) {
        }
    }
}
