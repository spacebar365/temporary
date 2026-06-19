package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;
import org.bouncycastle.p107d.p117c.AbstractC1419f;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.x */
/* JADX INFO: loaded from: classes.dex */
public final class C1361x extends AbstractC1381d.b {

    /* JADX INFO: renamed from: i */
    public static final BigInteger f4958i = new BigInteger(1, C1541f.m4106a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFF"));

    /* JADX INFO: renamed from: j */
    protected C1236ab f4959j;

    public C1361x() {
        super(f4958i);
        this.f4959j = new C1236ab(this, null, null);
        this.f5004b = mo2906a(new BigInteger(1, C1541f.m4106a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFFFFFFFFFC")));
        this.f5005c = mo2906a(new BigInteger(1, C1541f.m4106a("64210519E59C80E70FA7E9AB72243049FEB8DEECC146B9B1")));
        this.f5006d = new BigInteger(1, C1541f.m4106a("FFFFFFFFFFFFFFFFFFFFFFFF99DEF836146BC9B1B4D22831"));
        this.f5007e = BigInteger.valueOf(1L);
        this.f5008f = 2;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final int mo2905a() {
        return f4958i.bitLength();
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2906a(BigInteger bigInteger) {
        return new C1235aa(bigInteger);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final InterfaceC1387h mo2907a(AbstractC1389j[] abstractC1389jArr, int i) {
        int[] iArr = new int[i * 6 * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC1389j abstractC1389j = abstractC1389jArr[i3 + 0];
            AbstractC1419f.m3637a(((C1235aa) abstractC1389j.m3464k()).f4769b, iArr, i2);
            int i4 = i2 + 6;
            AbstractC1419f.m3637a(((C1235aa) abstractC1389j.m3465l()).f4769b, iArr, i4);
            i2 = i4 + 6;
        }
        return new C1362y(this, i, iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    protected final AbstractC1389j mo2908a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        return new C1236ab(this, abstractC1386g, abstractC1386g2, z);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    protected final AbstractC1389j mo2909a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
        return new C1236ab(this, abstractC1386g, abstractC1386g2, abstractC1386gArr, z);
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
        return new C1361x();
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: e */
    public final AbstractC1389j mo2912e() {
        return this.f4959j;
    }
}
