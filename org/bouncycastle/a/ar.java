package org.bouncycastle.a;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
final class ar extends InputStream {
    private final z a;
    private boolean b = true;
    private InputStream c;

    ar(z zVar) {
        this.a = zVar;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        r rVar;
        if (this.c == null) {
            if (this.b && (rVar = (r) this.a.a()) != null) {
                this.b = false;
                this.c = rVar.b();
            }
            return -1;
        }
        while (true) {
            int i = this.c.read();
            if (i >= 0) {
                return i;
            }
            r rVar2 = (r) this.a.a();
            if (rVar2 == null) {
                this.c = null;
                return -1;
            }
            this.c = rVar2.b();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        r rVar;
        int i4 = 0;
        if (this.c == null) {
            if (this.b && (rVar = (r) this.a.a()) != null) {
                this.b = false;
                this.c = rVar.b();
            }
            return -1;
        }
        while (true) {
            int i5 = this.c.read(bArr, i + i4, i2 - i4);
            if (i5 >= 0) {
                i3 = i5 + i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                r rVar2 = (r) this.a.a();
                if (rVar2 == null) {
                    this.c = null;
                    if (i4 <= 0) {
                        return -1;
                    }
                    return i4;
                }
                this.c = rVar2.b();
                i3 = i4;
            }
            i4 = i3;
        }
    }
}
