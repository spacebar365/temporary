package org.bouncycastle.p107d.p116b;

import java.math.BigInteger;

/* JADX INFO: renamed from: org.bouncycastle.d.b.h */
/* JADX INFO: loaded from: classes.dex */
final class C1413h implements InterfaceC1407b {

    /* JADX INFO: renamed from: a */
    protected final BigInteger f5121a;

    C1413h(BigInteger bigInteger) {
        this.f5121a = bigInteger;
    }

    @Override // org.bouncycastle.p107d.p116b.InterfaceC1407b
    /* JADX INFO: renamed from: a */
    public final BigInteger mo3552a() {
        return this.f5121a;
    }

    @Override // org.bouncycastle.p107d.p116b.InterfaceC1407b
    /* JADX INFO: renamed from: b */
    public final int mo3553b() {
        return 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1413h) {
            return this.f5121a.equals(((C1413h) obj).f5121a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5121a.hashCode();
    }
}
