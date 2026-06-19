package org.bouncycastle.p083b.p096j;

import java.security.SecureRandom;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.C1179v;

/* JADX INFO: renamed from: org.bouncycastle.b.j.b */
/* JADX INFO: loaded from: classes.dex */
public final class C1040b implements InterfaceC1039a {

    /* JADX INFO: renamed from: a */
    SecureRandom f4369a;

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
            bArr[i] = (byte) this.f4369a.nextInt();
            i++;
        }
        bArr[i] = length;
        return length;
    }

    @Override // org.bouncycastle.p083b.p096j.InterfaceC1039a
    /* JADX INFO: renamed from: a */
    public final void mo2557a(SecureRandom secureRandom) {
        if (secureRandom != null) {
            this.f4369a = secureRandom;
        } else {
            this.f4369a = C1124l.m2709a();
        }
    }
}
