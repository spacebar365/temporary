package org.bouncycastle.jcajce.provider.keystore.bcfks;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAKey;
import java.security.interfaces.RSAKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.ParseException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.PasswordCallback;
import javax.security.auth.callback.UnsupportedCallbackException;
import org.bouncycastle.jcajce.BCFKSLoadStoreParameter;
import org.bouncycastle.jcajce.BCFKSStoreParameter;
import org.bouncycastle.jcajce.BCLoadStoreParameter;
import org.bouncycastle.jcajce.util.BCJcaJceHelper;
import org.bouncycastle.jcajce.util.DefaultJcaJceHelper;
import org.bouncycastle.jcajce.util.JcaJceHelper;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.C0638l;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p056aa.InterfaceC0513aj;
import org.bouncycastle.p054a.p057b.C0566b;
import org.bouncycastle.p054a.p057b.C0567c;
import org.bouncycastle.p054a.p057b.C0568d;
import org.bouncycastle.p054a.p057b.C0569e;
import org.bouncycastle.p054a.p057b.C0570f;
import org.bouncycastle.p054a.p057b.C0571g;
import org.bouncycastle.p054a.p057b.C0572h;
import org.bouncycastle.p054a.p057b.C0573i;
import org.bouncycastle.p054a.p057b.C0574j;
import org.bouncycastle.p054a.p057b.C0575k;
import org.bouncycastle.p054a.p057b.C0576l;
import org.bouncycastle.p054a.p059d.C0614a;
import org.bouncycastle.p054a.p068m.InterfaceC0641a;
import org.bouncycastle.p054a.p069n.C0648f;
import org.bouncycastle.p054a.p069n.InterfaceC0645c;
import org.bouncycastle.p054a.p070o.InterfaceC0652b;
import org.bouncycastle.p054a.p071p.InterfaceC0654a;
import org.bouncycastle.p054a.p072q.InterfaceC0656a;
import org.bouncycastle.p054a.p073r.InterfaceC0659b;
import org.bouncycastle.p054a.p074s.C0666f;
import org.bouncycastle.p054a.p074s.C0667g;
import org.bouncycastle.p054a.p074s.C0668h;
import org.bouncycastle.p054a.p074s.C0671k;
import org.bouncycastle.p054a.p074s.C0672l;
import org.bouncycastle.p054a.p074s.C0676p;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p082z.C0759a;
import org.bouncycastle.p054a.p082z.C0766g;
import org.bouncycastle.p054a.p082z.InterfaceC0760aa;
import org.bouncycastle.p083b.AbstractC0804ad;
import org.bouncycastle.p083b.C1124l;
import org.bouncycastle.p083b.p086b.C0846w;
import org.bouncycastle.p083b.p086b.C0847x;
import org.bouncycastle.p083b.p090f.C0952aa;
import org.bouncycastle.p083b.p090f.C0977x;
import org.bouncycastle.p083b.p097k.C1076ba;
import org.bouncycastle.p083b.p102o.AbstractC1168e;
import org.bouncycastle.p083b.p102o.C1167d;
import org.bouncycastle.p083b.p102o.C1172i;
import org.bouncycastle.p103c.p104a.InterfaceC1185a;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: loaded from: classes.dex */
class BcFKSKeyStoreSpi extends KeyStoreSpi {

    /* JADX INFO: renamed from: a */
    private static final Map<String, C0653p> f6022a = new HashMap();

    /* JADX INFO: renamed from: b */
    private static final Map<C0653p, String> f6023b = new HashMap();

    /* JADX INFO: renamed from: e */
    private static final BigInteger f6024e;

    /* JADX INFO: renamed from: f */
    private static final BigInteger f6025f;

    /* JADX INFO: renamed from: g */
    private static final BigInteger f6026g;

    /* JADX INFO: renamed from: h */
    private static final BigInteger f6027h;

    /* JADX INFO: renamed from: i */
    private static final BigInteger f6028i;

    /* JADX INFO: renamed from: c */
    private PublicKey f6029c;

    /* JADX INFO: renamed from: d */
    private BCFKSLoadStoreParameter.CertChainValidator f6030d;

    /* JADX INFO: renamed from: j */
    private final JcaJceHelper f6031j;

    /* JADX INFO: renamed from: m */
    private C0759a f6034m;

    /* JADX INFO: renamed from: n */
    private C0668h f6035n;

    /* JADX INFO: renamed from: o */
    private C0759a f6036o;

    /* JADX INFO: renamed from: p */
    private Date f6037p;

    /* JADX INFO: renamed from: q */
    private Date f6038q;

    /* JADX INFO: renamed from: k */
    private final Map<String, C0569e> f6032k = new HashMap();

    /* JADX INFO: renamed from: l */
    private final Map<String, PrivateKey> f6033l = new HashMap();

    /* JADX INFO: renamed from: r */
    private C0653p f6039r = InterfaceC0652b.f2468P;

    public static class Def extends BcFKSKeyStoreSpi {
        public Def() {
            super(new DefaultJcaJceHelper());
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
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws ExtKeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws NoSuchAlgorithmException, IOException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException {
            super.engineStore(loadStoreParameter);
        }
    }

