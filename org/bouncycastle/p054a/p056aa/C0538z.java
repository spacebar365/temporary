package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.z */
/* JADX INFO: loaded from: classes.dex */
final class C0538z extends AbstractC0508ae {
    C0538z() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("0400000000000000000001E60FC8821CC74DAEAFC1", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(2L);
        AbstractC1381d.d dVar = new AbstractC1381d.d(163, 1, 2, 8, new BigInteger("072546B5435234A422E0789675F432C89435DE5242", 16), new BigInteger("00C9517D06D5240D3CFF38C74B20B6CD4D6F9DD4D9", 16), bigInteger, bigIntegerValueOf);
        return new C0507ad(dVar, new C0509af(dVar, C1541f.m4106a("0307AF69989546103D79329FCC3D74880F33BBE803CB")), bigInteger, bigIntegerValueOf, C1541f.m4106a("D2C0FB15760860DEF1EEF4D696E6768756151754"));
    }
}
