package org.bouncycastle.p083b.p101n;

import java.io.ByteArrayOutputStream;
import org.bouncycastle.p083b.InterfaceC0811ak;
import org.bouncycastle.p083b.InterfaceC1003i;
import org.bouncycastle.p083b.p097k.C1055ag;
import org.bouncycastle.p083b.p097k.C1056ah;
import org.bouncycastle.p107d.p108a.p115d.AbstractC1382a;
import org.bouncycastle.p142f.C1535a;

/* JADX INFO: renamed from: org.bouncycastle.b.n.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1151i implements InterfaceC0811ak {

    /* JADX INFO: renamed from: a */
    private final a f4592a = new a(0);

    /* JADX INFO: renamed from: b */
    private boolean f4593b;

    /* JADX INFO: renamed from: c */
    private C1055ag f4594c;

    /* JADX INFO: renamed from: d */
    private C1056ah f4595d;

    /* JADX INFO: renamed from: org.bouncycastle.b.n.i$a */
    private static class a extends ByteArrayOutputStream {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        /* JADX INFO: renamed from: a */
        final synchronized boolean m2758a(C1056ah c1056ah, byte[] bArr) {
            boolean zM3394a;
            zM3394a = AbstractC1382a.m3394a(bArr, c1056ah.m2571b(), this.buf, this.count);
            reset();
            return zM3394a;
        }

        /* JADX INFO: renamed from: a */
        final synchronized byte[] m2759a(C1055ag c1055ag, C1056ah c1056ah) {
            byte[] bArr;
            bArr = new byte[64];
            c1055ag.m2567a(c1056ah, this.buf, this.count, bArr);
            reset();
            return bArr;
        }

        @Override // java.io.ByteArrayOutputStream
        public final synchronized void reset() {
            C1535a.m4084b(this.buf, 0, this.count);
            this.count = 0;
        }
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final void mo1903a(byte b) {
        this.f4592a.write(b);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final void mo1905a(byte[] bArr, int i, int i2) {
        this.f4592a.write(bArr, i, i2);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final boolean mo1906a(byte[] bArr) {
        if (this.f4593b || this.f4595d == null) {
            throw new IllegalStateException("Ed25519Signer not initialised for verification");
        }
        return this.f4592a.m2758a(this.f4595d, bArr);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final byte[] mo1907a() {
        if (!this.f4593b || this.f4594c == null) {
            throw new IllegalStateException("Ed25519Signer not initialised for signature generation.");
        }
        return this.f4592a.m2759a(this.f4594c, this.f4595d);
    }

    @Override // org.bouncycastle.p083b.InterfaceC0811ak
    /* JADX INFO: renamed from: a */
    public final void mo1904a(boolean z, InterfaceC1003i interfaceC1003i) {
        this.f4593b = z;
        if (z) {
            this.f4594c = (C1055ag) interfaceC1003i;
            this.f4595d = this.f4594c.m2569c();
        } else {
            this.f4594c = null;
            this.f4595d = (C1056ah) interfaceC1003i;
        }
        this.f4592a.reset();
    }
}
