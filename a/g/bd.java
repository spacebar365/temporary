package a.g;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.a.bg;
import org.bouncycastle.a.bi;

/* JADX INFO: compiled from: SpnegoContext.java */
/* JADX INFO: loaded from: classes.dex */
class bd implements z {
    private static final org.c.b a = org.c.c.a((Class<?>) bd.class);
    private static org.bouncycastle.a.p b;
    private z c;
    private boolean d;
    private boolean e;
    private org.bouncycastle.a.p[] f;
    private org.bouncycastle.a.p g;
    private org.bouncycastle.a.p[] h;
    private boolean i;
    private boolean j;

    static {
        try {
            b = new org.bouncycastle.a.p("1.3.6.1.5.5.2");
        } catch (IllegalArgumentException e) {
            a.e("Failed to initialize OID", e);
        }
    }

    bd(a.h hVar, z zVar) {
        this(hVar, zVar, zVar.a());
    }

    private bd(a.h hVar, z zVar, org.bouncycastle.a.p[] pVarArr) {
        this.d = true;
        this.c = zVar;
        this.f = pVarArr;
        this.i = !hVar.ap() && hVar.ao();
        this.j = hVar.ap();
    }

    @Override // a.g.z
    public final org.bouncycastle.a.p[] a() {
        return new org.bouncycastle.a.p[]{b};
    }

    @Override // a.g.z
    public final int b() {
        return this.c.b();
    }

    @Override // a.g.z
    public final boolean a(org.bouncycastle.a.p pVar) {
        return false;
    }

    @Override // a.g.z
    public final String e() {
        return null;
    }

    @Override // a.g.z
    public final byte[] d() {
        return this.c.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x017d  */
    @Override // a.g.z
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] a(byte[] r9, int r10) throws a.d {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: a.g.bd.a(byte[], int):byte[]");
    }

    private byte[] h() throws a.d {
        if (!this.c.g()) {
            return null;
        }
        org.bouncycastle.a.p[] pVarArr = this.f;
        byte[] bArrA = a(pVarArr);
        byte[] bArrA2 = this.c.a(bArrA);
        if (a.c()) {
            a.b("Out Mech list " + Arrays.toString(pVarArr));
            a.b("Out Mech list encoded " + a.i.e.a(bArrA));
            a.b("Out Mech list MIC " + a.i.e.a(bArrA2));
            return bArrA2;
        }
        return bArrA2;
    }

    private void b(byte[] bArr) throws a.d {
        if (!this.i) {
            if ((bArr == null || !this.c.f()) && this.j && !this.c.b(this.g)) {
                throw new a.d("SPNEGO integrity is required but not available");
            }
            if (this.c.g() && bArr != null) {
                try {
                    org.bouncycastle.a.p[] pVarArr = this.f;
                    byte[] bArrA = a(pVarArr);
                    if (a.d()) {
                        a.b("In Mech list " + Arrays.toString(pVarArr));
                        a.b("In Mech list encoded " + a.i.e.a(bArrA));
                        a.b("In Mech list MIC " + a.i.e.a(bArr));
                    }
                    this.c.a(bArrA, bArr);
                } catch (a.d e) {
                    throw new a.d("Failed to verify mechanismListMIC", e);
                }
            }
        }
    }

    private static byte[] a(org.bouncycastle.a.p[] pVarArr) throws a.d {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bg bgVar = new bg(byteArrayOutputStream);
            bgVar.a((org.bouncycastle.a.f) new bi(pVarArr));
            bgVar.a();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new a.d("Failed to encode mechList", e);
        }
    }

    private a.h.d i() {
        return new a.h.a(this.f, this.c.b(), this.c.a(new byte[0], 0));
    }

    @Override // a.g.z
    public final boolean c() {
        return this.e && this.c.c();
    }

    private static a.h.d c(byte[] bArr) throws a.h.c {
        try {
            switch (bArr[0]) {
                case -95:
                    return new a.h.b(bArr);
                case 96:
                    return new a.h.a(bArr);
                default:
                    throw new a.h.c("Invalid token type");
            }
        } catch (IOException e) {
            throw new a.h.c("Invalid token");
        }
    }

    @Override // a.g.z
    public final boolean f() {
        return this.c.f();
    }

    @Override // a.g.z
    public final boolean b(org.bouncycastle.a.p pVar) {
        return this.c.b(pVar);
    }

    @Override // a.g.z
    public final byte[] a(byte[] bArr) throws a.d {
        if (!this.e) {
            throw new a.d("Context is not established");
        }
        return this.c.a(bArr);
    }

    @Override // a.g.z
    public final void a(byte[] bArr, byte[] bArr2) throws a.d {
        if (!this.e) {
            throw new a.d("Context is not established");
        }
        this.c.a(bArr, bArr2);
    }

    @Override // a.g.z
    public final boolean g() {
        if (this.e) {
            return this.c.g();
        }
        return false;
    }

    public String toString() {
        return "SPNEGO[" + this.c + "]";
    }
}
