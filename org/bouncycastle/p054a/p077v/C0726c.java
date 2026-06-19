package org.bouncycastle.p054a.p077v;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.v.c */
/* JADX INFO: loaded from: classes.dex */
final class C0726c extends AbstractC0508ae {
    C0726c() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("D35E472036BC4FB7E13C785ED201E065F98FCFA5B68F12A32D482EC7EE8658E98691555B44C59311", 16);
        BigInteger bigInteger2 = new BigInteger("01", 16);
        AbstractC1381d abstractC1381dM1714a = C0724a.m1714a(new AbstractC1381d.e(new BigInteger("D35E472036BC4FB7E13C785ED201E065F98FCFA6F6F40DEF4F92B9EC7893EC28FCD412B1F1B32E27", 16), new BigInteger("D35E472036BC4FB7E13C785ED201E065F98FCFA6F6F40DEF4F92B9EC7893EC28FCD412B1F1B32E24", 16), new BigInteger("A7F561E038EB1ED560B3D147DB782013064C19F27ED27C6780AAF77FB8A547CEB5B4FEF422340353", 16), bigInteger, bigInteger2));
        return new C0507ad(abstractC1381dM1714a, new C0509af(abstractC1381dM1714a, C1541f.m4106a("04925BE9FB01AFC6FB4D3E7D4990010F813408AB106C4F09CB7EE07868CC136FFF3357F624A21BED5263BA3A7A27483EBF6671DBEF7ABB30EBEE084E58A0B077AD42A5A0989D1EE71B1B9BC0455FB0D2C3")), bigInteger, bigInteger2);
    }
}
