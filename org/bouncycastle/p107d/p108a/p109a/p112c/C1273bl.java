package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;
import org.bouncycastle.p107d.p117c.AbstractC1417d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.bl */
/* JADX INFO: loaded from: classes.dex */
public final class C1273bl extends AbstractC1381d.a {

    /* JADX INFO: renamed from: i */
    protected C1275bn f4836i;

    public C1273bl() {
        super(113, 9, 0, 0);
        this.f4836i = new C1275bn(this, null, null);
        this.f5004b = mo2906a(new BigInteger(1, C1541f.m4106a("00689918DBEC7E5A0DD6DFC0AA55C7")));
        this.f5005c = mo2906a(new BigInteger(1, C1541f.m4106a("0095E9A9EC9B297BD4BF36E059184F")));
        this.f5006d = new BigInteger(1, C1541f.m4106a("010000000000000108789B2496AF93"));
        this.f5007e = BigInteger.valueOf(2L);
        this.f5008f = 6;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final int mo2905a() {
        return 113;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2906a(BigInteger bigInteger) {
        return new C1269bh(bigInteger);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final InterfaceC1387h mo2907a(AbstractC1389j[] abstractC1389jArr, int i) {
        long[] jArr = new long[i * 2 * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC1389j abstractC1389j = abstractC1389jArr[i3 + 0];
            AbstractC1417d.m3605a(((C1269bh) abstractC1389j.m3464k()).f4831a, jArr, i2);
            int i4 = i2 + 2;
            AbstractC1417d.m3605a(((C1269bh) abstractC1389j.m3465l()).f4831a, jArr, i4);
            i2 = i4 + 2;
        }
        return new C1274bm(this, i, jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    protected final AbstractC1389j mo2908a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        return new C1275bn(this, abstractC1386g, abstractC1386g2, z);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    protected final AbstractC1389j mo2909a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
        return new C1275bn(this, abstractC1386g, abstractC1386g2, abstractC1386gArr, z);
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
        return new C1273bl();
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: e */
    public final AbstractC1389j mo2912e() {
        return this.f4836i;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d.a
    /* JADX INFO: renamed from: o */
    public final boolean mo3060o() {
        return false;
    }
}
