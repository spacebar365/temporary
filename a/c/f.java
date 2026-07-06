package a.c;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: DcerpcHandle.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class f implements c, AutoCloseable {
    private static final AtomicInteger b = new AtomicInteger(1);
    private final b c;
    private int d = 4280;
    private int e = this.d;
    private int f = 0;
    private i g = null;
    private a.c h;

    protected abstract int a(byte[] bArr);

    protected abstract int a(byte[] bArr, int i, int i2, byte[] bArr2);

    protected abstract void a(byte[] bArr, int i, int i2);

    protected static b a(String str) throws e {
        String strSubstring;
        char[] charArray = str.toCharArray();
        b bVar = null;
        String strTrim = null;
        String strSubstring2 = null;
        int length = 0;
        int i = 0;
        char c = 0;
        do {
            char c2 = charArray[length];
            switch (c) {
                case 0:
                    if (c2 == ':') {
                        strSubstring2 = str.substring(i, length);
                        i = length + 1;
                        c = 1;
                    }
                    break;
                case 1:
                    if (c2 == '\\') {
                        i = length + 1;
                        break;
                    } else {
                        c = 2;
                        break;
                    }
                case 2:
                    if (c2 == '[') {
                        String strTrim2 = str.substring(i, length).trim();
                        if (strTrim2.length() == 0) {
                            int iIndexOf = str.indexOf(91, length + 1);
                            int iIndexOf2 = str.indexOf(93, length);
                            if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf2 == iIndexOf - 1) {
                                strSubstring = str.substring(length, iIndexOf2 + 1);
                                length = iIndexOf;
                            } else {
                                strSubstring = "127.0.0.1";
                            }
                        } else {
                            strSubstring = strTrim2;
                        }
                        bVar = new b(strSubstring2, strSubstring);
                        i = length + 1;
                        c = 5;
                    }
                    break;
                case 3:
                case 4:
                default:
                    length = charArray.length;
                    break;
                case 5:
                    if (c2 == '=') {
                        strTrim = str.substring(i, length).trim();
                        i = length + 1;
                    } else if (c2 == ',' || c2 == ']') {
                        String strTrim3 = str.substring(i, length).trim();
                        i = length + 1;
                        if (strTrim == null) {
                            strTrim = "endpoint";
                        }
                        if (bVar != null) {
                            bVar.a(strTrim, strTrim3);
                        }
                        strTrim = null;
                    }
                    break;
            }
            length++;
        } while (length < charArray.length);
        if (bVar == null || bVar.b() == null) {
            throw new e("Invalid binding URL: ".concat(String.valueOf(str)));
        }
        return bVar;
    }

    public f(a.c cVar, b bVar) {
        this.h = cVar;
        this.c = bVar;
    }

    public final b a() {
        return this.c;
    }

    final int b() {
        return this.e;
    }

    final int c() {
        return this.d;
    }

    private void d() {
        synchronized (this) {
            try {
                this.f = 1;
                a(new a(this.c, this));
            } catch (IOException e) {
                this.f = 0;
                throw e;
            }
        }
    }

    public final void a(g gVar) throws e {
        a.c.b.a aVar;
        if (this.f == 0) {
            d();
        }
        byte[] bArrA = this.h.c().a();
        byte[] bArrA2 = this.h.c().a();
        try {
            int iA = a(bArrA2, a(gVar, bArrA2, b(gVar, bArrA2)), gVar.d, bArrA);
            if (iA != 0) {
                a.c.b.a aVar2 = new a.c.b.a(bArrA, 0);
                a(aVar2);
                aVar2.c = 0;
                gVar.d(aVar2);
            }
            if (iA != 0 && !gVar.c()) {
                aVar = new a.c.b.a(a(gVar, bArrA), 0);
            } else {
                aVar = new a.c.b.a(bArrA, 0);
            }
            gVar.f(aVar);
            this.h.c().a(bArrA);
            this.h.c().a(bArrA2);
            e eVarA = gVar.a();
            if (eVarA != null) {
                throw eVarA;
            }
        } catch (Throwable th) {
            this.h.c().a(bArrA);
            this.h.c().a(bArrA2);
            throw th;
        }
    }

    private byte[] a(g gVar, byte[] bArr) throws a.c.b.b {
        int i = gVar.b == 2 ? gVar.d : 24;
        byte[] bArr2 = new byte[this.e];
        a.c.b.a aVar = new a.c.b.a(bArr2, 0);
        while (!gVar.c()) {
            a(bArr2);
            a(aVar);
            aVar.a();
            gVar.d(aVar);
            int i2 = gVar.d - 24;
            if (i + i2 > bArr.length) {
                byte[] bArr3 = new byte[i + i2];
                System.arraycopy(bArr, 0, bArr3, 0, i);
                bArr = bArr3;
            }
            System.arraycopy(bArr2, 24, bArr, i, i2);
            i += i2;
        }
        return bArr;
    }

    private static void a(a.c.b.a aVar) {
        aVar.a();
        aVar.c = 8;
        aVar.b(aVar.c());
    }

    private a.c.b.a b(g gVar, byte[] bArr) {
        a.c.b.a aVar = new a.c.b.a(bArr, 0);
        gVar.c = 3;
        gVar.e = b.incrementAndGet();
        gVar.e(aVar);
        if (this.g != null) {
            aVar.c = 0;
        }
        return aVar;
    }

    public String toString() {
        return this.c.toString();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f = 0;
    }

    public static f a(String str, a.c cVar) throws e {
        if (str.startsWith("ncacn_np:")) {
            return new h(str, cVar);
        }
        throw new e("DCERPC transport not supported: ".concat(String.valueOf(str)));
    }

    private int a(g gVar, byte[] bArr, a.c.b.a aVar) throws IOException {
        int i = aVar.e.d - 24;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            if (i3 + 24 > this.d) {
                gVar.c &= -3;
                i3 = this.d - 24;
            } else {
                gVar.c |= 2;
                gVar.f = i3;
            }
            gVar.d = i3 + 24;
            if (i2 > 0) {
                gVar.c &= -2;
            }
            if ((gVar.c & 3) != 3) {
                aVar.b = i2;
                aVar.a();
                gVar.c(aVar);
                aVar.g(gVar.f);
                aVar.f(0);
                aVar.f(gVar.b());
            }
            if ((gVar.c & 2) != 2) {
                a(bArr, i2, gVar.d);
                i2 = i3 + i2;
            } else {
                return i2;
            }
        }
        throw new IOException();
    }
}