    public static class DefShared extends SharedKeyStoreSpi {
        public DefShared() {
            super(new DefaultJcaJceHelper());
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ Enumeration engineAliases() {
            return super.engineAliases();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ boolean engineContainsAlias(String str) {
            return super.engineContainsAlias(str);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
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

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
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
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
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
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineStore(loadStoreParameter);
        }
    }

    private static class ExtKeyStoreException extends KeyStoreException {

        /* JADX INFO: renamed from: a */
        private final Throwable f6042a;

        ExtKeyStoreException(String str, Throwable th) {
            super(str);
            this.f6042a = th;
        }

        @Override // java.lang.Throwable
        public Throwable getCause() {
            return this.f6042a;
        }
    }

    public static class Std extends BcFKSKeyStoreSpi {
        public Std() {
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
        public /* bridge */ /* synthetic */ void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
            super.engineLoad(inputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws ExtKeyStoreException {
            super.engineSetKeyEntry(str, bArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ int engineSize() {
            return super.engineSize();
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(OutputStream outputStream, char[] cArr) throws NoSuchAlgorithmException, IOException {
            super.engineStore(outputStream, cArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException {
            super.engineStore(loadStoreParameter);
        }
    }

    public static class StdShared extends SharedKeyStoreSpi {
        public StdShared() {
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

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineDeleteEntry(String str) throws KeyStoreException {
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

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
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
        public /* bridge */ /* synthetic */ void engineLoad(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineLoad(loadStoreParameter);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            super.engineSetCertificateEntry(str, certificate);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            super.engineSetKeyEntry(str, key, cArr, certificateArr);
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.SharedKeyStoreSpi, org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public /* bridge */ /* synthetic */ void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
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
        public /* bridge */ /* synthetic */ void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) {
            super.engineStore(loadStoreParameter);
        }
    }

    static {
        f6022a.put("DESEDE", InterfaceC0659b.f2574h);
        f6022a.put("TRIPLEDES", InterfaceC0659b.f2574h);
        f6022a.put("TDEA", InterfaceC0659b.f2574h);
        f6022a.put("HMACSHA1", InterfaceC0674n.f2622K);
        f6022a.put("HMACSHA224", InterfaceC0674n.f2623L);
        f6022a.put("HMACSHA256", InterfaceC0674n.f2624M);
        f6022a.put("HMACSHA384", InterfaceC0674n.f2625N);
        f6022a.put("HMACSHA512", InterfaceC0674n.f2626O);
        f6022a.put("SEED", InterfaceC0641a.f2400a);
        f6022a.put("CAMELLIA.128", InterfaceC0656a.f2559a);
        f6022a.put("CAMELLIA.192", InterfaceC0656a.f2560b);
        f6022a.put("CAMELLIA.256", InterfaceC0656a.f2561c);
        f6022a.put("ARIA.128", InterfaceC0654a.f2539h);
        f6022a.put("ARIA.192", InterfaceC0654a.f2544m);
        f6022a.put("ARIA.256", InterfaceC0654a.f2549r);
        f6023b.put(InterfaceC0674n.f2733f_, "RSA");
        f6023b.put(InterfaceC0513aj.f1952k, "EC");
        f6023b.put(InterfaceC0659b.f2578l, "DH");
        f6023b.put(InterfaceC0674n.f2748s, "DH");
        f6023b.put(InterfaceC0513aj.f1921U, "DSA");
        f6024e = BigInteger.valueOf(0L);
        f6025f = BigInteger.valueOf(1L);
        f6026g = BigInteger.valueOf(2L);
        f6027h = BigInteger.valueOf(3L);
        f6028i = BigInteger.valueOf(4L);
    }

    BcFKSKeyStoreSpi(JcaJceHelper jcaJceHelper) {
        this.f6031j = jcaJceHelper;
    }

    /* JADX INFO: renamed from: a */
    private Certificate m4398a(Object obj) {
        if (this.f6031j != null) {
            try {
                return this.f6031j.mo4526g("X.509").generateCertificate(new ByteArrayInputStream(C0766g.m1793a(obj).mo1578k()));
            } catch (Exception e) {
                return null;
            }
        }
        try {
            return CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(C0766g.m1793a(obj).mo1578k()));
        } catch (Exception e2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static Date m4399a(C0569e c0569e, Date date) {
        try {
            return c0569e.m1429a().m1546c();
        } catch (ParseException e) {
            return date;
        }
    }

    /* JADX INFO: renamed from: a */
    private Cipher m4400a(String str, byte[] bArr) throws InvalidKeyException {
        Cipher cipherMo4520a = this.f6031j.mo4520a(str);
        cipherMo4520a.init(1, new SecretKeySpec(bArr, "AES"));
        return cipherMo4520a;
    }

    /* JADX INFO: renamed from: a */
    private C0566b m4401a(C0759a c0759a, char[] cArr) throws NoSuchAlgorithmException, IOException {
        C0569e[] c0569eArr = (C0569e[]) this.f6032k.values().toArray(new C0569e[this.f6032k.size()]);
        C0668h c0668hM4404a = m4404a(this.f6035n, 32);
        if (cArr == null) {
            cArr = new char[0];
        }
        byte[] bArrM4410a = m4410a(c0668hM4404a, "STORE_ENCRYPTION", cArr, 32);
        C0572h c0572h = new C0572h(c0759a, this.f6037p, this.f6038q, new C0570f(c0569eArr));
        try {
            if (!this.f6039r.equals(InterfaceC0652b.f2468P)) {
                return new C0566b(new C0759a(InterfaceC0674n.f2612A, new C0671k(c0668hM4404a, new C0667g(InterfaceC0652b.f2469Q))), m4400a("AESKWP", bArrM4410a).doFinal(c0572h.mo1578k()));
            }
            Cipher cipherM4400a = m4400a("AES/CCM/NoPadding", bArrM4410a);
            return new C0566b(new C0759a(InterfaceC0674n.f2612A, new C0671k(c0668hM4404a, new C0667g(InterfaceC0652b.f2468P, C0614a.m1496a(cipherM4400a.getParameters().getEncoded())))), cipherM4400a.doFinal(c0572h.mo1578k()));
        } catch (InvalidKeyException e) {
            throw new IOException(e.toString());
        } catch (NoSuchProviderException e2) {
            throw new IOException(e2.toString());
        } catch (BadPaddingException e3) {
            throw new IOException(e3.toString());
        } catch (IllegalBlockSizeException e4) {
            throw new IOException(e4.toString());
        } catch (NoSuchPaddingException e5) {
            throw new NoSuchAlgorithmException(e5.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private static C0567c m4402a(C0666f c0666f, Certificate[] certificateArr) {
        C0766g[] c0766gArr = new C0766g[certificateArr.length];
        for (int i = 0; i != certificateArr.length; i++) {
            c0766gArr[i] = C0766g.m1793a(certificateArr[i].getEncoded());
        }
        return new C0567c(c0666f, c0766gArr);
    }

    /* JADX INFO: renamed from: a */
    private static C0759a m4406a(Key key, BCFKSLoadStoreParameter.SignatureAlgorithm signatureAlgorithm) throws IOException {
        if (key == null) {
            return null;
        }
        if (key instanceof InterfaceC1185a) {
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withECDSA) {
                return new C0759a(InterfaceC0513aj.f1957p);
            }
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA3_512withECDSA) {
                return new C0759a(InterfaceC0652b.f2484ae);
            }
        }
        if (key instanceof DSAKey) {
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withDSA) {
                return new C0759a(InterfaceC0652b.f2475W);
            }
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA3_512withDSA) {
                return new C0759a(InterfaceC0652b.f2480aa);
            }
        }
        if (key instanceof RSAKey) {
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA512withRSA) {
                return new C0759a(InterfaceC0674n.f2743n_, C0579bc.f2112a);
            }
            if (signatureAlgorithm == BCFKSLoadStoreParameter.SignatureAlgorithm.SHA3_512withRSA) {
                return new C0759a(InterfaceC0652b.f2488ai, C0579bc.f2112a);
            }
        }
        throw new IOException("unknown signature algorithm");
    }

    /* JADX INFO: renamed from: a */
    private void m4407a(InterfaceC0618f interfaceC0618f, C0576l c0576l, PublicKey publicKey) throws SignatureException, InvalidKeyException, IOException {
        Signature signatureMo4525f = this.f6031j.mo4525f(c0576l.m1455b().m1783a().m1593b());
        signatureMo4525f.initVerify(publicKey);
        signatureMo4525f.update(interfaceC0618f.mo1358i().m1577a("DER"));
        if (!signatureMo4525f.verify(c0576l.m1454a().m1473c())) {
            throw new IOException("BCFKS KeyStore corrupted: signature calculation failed");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4408a(byte[] bArr, C0574j c0574j, char[] cArr) throws IOException {
        if (!C1535a.m4085b(m4411a(bArr, c0574j.m1447a(), c0574j.m1448b(), cArr), c0574j.m1449c())) {
            throw new IOException("BCFKS KeyStore corrupted: MAC calculation failed");
        }
    }

    /* JADX INFO: renamed from: a */
    private byte[] m4409a(String str, C0759a c0759a, char[] cArr, byte[] bArr) throws IOException {
        Cipher cipherMo4520a;
        AlgorithmParameters algorithmParametersMo4522c;
        if (!c0759a.m1783a().equals(InterfaceC0674n.f2612A)) {
            throw new IOException("BCFKS KeyStore cannot recognize protection algorithm.");
        }
        C0671k c0671kM1641a = C0671k.m1641a(c0759a.m1784b());
        C0667g c0667gM1643b = c0671kM1641a.m1643b();
        try {
            if (c0667gM1643b.m1629a().equals(InterfaceC0652b.f2468P)) {
                cipherMo4520a = this.f6031j.mo4520a("AES/CCM/NoPadding");
                algorithmParametersMo4522c = this.f6031j.mo4522c("CCM");
                algorithmParametersMo4522c.init(C0614a.m1496a(c0667gM1643b.m1630b()).mo1578k());
            } else {
                if (!c0667gM1643b.m1629a().equals(InterfaceC0652b.f2469Q)) {
                    throw new IOException("BCFKS KeyStore cannot recognize protection encryption algorithm.");
                }
                cipherMo4520a = this.f6031j.mo4520a("AESKWP");
                algorithmParametersMo4522c = null;
            }
            C0668h c0668hM1642a = c0671kM1641a.m1642a();
            if (cArr == null) {
                cArr = new char[0];
            }
            cipherMo4520a.init(2, new SecretKeySpec(m4410a(c0668hM1642a, str, cArr, 32), "AES"), algorithmParametersMo4522c);
            return cipherMo4520a.doFinal(bArr);
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m4410a(C0668h c0668h, String str, char[] cArr, int i) throws IOException {
        int iIntValue;
        byte[] bArrM1896c = AbstractC0804ad.m1896c(cArr);
        byte[] bArrM1896c2 = AbstractC0804ad.m1896c(str.toCharArray());
        if (InterfaceC0645c.f2419L.equals(c0668h.m1632a())) {
            C0648f c0648fM1571a = C0648f.m1571a(c0668h.m1633b());
            if (c0648fM1571a.m1576e() != null) {
                iIntValue = c0648fM1571a.m1576e().intValue();
            } else {
                if (i == -1) {
                    throw new IOException("no keyLength found in ScryptParams");
                }
                iIntValue = i;
            }
            return C0952aa.m2413a(C1535a.m4095d(bArrM1896c, bArrM1896c2), c0648fM1571a.m1572a(), c0648fM1571a.m1573b().intValue(), c0648fM1571a.m1574c().intValue(), c0648fM1571a.m1574c().intValue(), iIntValue);
        }
        if (!c0668h.m1632a().equals(InterfaceC0674n.f2613B)) {
            throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD.");
        }
        C0672l c0672lM1644a = C0672l.m1644a(c0668h.m1633b());
        if (c0672lM1644a.m1647c() != null) {
            i = c0672lM1644a.m1647c().intValue();
        } else if (i == -1) {
            throw new IOException("no keyLength found in PBKDF2Params");
        }
        if (c0672lM1644a.m1649e().m1783a().equals(InterfaceC0674n.f2626O)) {
            C0977x c0977x = new C0977x(new C0847x());
            c0977x.m1899a(C1535a.m4095d(bArrM1896c, bArrM1896c2), c0672lM1644a.m1645a(), c0672lM1644a.m1646b().intValue());
            return ((C1076ba) c0977x.mo1897a(i * 8)).m2603a();
        }
        if (!c0672lM1644a.m1649e().m1783a().equals(InterfaceC0652b.f2505r)) {
            throw new IOException("BCFKS KeyStore: unrecognized MAC PBKD PRF: " + c0672lM1644a.m1649e().m1783a());
        }
        C0977x c0977x2 = new C0977x(new C0846w(512));
        c0977x2.m1899a(C1535a.m4095d(bArrM1896c, bArrM1896c2), c0672lM1644a.m1645a(), c0672lM1644a.m1646b().intValue());
        return ((C1076ba) c0977x2.mo1897a(i * 8)).m2603a();
    }

    /* JADX INFO: renamed from: a */
    private byte[] m4411a(byte[] bArr, C0759a c0759a, C0668h c0668h, char[] cArr) throws IOException {
        String strM1593b = c0759a.m1783a().m1593b();
        Mac macMo4521b = this.f6031j.mo4521b(strM1593b);
        try {
            if (cArr == null) {
                cArr = new char[0];
            }
            macMo4521b.init(new SecretKeySpec(m4410a(c0668h, "INTEGRITY_CHECK", cArr, -1), strM1593b));
            return macMo4521b.doFinal(bArr);
        } catch (InvalidKeyException e) {
            throw new IOException("Cannot set up MAC calculation: " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: a */
    private static char[] m4412a(KeyStore.LoadStoreParameter loadStoreParameter) throws IOException {
        KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            return null;
        }
        if (protectionParameter instanceof KeyStore.PasswordProtection) {
            return ((KeyStore.PasswordProtection) protectionParameter).getPassword();
        }
        if (!(protectionParameter instanceof KeyStore.CallbackHandlerProtection)) {
            throw new IllegalArgumentException("no support for protection parameter of type " + protectionParameter.getClass().getName());
        }
        CallbackHandler callbackHandler = ((KeyStore.CallbackHandlerProtection) protectionParameter).getCallbackHandler();
        PasswordCallback passwordCallback = new PasswordCallback("password: ", false);
        try {
            callbackHandler.handle(new Callback[]{passwordCallback});
            return passwordCallback.getPassword();
        } catch (UnsupportedCallbackException e) {
            throw new IllegalArgumentException("PasswordCallback not recognised: " + e.getMessage(), e);
        }
    }

    @Override // java.security.KeyStoreSpi
    public Enumeration<String> engineAliases() {
        final Iterator it = new HashSet(this.f6032k.keySet()).iterator();
        return new Enumeration() { // from class: org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.1
            @Override // java.util.Enumeration
            public boolean hasMoreElements() {
                return it.hasNext();
            }

            @Override // java.util.Enumeration
            public Object nextElement() {
                return it.next();
            }
        };
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineContainsAlias(String str) {
        if (str == null) {
            throw new NullPointerException("alias value is null");
        }
        return this.f6032k.containsKey(str);
    }

    @Override // java.security.KeyStoreSpi
    public void engineDeleteEntry(String str) {
        if (this.f6032k.get(str) == null) {
            return;
        }
        this.f6033l.remove(str);
        this.f6032k.remove(str);
        this.f6038q = new Date();
    }

    @Override // java.security.KeyStoreSpi
    public Certificate engineGetCertificate(String str) {
        C0569e c0569e = this.f6032k.get(str);
        if (c0569e != null) {
            if (c0569e.m1433e().equals(f6025f) || c0569e.m1433e().equals(f6027h)) {
                return m4398a(C0567c.m1422a(c0569e.m1430b()).m1423a()[0]);
            }
            if (c0569e.m1433e().equals(f6024e)) {
                return m4398a(c0569e.m1430b());
            }
        }
        return null;
    }

    @Override // java.security.KeyStoreSpi
    public String engineGetCertificateAlias(Certificate certificate) {
        if (certificate == null) {
            return null;
        }
        try {
            byte[] encoded = certificate.getEncoded();
            for (String str : this.f6032k.keySet()) {
                C0569e c0569e = this.f6032k.get(str);
                if (c0569e.m1433e().equals(f6024e)) {
                    if (C1535a.m4076a(c0569e.m1430b(), encoded)) {
                        return str;
                    }
                } else if (c0569e.m1433e().equals(f6025f) || c0569e.m1433e().equals(f6027h)) {
                    try {
                        if (C1535a.m4076a(C0567c.m1422a(c0569e.m1430b()).m1423a()[0].mo1358i().mo1578k(), encoded)) {
                            return str;
                        }
                    } catch (IOException e) {
                    }
                }
            }
            return null;
        } catch (CertificateEncodingException e2) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.security.KeyStoreSpi
    public Certificate[] engineGetCertificateChain(String str) {
        C0569e c0569e = this.f6032k.get(str);
        if (c0569e == null || !(c0569e.m1433e().equals(f6025f) || c0569e.m1433e().equals(f6027h))) {
            return null;
        }
        C0766g[] c0766gArrM1423a = C0567c.m1422a(c0569e.m1430b()).m1423a();
        X509Certificate[] x509CertificateArr = new X509Certificate[c0766gArrM1423a.length];
        for (int i = 0; i != x509CertificateArr.length; i++) {
            x509CertificateArr[i] = m4398a(c0766gArrM1423a[i]);
        }
        return x509CertificateArr;
    }

    @Override // java.security.KeyStoreSpi
    public Date engineGetCreationDate(String str) {
        C0569e c0569e = this.f6032k.get(str);
        if (c0569e == null) {
            return null;
        }
        try {
            return c0569e.m1432d().m1546c();
        } catch (ParseException e) {
            return new Date();
        }
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsCertificateEntry(String str) {
        C0569e c0569e = this.f6032k.get(str);
        if (c0569e != null) {
            return c0569e.m1433e().equals(f6024e);
        }
        return false;
    }

    @Override // java.security.KeyStoreSpi
    public boolean engineIsKeyEntry(String str) {
        C0569e c0569e = this.f6032k.get(str);
        if (c0569e == null) {
            return false;
        }
        BigInteger bigIntegerM1433e = c0569e.m1433e();
        return bigIntegerM1433e.equals(f6025f) || bigIntegerM1433e.equals(f6026g) || bigIntegerM1433e.equals(f6027h) || bigIntegerM1433e.equals(f6028i);
    }

    @Override // java.security.KeyStoreSpi
    public void engineLoad(InputStream inputStream, char[] cArr) throws IOException {
        C0759a c0759aM1455b;
        C0572h c0572hM1438a;
        this.f6032k.clear();
        this.f6033l.clear();
        this.f6037p = null;
        this.f6038q = null;
        this.f6034m = null;
        if (inputStream == null) {
            Date date = new Date();
            this.f6037p = date;
            this.f6038q = date;
            this.f6029c = null;
            this.f6030d = null;
            this.f6034m = new C0759a(InterfaceC0674n.f2626O, C0579bc.f2112a);
            this.f6035n = m4403a(InterfaceC0674n.f2613B, 64);
            return;
        }
        try {
            C0571g c0571gM1435a = C0571g.m1435a(new C0638l(inputStream).m1560b());
            C0573i c0573iM1436a = c0571gM1435a.m1436a();
            if (c0573iM1436a.m1444a() == 0) {
                C0574j c0574jM1446a = C0574j.m1446a(c0573iM1436a.m1445b());
                this.f6034m = c0574jM1446a.m1447a();
                this.f6035n = c0574jM1446a.m1448b();
                C0759a c0759a = this.f6034m;
                try {
                    m4408a(c0571gM1435a.m1437b().mo1358i().mo1578k(), c0574jM1446a, cArr);
                    c0759aM1455b = c0759a;
                } catch (NoSuchProviderException e) {
                    throw new IOException(e.getMessage());
                }
            } else {
                if (c0573iM1436a.m1444a() != 1) {
                    throw new IOException("BCFKS KeyStore unable to recognize integrity check.");
                }
                C0576l c0576lM1453a = C0576l.m1453a(c0573iM1436a.m1445b());
                c0759aM1455b = c0576lM1453a.m1455b();
                try {
                    C0766g[] c0766gArrM1456c = c0576lM1453a.m1456c();
                    if (this.f6030d == null) {
                        m4407a(c0571gM1435a.m1437b(), c0576lM1453a, this.f6029c);
                    } else {
                        if (c0766gArrM1456c == null) {
                            throw new IOException("validator specified but no certifcates in store");
                        }
                        CertificateFactory certificateFactoryMo4526g = this.f6031j.mo4526g("X.509");
                        X509Certificate[] x509CertificateArr = new X509Certificate[c0766gArrM1456c.length];
                        for (int i = 0; i != x509CertificateArr.length; i++) {
                            x509CertificateArr[i] = (X509Certificate) certificateFactoryMo4526g.generateCertificate(new ByteArrayInputStream(c0766gArrM1456c[i].mo1578k()));
                        }
                        if (!this.f6030d.m4176a()) {
                            throw new IOException("certificate chain in key store signature not valid");
                        }
                        m4407a(c0571gM1435a.m1437b(), c0576lM1453a, x509CertificateArr[0].getPublicKey());
                    }
                } catch (GeneralSecurityException e2) {
                    throw new IOException("error verifying signature: " + e2.getMessage(), e2);
                }
            }
            InterfaceC0618f interfaceC0618fM1437b = c0571gM1435a.m1437b();
            if (interfaceC0618fM1437b instanceof C0566b) {
                C0566b c0566b = (C0566b) interfaceC0618fM1437b;
                c0572hM1438a = C0572h.m1438a(m4409a("STORE_ENCRYPTION", c0566b.m1421b(), cArr, c0566b.m1420a().mo1410c()));
            } else {
                c0572hM1438a = C0572h.m1438a(interfaceC0618fM1437b);
            }
            try {
                this.f6037p = c0572hM1438a.m1439a().m1546c();
                this.f6038q = c0572hM1438a.m1441c().m1546c();
                if (!c0572hM1438a.m1440b().equals(c0759aM1455b)) {
                    throw new IOException("BCFKS KeyStore storeData integrity algorithm does not match store integrity algorithm.");
                }
                Iterator<InterfaceC0618f> it = c0572hM1438a.m1442d().iterator();
                while (it.hasNext()) {
                    C0569e c0569eM1428a = C0569e.m1428a(it.next());
                    this.f6032k.put(c0569eM1428a.m1431c(), c0569eM1428a);
                }
            } catch (ParseException e3) {
                throw new IOException("BCFKS KeyStore unable to parse store data information.");
            }
        } catch (Exception e4) {
            throw new IOException(e4.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
        Date dateM4399a;
        C0569e c0569e = this.f6032k.get(str);
        Date date = new Date();
        if (c0569e == null) {
            dateM4399a = date;
        } else {
            if (!c0569e.m1433e().equals(f6024e)) {
                throw new KeyStoreException("BCFKS KeyStore already has a key entry with alias ".concat(String.valueOf(str)));
            }
            dateM4399a = m4399a(c0569e, date);
        }
        try {
            this.f6032k.put(str, new C0569e(f6024e, str, dateM4399a, date, certificate.getEncoded()));
            this.f6038q = date;
        } catch (CertificateEncodingException e) {
            throw new ExtKeyStoreException("BCFKS KeyStore unable to handle certificate: " + e.getMessage(), e);
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
        C0575k c0575k;
        C0568d c0568d;
        C0666f c0666f;
        Date date = new Date();
        C0569e c0569e = this.f6032k.get(str);
        Date dateM4399a = c0569e != null ? m4399a(c0569e, date) : date;
        this.f6033l.remove(str);
        if (key instanceof PrivateKey) {
            if (certificateArr == null) {
                throw new KeyStoreException("BCFKS KeyStore requires a certificate chain for private key storage.");
            }
            try {
                byte[] encoded = key.getEncoded();
                C0668h c0668hM4403a = m4403a(InterfaceC0674n.f2613B, 32);
                if (cArr == null) {
                    cArr = new char[0];
                }
                byte[] bArrM4410a = m4410a(c0668hM4403a, "PRIVATE_KEY_ENCRYPTION", cArr, 32);
                if (this.f6039r.equals(InterfaceC0652b.f2468P)) {
                    Cipher cipherM4400a = m4400a("AES/CCM/NoPadding", bArrM4410a);
                    c0666f = new C0666f(new C0759a(InterfaceC0674n.f2612A, new C0671k(c0668hM4403a, new C0667g(InterfaceC0652b.f2468P, C0614a.m1496a(cipherM4400a.getParameters().getEncoded())))), cipherM4400a.doFinal(encoded));
                } else {
                    c0666f = new C0666f(new C0759a(InterfaceC0674n.f2612A, new C0671k(c0668hM4403a, new C0667g(InterfaceC0652b.f2469Q))), m4400a("AESKWP", bArrM4410a).doFinal(encoded));
                }
                this.f6032k.put(str, new C0569e(f6025f, str, dateM4399a, date, m4402a(c0666f, certificateArr).mo1578k()));
            } catch (Exception e) {
                throw new ExtKeyStoreException("BCFKS KeyStore exception storing private key: " + e.toString(), e);
            }
        } else {
            if (!(key instanceof SecretKey)) {
                throw new KeyStoreException("BCFKS KeyStore unable to recognize key.");
            }
            if (certificateArr != null) {
                throw new KeyStoreException("BCFKS KeyStore cannot store certificate chain with secret key.");
            }
            try {
                byte[] encoded2 = key.getEncoded();
                C0668h c0668hM4403a2 = m4403a(InterfaceC0674n.f2613B, 32);
                if (cArr == null) {
                    cArr = new char[0];
                }
                byte[] bArrM4410a2 = m4410a(c0668hM4403a2, "SECRET_KEY_ENCRYPTION", cArr, 32);
                String strM4163b = C1560k.m4163b(key.getAlgorithm());
                if (strM4163b.indexOf("AES") >= 0) {
                    c0575k = new C0575k(InterfaceC0652b.f2506s, encoded2);
                } else {
                    C0653p c0653p = f6022a.get(strM4163b);
                    if (c0653p != null) {
                        c0575k = new C0575k(c0653p, encoded2);
                    } else {
                        C0653p c0653p2 = f6022a.get(strM4163b + "." + (encoded2.length * 8));
                        if (c0653p2 == null) {
                            throw new KeyStoreException("BCFKS KeyStore cannot recognize secret key (" + strM4163b + ") for storage.");
                        }
                        c0575k = new C0575k(c0653p2, encoded2);
                    }
                }
                if (this.f6039r.equals(InterfaceC0652b.f2468P)) {
                    Cipher cipherM4400a2 = m4400a("AES/CCM/NoPadding", bArrM4410a2);
                    c0568d = new C0568d(new C0759a(InterfaceC0674n.f2612A, new C0671k(c0668hM4403a2, new C0667g(InterfaceC0652b.f2468P, C0614a.m1496a(cipherM4400a2.getParameters().getEncoded())))), cipherM4400a2.doFinal(c0575k.mo1578k()));
                } else {
                    c0568d = new C0568d(new C0759a(InterfaceC0674n.f2612A, new C0671k(c0668hM4403a2, new C0667g(InterfaceC0652b.f2469Q))), m4400a("AESKWP", bArrM4410a2).doFinal(c0575k.mo1578k()));
                }
                this.f6032k.put(str, new C0569e(f6026g, str, dateM4399a, date, c0568d.mo1578k()));
            } catch (Exception e2) {
                throw new ExtKeyStoreException("BCFKS KeyStore exception storing private key: " + e2.toString(), e2);
            }
        }
        this.f6038q = date;
    }

    @Override // java.security.KeyStoreSpi
    public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws ExtKeyStoreException {
        Date date = new Date();
        C0569e c0569e = this.f6032k.get(str);
        Date dateM4399a = c0569e != null ? m4399a(c0569e, date) : date;
        if (certificateArr != null) {
            try {
                C0666f c0666fM1625a = C0666f.m1625a(bArr);
                try {
                    this.f6033l.remove(str);
                    this.f6032k.put(str, new C0569e(f6027h, str, dateM4399a, date, m4402a(c0666fM1625a, certificateArr).mo1578k()));
                } catch (Exception e) {
                    throw new ExtKeyStoreException("BCFKS KeyStore exception storing protected private key: " + e.toString(), e);
                }
            } catch (Exception e2) {
                throw new ExtKeyStoreException("BCFKS KeyStore private key encoding must be an EncryptedPrivateKeyInfo.", e2);
            }
        } else {
            try {
                this.f6032k.put(str, new C0569e(f6028i, str, dateM4399a, date, bArr));
            } catch (Exception e3) {
                throw new ExtKeyStoreException("BCFKS KeyStore exception storing protected private key: " + e3.toString(), e3);
            }
        }
        this.f6038q = date;
    }

    @Override // java.security.KeyStoreSpi
    public int engineSize() {
        return this.f6032k.size();
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(OutputStream outputStream, char[] cArr) throws NoSuchAlgorithmException, IOException {
        if (this.f6037p == null) {
            throw new IOException("KeyStore not initialized");
        }
        C0566b c0566bM4401a = m4401a(this.f6034m, cArr);
        if (InterfaceC0645c.f2419L.equals(this.f6035n.m1632a())) {
            this.f6035n = m4404a(this.f6035n, C0648f.m1571a(this.f6035n.m1633b()).m1576e().intValue());
        } else {
            this.f6035n = m4404a(this.f6035n, C0672l.m1644a(this.f6035n.m1633b()).m1647c().intValue());
        }
        try {
            outputStream.write(new C0571g(c0566bM4401a, new C0573i(new C0574j(this.f6034m, this.f6035n, m4411a(c0566bM4401a.mo1578k(), this.f6034m, this.f6035n, cArr)))).mo1578k());
            outputStream.flush();
        } catch (NoSuchProviderException e) {
            throw new IOException("cannot calculate mac: " + e.getMessage());
        }
    }

    @Override // java.security.KeyStoreSpi
    public void engineStore(KeyStore.LoadStoreParameter loadStoreParameter) throws NoSuchAlgorithmException, IOException {
        C0576l c0576l;
        if (loadStoreParameter == null) {
            throw new IllegalArgumentException("'parameter' arg cannot be null");
        }
        if (loadStoreParameter instanceof BCFKSStoreParameter) {
            BCFKSStoreParameter bCFKSStoreParameter = (BCFKSStoreParameter) loadStoreParameter;
            char[] cArrM4412a = m4412a(loadStoreParameter);
            this.f6035n = m4405a(bCFKSStoreParameter.m4178b());
            engineStore(bCFKSStoreParameter.m4177a(), cArrM4412a);
            return;
        }
        if (!(loadStoreParameter instanceof BCFKSLoadStoreParameter)) {
            if (!(loadStoreParameter instanceof BCLoadStoreParameter)) {
                throw new IllegalArgumentException("no support for 'parameter' of type " + loadStoreParameter.getClass().getName());
            }
            engineStore(((BCLoadStoreParameter) loadStoreParameter).m4179h(), m4412a(loadStoreParameter));
            return;
        }
        BCFKSLoadStoreParameter bCFKSLoadStoreParameter = (BCFKSLoadStoreParameter) loadStoreParameter;
        if (bCFKSLoadStoreParameter.m4173e() == null) {
            char[] cArrM4412a2 = m4412a((KeyStore.LoadStoreParameter) bCFKSLoadStoreParameter);
            this.f6035n = m4405a(bCFKSLoadStoreParameter.m4169a());
            if (bCFKSLoadStoreParameter.m4170b() == BCFKSLoadStoreParameter.EncryptionAlgorithm.AES256_CCM) {
                this.f6039r = InterfaceC0652b.f2468P;
            } else {
                this.f6039r = InterfaceC0652b.f2469Q;
            }
            if (bCFKSLoadStoreParameter.m4171c() == BCFKSLoadStoreParameter.MacAlgorithm.HmacSHA512) {
                this.f6034m = new C0759a(InterfaceC0674n.f2626O, C0579bc.f2112a);
            } else {
                this.f6034m = new C0759a(InterfaceC0652b.f2505r, C0579bc.f2112a);
            }
            engineStore(bCFKSLoadStoreParameter.m4179h(), cArrM4412a2);
            return;
        }
        this.f6036o = m4406a(bCFKSLoadStoreParameter.m4173e(), bCFKSLoadStoreParameter.m4172d());
        this.f6035n = m4405a(bCFKSLoadStoreParameter.m4169a());
        if (bCFKSLoadStoreParameter.m4170b() == BCFKSLoadStoreParameter.EncryptionAlgorithm.AES256_CCM) {
            this.f6039r = InterfaceC0652b.f2468P;
        } else {
            this.f6039r = InterfaceC0652b.f2469Q;
        }
        if (bCFKSLoadStoreParameter.m4171c() == BCFKSLoadStoreParameter.MacAlgorithm.HmacSHA512) {
            this.f6034m = new C0759a(InterfaceC0674n.f2626O, C0579bc.f2112a);
        } else {
            this.f6034m = new C0759a(InterfaceC0652b.f2505r, C0579bc.f2112a);
        }
        C0566b c0566bM4401a = m4401a(this.f6036o, m4412a((KeyStore.LoadStoreParameter) bCFKSLoadStoreParameter));
        try {
            Signature signatureMo4525f = this.f6031j.mo4525f(this.f6036o.m1783a().m1593b());
            signatureMo4525f.initSign((PrivateKey) bCFKSLoadStoreParameter.m4173e());
            signatureMo4525f.update(c0566bM4401a.mo1578k());
            X509Certificate[] x509CertificateArrM4174f = bCFKSLoadStoreParameter.m4174f();
            if (x509CertificateArrM4174f != null) {
                C0766g[] c0766gArr = new C0766g[x509CertificateArrM4174f.length];
                for (int i = 0; i != c0766gArr.length; i++) {
                    c0766gArr[i] = C0766g.m1793a(x509CertificateArrM4174f[i].getEncoded());
                }
                c0576l = new C0576l(this.f6036o, c0766gArr, signatureMo4525f.sign());
            } else {
                c0576l = new C0576l(this.f6036o, signatureMo4525f.sign());
            }
            bCFKSLoadStoreParameter.m4179h().write(new C0571g(c0566bM4401a, new C0573i(c0576l)).mo1578k());
            bCFKSLoadStoreParameter.m4179h().flush();
        } catch (GeneralSecurityException e) {
            throw new IOException("error creating signature: " + e.getMessage(), e);
        }
    }

    private static class SharedKeyStoreSpi extends BcFKSKeyStoreSpi implements InterfaceC0674n, InterfaceC0760aa {

        /* JADX INFO: renamed from: bO */
        private final Map<String, byte[]> f6043bO;

        /* JADX INFO: renamed from: bP */
        private final byte[] f6044bP;

        public SharedKeyStoreSpi(JcaJceHelper jcaJceHelper) {
            super(jcaJceHelper);
            try {
                this.f6044bP = new byte[32];
                jcaJceHelper.mo4527h("DEFAULT").nextBytes(this.f6044bP);
                this.f6043bO = new HashMap();
            } catch (GeneralSecurityException e) {
                throw new IllegalArgumentException("can't create random - " + e.toString());
            }
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineDeleteEntry(String str) throws KeyStoreException {
            throw new KeyStoreException("delete operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetCertificateEntry(String str, Certificate certificate) throws KeyStoreException {
            throw new KeyStoreException("set operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, Key key, char[] cArr, Certificate[] certificateArr) throws KeyStoreException {
            throw new KeyStoreException("set operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public void engineSetKeyEntry(String str, byte[] bArr, Certificate[] certificateArr) throws KeyStoreException {
            throw new KeyStoreException("set operation not supported in shared mode");
        }

        @Override // org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi, java.security.KeyStoreSpi
        public Key engineGetKey(String str, char[] cArr) throws UnrecoverableKeyException {
            try {
                byte[] bArrM2413a = C0952aa.m2413a(cArr != null ? C1535a.m4095d(C1560k.m4162a(cArr), C1560k.m4161a(str)) : C1535a.m4095d(this.f6044bP, C1560k.m4161a(str)), this.f6044bP, 16384, 8, 1, 32);
                if (this.f6043bO.containsKey(str) && !C1535a.m4085b(this.f6043bO.get(str), bArrM2413a)) {
                    throw new UnrecoverableKeyException("unable to recover key (" + str + ")");
                }
                Key keyEngineGetKey = super.engineGetKey(str, cArr);
                if (keyEngineGetKey != null && !this.f6043bO.containsKey(str)) {
                    this.f6043bO.put(str, bArrM2413a);
                }
                return keyEngineGetKey;
            } catch (InvalidKeyException e) {
                throw new UnrecoverableKeyException("unable to recover key (" + str + "): " + e.getMessage());
            }
        }
    }

    @Override // java.security.KeyStoreSpi
    public Key engineGetKey(String str, char[] cArr) throws UnrecoverableKeyException {
        C0569e c0569e = this.f6032k.get(str);
        if (c0569e == null) {
            return null;
        }
        if (!c0569e.m1433e().equals(f6025f) && !c0569e.m1433e().equals(f6027h)) {
            if (!c0569e.m1433e().equals(f6026g) && !c0569e.m1433e().equals(f6028i)) {
                throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover secret key (" + str + "): type not recognized");
            }
            C0568d c0568dM1425a = C0568d.m1425a(c0569e.m1430b());
            try {
                C0575k c0575kM1450a = C0575k.m1450a(m4409a("SECRET_KEY_ENCRYPTION", c0568dM1425a.m1426a(), cArr, c0568dM1425a.m1427b()));
                return this.f6031j.mo4524e(c0575kM1450a.m1452b().m1593b()).generateSecret(new SecretKeySpec(c0575kM1450a.m1451a(), c0575kM1450a.m1452b().m1593b()));
            } catch (Exception e) {
                throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover secret key (" + str + "): " + e.getMessage());
            }
        }
        PrivateKey privateKey = this.f6033l.get(str);
        if (privateKey != null) {
            return privateKey;
        }
        C0666f c0666fM1625a = C0666f.m1625a(C0567c.m1422a(c0569e.m1430b()).m1424b());
        try {
            C0676p c0676pM1656a = C0676p.m1656a(m4409a("PRIVATE_KEY_ENCRYPTION", c0666fM1625a.m1626a(), cArr, c0666fM1625a.m1627b()));
            JcaJceHelper jcaJceHelper = this.f6031j;
            C0653p c0653pM1783a = c0676pM1656a.m1658b().m1783a();
            String strM1593b = f6023b.get(c0653pM1783a);
            if (strM1593b == null) {
                strM1593b = c0653pM1783a.m1593b();
            }
            PrivateKey privateKeyGeneratePrivate = jcaJceHelper.mo4523d(strM1593b).generatePrivate(new PKCS8EncodedKeySpec(c0676pM1656a.mo1578k()));
            this.f6033l.put(str, privateKeyGeneratePrivate);
            return privateKeyGeneratePrivate;
        } catch (Exception e2) {
            throw new UnrecoverableKeyException("BCFKS KeyStore unable to recover private key (" + str + "): " + e2.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:48:0x011a  */
    @Override // java.security.KeyStoreSpi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void engineLoad(java.security.KeyStore.LoadStoreParameter r7) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bouncycastle.jcajce.provider.keystore.bcfks.BcFKSKeyStoreSpi.engineLoad(java.security.KeyStore$LoadStoreParameter):void");
    }

    /* JADX INFO: renamed from: a */
    private static C0668h m4405a(AbstractC1168e abstractC1168e) {
        if (!InterfaceC0645c.f2419L.equals(abstractC1168e.m2803d())) {
            C1167d c1167d = (C1167d) abstractC1168e;
            byte[] bArr = new byte[c1167d.m2795c()];
            C1124l.m2709a().nextBytes(bArr);
            return new C0668h(InterfaceC0674n.f2613B, new C0672l(bArr, c1167d.m2793a(), 64, c1167d.m2794b()));
        }
        C1172i c1172i = (C1172i) abstractC1168e;
        byte[] bArr2 = new byte[c1172i.m2820e()];
        C1124l.m2709a().nextBytes(bArr2);
        return new C0668h(InterfaceC0645c.f2419L, new C0648f(bArr2, c1172i.m2817a(), c1172i.m2818b(), c1172i.m2819c()));
    }

    /* JADX INFO: renamed from: a */
    private static C0668h m4404a(C0668h c0668h, int i) {
        if (InterfaceC0645c.f2419L.equals(c0668h.m1632a())) {
            C0648f c0648fM1571a = C0648f.m1571a(c0668h.m1633b());
            byte[] bArr = new byte[c0648fM1571a.m1572a().length];
            C1124l.m2709a().nextBytes(bArr);
            return new C0668h(InterfaceC0645c.f2419L, new C0648f(bArr, c0648fM1571a.m1573b(), c0648fM1571a.m1574c(), c0648fM1571a.m1575d(), BigInteger.valueOf(i)));
        }
        C0672l c0672lM1644a = C0672l.m1644a(c0668h.m1633b());
        byte[] bArr2 = new byte[c0672lM1644a.m1645a().length];
        C1124l.m2709a().nextBytes(bArr2);
        return new C0668h(InterfaceC0674n.f2613B, new C0672l(bArr2, c0672lM1644a.m1646b().intValue(), i, c0672lM1644a.m1649e()));
    }

    /* JADX INFO: renamed from: a */
    private static C0668h m4403a(C0653p c0653p, int i) {
        byte[] bArr = new byte[64];
        C1124l.m2709a().nextBytes(bArr);
        if (InterfaceC0674n.f2613B.equals(c0653p)) {
            return new C0668h(InterfaceC0674n.f2613B, new C0672l(bArr, 51200, i, new C0759a(InterfaceC0674n.f2626O, C0579bc.f2112a)));
        }
        throw new IllegalStateException("unknown derivation algorithm: ".concat(String.valueOf(c0653p)));
    }
}
