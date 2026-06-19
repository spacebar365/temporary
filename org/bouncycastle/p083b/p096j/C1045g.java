package org.bouncycastle.p083b.p096j;

import java.security.SecureRandom;
import org.bouncycastle.p083b.C1179v;

/* JADX INFO: renamed from: org.bouncycastle.b.j.g */
/* JADX INFO: loaded from: classes.dex */
public final class C1045g implements InterfaceC1039a {

    /* JADX INFO: renamed from: a */
    SecureRandom f4371a = null;

    @Override // org.bouncycastle.p083b.p096j.InterfaceC1039a
    /* JADX INFO: renamed from: a */
    public final int mo2555a(byte[] bArr) throws C1179v {
        int i = bArr[bArr.length - 1] & 255;
        if (i > bArr.length) {
            throw new C1179v("pad block corrupted");
        }
        return i;
    }

    @Override // org.bouncycastle.p083b.p096j.InterfaceC1039a
    /* JADX INFO: renamed from: a */
    public final int mo2556a(byte[] bArr, int i) {
        byte length = (byte) (bArr.length - i);
        while (i < bArr.length - 1) {
            if (this.f4371a == null) {
                bArr[i] = 0;
            } else {
                bArr[i] = (byte) this.f4371a.nextInt();
            }
            i++;
        }
        bArr[i] = length;
        return length;
    }

    @Override // org.bouncycastle.p083b.p096j.InterfaceC1039a
    /* JADX INFO: renamed from: a */
    public final void mo2557a(SecureRandom secureRandom) {
        this.f4371a = secureRandom;
    }
}
