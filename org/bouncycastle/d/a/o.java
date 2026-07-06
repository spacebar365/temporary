package org.bouncycastle.d.a;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes.dex */
public final class o {
    public static int a(d dVar) {
        BigInteger bigIntegerI = dVar.i();
        return bigIntegerI == null ? dVar.a() + 1 : bigIntegerI.bitLength();
    }
}
