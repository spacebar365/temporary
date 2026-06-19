package org.bouncycastle.p083b.p096j;

import java.security.SecureRandom;

/* JADX INFO: renamed from: org.bouncycastle.b.j.f */
/* JADX INFO: loaded from: classes.dex */
public final class C1044f implements InterfaceC1039a {
    @Override // org.bouncycastle.p083b.p096j.InterfaceC1039a
    /* JADX INFO: renamed from: a */
    public final int mo2555a(byte[] bArr) {
        byte b = bArr[bArr.length - 1];
        int length = bArr.length - 1;
        while (length > 0 && bArr[length - 1] == b) {
            length--;
        }
        return bArr.length - length;
    }

    @Override // org.bouncycastle.p083b.p096j.InterfaceC1039a
    /* JADX INFO: renamed from: a */
    public final int mo2556a(byte[] bArr, int i) {
        byte b;
        int length = bArr.length - i;
        if (i > 0) {
            b = (byte) ((bArr[i + (-1)] & 1) != 0 ? 0 : 255);
        } else {
            b = (byte) ((bArr[bArr.length + (-1)] & 1) != 0 ? 0 : 255);
        }
        while (i < bArr.length) {
            bArr[i] = b;
            i++;
        }
        return length;
    }

    @Override // org.bouncycastle.p083b.p096j.InterfaceC1039a
    /* JADX INFO: renamed from: a */
    public final void mo2557a(SecureRandom secureRandom) {
    }
}
