package org.bouncycastle.p083b.p084a;

import java.math.BigInteger;
import org.bouncycastle.p083b.InterfaceC0884d;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1075b;
import org.bouncycastle.p083b.p097k.C1081bf;
import org.bouncycastle.p083b.p097k.C1106i;
import org.bouncycastle.p083b.p097k.C1107j;
import org.bouncycastle.p083b.p097k.C1108k;

/* JADX INFO: renamed from: org.bouncycastle.b.a.a */
/* JADX INFO: loaded from: classes.dex */
public final class C0787a implements InterfaceC0884d {

    /* JADX INFO: renamed from: a */
    private static final BigInteger f3294a = BigInteger.valueOf(1);

    /* JADX INFO: renamed from: b */
    private C1107j f3295b;

    /* JADX INFO: renamed from: c */
    private C1106i f3296c;

    @Override // org.bouncycastle.p083b.InterfaceC0884d
    /* JADX INFO: renamed from: a */
    public final int mo1872a() {
        return (this.f3295b.m2658b().m2664a().bitLength() + 7) / 8;
    }

    @Override // org.bouncycastle.p083b.InterfaceC0884d
    /* JADX INFO: renamed from: a */
    public final void mo1873a(InterfaceC1003i interfaceC1003i) {
        C1075b c1075b = interfaceC1003i instanceof C1081bf ? (C1075b) ((C1081bf) interfaceC1003i).m2614b() : (C1075b) interfaceC1003i;
        if (!(c1075b instanceof C1107j)) {
            throw new IllegalArgumentException("DHEngine expects DHPrivateKeyParameters");
        }
        this.f3295b = (C1107j) c1075b;
        this.f3296c = this.f3295b.m2658b();
    }

    @Override // org.bouncycastle.p083b.InterfaceC0884d
    /* JADX INFO: renamed from: b */
    public final BigInteger mo1874b(InterfaceC1003i interfaceC1003i) {
        C1108k c1108k = (C1108k) interfaceC1003i;
        if (!c1108k.m2658b().equals(this.f3296c)) {
            throw new IllegalArgumentException("Diffie-Hellman public key has wrong parameters.");
        }
        BigInteger bigIntegerM2664a = this.f3296c.m2664a();
        BigInteger bigIntegerM2672c = c1108k.m2672c();
        if (bigIntegerM2672c == null || bigIntegerM2672c.compareTo(f3294a) <= 0 || bigIntegerM2672c.compareTo(bigIntegerM2664a.subtract(f3294a)) >= 0) {
            throw new IllegalArgumentException("Diffie-Hellman public key is weak");
        }
        BigInteger bigIntegerModPow = bigIntegerM2672c.modPow(this.f3295b.m2671c(), bigIntegerM2664a);
        if (bigIntegerModPow.equals(f3294a)) {
            throw new IllegalStateException("Shared key can't be 1");
        }
        return bigIntegerModPow;
    }
}
