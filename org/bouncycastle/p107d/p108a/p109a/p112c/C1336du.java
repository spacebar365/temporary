package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.C1367ad;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;
import org.bouncycastle.p107d.p108a.InterfaceC1388i;
import org.bouncycastle.p107d.p117c.AbstractC1426m;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.du */
/* JADX INFO: loaded from: classes.dex */
public final class C1336du extends AbstractC1381d.a {

    /* JADX INFO: renamed from: i */
    protected C1338dw f4913i;

    public C1336du() {
        super(571, 2, 5, 10);
        this.f4913i = new C1338dw(this, null, null);
        this.f5004b = mo2906a(BigInteger.valueOf(0L));
        this.f5005c = mo2906a(BigInteger.valueOf(1L));
        this.f5006d = new BigInteger(1, C1541f.m4106a("020000000000000000000000000000000000000000000000000000000000000000000000131850E1F19A63E4B391A8DB917F4138B630D84BE5D639381E91DEB45CFE778F637C1001"));
        this.f5007e = BigInteger.valueOf(4L);
        this.f5008f = 6;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final int mo2905a() {
        return 571;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2906a(BigInteger bigInteger) {
        return new C1335dt(bigInteger);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final InterfaceC1387h mo2907a(AbstractC1389j[] abstractC1389jArr, int i) {
        long[] jArr = new long[i * 9 * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC1389j abstractC1389j = abstractC1389jArr[i3 + 0];
            AbstractC1426m.m3715a(((C1335dt) abstractC1389j.m3464k()).f4912a, jArr, i2);
            int i4 = i2 + 9;
            AbstractC1426m.m3715a(((C1335dt) abstractC1389j.m3465l()).f4912a, jArr, i4);
            i2 = i4 + 9;
        }
        return new C1337dv(this, i, jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    protected final AbstractC1389j mo2908a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        return new C1338dw(this, abstractC1386g, abstractC1386g2, z);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    protected final AbstractC1389j mo2909a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
        return new C1338dw(this, abstractC1386g, abstractC1386g2, abstractC1386gArr, z);
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
        return new C1336du();
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: d */
    protected final InterfaceC1388i mo3097d() {
        return new C1367ad();
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: e */
    public final AbstractC1389j mo2912e() {
        return this.f4913i;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d.a
    /* JADX INFO: renamed from: o */
    public final boolean mo3060o() {
        return true;
    }
}
