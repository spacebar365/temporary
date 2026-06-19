package org.bouncycastle.p103c.p106c;

import java.security.spec.EncodedKeySpec;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.c.c.r */
/* JADX INFO: loaded from: classes.dex */
public class C1221r extends EncodedKeySpec {

    /* JADX INFO: renamed from: a */
    private static final String[] f4742a = {"ssh-rsa", "ssh-ed25519", "ssh-dss"};

    /* JADX INFO: renamed from: b */
    private final String f4743b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1221r(byte[] bArr) {
        super(bArr);
        int i = ((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i + 4 >= bArr.length) {
            throw new IllegalArgumentException("invalid public key blob: type field longer than blob");
        }
        this.f4743b = C1560k.m4164b(C1535a.m4090c(bArr, 4, i + 4));
        if (this.f4743b.startsWith("ecdsa")) {
            return;
        }
        for (int i2 = 0; i2 < f4742a.length; i2++) {
            if (f4742a[i2].equals(this.f4743b)) {
                return;
            }
        }
        throw new IllegalArgumentException("unrecognised public key type " + this.f4743b);
    }

    @Override // java.security.spec.EncodedKeySpec
    public String getFormat() {
        return "OpenSSH";
    }
}
