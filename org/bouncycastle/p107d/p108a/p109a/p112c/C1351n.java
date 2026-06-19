package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;
import org.bouncycastle.p107d.p117c.AbstractC1418e;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.n */
/* JADX INFO: loaded from: classes.dex */
public final class C1351n extends AbstractC1381d.b {

    /* JADX INFO: renamed from: i */
    public static final BigInteger f4938i = new BigInteger(1, C1541f.m4106a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC73"));

    /* JADX INFO: renamed from: j */
    protected C1355r f4939j;

    public C1351n() {
        super(f4938i);
        this.f4939j = new C1355r(this, null, null);
        this.f5004b = mo2906a(new BigInteger(1, C1541f.m4106a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFAC70")));
        this.f5005c = mo2906a(new BigInteger(1, C1541f.m4106a("B4E134D3FB59EB8BAB57274904664D5AF50388BA")));
        this.f5006d = new BigInteger(1, C1541f.m4106a("0100000000000000000000351EE786A818F3A1A16B"));
        this.f5007e = BigInteger.valueOf(1L);
        this.f5008f = 2;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final int mo2905a() {
        return f4938i.bitLength();
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2906a(BigInteger bigInteger) {
        return new C1354q(bigInteger);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final InterfaceC1387h mo2907a(AbstractC1389j[] abstractC1389jArr, int i) {
        int[] iArr = new int[i * 5 * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC1389j abstractC1389j = abstractC1389jArr[i3 + 0];
            AbstractC1418e.m3617a(((C1354q) abstractC1389j.m3464k()).f4947b, iArr, i2);
            int i4 = i2 + 5;
            AbstractC1418e.m3617a(((C1354q) abstractC1389j.m3465l()).f4947b, iArr, i4);
            i2 = i4 + 5;
        }
        return new C1352o(this, i, iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    protected final AbstractC1389j mo2908a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        return new C1355r(this, abstractC1386g, abstractC1386g2, z);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    protected final AbstractC1389j mo2909a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
        return new C1355r(this, abstractC1386g, abstractC1386g2, abstractC1386gArr, z);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final boolean mo2910a(int i) {
        switch (i) {
            case 2:
                return true;
            default:
                return false;
        }
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: c */
    protected final AbstractC1381d mo2911c() {
        return new C1351n();
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: e */
    public final AbstractC1389j mo2912e() {
        return this.f4939j;
    }
}
