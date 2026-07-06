package org.bouncycastle.jcajce.provider.util;

import java.security.PrivateKey;
import java.security.PublicKey;
import org.bouncycastle.a.s.p;
import org.bouncycastle.a.z.u;

/* JADX INFO: loaded from: classes.dex */
public interface AsymmetricKeyInfoConverter {
    PrivateKey a(p pVar);

    PublicKey a(u uVar);
}
