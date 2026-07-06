package org.bouncycastle.c.c;

import java.security.spec.AlgorithmParameterSpec;

/* JADX INFO: loaded from: classes.dex */
public final class l implements AlgorithmParameterSpec, org.bouncycastle.c.a.h {
    private n a;
    private String b;
    private String c;
    private String d;

    public l(String str) {
        this(str, org.bouncycastle.a.f.a.p.b(), null);
    }

    private l(String str, String str2) {
        this(str, str2, null);
    }

    private l(String str, String str2, String str3) {
        org.bouncycastle.a.f.e eVarA = null;
        try {
            eVarA = org.bouncycastle.a.f.d.a(new org.bouncycastle.a.p(str));
        } catch (IllegalArgumentException e) {
            org.bouncycastle.a.p pVarA = org.bouncycastle.a.f.d.a(str);
            if (pVarA != null) {
                str = pVarA.b();
                eVarA = org.bouncycastle.a.f.d.a(pVarA);
            }
        }
        if (eVarA == null) {
            throw new IllegalArgumentException("no key parameter set for passed in name/OID.");
        }
        this.a = new n(eVarA.a(), eVarA.b(), eVarA.c());
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public l(n nVar) {
        this.a = nVar;
        this.c = org.bouncycastle.a.f.a.p.b();
        this.d = null;
    }

    public static l a(org.bouncycastle.a.f.f fVar) {
        return fVar.c() != null ? new l(fVar.a().b(), fVar.b().b(), fVar.c().b()) : new l(fVar.a().b(), fVar.b().b());
    }

    @Override // org.bouncycastle.c.a.h
    public final String a() {
        return this.b;
    }

    @Override // org.bouncycastle.c.a.h
    public final String b() {
        return this.c;
    }

    @Override // org.bouncycastle.c.a.h
    public final String c() {
        return this.d;
    }

    @Override // org.bouncycastle.c.a.h
    public final n d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.a.equals(lVar.a) && this.c.equals(lVar.c)) {
            return this.d == lVar.d || (this.d != null && this.d.equals(lVar.d));
        }
        return false;
    }

    public final int hashCode() {
        return (this.d != null ? this.d.hashCode() : 0) ^ (this.c.hashCode() ^ this.a.hashCode());
    }
}
