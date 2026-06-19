package org.bouncycastle.jcajce.provider.asymmetric.util;

import java.security.InvalidKeyException;
import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.p083b.p097k.C1067as;
import org.bouncycastle.p083b.p097k.C1068at;
import org.bouncycastle.p083b.p097k.C1069au;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p103c.p104a.InterfaceC1193i;
import org.bouncycastle.p103c.p104a.InterfaceC1194j;
import org.bouncycastle.p103c.p106c.C1217n;

/* JADX INFO: loaded from: classes.dex */
public class GOST3410Util {
    /* JADX INFO: renamed from: a */
    public static C1075b m4335a(PrivateKey privateKey) throws InvalidKeyException {
        if (!(privateKey instanceof InterfaceC1193i)) {
            throw new InvalidKeyException("can't identify GOST3410 private key.");
        }
        InterfaceC1193i interfaceC1193i = (InterfaceC1193i) privateKey;
        C1217n c1217nMo2835d = interfaceC1193i.mo2831a().mo2835d();
        return new C1068at(interfaceC1193i.mo2836c(), new C1067as(c1217nMo2835d.m2886a(), c1217nMo2835d.m2887b(), c1217nMo2835d.m2888c()));
    }

    /* JADX INFO: renamed from: a */
    public static C1075b m4336a(PublicKey publicKey) throws InvalidKeyException {
        if (!(publicKey instanceof InterfaceC1194j)) {
            throw new InvalidKeyException("can't identify GOST3410 public key: " + publicKey.getClass().getName());
        }
        InterfaceC1194j interfaceC1194j = (InterfaceC1194j) publicKey;
        C1217n c1217nMo2835d = interfaceC1194j.mo2831a().mo2835d();
        return new C1069au(interfaceC1194j.mo2837b(), new C1067as(c1217nMo2835d.m2886a(), c1217nMo2835d.m2887b(), c1217nMo2835d.m2888c()));
    }
}
