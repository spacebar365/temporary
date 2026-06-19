package org.bouncycastle.p083b.p097k;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.C1371b;
import org.bouncycastle.p107d.p108a.InterfaceC1376c;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.k.y */
/* JADX INFO: loaded from: classes.dex */
public class C1122y implements InterfaceC1376c {

    /* JADX INFO: renamed from: a */
    private AbstractC1381d f4506a;

    /* JADX INFO: renamed from: b */
    private byte[] f4507b;

    /* JADX INFO: renamed from: i */
    private AbstractC1389j f4508i;

    /* JADX INFO: renamed from: j */
    private BigInteger f4509j;

    /* JADX INFO: renamed from: k */
    private BigInteger f4510k;

    /* JADX INFO: renamed from: l */
    private BigInteger f4511l;

    public C1122y(AbstractC1381d abstractC1381d, AbstractC1389j abstractC1389j, BigInteger bigInteger, BigInteger bigInteger2) {
        this(abstractC1381d, abstractC1389j, bigInteger, bigInteger2, null);
    }

    public C1122y(AbstractC1381d abstractC1381d, AbstractC1389j abstractC1389j, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f4511l = null;
        if (abstractC1381d == null) {
            throw new NullPointerException("curve");
        }
        if (bigInteger == null) {
            throw new NullPointerException("n");
        }
        this.f4506a = abstractC1381d;
        this.f4508i = m2698a(abstractC1381d, abstractC1389j);
        this.f4509j = bigInteger;
        this.f4510k = bigInteger2;
        this.f4507b = C1535a.m4086b(bArr);
    }

    /* JADX INFO: renamed from: a */
    static AbstractC1389j m2698a(AbstractC1381d abstractC1381d, AbstractC1389j abstractC1389j) {
        if (abstractC1389j == null) {
            throw new IllegalArgumentException("Point has null value");
        }
        AbstractC1389j abstractC1389jM3468o = C1371b.m3271a(abstractC1381d, abstractC1389j).m3468o();
        if (abstractC1389jM3468o.m3469p()) {
            throw new IllegalArgumentException("Point at infinity");
        }
        if (abstractC1389jM3468o.m3470q()) {
            return abstractC1389jM3468o;
        }
        throw new IllegalArgumentException("Point not on curve");
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1381d m2699a() {
        return this.f4506a;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1389j m2700b() {
        return this.f4508i;
    }

    /* JADX INFO: renamed from: c */
    public final BigInteger m2701c() {
        return this.f4509j;
    }

    /* JADX INFO: renamed from: d */
    public final BigInteger m2702d() {
        return this.f4510k;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized BigInteger m2703e() {
        if (this.f4511l == null) {
            this.f4511l = this.f4510k.modInverse(this.f4509j);
        }
        return this.f4511l;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1122y)) {
            return false;
        }
        C1122y c1122y = (C1122y) obj;
        return this.f4506a.m3362a(c1122y.f4506a) && this.f4508i.m3450a(c1122y.f4508i) && this.f4509j.equals(c1122y.f4509j) && this.f4510k.equals(c1122y.f4510k);
    }

    /* JADX INFO: renamed from: f */
    public final byte[] m2704f() {
        return C1535a.m4086b(this.f4507b);
    }

    public int hashCode() {
        return (((((this.f4506a.hashCode() * 37) ^ this.f4508i.hashCode()) * 37) ^ this.f4509j.hashCode()) * 37) ^ this.f4510k.hashCode();
    }
}
