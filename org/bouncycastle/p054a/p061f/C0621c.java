package org.bouncycastle.p054a.p061f;

import java.util.Enumeration;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0655q;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0581be;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0625g;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.a.f.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0621c extends AbstractC0650o {

    /* JADX INFO: renamed from: a */
    private AbstractC0655q f2222a;

    /* JADX INFO: renamed from: b */
    private C0653p f2223b;

    private C0621c(AbstractC0723v abstractC0723v) {
        Enumeration enumerationMo1483c = abstractC0723v.mo1483c();
        this.f2222a = (AbstractC0655q) enumerationMo1483c.nextElement();
        this.f2223b = (C0653p) enumerationMo1483c.nextElement();
    }

    public C0621c(byte[] bArr, C0653p c0653p) {
        this.f2222a = new C0581be(bArr);
        this.f2223b = c0653p;
    }

    /* JADX INFO: renamed from: a */
    public static C0621c m1507a(Object obj) {
        if (obj instanceof C0621c) {
            return (C0621c) obj;
        }
        if (obj != null) {
            return new C0621c(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0653p m1508a() {
        return this.f2223b;
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m1509b() {
        return C1535a.m4086b(this.f2222a.mo1410c());
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        C0625g c0625g = new C0625g();
        c0625g.m1521a(this.f2222a);
        c0625g.m1521a(this.f2223b);
        return new C0585bi(c0625g);
    }
}
