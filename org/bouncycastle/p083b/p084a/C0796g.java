package org.bouncycastle.p083b.p084a;

import java.math.BigInteger;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.InterfaceC1175r;
import org.bouncycastle.p083b.p097k.C1052ad;
import org.bouncycastle.p083b.p097k.C1053ae;
import org.bouncycastle.p083b.p097k.C1083bh;
import org.bouncycastle.p083b.p097k.C1122y;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.C1371b;
import org.bouncycastle.p142f.C1544b;

/* JADX INFO: renamed from: org.bouncycastle.b.a.g */
/* JADX INFO: loaded from: classes.dex */
public final class C0796g {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1175r f3315a;

    /* JADX INFO: renamed from: b */
    private C1052ad f3316b;

    /* JADX INFO: renamed from: c */
    private BigInteger f3317c;

    public C0796g(InterfaceC1175r interfaceC1175r) {
        this.f3315a = interfaceC1175r;
    }

    /* JADX INFO: renamed from: a */
    private byte[] m1888a(AbstractC1389j abstractC1389j) {
        BigInteger bigIntegerMo2928a = abstractC1389j.m3461g().mo2928a();
        BigInteger bigIntegerMo2928a2 = abstractC1389j.m3462h().mo2928a();
        int i = bigIntegerMo2928a.toByteArray().length > 33 ? 64 : 32;
        byte[] bArr = new byte[i * 2];
        byte[] bArrM4117a = C1544b.m4117a(i, bigIntegerMo2928a);
        byte[] bArrM4117a2 = C1544b.m4117a(i, bigIntegerMo2928a2);
        for (int i2 = 0; i2 != i; i2++) {
            bArr[i2] = bArrM4117a[(i - i2) - 1];
        }
        for (int i3 = 0; i3 != i; i3++) {
            bArr[i + i3] = bArrM4117a2[(i - i3) - 1];
        }
        this.f3315a.mo1929a(bArr, 0, bArr.length);
        byte[] bArr2 = new byte[this.f3315a.mo1930b()];
        this.f3315a.mo1926a(bArr2, 0);
        return bArr2;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m1890b(InterfaceC1003i interfaceC1003i) {
        C1053ae c1053ae = (C1053ae) interfaceC1003i;
        C1122y c1122yB = this.f3316b.m2563b();
        if (!c1122yB.equals(c1053ae.m2563b())) {
            throw new IllegalStateException("ECVKO public key has wrong domain parameters");
        }
        BigInteger bigIntegerMod = c1122yB.m2702d().multiply(this.f3317c).multiply(this.f3316b.m2565c()).mod(c1122yB.m2701c());
        AbstractC1389j abstractC1389jM3279b = C1371b.m3279b(c1122yB.m2699a(), c1053ae.m2566c());
        if (abstractC1389jM3279b.m3469p()) {
            throw new IllegalStateException("Infinity is not a valid public key for ECDHC");
        }
        AbstractC1389j abstractC1389jM3468o = abstractC1389jM3279b.m3447a(bigIntegerMod).m3468o();
        if (abstractC1389jM3468o.m3469p()) {
            throw new IllegalStateException("Infinity is not a valid agreement value for ECVKO");
        }
        return m1888a(abstractC1389jM3468o);
    }

    /* JADX INFO: renamed from: a */
    public final void m1889a(InterfaceC1003i interfaceC1003i) {
        C1083bh c1083bh = (C1083bh) interfaceC1003i;
        this.f3316b = (C1052ad) c1083bh.m2618b();
        byte[] bArrM2617a = c1083bh.m2617a();
        byte[] bArr = new byte[bArrM2617a.length];
        for (int i = 0; i != bArr.length; i++) {
            bArr[i] = bArrM2617a[(bArrM2617a.length - i) - 1];
        }
        this.f3317c = new BigInteger(1, bArr);
    }
}
