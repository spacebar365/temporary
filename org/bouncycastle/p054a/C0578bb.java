package org.bouncycastle.p054a;

import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1560k;

/* JADX INFO: renamed from: org.bouncycastle.a.bb */
/* JADX INFO: loaded from: classes.dex */
public class C0578bb extends AbstractC0686u implements InterfaceC0502aa {

    /* JADX INFO: renamed from: a */
    private final byte[] f2111a;

    public C0578bb(String str) {
        this(str, (byte) 0);
    }

    private C0578bb(String str, byte b) {
        if (str == null) {
            throw new NullPointerException("string cannot be null");
        }
        this.f2111a = C1560k.m4168d(str);
    }

    C0578bb(byte[] bArr) {
        this.f2111a = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static C0578bb m1457a(Object obj) {
        if (obj == null || (obj instanceof C0578bb)) {
            return (C0578bb) obj;
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    /* JADX INFO: renamed from: a */
    public static C0578bb m1458a(AbstractC0539ab abstractC0539ab) {
        AbstractC0686u abstractC0686uM1402j = abstractC0539ab.m1402j();
        return abstractC0686uM1402j instanceof C0578bb ? m1457a((Object) abstractC0686uM1402j) : new C0578bb(((AbstractC0655q) abstractC0686uM1402j).mo1410c());
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) {
        c0660s.m1605a(22, this.f2111a);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1336a() {
        return false;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1337a(AbstractC0686u abstractC0686u) {
        if (abstractC0686u instanceof C0578bb) {
            return C1535a.m4076a(this.f2111a, ((C0578bb) abstractC0686u).f2111a);
        }
        return false;
    }

    @Override // org.bouncycastle.p054a.InterfaceC0502aa
    /* JADX INFO: renamed from: b */
    public final String mo1350b() {
        return C1560k.m4164b(this.f2111a);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        return C0612ch.m1488a(this.f2111a.length) + 1 + this.f2111a.length;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u, org.bouncycastle.p054a.AbstractC0650o
    public int hashCode() {
        return C1535a.m4066a(this.f2111a);
    }

    public String toString() {
        return mo1350b();
    }
}
