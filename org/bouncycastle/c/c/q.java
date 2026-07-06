package org.bouncycastle.c.c;

import java.security.spec.EncodedKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class q extends EncodedKeySpec {
    private final String a;

    public q(byte[] bArr) {
        super(bArr);
        if (bArr[0] == 48) {
            this.a = "ASN.1";
        } else {
            if (bArr[0] != 111) {
                throw new IllegalArgumentException("unknown byte encoding");
            }
            this.a = "OpenSSH";
        }
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return this.a;
    }
}
