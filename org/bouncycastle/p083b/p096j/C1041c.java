package org.bouncycastle.p083b.p096j;

import java.security.SecureRandom;
import org.bouncycastle.p083b.C1179v;

/* JADX INFO: renamed from: org.bouncycastle.b.j.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1041c implements InterfaceC1039a {
    @Override // org.bouncycastle.p083b.p096j.InterfaceC1039a
    /* JADX INFO: renamed from: a */
    public final int mo2555a(byte[] bArr) throws C1179v {
        int length = bArr.length - 1;
        while (length > 0 && bArr[length] == 0) {
            length--;
        }
        if (bArr[length] != -128) {
            throw new C1179v("pad block corrupted");
        }
        return bArr.length - length;
    }

    @Override // org.bouncycastle.p083b.p096j.InterfaceC1039a
    /* JADX INFO: renamed from: a */
    public final int mo2556a(byte[] bArr, int i) {
        int length = bArr.length - i;
        bArr[i] = -128;
        for (int i2 = i + 1; i2 < bArr.length; i2++) {
            bArr[i2] = 0;
        }
        return length;
    }

    @Override // org.bouncycastle.p083b.p096j.InterfaceC1039a
    /* JADX INFO: renamed from: a */
    public final void mo2557a(SecureRandom secureRandom) {
    }
}
