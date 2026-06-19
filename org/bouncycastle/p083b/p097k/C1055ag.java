package org.bouncycastle.p083b.p097k;

import java.security.SecureRandom;
import org.bouncycastle.p107d.p108a.p115d.AbstractC1382a;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.k.ag */
/* JADX INFO: loaded from: classes.dex */
public final class C1055ag extends C1075b {

    /* JADX INFO: renamed from: b */
    private final byte[] f4382b;

    public C1055ag(SecureRandom secureRandom) {
        super(true);
        this.f4382b = new byte[32];
        AbstractC1382a.m3383a(secureRandom, this.f4382b);
    }

    public C1055ag(byte[] bArr) {
        super(true);
        this.f4382b = new byte[32];
        System.arraycopy(bArr, 0, this.f4382b, 0, 32);
    }

    /* JADX INFO: renamed from: a */
    public final void m2567a(C1056ah c1056ah, byte[] bArr, int i, byte[] bArr2) {
        byte[] bArr3 = new byte[32];
        if (c1056ah == null) {
            AbstractC1382a.m3390a(this.f4382b, bArr3);
        } else {
            c1056ah.m2570a(bArr3, 0);
        }
        AbstractC1382a.m3391a(this.f4382b, bArr3, bArr, i, bArr2);
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m2568b() {
        return C1535a.m4086b(this.f4382b);
    }

    /* JADX INFO: renamed from: c */
    public final C1056ah m2569c() {
        byte[] bArr = new byte[32];
        AbstractC1382a.m3390a(this.f4382b, bArr);
        return new C1056ah(bArr, 0);
    }
}
