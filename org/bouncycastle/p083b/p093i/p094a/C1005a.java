package org.bouncycastle.p083b.p093i.p094a;

import org.bouncycastle.p107d.p117c.C1414a;
import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.i.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1005a implements InterfaceC1006b {

    /* JADX INFO: renamed from: a */
    private long[] f4168a;

    @Override // org.bouncycastle.p083b.p093i.p094a.InterfaceC1006b
    /* JADX INFO: renamed from: a */
    public final void mo2481a(byte[] bArr) {
        this.f4168a = AbstractC1008d.m2489a(bArr);
    }

    @Override // org.bouncycastle.p083b.p093i.p094a.InterfaceC1006b
    /* JADX INFO: renamed from: a */
    public final void mo2480a(long j, byte[] bArr) {
        long[] jArr = {Long.MIN_VALUE, 0};
        if (j > 0) {
            long[] jArrM4088b = C1535a.m4088b(this.f4168a);
            do {
                if ((1 & j) != 0) {
                    AbstractC1008d.m2488a(jArr, jArrM4088b);
                }
                long[] jArr2 = new long[4];
                C1414a.m3563b(jArrM4088b[0], jArr2, 0);
                C1414a.m3563b(jArrM4088b[1], jArr2, 2);
                long j2 = jArr2[0];
                long j3 = jArr2[1];
                long j4 = jArr2[2];
                long j5 = jArr2[3];
                long j6 = j3 ^ ((((j5 >>> 1) ^ j5) ^ (j5 >>> 2)) ^ (j5 >>> 7));
                long j7 = ((j5 << 57) ^ ((j5 << 63) ^ (j5 << 62))) ^ j4;
                jArrM4088b[0] = j2 ^ ((((j7 >>> 1) ^ j7) ^ (j7 >>> 2)) ^ (j7 >>> 7));
                jArrM4088b[1] = ((j7 << 57) ^ ((j7 << 63) ^ (j7 << 62))) ^ j6;
                j >>>= 1;
            } while (j > 0);
        }
        AbstractC1556g.m4142a(jArr, bArr, 0);
    }
}
