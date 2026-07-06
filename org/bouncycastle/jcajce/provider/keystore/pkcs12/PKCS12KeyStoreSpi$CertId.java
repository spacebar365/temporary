package org.bouncycastle.jcajce.provider.keystore.pkcs12;

import java.security.PublicKey;
import org.bouncycastle.f.a;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class PKCS12KeyStoreSpi$CertId {
    byte[] a;
    final /* synthetic */ PKCS12KeyStoreSpi b;

    PKCS12KeyStoreSpi$CertId(PKCS12KeyStoreSpi pKCS12KeyStoreSpi, PublicKey publicKey) {
        this.b = pKCS12KeyStoreSpi;
        this.a = PKCS12KeyStoreSpi.a(publicKey).a();
    }

    PKCS12KeyStoreSpi$CertId(PKCS12KeyStoreSpi pKCS12KeyStoreSpi, byte[] bArr) {
        this.b = pKCS12KeyStoreSpi;
        this.a = bArr;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof PKCS12KeyStoreSpi$CertId) {
            return a.a(this.a, ((PKCS12KeyStoreSpi$CertId) obj).a);
        }
        return false;
    }

    public int hashCode() {
        return a.a(this.a);
    }
}
