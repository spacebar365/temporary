package org.bouncycastle.p083b.p097k;

import java.security.SecureRandom;
import org.bouncycastle.p107d.p108a.p115d.AbstractC1383b;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.k.aj */
/* JADX INFO: loaded from: classes.dex */
public final class C1058aj extends C1075b {

    /* JADX INFO: renamed from: b */
    private final byte[] f4384b;

    public C1058aj(SecureRandom secureRandom) {
        super(true);
        this.f4384b = new byte[57];
        AbstractC1383b.m3408a(secureRandom, this.f4384b);
    }

    public C1058aj(byte[] bArr) {
        super(true);
        this.f4384b = new byte[57];
        System.arraycopy(bArr, 0, this.f4384b, 0, 57);
    }

    /* JADX INFO: renamed from: a */
    public final void m2572a(C1059ak c1059ak, byte[] bArr, byte[] bArr2, int i, byte[] bArr3) {
        byte[] bArr4 = new byte[57];
        if (c1059ak == null) {
            AbstractC1383b.m3414a(this.f4384b, bArr4);
        } else {
            c1059ak.m2575a(bArr4, 0);
        }
        AbstractC1383b.m3415a(this.f4384b, bArr4, bArr, bArr2, i, bArr3);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m2573b() {
        return C1535a.m4086b(this.f4384b);
    }

    /* JADX INFO: renamed from: c */
    public final C1059ak m2574c() {
        byte[] bArr = new byte[57];
        AbstractC1383b.m3414a(this.f4384b, bArr);
        return new C1059ak(bArr, 0);
    }
}
