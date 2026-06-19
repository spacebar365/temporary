package org.bouncycastle.p054a;

import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.a.bd */
/* JADX INFO: loaded from: classes.dex */
public final class C0580bd extends AbstractC0686u implements InterfaceC0502aa {

    /* JADX INFO: renamed from: a */
    private final byte[] f2114a;

    C0580bd(byte[] bArr) {
        this.f2114a = bArr;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) {
        c0660s.m1605a(18, this.f2114a);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1336a() {
        return false;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1337a(AbstractC0686u abstractC0686u) {
        if (abstractC0686u instanceof C0580bd) {
            return C1535a.m4076a(this.f2114a, ((C0580bd) abstractC0686u).f2114a);
        }
        return false;
    }

    @Override // org.bouncycastle.p054a.InterfaceC0502aa
    /* JADX INFO: renamed from: b */
    public final String mo1350b() {
        return C1560k.m4164b(this.f2114a);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        return C0612ch.m1488a(this.f2114a.length) + 1 + this.f2114a.length;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u, org.bouncycastle.p054a.AbstractC0650o
    public final int hashCode() {
        return C1535a.m4066a(this.f2114a);
    }

    public final String toString() {
        return mo1350b();
    }
}
