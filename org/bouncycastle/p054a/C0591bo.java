package org.bouncycastle.p054a;

import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.a.bo */
/* JADX INFO: loaded from: classes.dex */
public final class C0591bo extends AbstractC0686u implements InterfaceC0502aa {

    /* JADX INFO: renamed from: a */
    private final byte[] f2123a;

    public C0591bo(String str) {
        this.f2123a = C1560k.m4161a(str);
    }

    C0591bo(byte[] bArr) {
        this.f2123a = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static C0591bo m1464a(Object obj) {
        if (obj == null || (obj instanceof C0591bo)) {
            return (C0591bo) obj;
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) {
        c0660s.m1605a(12, this.f2123a);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1336a() {
        return false;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1337a(AbstractC0686u abstractC0686u) {
        if (abstractC0686u instanceof C0591bo) {
            return C1535a.m4076a(this.f2123a, ((C0591bo) abstractC0686u).f2123a);
        }
        return false;
    }

    @Override // org.bouncycastle.p054a.InterfaceC0502aa
    /* JADX INFO: renamed from: b */
    public final String mo1350b() {
        return C1560k.m4159a(this.f2123a);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        return C0612ch.m1488a(this.f2123a.length) + 1 + this.f2123a.length;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u, org.bouncycastle.p054a.AbstractC0650o
    public final int hashCode() {
        return C1535a.m4066a(this.f2123a);
    }

    public final String toString() {
        return mo1350b();
    }
}
