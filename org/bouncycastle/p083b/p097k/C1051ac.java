package org.bouncycastle.p083b.p097k;

import java.math.BigInteger;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1389j;

/* JADX INFO: renamed from: org.bouncycastle.b.k.ac */
/* JADX INFO: loaded from: classes.dex */
public class C1051ac extends C1122y {

    /* JADX INFO: renamed from: a */
    private C0653p f4379a;

    public C1051ac(C0653p c0653p, C1122y c1122y) {
        super(c1122y.m2699a(), c1122y.m2700b(), c1122y.m2701c(), c1122y.m2702d(), c1122y.m2704f());
        this.f4379a = c0653p;
    }

    public C1051ac(C0653p c0653p, AbstractC1381d abstractC1381d, AbstractC1389j abstractC1389j, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        super(abstractC1381d, abstractC1389j, bigInteger, bigInteger2, bArr);
        this.f4379a = c0653p;
    }

    /* JADX INFO: renamed from: j */
    public final C0653p m2564j() {
        return this.f4379a;
    }
}
