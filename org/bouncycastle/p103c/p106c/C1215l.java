package org.bouncycastle.p103c.p106c;

import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.p061f.C0622d;
import org.bouncycastle.p054a.p061f.C0623e;
import org.bouncycastle.p054a.p061f.C0624f;
import org.bouncycastle.p054a.p061f.InterfaceC0619a;
import org.bouncycastle.p103c.p104a.InterfaceC1192h;

/* JADX INFO: renamed from: org.bouncycastle.c.c.l */
/* JADX INFO: loaded from: classes.dex */
public final class C1215l implements AlgorithmParameterSpec, InterfaceC1192h {

    /* JADX INFO: renamed from: a */
    private C1217n f4720a;

    /* JADX INFO: renamed from: b */
    private String f4721b;

    /* JADX INFO: renamed from: c */
    private String f4722c;

    /* JADX INFO: renamed from: d */
    private String f4723d;

    public C1215l(String str) {
        this(str, InterfaceC0619a.f2208p.m1593b(), null);
    }

    private C1215l(String str, String str2) {
        this(str, str2, null);
    }

    private C1215l(String str, String str2, String str3) {
        C0623e c0623eM1510a = null;
        try {
            c0623eM1510a = C0622d.m1510a(new C0653p(str));
        } catch (IllegalArgumentException e) {
            C0653p c0653pM1511a = C0622d.m1511a(str);
            if (c0653pM1511a != null) {
                str = c0653pM1511a.m1593b();
                c0623eM1510a = C0622d.m1510a(c0653pM1511a);
            }
        }
        if (c0623eM1510a == null) {
            throw new IllegalArgumentException("no key parameter set for passed in name/OID.");
        }
        this.f4720a = new C1217n(c0623eM1510a.m1512a(), c0623eM1510a.m1513b(), c0623eM1510a.m1514c());
        this.f4721b = str;
        this.f4722c = str2;
        this.f4723d = str3;
    }

    public C1215l(C1217n c1217n) {
        this.f4720a = c1217n;
        this.f4722c = InterfaceC0619a.f2208p.m1593b();
        this.f4723d = null;
    }

    /* JADX INFO: renamed from: a */
    public static C1215l m2881a(C0624f c0624f) {
        return c0624f.m1518c() != null ? new C1215l(c0624f.m1516a().m1593b(), c0624f.m1517b().m1593b(), c0624f.m1518c().m1593b()) : new C1215l(c0624f.m1516a().m1593b(), c0624f.m1517b().m1593b());
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1192h
    /* JADX INFO: renamed from: a */
    public final String mo2832a() {
        return this.f4721b;
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1192h
    /* JADX INFO: renamed from: b */
    public final String mo2833b() {
        return this.f4722c;
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1192h
    /* JADX INFO: renamed from: c */
    public final String mo2834c() {
        return this.f4723d;
    }

    @Override // org.bouncycastle.p103c.p104a.InterfaceC1192h
    /* JADX INFO: renamed from: d */
    public final C1217n mo2835d() {
        return this.f4720a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1215l)) {
            return false;
        }
        C1215l c1215l = (C1215l) obj;
        if (this.f4720a.equals(c1215l.f4720a) && this.f4722c.equals(c1215l.f4722c)) {
            return this.f4723d == c1215l.f4723d || (this.f4723d != null && this.f4723d.equals(c1215l.f4723d));
        }
        return false;
    }

    public final int hashCode() {
        return (this.f4723d != null ? this.f4723d.hashCode() : 0) ^ (this.f4722c.hashCode() ^ this.f4720a.hashCode());
    }
}
