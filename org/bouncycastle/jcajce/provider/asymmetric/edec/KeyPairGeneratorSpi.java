package org.bouncycastle.jcajce.provider.asymmetric.edec;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import org.bouncycastle.a.h.a;
import org.bouncycastle.b.b;
import org.bouncycastle.b.c;
import org.bouncycastle.b.f.ab;
import org.bouncycastle.b.f.ac;
import org.bouncycastle.b.f.m;
import org.bouncycastle.b.f.n;
import org.bouncycastle.b.k.af;
import org.bouncycastle.b.k.ai;
import org.bouncycastle.b.k.bq;
import org.bouncycastle.b.k.bt;
import org.bouncycastle.jcajce.spec.EdDSAParameterSpec;
import org.bouncycastle.jcajce.spec.XDHParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public class KeyPairGeneratorSpi extends java.security.KeyPairGeneratorSpi {
    private int a;
    private c b;
    private boolean c;
    private SecureRandom d;

    KeyPairGeneratorSpi(int i, c cVar) {
        this.a = i;
        this.b = cVar;
    }

    private void a(int i) throws InvalidAlgorithmParameterException {
        if (this.a != i) {
            if (this.a == 1 || this.a == 0) {
                throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
            }
            if (this.a == -1 && i != 1 && i != 0) {
                throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
            }
            if (this.a == 3 || this.a == 2) {
                throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
            }
            if (this.a == -2 && i != 3 && i != 2) {
                throw new InvalidAlgorithmParameterException("parameterSpec for wrong curve type");
            }
            this.a = i;
        }
    }

    private void a(String str) throws InvalidAlgorithmParameterException {
        if (str.equalsIgnoreCase("Ed448") || str.equals(a.e.b())) {
            a(0);
            this.b = new n();
            b(0);
            return;
        }
        if (str.equalsIgnoreCase("Ed25519") || str.equals(a.d.b())) {
            a(1);
            this.b = new m();
            b(1);
        } else if (str.equalsIgnoreCase("X448") || str.equals(a.c.b())) {
            a(2);
            this.b = new ac();
            b(2);
        } else if (str.equalsIgnoreCase("X25519") || str.equals(a.b.b())) {
            a(3);
            this.b = new ab();
            b(3);
        }
    }

    private void b(int i) {
        this.c = true;
        if (this.d == null) {
            this.d = new SecureRandom();
        }
        switch (i) {
            case -2:
            case 3:
                this.b.a(new bq(this.d));
                break;
            case -1:
            case 1:
                this.b.a(new af(this.d));
                break;
            case 0:
                this.b.a(new ai(this.d));
                break;
            case 2:
                this.b.a(new bt(this.d));
                break;
        }
    }

    @Override // java.security.KeyPairGeneratorSpi
    public KeyPair generateKeyPair() {
        if (this.b == null) {
            throw new IllegalStateException("generator not correctly initialized");
        }
        if (!this.c) {
            b(this.a);
        }
        b bVarA = this.b.a();
        switch (this.a) {
            case 0:
                return new KeyPair(new BCEdDSAPublicKey(bVarA.a()), new BCEdDSAPrivateKey(bVarA.b()));
            case 1:
                return new KeyPair(new BCEdDSAPublicKey(bVarA.a()), new BCEdDSAPrivateKey(bVarA.b()));
            case 2:
                return new KeyPair(new BCXDHPublicKey(bVarA.a()), new BCXDHPrivateKey(bVarA.b()));
            case 3:
                return new KeyPair(new BCXDHPublicKey(bVarA.a()), new BCXDHPrivateKey(bVarA.b()));
            default:
                throw new IllegalStateException("generator not correctly initialized");
        }
    }

    @Override // java.security.KeyPairGeneratorSpi
    public void initialize(int i, SecureRandom secureRandom) {
        this.d = secureRandom;
        switch (i) {
            case 255:
            case 256:
                switch (this.a) {
                    case -2:
                    case 3:
                        b(3);
                        return;
                    case -1:
                    case 1:
                        b(1);
                        return;
                    case 0:
                    case 2:
                    default:
                        throw new InvalidParameterException("key size not configurable");
                }
            case 448:
                switch (this.a) {
                    case -2:
                    case 2:
                        b(2);
                        return;
                    case -1:
                    case 0:
                        b(0);
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
        this.d = secureRandom;
        if (algorithmParameterSpec instanceof ECGenParameterSpec) {
            a(((ECGenParameterSpec) algorithmParameterSpec).getName());
            return;
        }
        if (algorithmParameterSpec instanceof org.bouncycastle.c.c.b) {
            a(((org.bouncycastle.c.c.b) algorithmParameterSpec).a());
        } else if (algorithmParameterSpec instanceof EdDSAParameterSpec) {
            a(((EdDSAParameterSpec) algorithmParameterSpec).a());
        } else {
            if (!(algorithmParameterSpec instanceof XDHParameterSpec)) {
                throw new InvalidAlgorithmParameterException("invalid parameterSpec: ".concat(String.valueOf(algorithmParameterSpec)));
            }
            a(((XDHParameterSpec) algorithmParameterSpec).a());
        }
    }
}
