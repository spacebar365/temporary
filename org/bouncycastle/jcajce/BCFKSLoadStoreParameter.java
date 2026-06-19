package org.bouncycastle.jcajce;

import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.cert.X509Certificate;
import org.bouncycastle.p083b.p102o.AbstractC1168e;
import org.bouncycastle.p083b.p102o.C1167d;

/* JADX INFO: loaded from: classes.dex */
public class BCFKSLoadStoreParameter extends BCLoadStoreParameter {

    /* JADX INFO: renamed from: a */
    private final AbstractC1168e f5515a;

    /* JADX INFO: renamed from: b */
    private final EncryptionAlgorithm f5516b;

    /* JADX INFO: renamed from: c */
    private final MacAlgorithm f5517c;

    /* JADX INFO: renamed from: d */
    private final SignatureAlgorithm f5518d;

    /* JADX INFO: renamed from: e */
    private final Key f5519e;

    /* JADX INFO: renamed from: f */
    private final X509Certificate[] f5520f;

    /* JADX INFO: renamed from: g */
    private final CertChainValidator f5521g;

    public static class Builder {

        /* JADX INFO: renamed from: a */
        private final OutputStream f5522a;

        /* JADX INFO: renamed from: b */
        private final InputStream f5523b;

        /* JADX INFO: renamed from: c */
        private final KeyStore.ProtectionParameter f5524c;

        /* JADX INFO: renamed from: d */
        private final Key f5525d;

        /* JADX INFO: renamed from: e */
        private AbstractC1168e f5526e;

        /* JADX INFO: renamed from: f */
        private EncryptionAlgorithm f5527f;

        /* JADX INFO: renamed from: g */
        private MacAlgorithm f5528g;

        /* JADX INFO: renamed from: h */
        private SignatureAlgorithm f5529h;

        /* JADX INFO: renamed from: i */
        private X509Certificate[] f5530i;

        public Builder() {
            this((byte) 0);
        }

        private Builder(byte b) {
            this.f5526e = new C1167d.a().m2799a().m2801b().m2800a(C1167d.f4654c).m2802c();
            this.f5527f = EncryptionAlgorithm.AES256_CCM;
            this.f5528g = MacAlgorithm.HmacSHA512;
            this.f5529h = SignatureAlgorithm.SHA512withECDSA;
            this.f5530i = null;
            this.f5523b = null;
            this.f5522a = null;
            this.f5524c = null;
            this.f5525d = null;
        }
    }

    public interface CertChainValidator {
        /* JADX INFO: renamed from: a */
        boolean m4176a();
    }

    public enum EncryptionAlgorithm {
        AES256_CCM,
        AES256_KWP
    }

    public enum MacAlgorithm {
        HmacSHA512,
        HmacSHA3_512
    }

    public enum SignatureAlgorithm {
        SHA512withDSA,
        SHA3_512withDSA,
        SHA512withECDSA,
        SHA3_512withECDSA,
        SHA512withRSA,
        SHA3_512withRSA
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC1168e m4169a() {
        return this.f5515a;
    }

    /* JADX INFO: renamed from: b */
    public final EncryptionAlgorithm m4170b() {
        return this.f5516b;
    }

    /* JADX INFO: renamed from: c */
    public final MacAlgorithm m4171c() {
        return this.f5517c;
    }

    /* JADX INFO: renamed from: d */
    public final SignatureAlgorithm m4172d() {
        return this.f5518d;
    }

    /* JADX INFO: renamed from: e */
    public final Key m4173e() {
        return this.f5519e;
    }

    /* JADX INFO: renamed from: f */
    public final X509Certificate[] m4174f() {
        return this.f5520f;
    }

    /* JADX INFO: renamed from: g */
    public final CertChainValidator m4175g() {
        return this.f5521g;
    }
}
