package org.bouncycastle.a;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

/* JADX INFO: loaded from: classes.dex */
public abstract class q extends u implements r {
    byte[] a;

    public q(byte[] bArr) {
        if (bArr == null) {
            throw new NullPointerException("string cannot be null");
        }
        this.a = bArr;
    }

    public static q a(Object obj) {
        if (obj == null || (obj instanceof q)) {
            return (q) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return a((Object) u.b((byte[]) obj));
            } catch (IOException e) {
                throw new IllegalArgumentException("failed to construct OCTET STRING from byte[]: " + e.getMessage());
            }
        }
        if (obj instanceof f) {
            u uVarI = ((f) obj).i();
            if (uVarI instanceof q) {
                return (q) uVarI;
            }
        }
        throw new IllegalArgumentException("illegal object in getInstance: " + obj.getClass().getName());
    }

    @Override // org.bouncycastle.a.u
    abstract void a(s sVar);

    @Override // org.bouncycastle.a.u
    final boolean a(u uVar) {
        if (uVar instanceof q) {
            return org.bouncycastle.f.a.a(this.a, ((q) uVar).a);
        }
        return false;
    }

    @Override // org.bouncycastle.a.r
    public final InputStream b() {
        return new ByteArrayInputStream(this.a);
    }

    public byte[] c() {
        return this.a;
    }

    @Override // org.bouncycastle.a.cb
    public final u d() {
        return i();
    }

    @Override // org.bouncycastle.a.u
    final u g() {
        return new be(this.a);
    }

    @Override // org.bouncycastle.a.u
    final u h() {
        return new be(this.a);
    }

    @Override // org.bouncycastle.a.u, org.bouncycastle.a.o
    public int hashCode() {
        return org.bouncycastle.f.a.a(c());
    }

    public String toString() {
        return "#" + org.bouncycastle.f.k.b(org.bouncycastle.f.a.f.b(this.a));
    }

    public static q a(ab abVar, boolean z) {
        u uVarJ = abVar.j();
        if (z || (uVarJ instanceof q)) {
            return a((Object) uVarJ);
        }
        v vVarA = v.a((Object) uVarJ);
        q[] qVarArr = new q[vVarA.d()];
        Enumeration enumerationC = vVarA.c();
        int i = 0;
        while (enumerationC.hasMoreElements()) {
            qVarArr[i] = (q) enumerationC.nextElement();
            i++;
        }
        return new ah(qVarArr);
    }
}
