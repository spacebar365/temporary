package org.bouncycastle.p103c.p106c;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1389j;

/* JADX INFO: renamed from: org.bouncycastle.c.c.e */
/* JADX INFO: loaded from: classes.dex */
public class C1208e implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a */
    private AbstractC1381d f4708a;

    /* JADX INFO: renamed from: b */
    private byte[] f4709b;

    /* JADX INFO: renamed from: c */
    private AbstractC1389j f4710c;

    /* JADX INFO: renamed from: d */
    private BigInteger f4711d;

    /* JADX INFO: renamed from: e */
    private BigInteger f4712e;

    public C1208e(AbstractC1381d abstractC1381d, AbstractC1389j abstractC1389j, BigInteger bigInteger) {
        this.f4708a = abstractC1381d;
        this.f4710c = abstractC1389j.m3468o();
        this.f4711d = bigInteger;
        this.f4712e = BigInteger.valueOf(1L);
        this.f4709b = null;
    }

    public C1208e(AbstractC1381d abstractC1381d, AbstractC1389j abstractC1389j, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f4708a = abstractC1381d;
        this.f4710c = abstractC1389j.m3468o();
        this.f4711d = bigInteger;
        this.f4712e = bigInteger2;
        this.f4709b = bArr;
    }

    /* JADX INFO: renamed from: b */
    public final AbstractC1381d m2869b() {
        return this.f4708a;
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC1389j m2870c() {
        return this.f4710c;
    }

    /* JADX INFO: renamed from: d */
    public final BigInteger m2871d() {
        return this.f4711d;
    }

    /* JADX INFO: renamed from: e */
    public final BigInteger m2872e() {
        return this.f4712e;
    }

    /* JADX INFO: renamed from: f */
    public final byte[] m2873f() {
        return this.f4709b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1208e)) {
            return false;
        }
        C1208e c1208e = (C1208e) obj;
        return this.f4708a.m3362a(c1208e.f4708a) && this.f4710c.m3450a(c1208e.f4710c);
    }

    public int hashCode() {
        return this.f4708a.hashCode() ^ this.f4710c.hashCode();
    }
}
