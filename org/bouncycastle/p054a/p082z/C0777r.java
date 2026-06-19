package org.bouncycastle.p054a.p082z;

import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.C0558au;

/* JADX INFO: renamed from: org.bouncycastle.a.z.r */
/* JADX INFO: loaded from: classes.dex */
public final class C0777r extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private C0558au f3214a;

    private C0777r(C0558au c0558au) {
        this.f3214a = c0558au;
    }

    /* JADX INFO: renamed from: a */
    public static C0777r m1841a(Object obj) {
        if (obj != null) {
            return new C0777r(C0558au.m1414a(obj));
        }
        return null;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return this.f3214a;
    }

    public final String toString() {
        byte[] bArrD = this.f3214a.m1474d();
        if (bArrD.length == 1) {
            return "KeyUsage: 0x" + Integer.toHexString(bArrD[0] & 255);
        }
        return "KeyUsage: 0x" + Integer.toHexString((bArrD[0] & 255) | ((bArrD[1] & 255) << 8));
    }
}
