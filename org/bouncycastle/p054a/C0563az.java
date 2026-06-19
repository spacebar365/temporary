package org.bouncycastle.p054a;

import java.util.Date;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.a.az */
/* JADX INFO: loaded from: classes.dex */
public final class C0563az extends C0636k {
    public C0563az(Date date) {
        super(date);
    }

    public C0563az(byte[] bArr) {
        super(bArr);
    }

    /* JADX INFO: renamed from: l */
    private byte[] m1418l() {
        if (this.f2370a[this.f2370a.length - 1] != 90) {
            return this.f2370a;
        }
        if (!m1549j()) {
            byte[] bArr = new byte[this.f2370a.length + 4];
            System.arraycopy(this.f2370a, 0, bArr, 0, this.f2370a.length - 1);
            System.arraycopy(C1560k.m4168d("0000Z"), 0, bArr, this.f2370a.length - 1, 5);
            return bArr;
        }
        if (!m1548f()) {
            byte[] bArr2 = new byte[this.f2370a.length + 2];
            System.arraycopy(this.f2370a, 0, bArr2, 0, this.f2370a.length - 1);
            System.arraycopy(C1560k.m4168d("00Z"), 0, bArr2, this.f2370a.length - 1, 3);
            return bArr2;
        }
        if (!m1547d()) {
            return this.f2370a;
        }
        int length = this.f2370a.length - 2;
        while (length > 0 && this.f2370a[length] == 48) {
            length--;
        }
        if (this.f2370a[length] == 46) {
            byte[] bArr3 = new byte[length + 1];
            System.arraycopy(this.f2370a, 0, bArr3, 0, length);
            bArr3[length] = 90;
            return bArr3;
        }
        byte[] bArr4 = new byte[length + 2];
        System.arraycopy(this.f2370a, 0, bArr4, 0, length + 1);
        bArr4[length + 1] = 90;
        return bArr4;
    }

    @Override // org.bouncycastle.p054a.C0636k, org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) {
        c0660s.m1605a(24, m1418l());
    }

    @Override // org.bouncycastle.p054a.C0636k, org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        int length = m1418l().length;
        return length + C0612ch.m1488a(length) + 1;
    }
}
