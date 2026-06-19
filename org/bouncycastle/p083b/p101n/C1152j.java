package org.bouncycastle.p083b.p101n;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.p083b.InterfaceC0811ak;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1058aj;
import org.bouncycastle.p083b.p097k.C1059ak;
import org.bouncycastle.p107d.p108a.p115d.AbstractC1383b;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.n.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1152j implements InterfaceC0811ak {

    /* JADX INFO: renamed from: a */
    private final a f4596a = new a(0);

    /* JADX INFO: renamed from: b */
    private final byte[] f4597b;

    /* JADX INFO: renamed from: c */
    private boolean f4598c;

    /* JADX INFO: renamed from: d */
    private C1058aj f4599d;

    /* JADX INFO: renamed from: e */
    private C1059ak f4600e;

    /* JADX INFO: renamed from: org.bouncycastle.b.n.j$a */
    private static class a extends ByteArrayOutputStream {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        /* JADX INFO: renamed from: a */
        final synchronized boolean m2760a(C1059ak c1059ak, byte[] bArr, byte[] bArr2) {
            boolean zM3420a;
            zM3420a = AbstractC1383b.m3420a(bArr2, c1059ak.m2576b(), bArr, this.buf, this.count);
            reset();
            return zM3420a;
        }

        /* JADX INFO: renamed from: a */
        final synchronized byte[] m2761a(C1058aj c1058aj, C1059ak c1059ak, byte[] bArr) {
            byte[] bArr2;
            bArr2 = new byte[114];
            c1058aj.m2572a(c1059ak, bArr, this.buf, this.count, bArr2);
            reset();
            return bArr2;
        }

        @Override // java.io.ByteArrayOutputStream
        public final synchronized void reset() {
            C1535a.m4084b(this.buf, 0, this.count);
            this.count = 0;
        }
    }

    public C1152j(byte[] bArr) {
        this.f4597b = C1535a.m4086b(bArr);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final void mo1903a(byte b) {
        this.f4596a.write(b);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final void mo1905a(byte[] bArr, int i, int i2) {
        this.f4596a.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final boolean mo1906a(byte[] bArr) {
        if (this.f4598c || this.f4600e == null) {
            throw new IllegalStateException("Ed448Signer not initialised for verification");
        }
        return this.f4596a.m2760a(this.f4600e, this.f4597b, bArr);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final byte[] mo1907a() {
        if (!this.f4598c || this.f4599d == null) {
            throw new IllegalStateException("Ed448Signer not initialised for signature generation.");
        }
        return this.f4596a.m2761a(this.f4599d, this.f4600e, this.f4597b);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final void mo1904a(boolean z, InterfaceC1003i interfaceC1003i) {
        this.f4598c = z;
        if (z) {
            this.f4599d = (C1058aj) interfaceC1003i;
            this.f4600e = this.f4599d.m2574c();
        } else {
            this.f4599d = null;
            this.f4600e = (C1059ak) interfaceC1003i;
        }
        this.f4596a.reset();
    }
}
