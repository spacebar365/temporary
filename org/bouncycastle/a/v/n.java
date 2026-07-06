package org.bouncycastle.a.v;

import java.math.BigInteger;
import org.bouncycastle.a.aa.ad;
import org.bouncycastle.a.aa.ae;
import org.bouncycastle.a.aa.af;
import org.bouncycastle.d.a.d$e;

/* JADX INFO: loaded from: classes.dex */
final class n extends ae {
    n() {
    }

    @Override // org.bouncycastle.a.aa.ae
    protected final ad a() {
        BigInteger bigInteger = new BigInteger("A9FB57DBA1EEA9BC3E660A909D838D718C397AA3B561A6F7901E0E82974856A7", 16);
        BigInteger bigInteger2 = new BigInteger("01", 16);
        org.bouncycastle.d.a.d dVarA = a.a(new d$e(new BigInteger("A9FB57DBA1EEA9BC3E660A909D838D726E3BF623D52620282013481D1F6E5377", 16), new BigInteger("A9FB57DBA1EEA9BC3E660A909D838D726E3BF623D52620282013481D1F6E5374", 16), new BigInteger("662C61C430D84EA4FE66A7733D0B76B7BF93EBC4AF2F49256AE58101FEE92B04", 16), bigInteger, bigInteger2));
        return new ad(dVarA, new af(dVarA, org.bouncycastle.f.a.f.a("04A3E8EB3CC1CFE7B7732213B23A656149AFA142C47AAFBC2B79A191562E1305F42D996C823439C56D7F7B22E14644417E69BCB6DE39D027001DABE8F35B25C9BE")), bigInteger, bigInteger2);
    }
}
