package org.bouncycastle.jcajce.provider.asymmetric.elgamal;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import org.bouncycastle.p083b.p097k.C1062an;
import org.bouncycastle.p083b.p097k.C1063ao;
import org.bouncycastle.p083b.p097k.C1064ap;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p103c.p104a.InterfaceC1189e;
import org.bouncycastle.p103c.p104a.InterfaceC1190f;

/* JADX INFO: loaded from: classes.dex */
public class ElGamalUtil {
    /* JADX INFO: renamed from: a */
    public static C1075b m4280a(PrivateKey privateKey) throws InvalidKeyException {
        if (privateKey instanceof InterfaceC1189e) {
            InterfaceC1189e interfaceC1189e = (InterfaceC1189e) privateKey;
            return new C1063ao(interfaceC1189e.getX(), new C1062an(interfaceC1189e.mo2830a().m2877a(), interfaceC1189e.mo2830a().m2878b()));
        }
        if (!(privateKey instanceof DHPrivateKey)) {
            throw new InvalidKeyException("can't identify private key for El Gamal.");
        }
        DHPrivateKey dHPrivateKey = (DHPrivateKey) privateKey;
        return new C1063ao(dHPrivateKey.getX(), new C1062an(dHPrivateKey.getParams().getP(), dHPrivateKey.getParams().getG()));
    }

    /* JADX INFO: renamed from: a */
    public static C1075b m4281a(PublicKey publicKey) throws InvalidKeyException {
        if (publicKey instanceof InterfaceC1190f) {
            InterfaceC1190f interfaceC1190f = (InterfaceC1190f) publicKey;
            return new C1064ap(interfaceC1190f.getY(), new C1062an(interfaceC1190f.mo2830a().m2877a(), interfaceC1190f.mo2830a().m2878b()));
        }
        if (!(publicKey instanceof DHPublicKey)) {
            throw new InvalidKeyException("can't identify public key for El Gamal.");
        }
        DHPublicKey dHPublicKey = (DHPublicKey) publicKey;
        return new C1064ap(dHPublicKey.getY(), new C1062an(dHPublicKey.getParams().getP(), dHPublicKey.getParams().getG()));
    }
}
