package org.bouncycastle.jcajce.provider.asymmetric.ec;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.b.k.b;
import org.bouncycastle.b.k.bf;
import org.bouncycastle.b.n;
import org.bouncycastle.b.n.a;
import org.bouncycastle.b.r;
import org.bouncycastle.jcajce.provider.asymmetric.util.DSABase;
import org.bouncycastle.jcajce.provider.asymmetric.util.ECUtil;

/* JADX INFO: loaded from: classes.dex */
public class SignatureSpi extends DSABase {
    SignatureSpi(r rVar, n nVar, a aVar) {
        super(rVar, nVar, aVar);
    }

    @Override // java.security.SignatureSpi
    protected void engineInitSign(PrivateKey privateKey) throws InvalidKeyException {
        b bVarA = ECUtil.a(privateKey);
        this.bO.c();
        if (this.appRandom != null) {
            this.bP.a(true, new bf(bVarA, this.appRandom));
        } else {
            this.bP.a(true, bVarA);
        }
    }

    @Override // java.security.SignatureSpi
    protected void engineInitVerify(PublicKey publicKey) {
        b bVarA = ECUtils.a(publicKey);
        this.bO.c();
        this.bP.a(false, bVarA);
    }
}
