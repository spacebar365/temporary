package org.bouncycastle.p083b.p096j;

import java.security.SecureRandom;

/* JADX INFO: renamed from: org.bouncycastle.b.j.h */
/* JADX INFO: loaded from: classes.dex */
public final class C1046h implements InterfaceC1039a {
    @Override // org.bouncycastle.p083b.p096j.InterfaceC1039a
    /* JADX INFO: renamed from: a */
    public final int mo2555a(byte[] bArr) {
        int length = bArr.length;
        while (length > 0 && bArr[length - 1] == 0) {
            length--;
        }
        return bArr.length - length;
    }

    @Override // org.bouncycastle.p083b.p096j.InterfaceC1039a
    /* JADX INFO: renamed from: a */
    public final int mo2556a(byte[] bArr, int i) {
        int length = bArr.length - i;
        while (i < bArr.length) {
            bArr[i] = 0;
            i++;
        }
        return length;
    }

    @Override // org.bouncycastle.p083b.p096j.InterfaceC1039a
    /* JADX INFO: renamed from: a */
    public final void mo2557a(SecureRandom secureRandom) {
    }
}
