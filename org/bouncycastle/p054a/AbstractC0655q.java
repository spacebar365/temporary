package org.bouncycastle.p054a;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;
import org.bouncycastle.p142f.C1535a;
import org.bouncycastle.p142f.C1560k;
import org.bouncycastle.p142f.p143a.C1541f;

/* JADX INFO: renamed from: org.bouncycastle.a.q */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0655q extends AbstractC0686u implements InterfaceC0657r {

    /* JADX INFO: renamed from: a */
    byte[] f2558a;

    public AbstractC0655q(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("string cannot be null");
        }
        this.f2558a = bArr;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0655q m1596a(Object obj) {
        if (obj == null || (obj instanceof AbstractC0655q)) {
            return (AbstractC0655q) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return m1596a((Object) AbstractC0686u.m1692b((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e.getMessage());
            }
        }
        if (obj instanceof InterfaceC0618f) {
            AbstractC0686u abstractC0686uMo1358i = ((InterfaceC0618f) obj).mo1358i();
            if (abstractC0686uMo1358i instanceof AbstractC0655q) {
                return (AbstractC0655q) abstractC0686uMo1358i;
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    abstract void mo1335a(C0660s c0660s);

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: a */
    final boolean mo1337a(AbstractC0686u abstractC0686u) {
        if (abstractC0686u instanceof AbstractC0655q) {
            return C1535a.m4076a(this.f2558a, ((AbstractC0655q) abstractC0686u).f2558a);
        }
        return false;
    }

    @Override // org.bouncycastle.p054a.InterfaceC0657r
    /* JADX INFO: renamed from: b */
    public final InputStream mo1412b() {
        return new ByteArrayInputStream(this.f2558a);
    }

    /* JADX INFO: renamed from: c */
    public byte[] mo1410c() {
        return this.f2558a;
    }

    @Override // org.bouncycastle.p054a.InterfaceC0606cb
    /* JADX INFO: renamed from: d */
    public final AbstractC0686u mo1398d() {
        return mo1358i();
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: g */
    final AbstractC0686u mo1400g() {
        return new C0581be(this.f2558a);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u
    /* JADX INFO: renamed from: h */
    final AbstractC0686u mo1401h() {
        return new C0581be(this.f2558a);
    }

    @Override // org.bouncycastle.p054a.AbstractC0686u, org.bouncycastle.p054a.AbstractC0650o
    public int hashCode() {
        return C1535a.m4066a(mo1410c());
    }

    public String toString() {
        return "#" + C1560k.m4164b(C1541f.m4108b(this.f2558a));
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0655q m1597a(AbstractC0539ab abstractC0539ab, boolean z) {
        AbstractC0686u abstractC0686uM1402j = abstractC0539ab.m1402j();
        if (z || (abstractC0686uM1402j instanceof AbstractC0655q)) {
            return m1596a((Object) abstractC0686uM1402j);
        }
        AbstractC0723v abstractC0723vM1708a = AbstractC0723v.m1708a((Object) abstractC0686uM1402j);
        AbstractC0655q[] abstractC0655qArr = new AbstractC0655q[abstractC0723vM1708a.mo1484d()];
        Enumeration enumerationMo1483c = abstractC0723vM1708a.mo1483c();
        int i = 0;
        while (enumerationMo1483c.hasMoreElements()) {
            abstractC0655qArr[i] = (AbstractC0655q) enumerationMo1483c.nextElement();
            i++;
        }
        return new C0545ah(abstractC0655qArr);
    }
}
