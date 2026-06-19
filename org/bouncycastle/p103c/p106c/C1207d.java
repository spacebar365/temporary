package org.bouncycastle.p103c.p106c;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1389j;
import org.bouncycastle.p107d.p108a.C1371b;
import org.bouncycastle.p107d.p116b.InterfaceC1407b;
import org.bouncycastle.p107d.p116b.InterfaceC1411f;
import org.bouncycastle.p107d.p116b.InterfaceC1412g;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.c.c.d */
/* JADX INFO: loaded from: classes.dex */
public final class C1207d extends ECParameterSpec {

    /* JADX INFO: renamed from: a */
    private String f4707a;

    public C1207d(String str, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        super(ellipticCurve, eCPoint, bigInteger, bigInteger2.intValue());
        this.f4707a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m2868a() {
        return this.f4707a;
    }

    public C1207d(String str, AbstractC1381d abstractC1381d, AbstractC1389j abstractC1389j, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        ECField eCFieldF2m;
        InterfaceC1407b interfaceC1407bM3365f = abstractC1381d.m3365f();
        if (C1371b.m3280b(interfaceC1407bM3365f)) {
            eCFieldF2m = new ECFieldFp(interfaceC1407bM3365f.mo3552a());
        } else {
            InterfaceC1411f interfaceC1411fMo3558c = ((InterfaceC1412g) interfaceC1407bM3365f).mo3558c();
            eCFieldF2m = new ECFieldF2m(interfaceC1411fMo3558c.mo3556a(), C1535a.m4096d(C1535a.m4087b(interfaceC1411fMo3558c.mo3557b(), r0.length - 1)));
        }
        super(new EllipticCurve(eCFieldF2m, abstractC1381d.m3366g().mo2928a(), abstractC1381d.m3367h().mo2928a(), bArr), EC5Util.m4313a(abstractC1389j), bigInteger, bigInteger2.intValue());
        this.f4707a = str;
    }
}
