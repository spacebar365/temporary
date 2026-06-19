package org.bouncycastle.p107d.p108a.p109a.p110a;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;
import org.bouncycastle.p107d.p117c.AbstractC1421h;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C1224a extends AbstractC1381d.b {

    /* JADX INFO: renamed from: i */
    public static final BigInteger f4747i = AbstractC1421h.m3694c(C1226c.f4752a);

    /* JADX INFO: renamed from: j */
    protected C1228e f4748j;

    public C1224a() {
        super(f4747i);
        this.f4748j = new C1228e(this, null, null);
        this.f5004b = mo2906a(new BigInteger(1, C1541f.m4106a("2AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA984914A144")));
        this.f5005c = mo2906a(new BigInteger(1, C1541f.m4106a("7B425ED097B425ED097B425ED097B425ED097B425ED097B4260B5E9C7710C864")));
        this.f5006d = new BigInteger(1, C1541f.m4106a("1000000000000000000000000000000014DEF9DEA2F79CD65812631A5CF5D3ED"));
        this.f5007e = BigInteger.valueOf(8L);
        this.f5008f = 4;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final int mo2905a() {
        return f4747i.bitLength();
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2906a(BigInteger bigInteger) {
        return new C1227d(bigInteger);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final InterfaceC1387h mo2907a(AbstractC1389j[] abstractC1389jArr, int i) {
        int[] iArr = new int[i * 8 * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC1389j abstractC1389j = abstractC1389jArr[i3 + 0];
            AbstractC1421h.m3683a(((C1227d) abstractC1389j.m3464k()).f4756b, iArr, i2);
            int i4 = i2 + 8;
            AbstractC1421h.m3683a(((C1227d) abstractC1389j.m3465l()).f4756b, iArr, i4);
            i2 = i4 + 8;
        }
        return new C1225b(this, i, iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    protected final AbstractC1389j mo2908a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        return new C1228e(this, abstractC1386g, abstractC1386g2, z);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    protected final AbstractC1389j mo2909a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
        return new C1228e(this, abstractC1386g, abstractC1386g2, abstractC1386gArr, z);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final boolean mo2910a(int i) {
        switch (i) {
            case 4:
                return true;
            default:
                return false;
        }
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: c */
    protected final AbstractC1381d mo2911c() {
        return new C1224a();
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: e */
    public final AbstractC1389j mo2912e() {
        return this.f4748j;
    }
}
