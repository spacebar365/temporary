package org.bouncycastle.p083b.p096j;

import java.security.SecureRandom;
import org.bouncycastle.p083b.C1179v;

/* JADX INFO: renamed from: org.bouncycastle.b.j.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1042d implements InterfaceC1039a {
    @Override // org.bouncycastle.p083b.p096j.InterfaceC1039a
    /* JADX INFO: renamed from: a */
    public final int mo2555a(byte[] bArr) throws C1179v {
        int i = bArr[bArr.length - 1] & 255;
        byte b = (byte) i;
        boolean z = (i > bArr.length) | (i == 0);
        for (int i2 = 0; i2 < bArr.length; i2++) {
            z |= (bArr.length - i2 <= i) & (bArr[i2] != b);
        }
        if (z) {
            throw new C1179v("pad block corrupted");
        }
        return i;
    }

    @Override // org.bouncycastle.p083b.p096j.InterfaceC1039a
    /* JADX INFO: renamed from: a */
    public final int mo2556a(byte[] bArr, int i) {
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length) {
            bArr[i] = length;
            i++;
        }
        return length;
    }

    @Override // org.bouncycastle.p083b.p096j.InterfaceC1039a
    /* JADX INFO: renamed from: a */
    public final void mo2557a(SecureRandom secureRandom) {
    }
}
