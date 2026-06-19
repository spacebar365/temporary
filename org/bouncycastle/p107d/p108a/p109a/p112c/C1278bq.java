package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;
import org.bouncycastle.p107d.p117c.AbstractC1419f;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.bq */
/* JADX INFO: loaded from: classes.dex */
public final class C1278bq extends AbstractC1381d.a {

    /* JADX INFO: renamed from: i */
    protected C1280bs f4842i;

    public C1278bq() {
        super(131, 2, 3, 8);
        this.f4842i = new C1280bs(this, null, null);
        this.f5004b = mo2906a(new BigInteger(1, C1541f.m4106a("07A11B09A76B562144418FF3FF8C2570B8")));
        this.f5005c = mo2906a(new BigInteger(1, C1541f.m4106a("0217C05610884B63B9C6C7291678F9D341")));
        this.f5006d = new BigInteger(1, C1541f.m4106a("0400000000000000023123953A9464B54D"));
        this.f5007e = BigInteger.valueOf(2L);
        this.f5008f = 6;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final int mo2905a() {
        return 131;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2906a(BigInteger bigInteger) {
        return new C1277bp(bigInteger);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final InterfaceC1387h mo2907a(AbstractC1389j[] abstractC1389jArr, int i) {
        long[] jArr = new long[i * 3 * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC1389j abstractC1389j = abstractC1389jArr[i3 + 0];
            AbstractC1419f.m3639a(((C1277bp) abstractC1389j.m3464k()).f4841a, jArr, i2);
            int i4 = i2 + 3;
            AbstractC1419f.m3639a(((C1277bp) abstractC1389j.m3465l()).f4841a, jArr, i4);
            i2 = i4 + 3;
        }
        return new C1279br(this, i, jArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    protected final AbstractC1389j mo2908a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        return new C1280bs(this, abstractC1386g, abstractC1386g2, z);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    protected final AbstractC1389j mo2909a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
        return new C1280bs(this, abstractC1386g, abstractC1386g2, abstractC1386gArr, z);
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
        return new C1278bq();
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: e */
    public final AbstractC1389j mo2912e() {
        return this.f4842i;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d.a
    /* JADX INFO: renamed from: o */
    public final boolean mo3060o() {
        return false;
    }
}
