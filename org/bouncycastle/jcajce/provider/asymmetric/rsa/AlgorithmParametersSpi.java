package org.bouncycastle.jcajce.provider.asymmetric.rsa;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;
import org.bouncycastle.jcajce.provider.util.DigestFactory;
import org.bouncycastle.jcajce.util.MessageDigestUtils;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.C0579bc;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0640m;
import org.bouncycastle.p054a.p074s.C0678r;
import org.bouncycastle.p054a.p074s.C0681u;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;
import org.bouncycastle.p054a.p082z.C0759a;

/* JADX INFO: loaded from: classes.dex */
public abstract class AlgorithmParametersSpi extends java.security.AlgorithmParametersSpi {

    public static class OAEP extends AlgorithmParametersSpi {

        /* JADX INFO: renamed from: a */
        OAEPParameterSpec f5850a;

        @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi
        /* JADX INFO: renamed from: a */
        protected final AlgorithmParameterSpec mo4289a(Class cls) throws InvalidParameterSpecException {
            if (cls == OAEPParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return this.f5850a;
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to OAEP parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            try {
                return new C0678r(new C0759a(DigestFactory.m4481b(this.f5850a.getDigestAlgorithm()), C0579bc.f2112a), new C0759a(InterfaceC0674n.f2738j_, new C0759a(DigestFactory.m4481b(((MGF1ParameterSpec) this.f5850a.getMGFParameters()).getDigestAlgorithm()), C0579bc.f2112a)), new C0759a(InterfaceC0674n.f2740k_, new C0581be(((PSource.PSpecified) this.f5850a.getPSource()).getValue()))).m1577a("DER");
            } catch (IOException e) {
                throw new RuntimeException("Error encoding OAEPParameters");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) {
            if (m4288a(str) || str.equalsIgnoreCase("X.509")) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof OAEPParameterSpec)) {
                throw new InvalidParameterSpecException("OAEPParameterSpec required to initialise an OAEP algorithm parameters object");
            }
            this.f5850a = (OAEPParameterSpec) algorithmParameterSpec;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) throws IOException {
            try {
                C0678r c0678rM1664a = C0678r.m1664a(bArr);
                if (!c0678rM1664a.m1666b().m1783a().equals(InterfaceC0674n.f2738j_)) {
                    throw new IOException("unknown mask generation function: " + c0678rM1664a.m1666b().m1783a());
                }
                this.f5850a = new OAEPParameterSpec(MessageDigestUtils.m4528a(c0678rM1664a.m1665a().m1783a()), OAEPParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(MessageDigestUtils.m4528a(C0759a.m1781a(c0678rM1664a.m1666b().m1784b()).m1783a())), new PSource.PSpecified(AbstractC0655q.m1596a(c0678rM1664a.m1667c().m1784b()).mo1410c()));
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new IOException("Not a valid OAEP Parameter encoding.");
            } catch (ClassCastException e2) {
                throw new IOException("Not a valid OAEP Parameter encoding.");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) throws IOException {
            if (!str.equalsIgnoreCase("X.509") && !str.equalsIgnoreCase("ASN.1")) {
                throw new IOException("Unknown parameter format ".concat(String.valueOf(str)));
            }
            engineInit(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "OAEP Parameters";
        }
    }

    public static class PSS extends AlgorithmParametersSpi {

        /* JADX INFO: renamed from: a */
        PSSParameterSpec f5851a;

        @Override // org.bouncycastle.jcajce.provider.asymmetric.rsa.AlgorithmParametersSpi
        /* JADX INFO: renamed from: a */
        protected final AlgorithmParameterSpec mo4289a(Class cls) throws InvalidParameterSpecException {
            if (cls == PSSParameterSpec.class || cls == AlgorithmParameterSpec.class) {
                return this.f5851a;
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to PSS parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            PSSParameterSpec pSSParameterSpec = this.f5851a;
            return new C0681u(new C0759a(DigestFactory.m4481b(pSSParameterSpec.getDigestAlgorithm()), C0579bc.f2112a), new C0759a(InterfaceC0674n.f2738j_, new C0759a(DigestFactory.m4481b(((MGF1ParameterSpec) pSSParameterSpec.getMGFParameters()).getDigestAlgorithm()), C0579bc.f2112a)), new C0640m(pSSParameterSpec.getSaltLength()), new C0640m(pSSParameterSpec.getTrailerField())).m1577a("DER");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) {
            if (str.equalsIgnoreCase("X.509") || str.equalsIgnoreCase("ASN.1")) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof PSSParameterSpec)) {
                throw new InvalidParameterSpecException("PSSParameterSpec required to initialise an PSS algorithm parameters object");
            }
            this.f5851a = (PSSParameterSpec) algorithmParameterSpec;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) throws IOException {
            try {
                C0681u c0681uM1680a = C0681u.m1680a(bArr);
                if (!c0681uM1680a.m1682b().m1783a().equals(InterfaceC0674n.f2738j_)) {
                    throw new IOException("unknown mask generation function: " + c0681uM1680a.m1682b().m1783a());
                }
                this.f5851a = new PSSParameterSpec(MessageDigestUtils.m4528a(c0681uM1680a.m1681a().m1783a()), PSSParameterSpec.DEFAULT.getMGFAlgorithm(), new MGF1ParameterSpec(MessageDigestUtils.m4528a(C0759a.m1781a(c0681uM1680a.m1682b().m1784b()).m1783a())), c0681uM1680a.m1683c().intValue(), c0681uM1680a.m1684d().intValue());
            } catch (ArrayIndexOutOfBoundsException e) {
                throw new IOException("Not a valid PSS Parameter encoding.");
            } catch (ClassCastException e2) {
                throw new IOException("Not a valid PSS Parameter encoding.");
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) throws IOException {
            if (!m4288a(str) && !str.equalsIgnoreCase("X.509")) {
                throw new IOException("Unknown parameter format ".concat(String.valueOf(str)));
            }
            engineInit(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "PSS Parameters";
        }
    }

    /* JADX INFO: renamed from: a */
    protected static boolean m4288a(String str) {
        return str == null || str.equals("ASN.1");
    }

    /* JADX INFO: renamed from: a */
    protected abstract AlgorithmParameterSpec mo4289a(Class cls);

    @Override // java.security.AlgorithmParametersSpi
    protected AlgorithmParameterSpec engineGetParameterSpec(Class cls) {
        if (cls == null) {
            throw new NullPointerException("argument to getParameterSpec must not be null");
        }
        return mo4289a(cls);
    }
}
