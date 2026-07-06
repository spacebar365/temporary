package org.bouncycastle.jcajce.provider.keystore.bcfks;

import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyStore$LoadStoreParameter;
import java.security.cert.Certificate;
import java.util.Date;
import java.util.Enumeration;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;

/* JADX INFO: loaded from: classes.dex */
public class BcFKSKeyStoreSpi$Std extends BcFKSKeyStoreSpi {
    public BcFKSKeyStoreSpi$Std() {
        super(new BCJcaJceHelper());
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public /* bridge */ /* synthetic */ Enumeration engineAliases() {
        return super.engineAliases();
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
        return super.engineContainsAlias(str);
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) {
        super.engineDeleteEntry(str);
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public /* bridge */ /* synthetic */ Certificate engineGetCertificate(String str) {
        return super.engineGetCertificate(str);
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public /* bridge */ /* synthetic */ String engineGetCertificateAlias(Certificate certificate) {
        return super.engineGetCertificateAlias(certificate);
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public /* bridge */ /* synthetic */ Certificate[] engineGetCertificateChain(String str) {
        return super.engineGetCertificateChain(str);
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public /* bridge */ /* synthetic */ Date engineGetCreationDate(String str) {
        return super.engineGetCreationDate(str);
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public /* bridge */ /* synthetic */ Key engineGetKey(String str, char[] cArr) {
        return super.engineGetKey(str, cArr);
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public /* bridge */ /* synthetic */ boolean engineIsCertificateEntry(String str) {
        return super.engineIsCertificateEntry(str);
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public /* bridge */ /* synthetic */ boolean engineIsKeyEntry(String str) {
        return super.engineIsKeyEntry(str);
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) {
        super.engineLoad(inputStream, cArr);
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public /* bridge */ /* synthetic */ void engineLoad(KeyStore$LoadStoreParameter keyStore$LoadStoreParameter) {
        super.engineLoad(keyStore$LoadStoreParameter);
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) {
        super.engineSetCertificateEntry(str, certificate);
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) {
        super.engineSetKeyEntry(str, key, cArr, certificateArr);
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) {
        super.engineSetKeyEntry(str, bArr, certificateArr);
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public /* bridge */ /* synthetic */ int engineSize() {
        return super.engineSize();
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) {
        super.engineStore(outputStream, cArr);
    }

    @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
    public /* bridge */ /* synthetic */ void engineStore(KeyStore$LoadStoreParameter keyStore$LoadStoreParameter) {
        super.engineStore(keyStore$LoadStoreParameter);
    }
}
