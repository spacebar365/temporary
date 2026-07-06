package org.cybergarage.d.d;

/* JADX INFO: compiled from: SSDPRequest.java */
/* JADX INFO: loaded from: classes.dex */
public class h extends org.cybergarage.a.e {
    public h() {
        a("1.1");
    }

    public final void c(int i) {
        a("Cache-Control", "max-age=" + Integer.toString(i));
    }
}
