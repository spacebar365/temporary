package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.bb */
/* JADX INFO: loaded from: classes.dex */
public final class C1263bb extends AbstractC1381d.b {

    /* JADX INFO: renamed from: i */
    public static final BigInteger f4823i = new BigInteger(1, C1541f.m4106a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFF"));

    /* JADX INFO: renamed from: j */
    protected C1267bf f4824j;

    public C1263bb() {
        super(f4823i);
        this.f4824j = new C1267bf(this, null, null);
        this.f5004b = mo2906a(new BigInteger(1, C1541f.m4106a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC")));
        this.f5005c = mo2906a(new BigInteger(1, C1541f.m4106a("0051953EB9618E1C9A1F929A21A0B68540EEA2DA725B99B315F3B8B489918EF109E156193951EC7E937B1652C0BD3BB1BF073573DF883D2C34F1EF451FD46B503F00")));
        this.f5006d = new BigInteger(1, C1541f.m4106a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFA51868783BF2F966B7FCC0148F709A5D03BB5C9B8899C47AEBB6FB71E91386409"));
        this.f5007e = BigInteger.valueOf(1L);
        this.f5008f = 2;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final int mo2905a() {
        return f4823i.bitLength();
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2906a(BigInteger bigInteger) {
        return new C1266be(bigInteger);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final InterfaceC1387h mo2907a(AbstractC1389j[] abstractC1389jArr, int i) {
        int[] iArr = new int[i * 17 * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC1389j abstractC1389j = abstractC1389jArr[i3 + 0];
            AbstractC1416c.m3588b(17, ((C1266be) abstractC1389j.m3464k()).f4830b, iArr, i2);
            int i4 = i2 + 17;
            AbstractC1416c.m3588b(17, ((C1266be) abstractC1389j.m3465l()).f4830b, iArr, i4);
            i2 = i4 + 17;
        }
        return new C1264bc(this, i, iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    protected final AbstractC1389j mo2908a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        return new C1267bf(this, abstractC1386g, abstractC1386g2, z);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    protected final AbstractC1389j mo2909a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
        return new C1267bf(this, abstractC1386g, abstractC1386g2, abstractC1386gArr, z);
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
        return new C1263bb();
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: e */
    public final AbstractC1389j mo2912e() {
        return this.f4824j;
    }
}
