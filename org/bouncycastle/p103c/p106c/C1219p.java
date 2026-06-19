package org.bouncycastle.p103c.p106c;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.c.c.p */
/* JADX INFO: loaded from: classes.dex */
public class C1219p implements AlgorithmParameterSpec {

    /* JADX INFO: renamed from: a */
    private byte[] f4735a;

    /* JADX INFO: renamed from: b */
    private byte[] f4736b;

    /* JADX INFO: renamed from: c */
    private int f4737c;

    /* JADX INFO: renamed from: d */
    private int f4738d;

    /* JADX INFO: renamed from: e */
    private byte[] f4739e;

    /* JADX INFO: renamed from: f */
    private boolean f4740f;

    public C1219p(byte[] bArr, byte[] bArr2, int i) {
        this(bArr, bArr2, i, -1, null, (byte) 0);
    }

    public C1219p(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3) {
        this(bArr, bArr2, i, i2, bArr3, (byte) 0);
    }

    private C1219p(byte[] bArr, byte[] bArr2, int i, int i2, byte[] bArr3, byte b) {
        if (bArr != null) {
            this.f4735a = new byte[bArr.length];
            System.arraycopy(bArr, 0, this.f4735a, 0, bArr.length);
        } else {
            this.f4735a = null;
        }
        if (bArr2 != null) {
            this.f4736b = new byte[bArr2.length];
            System.arraycopy(bArr2, 0, this.f4736b, 0, bArr2.length);
        } else {
            this.f4736b = null;
        }
        this.f4737c = i;
        this.f4738d = i2;
        this.f4739e = C1535a.m4086b(bArr3);
        this.f4740f = false;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m2893a() {
        return C1535a.m4086b(this.f4735a);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m2894b() {
        return C1535a.m4086b(this.f4736b);
    }

    /* JADX INFO: renamed from: c */
    public final int m2895c() {
        return this.f4737c;
    }

    /* JADX INFO: renamed from: d */
    public final int m2896d() {
        return this.f4738d;
    }

    /* JADX INFO: renamed from: e */
    public final byte[] m2897e() {
        return C1535a.m4086b(this.f4739e);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2898f() {
        return this.f4740f;
    }
}
