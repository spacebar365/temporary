package org.bouncycastle.p054a;

import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0613d extends AbstractC0686u {

    /* JADX INFO: renamed from: e */
    private final byte[] f2179e;

    /* JADX INFO: renamed from: c */
    private static final byte[] f2177c = {-1};

    /* JADX INFO: renamed from: d */
    private static final byte[] f2178d = {0};

    /* JADX INFO: renamed from: a */
    public static final C0613d f2175a = new C0613d(false);

    /* JADX INFO: renamed from: b */
    public static final C0613d f2176b = new C0613d(true);

    private C0613d(boolean z) {
        this.f2179e = z ? f2177c : f2178d;
    }

    private C0613d(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("byte value should have 1 byte in it");
        }
        if (bArr[0] == 0) {
            this.f2179e = f2178d;
        } else if ((bArr[0] & 255) == 255) {
            this.f2179e = f2177c;
        } else {
            this.f2179e = C1535a.m4086b(bArr);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C0613d m1491a(Object obj) {
        if (obj == null || (obj instanceof C0613d)) {
            return (C0613d) obj;
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    /* JADX INFO: renamed from: a */
    public static C0613d m1492a(AbstractC0539ab abstractC0539ab) {
        AbstractC0686u abstractC0686uM1402j = abstractC0539ab.m1402j();
        return abstractC0686uM1402j instanceof C0613d ? m1491a((Object) abstractC0686uM1402j) : m1494a(((AbstractC0655q) abstractC0686uM1402j).mo1410c());
    }

    /* JADX INFO: renamed from: a */
    public static C0613d m1493a(boolean z) {
        return z ? f2176b : f2175a;
    }

    /* JADX INFO: renamed from: a */
    static C0613d m1494a(byte[] bArr) {
        if (bArr.length != 1) {
            throw new IllegalArgumentException("BOOLEAN value should have 1 byte in it");
        }
        return bArr[0] == 0 ? f2175a : (bArr[0] & 255) == 255 ? f2176b : new C0613d(bArr);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final void mo1335a(C0660s c0660s) {
        c0660s.m1605a(1, this.f2179e);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1336a() {
        return false;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    protected final boolean mo1337a(AbstractC0686u abstractC0686u) {
        return (abstractC0686u instanceof C0613d) && this.f2179e[0] == ((C0613d) abstractC0686u).f2179e[0];
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1495b() {
        return this.f2179e[0] != 0;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: e */
    final int mo1341e() {
        return 3;
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u, org.bouncycastle.p054a.AbstractC0650o
    public final int hashCode() {
        return this.f2179e[0];
    }

    public final String toString() {
        return this.f2179e[0] != 0 ? "TRUE" : "FALSE";
    }
}
