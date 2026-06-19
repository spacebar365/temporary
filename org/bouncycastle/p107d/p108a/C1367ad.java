package org.bouncycastle.p107d.p108a;

import java.math.BigInteger;
import org.bouncycastle.p107d.p108a.AbstractC1381d;
import org.bouncycastle.p107d.p108a.AbstractC1389j;

/* JADX INFO: renamed from: org.bouncycastle.d.a.ad */
/* JADX INFO: loaded from: classes.dex */
public final class C1367ad extends AbstractC1223a {
    /* JADX INFO: renamed from: a */
    private static AbstractC1389j.a m3268a(AbstractC1389j.a aVar, byte[] bArr) {
        AbstractC1381d.a aVar2 = (AbstractC1381d.a) aVar.m3459d();
        AbstractC1389j.a[] aVarArrM3270a = ((C1369af) aVar2.m3359a(aVar, "bc_wtnaf", new C1368ae(aVar, aVar2.m3366g().mo2928a().byteValue()))).m3270a();
        AbstractC1389j.a[] aVarArr = new AbstractC1389j.a[aVarArrM3270a.length];
        for (int i = 0; i < aVarArrM3270a.length; i++) {
            aVarArr[i] = (AbstractC1389j.a) aVarArrM3270a[i].mo2949s();
        }
        AbstractC1389j.a aVar3 = (AbstractC1389j.a) aVar.m3459d().mo2912e();
        int length = bArr.length - 1;
        int i2 = 0;
        while (length >= 0) {
            int i3 = i2 + 1;
            byte b = bArr[length];
            if (b != 0) {
                aVar3 = (AbstractC1389j.a) aVar3.m3471c(i3).mo2946b(b > 0 ? aVarArrM3270a[b >>> 1] : aVarArr[(-b) >>> 1]);
                i3 = 0;
            }
            length--;
            i2 = i3;
        }
        return i2 > 0 ? aVar3.m3471c(i2) : aVar3;
    }

    @Override // org.bouncycastle.p107d.p108a.AbstractC1223a
    /* JADX INFO: renamed from: b */
    protected final AbstractC1389j mo2904b(AbstractC1389j abstractC1389j, BigInteger bigInteger) {
        if (!(abstractC1389j instanceof AbstractC1389j.a)) {
            throw new IllegalArgumentException("Only ECPoint.AbstractF2m can be used in WTauNafMultiplier");
        }
        AbstractC1389j.a aVar = (AbstractC1389j.a) abstractC1389j;
        AbstractC1381d.a aVar2 = (AbstractC1381d.a) aVar.m3459d();
        int iA = aVar2.mo2905a();
        byte bByteValue = aVar2.m3366g().mo2928a().byteValue();
        byte bM3532a = C1402w.m3532a((int) bByteValue);
        return m3268a(aVar, C1402w.m3536a(bM3532a, C1402w.m3534a(bigInteger, iA, bByteValue, aVar2.m3374n(), bM3532a), BigInteger.valueOf(16L), C1402w.m3533a(bM3532a), bByteValue == 0 ? C1402w.f5103a : C1402w.f5105c));
    }
}
