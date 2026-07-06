package org.bouncycastle.jcajce.provider.asymmetric.ies;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.a.ab;
import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.bn;
import org.bouncycastle.a.g;
import org.bouncycastle.a.m;
import org.bouncycastle.a.q;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;
import org.bouncycastle.c.c.p;

/* JADX INFO: loaded from: classes.dex */
public class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {
    p a;

    private static boolean a(String str) {
        return str == null || str.equals("ASN.1");
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded() {
        try {
            g gVar = new g();
            if (this.a.a() != null) {
                gVar.a(new bn(false, 0, new be(this.a.a())));
            }
            if (this.a.b() != null) {
                gVar.a(new bn(false, 1, new be(this.a.b())));
            }
            gVar.a(new m(this.a.c()));
            if (this.a.e() != null) {
                g gVar2 = new g();
                gVar2.a(new m(this.a.d()));
                gVar2.a(new m(this.a.e()));
                gVar.a(new bi(gVar2));
            }
            return new bi(gVar).a("DER");
        } catch (IOException e) {
            throw new RuntimeException("Error encoding IESParameters");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected byte[] engineGetEncoded(String str) {
        if (a(str) || str.equalsIgnoreCase("X.509")) {
            return engineGetEncoded();
        }
        return null;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        if (!(algorithmParameterSpec instanceof p)) {
            throw new InvalidParameterSpecException("IESParameterSpec required to initialise a IES algorithm parameters object");
        }
        this.a = (p) algorithmParameterSpec;
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr) throws IOException {
        try {
            v vVar = (v) u.b(bArr);
            if (vVar.d() == 1) {
                this.a = new p(null, null, m.a(vVar.a(0)).b().intValue());
                return;
            }
            if (vVar.d() == 2) {
                ab abVarA = ab.a(vVar.a(0));
                if (abVarA.b() == 0) {
                    this.a = new p(q.a(abVarA, false).c(), null, m.a(vVar.a(1)).b().intValue());
                    return;
                } else {
                    this.a = new p(null, q.a(abVarA, false).c(), m.a(vVar.a(1)).b().intValue());
                    return;
                }
            }
            if (vVar.d() == 3) {
                this.a = new p(q.a(ab.a(vVar.a(0)), false).c(), q.a(ab.a(vVar.a(1)), false).c(), m.a(vVar.a(2)).b().intValue());
            } else if (vVar.d() == 4) {
                ab abVarA2 = ab.a(vVar.a(0));
                ab abVarA3 = ab.a(vVar.a(1));
                v vVarA = v.a(vVar.a(3));
                this.a = new p(q.a(abVarA2, false).c(), q.a(abVarA3, false).c(), m.a(vVar.a(2)).b().intValue(), m.a(vVarA.a(0)).b().intValue(), q.a(vVarA.a(1)).c());
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IOException("Not a valid IES Parameter encoding.");
        } catch (ClassCastException e2) {
            throw new IOException("Not a valid IES Parameter encoding.");
        }
    }

    @Override // java.security.AlgorithmParametersSpi
    protected void engineInit(byte[] bArr, String str) throws IOException {
        if (!a(str) && !str.equalsIgnoreCase("X.509")) {
            throw new IOException("Unknown parameter format ".concat(String.valueOf(str)));
        }
        engineInit(bArr);
    }

    @Override // java.security.AlgorithmParametersSpi
    protected String engineToString() {
        return "IES Parameters";
    }

    @Override // java.security.AlgorithmParametersSpi
    protected AlgorithmParameterSpec engineGetParameterSpec(Class cls) throws InvalidParameterSpecException {
        if (cls == null) {
            throw new NullPointerException("argument to getParameterSpec must not be null");
        }
        if (cls == p.class || cls == AlgorithmParameterSpec.class) {
            return this.a;
        }
        throw new InvalidParameterSpecException("unknown parameter spec passed to ElGamal parameters object.");
    }
}
