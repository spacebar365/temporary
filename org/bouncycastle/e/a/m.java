package org.bouncycastle.e.a;

import java.math.BigInteger;
import org.bouncycastle.a.ab;
import org.bouncycastle.a.be;
import org.bouncycastle.a.bi;
import org.bouncycastle.a.bn;
import org.bouncycastle.a.o;
import org.bouncycastle.a.u;
import org.bouncycastle.a.v;

/* JADX INFO: loaded from: classes.dex */
public final class m extends o {
    private final int a;
    private final byte[] b;
    private final byte[] c;
    private final byte[] d;
    private final byte[] e;
    private final byte[] f;

    public m(int i, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        this.a = i;
        this.b = org.bouncycastle.f.a.b(bArr);
        this.c = org.bouncycastle.f.a.b(bArr2);
        this.d = org.bouncycastle.f.a.b(bArr3);
        this.e = org.bouncycastle.f.a.b(bArr4);
        this.f = org.bouncycastle.f.a.b(bArr5);
    }

    private m(v vVar) {
        if (!org.bouncycastle.a.m.a(vVar.a(0)).b().equals(BigInteger.valueOf(0L))) {
            throw new IllegalArgumentException("unknown version of sequence");
        }
        if (vVar.d() != 2 && vVar.d() != 3) {
            throw new IllegalArgumentException("key sequence wrong size");
        }
        v vVarA = v.a(vVar.a(1));
        this.a = org.bouncycastle.a.m.a(vVarA.a(0)).b().intValue();
        this.b = org.bouncycastle.f.a.b(be.a(vVarA.a(1)).c());
        this.c = org.bouncycastle.f.a.b(be.a(vVarA.a(2)).c());
        this.d = org.bouncycastle.f.a.b(be.a(vVarA.a(3)).c());
        this.e = org.bouncycastle.f.a.b(be.a(vVarA.a(4)).c());
        if (vVar.d() == 3) {
            this.f = org.bouncycastle.f.a.b(be.a(ab.a(vVar.a(2)), true).c());
        } else {
            this.f = null;
        }
    }

    public static m a(Object obj) {
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj != null) {
            return new m(v.a(obj));
        }
        return null;
    }

    public final int a() {
        return this.a;
    }

    public final byte[] b() {
        return org.bouncycastle.f.a.b(this.b);
    }

    public final byte[] c() {
        return org.bouncycastle.f.a.b(this.c);
    }

    public final byte[] d() {
        return org.bouncycastle.f.a.b(this.d);
    }

    public final byte[] e() {
        return org.bouncycastle.f.a.b(this.e);
    }

    public final byte[] f() {
        return org.bouncycastle.f.a.b(this.f);
    }

    @Override // org.bouncycastle.a.o, org.bouncycastle.a.f
    public final u i() {
        org.bouncycastle.a.g gVar = new org.bouncycastle.a.g();
        gVar.a(new org.bouncycastle.a.m(0L));
        org.bouncycastle.a.g gVar2 = new org.bouncycastle.a.g();
        gVar2.a(new org.bouncycastle.a.m(this.a));
        gVar2.a(new be(this.b));
        gVar2.a(new be(this.c));
        gVar2.a(new be(this.d));
        gVar2.a(new be(this.e));
        gVar.a(new bi(gVar2));
        gVar.a(new bn(true, 0, new be(this.f)));
        return new bi(gVar);
    }
}
