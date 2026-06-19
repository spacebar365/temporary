package org.bouncycastle.p054a.p077v;

import java.math.BigInteger;
import org.bouncycastle.p054a.p056aa.AbstractC0508ae;
import org.bouncycastle.p054a.p056aa.C0507ad;
import org.bouncycastle.p054a.p056aa.C0509af;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.v.m */
/* JADX INFO: loaded from: classes.dex */
final class C0736m extends AbstractC0508ae {
    C0736m() {
    }

    @Override // org.bouncycastle.p054a.p056aa.AbstractC0508ae
    /* JADX INFO: renamed from: a */
    protected final C0507ad mo1349a() {
        BigInteger bigInteger = new BigInteger("A9FB57DBA1EEA9BC3E660A909D838D718C397AA3B561A6F7901E0E82974856A7", 16);
        BigInteger bigInteger2 = new BigInteger("01", 16);
        AbstractC1381d abstractC1381dM1714a = C0724a.m1714a(new AbstractC1381d.e(new BigInteger("A9FB57DBA1EEA9BC3E660A909D838D726E3BF623D52620282013481D1F6E5377", 16), new BigInteger("7D5A0975FC2C3057EEF67530417AFFE7FB8055C126DC5C6CE94A4B44F330B5D9", 16), new BigInteger("26DC5C6CE94A4B44F330B5D9BBD77CBF958416295CF7E1CE6BCCDC18FF8C07B6", 16), bigInteger, bigInteger2));
        return new C0507ad(abstractC1381dM1714a, new C0509af(abstractC1381dM1714a, C1541f.m4106a("048BD2AEB9CB7E57CB2C4B482FFC81B7AFB9DE27E1E3BD23C23A4453BD9ACE3262547EF835C3DAC4FD97F8461A14611DC9C27745132DED8E545C1D54C72F046997")), bigInteger, bigInteger2);
    }
}
