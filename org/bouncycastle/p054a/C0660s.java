package org.bouncycastle.p054a;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: org.bouncycastle.a.s */
/* JADX INFO: loaded from: classes.dex */
public class C0660s {

    /* JADX INFO: renamed from: a */
    private OutputStream f2579a;

    /* JADX INFO: renamed from: org.bouncycastle.a.s$a */
    private class a extends C0660s {

        /* JADX INFO: renamed from: b */
        private boolean f2581b;

        public a(OutputStream outputStream) {
            super(outputStream);
            this.f2581b = true;
        }

        @Override // org.bouncycastle.p054a.C0660s
        /* JADX INFO: renamed from: b */
        public final void mo1608b(int i) {
            if (this.f2581b) {
                this.f2581b = false;
            } else {
                super.mo1608b(i);
            }
        }
    }

    public C0660s(OutputStream outputStream) {
        this.f2579a = outputStream;
    }

    /* JADX INFO: renamed from: a */
    public final void m1601a() throws IOException {
        this.f2579a.close();
    }

    /* JADX INFO: renamed from: a */
    final void m1602a(int i) {
        if (i <= 127) {
            mo1608b((byte) i);
            return;
        }
        int i2 = 1;
        int i3 = i;
        while (true) {
            i3 >>>= 8;
            if (i3 == 0) {
                break;
            } else {
                i2++;
            }
        }
        mo1608b((byte) (i2 | 128));
        for (int i4 = (i2 - 1) * 8; i4 >= 0; i4 -= 8) {
            mo1608b((byte) (i >> i4));
        }
    }

    /* JADX INFO: renamed from: a */
    final void m1604a(int i, int i2, byte[] bArr) throws IOException {
        m1603a(i, i2);
        m1602a(bArr.length);
        m1607a(bArr);
    }

    /* JADX INFO: renamed from: a */
    final void m1605a(int i, byte[] bArr) {
        mo1608b(i);
        m1602a(bArr.length);
        m1607a(bArr);
    }

    /* JADX INFO: renamed from: a */
    public void mo1459a(InterfaceC0618f interfaceC0618f) throws IOException {
        if (interfaceC0618f == null) {
            throw new IOException("null object detected");
        }
        interfaceC0618f.mo1358i().mo1335a(this);
    }

    /* JADX INFO: renamed from: a */
    final void m1606a(AbstractC0686u abstractC0686u) throws IOException {
        if (abstractC0686u == null) {
            throw new IOException("null object detected");
        }
        abstractC0686u.mo1335a(new a(this.f2579a));
    }

    /* JADX INFO: renamed from: a */
    final void m1607a(byte[] bArr) {
        this.f2579a.write(bArr);
    }

    /* JADX INFO: renamed from: b */
    C0660s mo1460b() {
        return new C0583bg(this.f2579a);
    }

    /* JADX INFO: renamed from: b */
    void mo1608b(int i) {
        this.f2579a.write(i);
    }

    /* JADX INFO: renamed from: c */
    C0660s mo1461c() {
        return new C0598bv(this.f2579a);
    }

    /* JADX INFO: renamed from: a */
    final void m1603a(int i, int i2) throws IOException {
        int i3 = 4;
        if (i2 < 31) {
            mo1608b(i | i2);
            return;
        }
        mo1608b(i | 31);
        if (i2 < 128) {
            mo1608b(i2);
            return;
        }
        byte[] bArr = new byte[5];
        bArr[4] = (byte) (i2 & 127);
        do {
            i2 >>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        } while (i2 > 127);
        this.f2579a.write(bArr, i3, 5 - i3);
    }
}
