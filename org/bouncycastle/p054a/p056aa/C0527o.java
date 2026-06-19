package org.bouncycastle.p054a.p056aa;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.aa.o */
/* JADX INFO: loaded from: classes.dex */
final class C0527o extends AbstractC0508ae {
    C0527o() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("0100FAF51354E0E39E4892DF6E319C72C8161603FA45AA7B998A167B8F1E629521", 16);
        BigInteger bigIntegerValueOf = BigInteger.valueOf(65286L);
        AbstractC1381d.d dVar = new AbstractC1381d.d(272, 1, 3, 56, new BigInteger("0091A091F03B5FBA4AB2CCF49C4EDD220FB028712D42BE752B2C40094DBACDB586FB20", 16), new BigInteger("7167EFC92BB2E3CE7C8AAAFF34E12A9C557003D7C73A6FAF003F99F6CC8482E540F7", 16), bigInteger, bigIntegerValueOf);
        return new C0507ad(dVar, new C0509af(dVar, C1541f.m4106a("026108BABB2CEEBCF787058A056CBE0CFE622D7723A289E08A07AE13EF0D10D171DD8D")), bigInteger, bigIntegerValueOf, (byte[]) null);
    }
}
