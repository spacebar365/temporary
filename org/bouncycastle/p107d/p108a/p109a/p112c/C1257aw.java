package org.bouncycastle.p107d.p108a.p109a.p112c;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1386g;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.InterfaceC1387h;
import org.bouncycastle.p107d.p117c.AbstractC1416c;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.d.a.a.c.aw */
/* JADX INFO: loaded from: classes.dex */
public final class C1257aw extends AbstractC1381d.b {

    /* JADX INFO: renamed from: i */
    public static final BigInteger f4810i = new BigInteger(1, C1541f.m4106a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFF"));

    /* JADX INFO: renamed from: j */
    protected C1262ba f4811j;

    public C1257aw() {
        super(f4810i);
        this.f4811j = new C1262ba(this, null, null);
        this.f5004b = mo2906a(new BigInteger(1, C1541f.m4106a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFEFFFFFFFF0000000000000000FFFFFFFC")));
        this.f5005c = mo2906a(new BigInteger(1, C1541f.m4106a("B3312FA7E23EE7E4988E056BE3F82D19181D9C6EFE8141120314088F5013875AC656398D8A2ED19D2A85C8EDD3EC2AEF")));
        this.f5006d = new BigInteger(1, C1541f.m4106a("FFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFFC7634D81F4372DDF581A0DB248B0A77AECEC196ACCC52973"));
        this.f5007e = BigInteger.valueOf(1L);
        this.f5008f = 2;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final int mo2905a() {
        return f4810i.bitLength();
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final AbstractC1386g mo2906a(BigInteger bigInteger) {
        return new C1260az(bigInteger);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    public final InterfaceC1387h mo2907a(AbstractC1389j[] abstractC1389jArr, int i) {
        int[] iArr = new int[i * 12 * 2];
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC1389j abstractC1389j = abstractC1389jArr[i3 + 0];
            AbstractC1416c.m3588b(12, ((C1260az) abstractC1389j.m3464k()).f4819b, iArr, i2);
            int i4 = i2 + 12;
            AbstractC1416c.m3588b(12, ((C1260az) abstractC1389j.m3465l()).f4819b, iArr, i4);
            i2 = i4 + 12;
        }
        return new C1258ax(this, i, iArr);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    protected final AbstractC1389j mo2908a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, boolean z) {
        return new C1262ba(this, abstractC1386g, abstractC1386g2, z);
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: a */
    protected final AbstractC1389j mo2909a(AbstractC1386g abstractC1386g, AbstractC1386g abstractC1386g2, AbstractC1386g[] abstractC1386gArr, boolean z) {
        return new C1262ba(this, abstractC1386g, abstractC1386g2, abstractC1386gArr, z);
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
        return new C1257aw();
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1381d
    /* JADX INFO: renamed from: e */
    public final AbstractC1389j mo2912e() {
        return this.f4811j;
    }
}
