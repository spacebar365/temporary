package org.bouncycastle.p054a.p080y;

import java.util.Enumeration;
import org.bouncycastle.p054a.AbstractC0539ab;
import org.bouncycastle.p054a.AbstractC0650o;
import org.bouncycastle.p054a.AbstractC0686u;
import org.bouncycastle.p054a.AbstractC0723v;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.InterfaceC0616e;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.bouncycastle.p054a.p080y.p081a.C0752b;

/* JADX INFO: renamed from: org.bouncycastle.a.y.c */
/* JADX INFO: loaded from: classes.dex */
public final class C0756c extends AbstractC0650o implements InterfaceC0616e {

    /* JADX INFO: renamed from: a */
    private static InterfaceC0757d f3107a = C0752b.f3027K;

    /* JADX INFO: renamed from: b */
    private boolean f3108b;

    /* JADX INFO: renamed from: c */
    private int f3109c;

    /* JADX INFO: renamed from: d */
    private InterfaceC0757d f3110d;

    /* JADX INFO: renamed from: e */
    private C0755b[] f3111e;

    private C0756c(AbstractC0723v abstractC0723v) {
        this(f3107a, abstractC0723v);
    }

    private C0756c(InterfaceC0757d interfaceC0757d, AbstractC0723v abstractC0723v) {
        this.f3110d = interfaceC0757d;
        this.f3111e = new C0755b[abstractC0723v.mo1484d()];
        int i = 0;
        Enumeration enumerationMo1483c = abstractC0723v.mo1483c();
        while (enumerationMo1483c.hasMoreElements()) {
            this.f3111e[i] = C0755b.m1770a(enumerationMo1483c.nextElement());
            i++;
        }
    }

    private C0756c(InterfaceC0757d interfaceC0757d, C0756c c0756c) {
        this.f3111e = c0756c.f3111e;
        this.f3110d = interfaceC0757d;
    }

    /* JADX INFO: renamed from: a */
    public static C0756c m1774a(Object obj) {
        if (obj instanceof C0756c) {
            return (C0756c) obj;
        }
        if (obj != null) {
            return new C0756c(AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static C0756c m1775a(AbstractC0539ab abstractC0539ab) {
        return m1774a(AbstractC0723v.m1709a(abstractC0539ab, true));
    }

    /* JADX INFO: renamed from: a */
    public static C0756c m1776a(InterfaceC0757d interfaceC0757d, Object obj) {
        if (obj instanceof C0756c) {
            return new C0756c(interfaceC0757d, (C0756c) obj);
        }
        if (obj != null) {
            return new C0756c(interfaceC0757d, AbstractC0723v.m1708a(obj));
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public final C0755b[] m1777a() {
        C0755b[] c0755bArr = new C0755b[this.f3111e.length];
        System.arraycopy(this.f3111e, 0, c0755bArr, 0, c0755bArr.length);
        return c0755bArr;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0756c) && !(obj instanceof AbstractC0723v)) {
            return false;
        }
        if (mo1358i().equals(((InterfaceC0618f) obj).mo1358i())) {
            return true;
        }
        try {
            return this.f3110d.mo1760a(this, new C0756c(AbstractC0723v.m1708a((Object) ((InterfaceC0618f) obj).mo1358i())));
        } catch (Exception e) {
            return false;
        }
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o
    public final int hashCode() {
        if (this.f3108b) {
            return this.f3109c;
        }
        this.f3108b = true;
        this.f3109c = this.f3110d.mo1759a(this);
        return this.f3109c;
    }

    @Override // org.bouncycastle.p054a.AbstractC0650o, org.bouncycastle.p054a.InterfaceC0618f
    /* JADX INFO: renamed from: i */
    public final AbstractC0686u mo1358i() {
        return new C0585bi(this.f3111e);
    }

    public final String toString() {
        return this.f3110d.mo1761b(this);
    }
}
