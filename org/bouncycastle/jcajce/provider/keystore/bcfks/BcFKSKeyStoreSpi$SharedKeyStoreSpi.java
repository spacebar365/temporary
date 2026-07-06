package org.bouncycastle.jcajce.provider.keystore.bcfks;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStoreException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.a.s.n;
import org.bouncycastle.a.z.aa;
import org.bouncycastle.f.a;
import org.bouncycastle.f.k;
import org.bouncycastle.jcajce.util.JcaJceHelper;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class BcFKSKeyStoreSpi$SharedKeyStoreSpi extends BcFKSKeyStoreSpi implements n, aa {
    private final Map<String, byte[]> bO;
    private final byte[] bP;

    public BcFKSKeyStoreSpi$SharedKeyStoreSpi(JcaJceHelper jcaJceHelper) {
        super(jcaJceHelper);
        try {
            this.bP = new byte[32];
            jcaJceHelper.h("DEFAULT").nextBytes(this.bP);
            this.bO = new HashMap();
        } catch (GeneralSecurityException e) {
            throw new IllegalArgumentException("can't create random - " + e.toString());
        }
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) {
        throw new KeyStoreException("delete operation not supported in shared mode");
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) {
        throw new KeyStoreException("set operation not supported in shared mode");
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
        throw new KeyStoreException("set operation not supported in shared mode");
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        throw new KeyStoreException("set operation not supported in shared mode");
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws UnrecoverableKeyException {
        try {
            byte[] bArrA = org.bouncycastle.b.f.aa.a(cArr != null ? a.d(k.a(cArr), k.a(str)) : a.d(this.bP, k.a(str)), this.bP, 16384, 8, 1, 32);
            if (this.bO.containsKey(str) && !a.b(this.bO.get(str), bArrA)) {
                throw new UnrecoverableKeyException("unable to recover key (" + str + ")");
            }
            Key keyEngineGetKey = super.engineGetKey(str, cArr);
            if (keyEngineGetKey != null && !this.bO.containsKey(str)) {
                this.bO.put(str, bArrA);
            }
            return keyEngineGetKey;
        } catch (InvalidKeyException e) {
            throw new UnrecoverableKeyException("unable to recover key (" + str + "): " + e.getMessage());
        }
    }
}
