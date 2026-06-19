package org.bouncycastle.p054a.p069n;

import org.bouncycastle.p054a.C0558au;

/* JADX INFO: renamed from: org.bouncycastle.a.n.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0646d extends C0558au {
    public C0646d(C0558au c0558au) {
        super(c0558au.m1474d(), c0558au.m1475f());
    }

    @Override // org.bouncycastle.p054a.AbstractC0603c
    public final String toString() {
        return "NetscapeCertType: 0x" + Integer.toHexString(this.f2135a[0] & 255);
    }
}
