package org.bouncycastle.p103c.p106c;

import java.security.spec.EncodedKeySpec;

/* JADX INFO: renamed from: org.bouncycastle.c.c.q */
/* JADX INFO: loaded from: classes.dex */
public class C1220q extends EncodedKeySpec {

    /* JADX INFO: renamed from: a */
    private final String f4741a;

    public C1220q(byte[] bArr) {
        super(bArr);
        if (bArr[0] == 48) {
            this.f4741a = "ASN.1";
        } else {
            if (bArr[0] != 111) {
                throw new IllegalArgumentException("unknown byte encoding");
            }
            this.f4741a = "OpenSSH";
        }
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return this.f4741a;
    }
}
