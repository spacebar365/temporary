package org.bouncycastle.a.z;

import org.bouncycastle.a.au;

/* JADX INFO: loaded from: classes.dex */
public final class r extends org.bouncycastle.a.o {
    private au a;

    private r(au auVar) {
        this.a = auVar;
    }

    public static r a(Object obj) {
        if (obj != null) {
            return new r(au.a(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final org.bouncycastle.a.u i() {
        return this.a;
    }

    public final String toString() {
        byte[] bArrD = this.a.d();
        if (bArrD.length == 1) {
            return "KeyUsage: 0x" + Integer.toHexString(bArrD[0] & 255);
        }
        return "KeyUsage: 0x" + Integer.toHexString((bArrD[0] & 255) | ((bArrD[1] & 255) << 8));
    }
}
