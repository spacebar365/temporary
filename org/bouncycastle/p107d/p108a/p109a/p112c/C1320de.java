package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.C1367ad;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;
import org.bouncycastle.p107d.p108a.InterfaceC1388i;
import org.bouncycastle.p107d.p117c.AbstractC1422i;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.de */
/* JADX INFO: loaded from: classes.dex */
public final class C1320de extends AbstractC1381d.a {

    /* JADX INFO: renamed from: i */
    protected C1322dg f4894i;

    public C1320de() {
        super(283, 5, 7, 12);
        this.f4894i = new C1322dg(this, null, null);
        this.f5004b = mo2906a(BigInteger.valueOf(0L));
        this.f5005c = mo2906a(BigInteger.valueOf(1L));
        this.f5006d = new BigInteger(1, C1541f.m4106a("01FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFE9AE2ED07577265DFF7F94451E061E163C61"));
        this.f5007e = BigInteger.valueOf(4L);
        this.f5008f = 6;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final int mo2905a() {
        return 283;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2906a(BigInteger bigInteger) {
        return new C1319dd(bigInteger);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final InterfaceC1387h mo2907a(AbstractC1389j[] abstractC1389jArr, int i) {
        long[] jArr = new long[i * 5 * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC1389j abstractC1389j = abstractC1389jArr[i3 + 0];
            AbstractC1422i.m3708a(((C1319dd) abstractC1389j.m3464k()).f4893a, jArr, i2);
            int i4 = i2 + 5;
            AbstractC1422i.m3708a(((C1319dd) abstractC1389j.m3465l()).f4893a, jArr, i4);
            i2 = i4 + 5;
        }
        return new C1321df(this, i, jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    protected final AbstractC1389j mo2908a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        return new C1322dg(this, abstractC1386g, abstractC1386g2, z);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    protected final AbstractC1389j mo2909a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
        return new C1322dg(this, abstractC1386g, abstractC1386g2, abstractC1386gArr, z);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final boolean mo2910a(int i) {
        switch (i) {
            case 6:
                return true;
            default:
                return false;
        }
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: c */
    protected final AbstractC1381d mo2911c() {
        return new C1320de();
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: d */
    protected final InterfaceC1388i mo3097d() {
        return new C1367ad();
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: e */
    public final AbstractC1389j mo2912e() {
        return this.f4894i;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d.a
    /* JADX INFO: renamed from: o */
    public final boolean mo3060o() {
        return true;
    }
}
