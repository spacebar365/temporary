package org.bouncycastle.p118e.p120b.p128g;

import org.bouncycastle.p083b.InterfaceC0817aq;
import org.bouncycastle.p083b.InterfaceC1175r;

/* JADX INFO: renamed from: org.bouncycastle.e.b.g.h */
/* JADX INFO: loaded from: classes.dex */
final class C1471h {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1175r f5321a;

    /* JADX INFO: renamed from: b */
    private final int f5322b;

    protected C1471h(InterfaceC1175r interfaceC1175r, int i) {
        if (interfaceC1175r == null) {
            throw new NullPointerException("digest == null");
        }
        this.f5321a = interfaceC1175r;
        this.f5322b = i;
    }

    /* JADX INFO: renamed from: a */
    private byte[] m3874a(int i, byte[] bArr, byte[] bArr2) {
        byte[] bArrM3839a = C1464aa.m3839a(i, this.f5322b);
        this.f5321a.mo1929a(bArrM3839a, 0, bArrM3839a.length);
        this.f5321a.mo1929a(bArr, 0, bArr.length);
        this.f5321a.mo1929a(bArr2, 0, bArr2.length);
        byte[] bArr3 = new byte[this.f5322b];
        if (this.f5321a instanceof InterfaceC0817aq) {
            ((InterfaceC0817aq) this.f5321a).mo1918b(bArr3, 0, this.f5322b);
        } else {
            this.f5321a.mo1926a(bArr3, 0);
        }
        return bArr3;
    }

    /* JADX INFO: renamed from: a */
    protected final byte[] m3875a(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.f5322b) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length != this.f5322b) {
            throw new IllegalArgumentException("wrong in length");
        }
        return m3874a(0, bArr, bArr2);
    }

    /* JADX INFO: renamed from: b */
    protected final byte[] m3876b(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.f5322b) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length != this.f5322b * 2) {
            throw new IllegalArgumentException("wrong in length");
        }
        return m3874a(1, bArr, bArr2);
    }

    /* JADX INFO: renamed from: c */
    protected final byte[] m3877c(byte[] bArr, byte[] bArr2) {
        if (bArr.length != this.f5322b) {
            throw new IllegalArgumentException("wrong key length");
        }
        if (bArr2.length != 32) {
            throw new IllegalArgumentException("wrong address length");
        }
        return m3874a(3, bArr, bArr2);
    }
}
