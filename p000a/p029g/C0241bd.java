package p000a.p029g;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
import org.bouncycastle.p054a.C0583bg;
import org.bouncycastle.p054a.C0585bi;
import org.bouncycastle.p054a.C0653p;
import org.bouncycastle.p054a.InterfaceC0618f;
import org.p150c.C1620c;
import org.p150c.InterfaceC1612b;
import p000a.C0044d;
import p000a.InterfaceC0267h;
import p000a.p030h.AbstractC0271d;
import p000a.p030h.C0268a;
import p000a.p030h.C0269b;
import p000a.p030h.C0270c;
import p000a.p031i.C0284e;

/* JADX INFO: renamed from: a.g.bd */
/* JADX INFO: compiled from: SpnegoContext.java */
/* JADX INFO: loaded from: classes.dex */
class C0241bd implements InterfaceC0266z {

    /* JADX INFO: renamed from: a */
    private static final InterfaceC1612b f1117a = C1620c.m4563a((Class<?>) C0241bd.class);

    /* JADX INFO: renamed from: b */
    private static C0653p f1118b;

    /* JADX INFO: renamed from: c */
    private InterfaceC0266z f1119c;

    /* JADX INFO: renamed from: d */
    private boolean f1120d;

    /* JADX INFO: renamed from: e */
    private boolean f1121e;

    /* JADX INFO: renamed from: f */
    private C0653p[] f1122f;

    /* JADX INFO: renamed from: g */
    private C0653p f1123g;

    /* JADX INFO: renamed from: h */
    private C0653p[] f1124h;

    /* JADX INFO: renamed from: i */
    private boolean f1125i;

    /* JADX INFO: renamed from: j */
    private boolean f1126j;

    static {
        try {
            f1118b = new C0653p("1.3.6.1.5.5.2");
        } catch (IllegalArgumentException e) {
            f1117a.mo4544e("Failed to initialize OID", e);
        }
    }

    C0241bd(InterfaceC0267h interfaceC0267h, InterfaceC0266z interfaceC0266z) {
        this(interfaceC0267h, interfaceC0266z, interfaceC0266z.mo839a());
    }

    private C0241bd(InterfaceC0267h interfaceC0267h, InterfaceC0266z interfaceC0266z, C0653p[] c0653pArr) {
        this.f1120d = true;
        this.f1119c = interfaceC0266z;
        this.f1122f = c0653pArr;
        this.f1125i = !interfaceC0267h.mo51ap() && interfaceC0267h.mo50ao();
        this.f1126j = interfaceC0267h.mo51ap();
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: a */
    public final C0653p[] mo839a() {
        return new C0653p[]{f1118b};
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: b */
    public final int mo840b() {
        return this.f1119c.mo840b();
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: a */
    public final boolean mo836a(C0653p c0653p) {
        return false;
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: e */
    public final String mo844e() {
        return null;
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: d */
    public final byte[] mo843d() {
        return this.f1119c.mo843d();
    }

    /* JADX WARN: Removed duplicated region for block: B:93:0x017d  */
    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] mo838a(byte[] r9, int r10) throws p000a.C0044d {
        /*
            Method dump skipped, instruction units count: 401
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p000a.p029g.C0241bd.mo838a(byte[], int):byte[]");
    }

    /* JADX INFO: renamed from: h */
    private byte[] m833h() throws C0044d {
        if (!this.f1119c.mo846g()) {
            return null;
        }
        C0653p[] c0653pArr = this.f1122f;
        byte[] bArrM830a = m830a(c0653pArr);
        byte[] bArrMo837a = this.f1119c.mo837a(bArrM830a);
        if (f1117a.mo4539c()) {
            f1117a.mo4534b("Out Mech list " + Arrays.toString(c0653pArr));
            f1117a.mo4534b("Out Mech list encoded " + C0284e.m948a(bArrM830a));
            f1117a.mo4534b("Out Mech list MIC " + C0284e.m948a(bArrMo837a));
            return bArrMo837a;
        }
        return bArrMo837a;
    }

    /* JADX INFO: renamed from: b */
    private void m831b(byte[] bArr) throws C0044d {
        if (!this.f1125i) {
            if ((bArr == null || !this.f1119c.mo845f()) && this.f1126j && !this.f1119c.mo841b(this.f1123g)) {
                throw new C0044d("SPNEGO integrity is required but not available");
            }
            if (this.f1119c.mo846g() && bArr != null) {
                try {
                    C0653p[] c0653pArr = this.f1122f;
                    byte[] bArrM830a = m830a(c0653pArr);
                    if (f1117a.mo4542d()) {
                        f1117a.mo4534b("In Mech list " + Arrays.toString(c0653pArr));
                        f1117a.mo4534b("In Mech list encoded " + C0284e.m948a(bArrM830a));
                        f1117a.mo4534b("In Mech list MIC " + C0284e.m948a(bArr));
                    }
                    this.f1119c.mo835a(bArrM830a, bArr);
                } catch (C0044d e) {
                    throw new C0044d("Failed to verify mechanismListMIC", e);
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m830a(C0653p[] c0653pArr) throws C0044d {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C0583bg c0583bg = new C0583bg(byteArrayOutputStream);
            c0583bg.mo1459a((InterfaceC0618f) new C0585bi(c0653pArr));
            c0583bg.m1601a();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            throw new C0044d("Failed to encode mechList", e);
        }
    }

    /* JADX INFO: renamed from: i */
    private AbstractC0271d m834i() {
        return new C0268a(this.f1122f, this.f1119c.mo840b(), this.f1119c.mo838a(new byte[0], 0));
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: c */
    public final boolean mo842c() {
        return this.f1121e && this.f1119c.mo842c();
    }

    /* JADX INFO: renamed from: c */
    private static AbstractC0271d m832c(byte[] bArr) throws C0270c {
        try {
            switch (bArr[0]) {
                case -95:
                    return new C0269b(bArr);
                case 96:
                    return new C0268a(bArr);
                default:
                    throw new C0270c("Invalid token type");
            }
        } catch (IOException e) {
            throw new C0270c("Invalid token");
        }
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: f */
    public final boolean mo845f() {
        return this.f1119c.mo845f();
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: b */
    public final boolean mo841b(C0653p c0653p) {
        return this.f1119c.mo841b(c0653p);
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: a */
    public final byte[] mo837a(byte[] bArr) throws C0044d {
        if (!this.f1121e) {
            throw new C0044d("Context is not established");
        }
        return this.f1119c.mo837a(bArr);
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: a */
    public final void mo835a(byte[] bArr, byte[] bArr2) throws C0044d {
        if (!this.f1121e) {
            throw new C0044d("Context is not established");
        }
        this.f1119c.mo835a(bArr, bArr2);
    }

    @Override // p000a.p029g.InterfaceC0266z
    /* JADX INFO: renamed from: g */
    public final boolean mo846g() {
        if (this.f1121e) {
            return this.f1119c.mo846g();
        }
        return false;
    }

    public String toString() {
        return "SPNEGO[" + this.f1119c + "]";
    }
}
