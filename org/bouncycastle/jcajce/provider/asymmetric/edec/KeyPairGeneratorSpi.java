package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;
import org.bouncycastle.p054a.p063h.InterfaceC0628a;
import org.bouncycastle.p083b.C0818b;
import org.bouncycastle.p083b.InterfaceC0850c;
import org.bouncycastle.p083b.p090f.C0953ab;
import org.bouncycastle.p083b.p090f.C0954ac;
import org.bouncycastle.p083b.p090f.C0966m;
import org.bouncycastle.p083b.p090f.C0967n;
import org.bouncycastle.p083b.p097k.C1054af;
import org.bouncycastle.p083b.p097k.C1057ai;
import org.bouncycastle.p083b.p097k.C1092bq;
import org.bouncycastle.p083b.p097k.C1095bt;
import org.bouncycastle.p103c.p106c.C1205b;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGeneratorSpi {

    /* JADX INFO: renamed from: a */
    private int f5807a;

    /* JADX INFO: renamed from: b */
    private InterfaceC0850c f5808b;

    /* JADX INFO: renamed from: c */
    private boolean f5809c;

    /* JADX INFO: renamed from: d */
    private SecureRandom f5810d;

    public static final class Ed25519 extends KeyPairGeneratorSpi {
        public Ed25519() {
            super(1, new C0966m());
        }
    }

    public static final class Ed448 extends KeyPairGeneratorSpi {
        public Ed448() {
            super(0, new C0967n());
        }
    }

    public static final class EdDSA extends KeyPairGeneratorSpi {
        public EdDSA() {
            super(-1, null);
        }
    }

    public static final class X25519 extends KeyPairGeneratorSpi {
        public X25519() {
            super(3, new C0953ab());
        }
    }

    public static final class X448 extends KeyPairGeneratorSpi {
        public X448() {
            super(2, new C0954ac());
        }
    }

    public static final class XDH extends KeyPairGeneratorSpi {
        public XDH() {
            super(-2, null);
        }
    }

    KeyPairGeneratorSpi(int i, InterfaceC0850c interfaceC0850c) {
        this.f5807a = i;
        this.f5808b = interfaceC0850c;
    }

    /* JADX INFO: renamed from: a */
    private void m4271a(int i) throws InvalidAlgorithmParameterException {
        if (this.f5807a != i) {
            if (this.f5807a == 1 || this.f5807a == 0) {
                throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
            }
            if (this.f5807a == -1 && i != 1 && i != 0) {
                throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
            }
            if (this.f5807a == 3 || this.f5807a == 2) {
                throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
            }
            if (this.f5807a == -2 && i != 3 && i != 2) {
                throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
            }
            this.f5807a = i;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m4272a(String str) throws InvalidAlgorithmParameterException {
        if (str.equalsIgnoreCase("Ed448") || str.equals(InterfaceC0628a.f2268e.m1593b())) {
            m4271a(0);
            this.f5808b = new C0967n();
            m4273b(0);
            return;
        }
        if (str.equalsIgnoreCase("Ed25519") || str.equals(InterfaceC0628a.f2267d.m1593b())) {
            m4271a(1);
            this.f5808b = new C0966m();
            m4273b(1);
        } else if (str.equalsIgnoreCase("X448") || str.equals(InterfaceC0628a.f2266c.m1593b())) {
            m4271a(2);
            this.f5808b = new C0954ac();
            m4273b(2);
        } else if (str.equalsIgnoreCase("X25519") || str.equals(InterfaceC0628a.f2265b.m1593b())) {
            m4271a(3);
            this.f5808b = new C0953ab();
            m4273b(3);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m4273b(int i) {
        this.f5809c = true;
        if (this.f5810d == null) {
            this.f5810d = new SecureRandom();
        }
        switch (i) {
            case -2:
            case 3:
                this.f5808b.mo2109a(new C1092bq(this.f5810d));
                break;
            case -1:
            case 1:
                this.f5808b.mo2109a(new C1054af(this.f5810d));
                break;
            case 0:
                this.f5808b.mo2109a(new C1057ai(this.f5810d));
                break;
            case 2:
                this.f5808b.mo2109a(new C1095bt(this.f5810d));
                break;
        }
    }

    @Override // java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (this.f5808b == null) {
            throw new IllegalStateException("generator not correctly initialized");
        }
        if (!this.f5809c) {
            m4273b(this.f5807a);
        }
        C0818b c0818bMo2108a = this.f5808b.mo2108a();
        switch (this.f5807a) {
            case 0:
                return new KeyPair(new BCEdDSAPublicKey(c0818bMo2108a.m1919a()), new BCEdDSAPrivateKey(c0818bMo2108a.m1920b()));
            case 1:
                return new KeyPair(new BCEdDSAPublicKey(c0818bMo2108a.m1919a()), new BCEdDSAPrivateKey(c0818bMo2108a.m1920b()));
            case 2:
                return new KeyPair(new BCXDHPublicKey(c0818bMo2108a.m1919a()), new BCXDHPrivateKey(c0818bMo2108a.m1920b()));
            case 3:
                return new KeyPair(new BCXDHPublicKey(c0818bMo2108a.m1919a()), new BCXDHPrivateKey(c0818bMo2108a.m1920b()));
            default:
                throw new IllegalStateException("generator not correctly initialized");
        }
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.f5810d = secureRandom;
        switch (i) {
            case 255:
            case 256:
                switch (this.f5807a) {
                    case -2:
                    case 3:
                        m4273b(3);
                        return;
                    case -1:
                    case 1:
                        m4273b(1);
                        return;
                    case 0:
                    case 2:
                    default:
                        throw new InvalidParameterException("key size not configurable");
                }
            case 448:
                switch (this.f5807a) {
                    case -2:
                    case 2:
                        m4273b(2);
                        return;
                    case -1:
                    case 0:
                        m4273b(0);
                        return;
                    case 1:
                    default:
                        throw new InvalidParameterException("key size not configurable");
                }
            default:
                throw new InvalidParameterException("unknown key size");
        }
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        this.f5810d = secureRandom;
        if (algorithmParameterSpec instanceof ECGenParameterSpec) {
            m4272a(((ECGenParameterSpec) algorithmParameterSpec).getName());
            return;
        }
        if (algorithmParameterSpec instanceof C1205b) {
            m4272a(((C1205b) algorithmParameterSpec).m2866a());
        } else if (algorithmParameterSpec instanceof EdDSAParameterSpec) {
            m4272a(((EdDSAParameterSpec) algorithmParameterSpec).m4491a());
        } else {
            if (!(algorithmParameterSpec instanceof XDHParameterSpec)) {
                throw new InvalidAlgorithmParameterException("invalid parameterSpec: ".concat(String.valueOf(algorithmParameterSpec)));
            }
            m4272a(((XDHParameterSpec) algorithmParameterSpec).m4518a());
        }
    }
}
