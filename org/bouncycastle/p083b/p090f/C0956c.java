package org.bouncycastle.p083b.p090f;

import org.bouncycastle.p083b.C1181x;
import org.bouncycastle.p083b.p097k.C1101d;

/* JADX INFO: renamed from: org.bouncycastle.b.f.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0956c extends C0955b {
    @Override // org.bouncycastle.p083b.p090f.C0955b, org.bouncycastle.p083b.C0987h
    /* JADX INFO: renamed from: a */
    public final void mo2415a(C1181x c1181x) {
        this.f4057a = c1181x.m2824a();
        this.f4058b = (c1181x.m2825b() + 7) / 8;
        if (this.f4058b == 0 || this.f4058b == 21) {
            this.f4058b = 24;
        } else if (this.f4058b == 14) {
            this.f4058b = 16;
        } else if (this.f4058b != 24 && this.f4058b != 16) {
            throw new IllegalArgumentException("DESede key must be 192 or 128 bits long.");
        }
    }

    @Override // org.bouncycastle.p083b.p090f.C0955b, org.bouncycastle.p083b.C0987h
    /* JADX INFO: renamed from: a */
    public final byte[] mo2416a() {
        byte[] bArr = new byte[this.f4058b];
        int i = 0;
        while (true) {
            this.f4057a.nextBytes(bArr);
            C1101d.m2653a(bArr);
            i++;
            if (i >= 20 || (!C1101d.m2656b(bArr, bArr.length) && C1101d.m2655b(bArr))) {
                break;
            }
        }
        if (C1101d.m2656b(bArr, bArr.length) || !C1101d.m2655b(bArr)) {
            throw new IllegalStateException("Unable to generate DES-EDE key");
        }
        return bArr;
    }
}
