package org.bouncycastle.p083b.p093i.p094a;

import java.lang.reflect.Array;
import org.bouncycastle.p142f.AbstractC1556g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.i.a.e */
/* JADX INFO: loaded from: classes.dex */
public final class C1009e implements InterfaceC1007c {

    /* JADX INFO: renamed from: a */
    private byte[] f4169a;

    /* JADX INFO: renamed from: b */
    private long[][] f4170b;

    @Override // org.bouncycastle.p083b.p093i.p094a.InterfaceC1007c
    /* JADX INFO: renamed from: b */
    public final void mo2483b(byte[] bArr) {
        long[] jArr = this.f4170b[bArr[15] & 255];
        long j = jArr[0];
        long j2 = jArr[1];
        for (int i = 14; i >= 0; i--) {
            long[] jArr2 = this.f4170b[bArr[i] & 255];
            long j3 = j2 << 56;
            j2 = ((j2 >>> 8) | (j << 56)) ^ jArr2[1];
            j = (((((j >>> 8) ^ jArr2[0]) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2)) ^ (j3 >>> 7);
        }
        AbstractC1556g.m4137a(j, bArr, 0);
        AbstractC1556g.m4137a(j2, bArr, 8);
    }

    @Override // org.bouncycastle.p083b.p093i.p094a.InterfaceC1007c
    /* JADX INFO: renamed from: a */
    public final void mo2482a(byte[] bArr) {
        if (this.f4170b == null) {
            this.f4170b = (long[][]) Array.newInstance((Class<?>) Long.TYPE, 256, 2);
        } else if (C1535a.m4076a(this.f4169a, bArr)) {
            return;
        }
        this.f4169a = C1535a.m4086b(bArr);
        AbstractC1556g.m4139a(this.f4169a, 0, this.f4170b[1]);
        long[] jArr = this.f4170b[1];
        long[] jArr2 = this.f4170b[1];
        long j = jArr[0];
        long j2 = jArr[1];
        long j3 = j2 << 57;
        jArr2[0] = (j3 >>> 7) ^ ((((j >>> 7) ^ j3) ^ (j3 >>> 1)) ^ (j3 >>> 2));
        jArr2[1] = (j << 57) | (j2 >>> 7);
        for (int i = 2; i < 256; i += 2) {
            long[] jArr3 = this.f4170b[i >> 1];
            long[] jArr4 = this.f4170b[i];
            long j4 = jArr3[0];
            long j5 = jArr3[1];
            long j6 = j4 >> 63;
            jArr4[0] = ((j4 ^ ((-2233785415175766016L) & j6)) << 1) | (j5 >>> 63);
            jArr4[1] = (j5 << 1) | (-j6);
            long[] jArr5 = this.f4170b[i];
            long[] jArr6 = this.f4170b[1];
            long[] jArr7 = this.f4170b[i + 1];
            jArr7[0] = jArr5[0] ^ jArr6[0];
            jArr7[1] = jArr5[1] ^ jArr6[1];
        }
    }
}
