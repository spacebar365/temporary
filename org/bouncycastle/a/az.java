package org.bouncycastle.a;

import java.util.Date;

/* JADX INFO: loaded from: classes.dex */
public final class az extends k {
    public az(Date date) {
        super(date);
    }

    public az(byte[] bArr) {
        super(bArr);
    }

    private byte[] l() {
        if (this.a[this.a.length - 1] != 90) {
            return this.a;
        }
        if (!j()) {
            byte[] bArr = new byte[this.a.length + 4];
            System.arraycopy(this.a, 0, bArr, 0, this.a.length - 1);
            System.arraycopy(org.bouncycastle.f.k.d("0000Z"), 0, bArr, this.a.length - 1, 5);
            return bArr;
        }
        if (!f()) {
            byte[] bArr2 = new byte[this.a.length + 2];
            System.arraycopy(this.a, 0, bArr2, 0, this.a.length - 1);
            System.arraycopy(org.bouncycastle.f.k.d("00Z"), 0, bArr2, this.a.length - 1, 3);
            return bArr2;
        }
        if (!d()) {
            return this.a;
        }
        int length = this.a.length - 2;
        while (length > 0 && this.a[length] == 48) {
            length--;
        }
        if (this.a[length] == 46) {
            byte[] bArr3 = new byte[length + 1];
            System.arraycopy(this.a, 0, bArr3, 0, length);
            bArr3[length] = 90;
            return bArr3;
        }
        byte[] bArr4 = new byte[length + 2];
        System.arraycopy(this.a, 0, bArr4, 0, length + 1);
        bArr4[length + 1] = 90;
        return bArr4;
    }

    @Override // org.bouncycastle.a.k, org.bouncycastle.a.u
    final void a(s sVar) {
        sVar.a(24, l());
    }

    @Override // org.bouncycastle.a.k, org.bouncycastle.a.u
    final int e() {
        int length = l().length;
        return length + ch.a(length) + 1;
    }
}
