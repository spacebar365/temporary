package org.bouncycastle.p054a;

import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.a.ba */
/* JADX INFO: loaded from: classes.dex */
public final class C0577ba extends AbstractC0686u implements InterfaceC0502aa {

    /* JADX INFO: renamed from: a */
    private final byte[] f2110a;

    public C0577ba(byte[] bArr) {
        this.f2110a = C1535a.m4086b(bArr);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) {
        c0660s.m1605a(25, this.f2110a);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1336a() {
        return false;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1337a(AbstractC0686u abstractC0686u) {
        if (abstractC0686u instanceof C0577ba) {
            return C1535a.m4076a(this.f2110a, ((C0577ba) abstractC0686u).f2110a);
        }
        return false;
    }

    @Override // org.bouncycastle.p054a.InterfaceC0502aa
    /* JADX INFO: renamed from: b */
    public final String mo1350b() {
        return C1560k.m4164b(this.f2110a);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        return C0612ch.m1488a(this.f2110a.length) + 1 + this.f2110a.length;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u, org.bouncycastle.p054a.AbstractC0650o
    public final int hashCode() {
        return C1535a.m4066a(this.f2110a);
    }
}
