package org.bouncycastle.a;

import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes.dex */
public class s {
    private OutputStream a;

    public s(OutputStream outputStream) {
        this.a = outputStream;
    }

    public final void a() throws IOException {
        this.a.close();
    }

    final void a(int i) {
        if (i <= 127) {
            b((byte) i);
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
        b((byte) (i2 | 128));
        for (int i4 = (i2 - 1) * 8; i4 >= 0; i4 -= 8) {
            b((byte) (i >> i4));
        }
    }

    final void a(int i, int i2, byte[] bArr) throws IOException {
        a(i, i2);
        a(bArr.length);
        a(bArr);
    }

    final void a(int i, byte[] bArr) {
        b(i);
        a(bArr.length);
        a(bArr);
    }

    public void a(f fVar) throws IOException {
        if (fVar == null) {
            throw new IOException("null object detected");
        }
        fVar.i().a(this);
    }

    final void a(u uVar) throws IOException {
        if (uVar == null) {
            throw new IOException("null object detected");
        }
        uVar.a(new s$a(this, this.a));
    }

    final void a(byte[] bArr) {
        this.a.write(bArr);
    }

    s b() {
        return new bg(this.a);
    }

    void b(int i) {
        this.a.write(i);
    }

    s c() {
        return new bv(this.a);
    }

    final void a(int i, int i2) throws IOException {
        int i3 = 4;
        if (i2 < 31) {
            b(i | i2);
            return;
        }
        b(i | 31);
        if (i2 < 128) {
            b(i2);
            return;
        }
        byte[] bArr = new byte[5];
        bArr[4] = (byte) (i2 & 127);
        do {
            i2 >>= 7;
            i3--;
            bArr[i3] = (byte) ((i2 & 127) | 128);
        } while (i2 > 127);
        this.a.write(bArr, i3, 5 - i3);
    }
}
