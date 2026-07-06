package a.e;

import a.q;

/* JADX INFO: compiled from: SessionRequestPacket.java */
/* JADX INFO: loaded from: classes.dex */
public final class l extends m {
    private b c;
    private b d;

    public l(a.h hVar, q qVar, q qVar2) {
        this.a = 129;
        this.c = new b(hVar, qVar);
        this.d = new b(hVar, qVar2);
    }

    @Override // a.e.m
    final int a(byte[] bArr) {
        int iA = this.c.a(bArr, 4) + 4;
        return (iA + this.d.a(bArr, iA)) - 4;
    }
}
