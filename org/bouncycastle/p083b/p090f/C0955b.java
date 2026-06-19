package org.bouncycastle.p083b.p090f;

import org.bouncycastle.p083b.C0987h;
import org.bouncycastle.p083b.C1181x;
import org.bouncycastle.p083b.p097k.C1100c;

/* JADX INFO: renamed from: org.bouncycastle.b.f.b */
/* JADX INFO: loaded from: classes.dex */
public class C0955b extends C0987h {
    @Override // org.bouncycastle.p083b.C0987h
    /* JADX INFO: renamed from: a */
    public void mo2415a(C1181x c1181x) {
        super.mo2415a(c1181x);
        if (this.f4058b == 0 || this.f4058b == 7) {
            this.f4058b = 8;
        } else if (this.f4058b != 8) {
            throw new IllegalArgumentException("DES key must be 64 bits long.");
        }
    }

    @Override // org.bouncycastle.p083b.C0987h
    /* JADX INFO: renamed from: a */
    public byte[] mo2416a() {
        byte[] bArr = new byte[8];
        do {
            this.f4057a.nextBytes(bArr);
            C1100c.m2653a(bArr);
        } while (C1100c.m2654a(bArr, 0));
        return bArr;
    }
}
