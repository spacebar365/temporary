package org.bouncycastle.p054a.p077v;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.v.k */
/* JADX INFO: loaded from: classes.dex */
final class C0734k extends AbstractC0508ae {
    C0734k() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("D7C134AA264366862A18302575D0FB98D116BC4B6DDEBCA3A5A7939F", 16);
        BigInteger bigInteger2 = new BigInteger("01", 16);
        AbstractC1381d abstractC1381dM1714a = C0724a.m1714a(new AbstractC1381d.e(new BigInteger("D7C134AA264366862A18302575D1D787B09F075797DA89F57EC8C0FF", 16), new BigInteger("68A5E62CA9CE6C1C299803A6C1530B514E182AD8B0042A59CAD29F43", 16), new BigInteger("2580F63CCFE44138870713B1A92369E33E2135D266DBB372386C400B", 16), bigInteger, bigInteger2));
        return new C0507ad(abstractC1381dM1714a, new C0509af(abstractC1381dM1714a, C1541f.m4106a("040D9029AD2C7E5CF4340823B2A87DC68C9E4CE3174C1E6EFDEE12C07D58AA56F772C0726F24C6B89E4ECDAC24354B9E99CAA3F6D3761402CD")), bigInteger, bigInteger2);
    }
}
