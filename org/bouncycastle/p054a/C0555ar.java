package org.bouncycastle.p054a;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: org.bouncycastle.a.ar */
/* JADX INFO: loaded from: classes.dex */
final class C0555ar extends InputStream {

    /* JADX INFO: renamed from: a */
    private final C0758z f2015a;

    /* JADX INFO: renamed from: b */
    private boolean f2016b = true;

    /* JADX INFO: renamed from: c */
    private InputStream f2017c;

    C0555ar(C0758z c0758z) {
        this.f2015a = c0758z;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        InterfaceC0657r interfaceC0657r;
        if (this.f2017c == null) {
            if (this.f2016b && (interfaceC0657r = (InterfaceC0657r) this.f2015a.m1778a()) != null) {
                this.f2016b = false;
                this.f2017c = interfaceC0657r.mo1412b();
            }
            return -1;
        }
        while (true) {
            int i = this.f2017c.read();
            if (i >= 0) {
                return i;
            }
            InterfaceC0657r interfaceC0657r2 = (InterfaceC0657r) this.f2015a.m1778a();
            if (interfaceC0657r2 == null) {
                this.f2017c = null;
                return -1;
            }
            this.f2017c = interfaceC0657r2.mo1412b();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        InterfaceC0657r interfaceC0657r;
        int i4 = 0;
        if (this.f2017c == null) {
            if (this.f2016b && (interfaceC0657r = (InterfaceC0657r) this.f2015a.m1778a()) != null) {
                this.f2016b = false;
                this.f2017c = interfaceC0657r.mo1412b();
            }
            return -1;
        }
        while (true) {
            int i5 = this.f2017c.read(bArr, i + i4, i2 - i4);
            if (i5 >= 0) {
                i3 = i5 + i4;
                if (i3 == i2) {
                    return i3;
                }
            } else {
                InterfaceC0657r interfaceC0657r2 = (InterfaceC0657r) this.f2015a.m1778a();
                if (interfaceC0657r2 == null) {
                    this.f2017c = null;
                    if (i4 <= 0) {
                        return -1;
                    }
                    return i4;
                }
                this.f2017c = interfaceC0657r2.mo1412b();
                i3 = i4;
            }
            i4 = i3;
        }
    }
}
