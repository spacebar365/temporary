package org.bouncycastle.c.c;

import java.security.spec.EncodedKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class r extends EncodedKeySpec {
    private static final String[] a = {"ssh-rsa", "ssh-ed25519", "ssh-dss"};
    private final String b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(byte[] bArr) {
        super(bArr);
        int i = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i + 4 >= bArr.length) {
            throw new IllegalArgumentException("invalid public key blob: type field longer than blob");
        }
        this.b = org.bouncycastle.f.k.b(org.bouncycastle.f.a.c(bArr, 4, i + 4));
        if (this.b.startsWith("ecdsa")) {
            return;
        }
        for (int i2 = 0; i2 < a.length; i2++) {
            if (a[i2].equals(this.b)) {
                return;
            }
        }
        throw new IllegalArgumentException("unrecognised public key type " + this.b);
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return "OpenSSH";
    }
}
