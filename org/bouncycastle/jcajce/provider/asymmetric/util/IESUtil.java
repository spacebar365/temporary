package org.bouncycastle.jcajce.provider.asymmetric.util;

import org.bouncycastle.b.e;
import org.bouncycastle.b.f;
import org.bouncycastle.c.c.p;

/* JADX INFO: loaded from: classes.dex */
public class IESUtil {
    public static p a(f fVar, byte[] bArr) {
        if (fVar == null) {
            return new p(null, null, 128);
        }
        e eVarA = fVar.a();
        return (eVarA.a().equals("DES") || eVarA.a().equals("RC2") || eVarA.a().equals("RC5-32") || eVarA.a().equals("RC5-64")) ? new p(null, null, 64, 64, bArr) : eVarA.a().equals("SKIPJACK") ? new p(null, null, 80, 80, bArr) : eVarA.a().equals("GOST28147") ? new p(null, null, 256, 256, bArr) : new p(null, null, 128, 128, bArr);
    }
}
