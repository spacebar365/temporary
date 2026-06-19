package org.bouncycastle.jcajce.provider.symmetric;

import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import javax.crypto.spec.PBEParameterSpec;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;
import org.bouncycastle.p054a.p074s.C0670j;
import org.bouncycastle.p054a.p074s.InterfaceC0674n;

/* JADX INFO: loaded from: classes.dex */
public class PBEPBKDF1 {

    public static class AlgParams extends BaseAlgorithmParameters {

        /* JADX INFO: renamed from: a */
        C0670j f6110a;

        @Override // org.bouncycastle.jcajce.provider.symmetric.util.BaseAlgorithmParameters
        /* JADX INFO: renamed from: a */
        protected final AlgorithmParameterSpec mo4277a(Class cls) throws InvalidParameterSpecException {
            if (cls == PBEParameterSpec.class) {
                return new PBEParameterSpec(this.f6110a.m1640b(), this.f6110a.m1639a().intValue());
            }
            throw new InvalidParameterSpecException("unknown parameter spec passed to PBKDF1 PBE parameters object.");
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded() {
            try {
                return this.f6110a.m1577a("DER");
            } catch (IOException e) {
                throw new RuntimeException("Oooops! " + e.toString());
            }
        }

        @Override // java.security.AlgorithmParametersSpi
        protected byte[] engineGetEncoded(String str) {
            if (m4449a(str)) {
                return engineGetEncoded();
            }
            return null;
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
            if (!(algorithmParameterSpec instanceof PBEParameterSpec)) {
                throw new InvalidParameterSpecException("PBEParameterSpec required to initialise a PBKDF1 PBE parameters algorithm parameters object");
            }
            PBEParameterSpec pBEParameterSpec = (PBEParameterSpec) algorithmParameterSpec;
            this.f6110a = new C0670j(pBEParameterSpec.getSalt(), pBEParameterSpec.getIterationCount());
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr) {
            this.f6110a = C0670j.m1638a(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected void engineInit(byte[] bArr, String str) throws IOException {
            if (!m4449a(str)) {
                throw new IOException("Unknown parameters format in PBKDF2 parameters object");
            }
            engineInit(bArr);
        }

        @Override // java.security.AlgorithmParametersSpi
        protected String engineToString() {
            return "PBKDF1 Parameters";
        }
    }

    public static class Mappings extends AlgorithmProvider {

        /* JADX INFO: renamed from: a */
        private static final String f6111a = PBEPBKDF1.class.getName();

        @Override // org.bouncycastle.jcajce.provider.util.AlgorithmProvider
        /* JADX INFO: renamed from: a */
        public final void mo4188a(ConfigurableProvider configurableProvider) {
            configurableProvider.mo2853a("AlgorithmParameters.PBKDF1", f6111a + "$AlgParams");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0674n.f2750t_, "PBKDF1");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0674n.f2752w, "PBKDF1");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0674n.f2753x, "PBKDF1");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0674n.f2754y, "PBKDF1");
            configurableProvider.mo2853a("Alg.Alias.AlgorithmParameters." + InterfaceC0674n.f2755z, "PBKDF1");
        }
    }

    private PBEPBKDF1() {
    }
}
