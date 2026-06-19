package p000a.p003c;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;
import p000a.InterfaceC0016c;
import p000a.p003c.p005b.C0029a;
import p000a.p003c.p005b.C0030b;

/* JADX INFO: renamed from: a.c.f */
/* JADX INFO: compiled from: DcerpcHandle.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0037f implements InterfaceC0034c, AutoCloseable {

    /* JADX INFO: renamed from: b */
    private static final AtomicInteger f190b = new AtomicInteger(1);

    /* JADX INFO: renamed from: c */
    private final C0028b f191c;

    /* JADX INFO: renamed from: d */
    private int f192d = 4280;

    /* JADX INFO: renamed from: e */
    private int f193e = this.f192d;

    /* JADX INFO: renamed from: f */
    private int f194f = 0;

    /* JADX INFO: renamed from: g */
    private InterfaceC0040i f195g = null;

    /* JADX INFO: renamed from: h */
    private InterfaceC0016c f196h;

    /* JADX INFO: renamed from: a */
    protected abstract int mo159a(byte[] bArr);

    /* JADX INFO: renamed from: a */
    protected abstract int mo160a(byte[] bArr, int i, int i2, byte[] bArr2);

    /* JADX INFO: renamed from: a */
    protected abstract void mo163a(byte[] bArr, int i, int i2);

    /* JADX INFO: renamed from: a */
    protected static C0028b m153a(String str) throws C0036e {
        String strSubstring;
        char[] charArray = str.toCharArray();
        C0028b c0028b = null;
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
                        c0028b = new C0028b(strSubstring2, strSubstring);
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
                        if (c0028b != null) {
                            c0028b.m132a(strTrim, strTrim3);
                        }
                        strTrim = null;
                    }
                    break;
            }
            length++;
        } while (length < charArray.length);
        if (c0028b == null || c0028b.m133b() == null) {
            throw new C0036e("Invalid binding URL: ".concat(String.valueOf(str)));
        }
        return c0028b;
    }

    public AbstractC0037f(InterfaceC0016c interfaceC0016c, C0028b c0028b) {
        this.f196h = interfaceC0016c;
        this.f191c = c0028b;
    }

    /* JADX INFO: renamed from: a */
    public final C0028b m161a() {
        return this.f191c;
    }

    /* JADX INFO: renamed from: b */
    final int m164b() {
        return this.f193e;
    }

    /* JADX INFO: renamed from: c */
    final int m165c() {
        return this.f192d;
    }

    /* JADX INFO: renamed from: d */
    private void m158d() {
        synchronized (this) {
            try {
                this.f194f = 1;
                m162a(new C0017a(this.f191c, this));
            } catch (IOException e) {
                this.f194f = 0;
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m162a(AbstractC0038g abstractC0038g) throws C0036e {
        C0029a c0029a;
        if (this.f194f == 0) {
            m158d();
        }
        byte[] bArrMo106a = this.f196h.mo116c().mo106a();
        byte[] bArrMo106a2 = this.f196h.mo116c().mo106a();
        try {
            int iMo160a = mo160a(bArrMo106a2, m152a(abstractC0038g, bArrMo106a2, m157b(abstractC0038g, bArrMo106a2)), abstractC0038g.f199d, bArrMo106a);
            if (iMo160a != 0) {
                C0029a c0029a2 = new C0029a(bArrMo106a, 0);
                m155a(c0029a2);
                c0029a2.f181c = 0;
                abstractC0038g.m168d(c0029a2);
            }
            if (iMo160a != 0 && !abstractC0038g.m167c()) {
                c0029a = new C0029a(m156a(abstractC0038g, bArrMo106a), 0);
            } else {
                c0029a = new C0029a(bArrMo106a, 0);
            }
            abstractC0038g.mo129f(c0029a);
            this.f196h.mo116c().mo105a(bArrMo106a);
            this.f196h.mo116c().mo105a(bArrMo106a2);
            C0036e c0036eMo123a = abstractC0038g.mo123a();
            if (c0036eMo123a != null) {
                throw c0036eMo123a;
            }
        } catch (Throwable th) {
            this.f196h.mo116c().mo105a(bArrMo106a);
            this.f196h.mo116c().mo105a(bArrMo106a2);
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    private byte[] m156a(AbstractC0038g abstractC0038g, byte[] bArr) throws C0030b {
        int i = abstractC0038g.f197b == 2 ? abstractC0038g.f199d : 24;
        byte[] bArr2 = new byte[this.f193e];
        C0029a c0029a = new C0029a(bArr2, 0);
        while (!abstractC0038g.m167c()) {
            mo159a(bArr2);
            m155a(c0029a);
            c0029a.m138a();
            abstractC0038g.m168d(c0029a);
            int i2 = abstractC0038g.f199d - 24;
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

    /* JADX INFO: renamed from: a */
    private static void m155a(C0029a c0029a) {
        c0029a.m138a();
        c0029a.f181c = 8;
        c0029a.m142b(c0029a.m143c());
    }

    /* JADX INFO: renamed from: b */
    private C0029a m157b(AbstractC0038g abstractC0038g, byte[] bArr) {
        C0029a c0029a = new C0029a(bArr, 0);
        abstractC0038g.f198c = 3;
        abstractC0038g.f200e = f190b.incrementAndGet();
        abstractC0038g.mo128e(c0029a);
        if (this.f195g != null) {
            c0029a.f181c = 0;
        }
        return c0029a;
    }

    public String toString() {
        return this.f191c.toString();
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        this.f194f = 0;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC0037f m154a(String str, InterfaceC0016c interfaceC0016c) throws C0036e {
        if (str.startsWith("ncacn_np:")) {
            return new C0039h(str, interfaceC0016c);
        }
        throw new C0036e("DCERPC transport not supported: ".concat(String.valueOf(str)));
    }

    /* JADX INFO: renamed from: a */
    private int m152a(AbstractC0038g abstractC0038g, byte[] bArr, C0029a c0029a) throws IOException {
        int i = c0029a.f183e.f182d - 24;
        int i2 = 0;
        while (i2 < i) {
            int i3 = i - i2;
            if (i3 + 24 > this.f192d) {
                abstractC0038g.f198c &= -3;
                i3 = this.f192d - 24;
            } else {
                abstractC0038g.f198c |= 2;
                abstractC0038g.f201f = i3;
            }
            abstractC0038g.f199d = i3 + 24;
            if (i2 > 0) {
                abstractC0038g.f198c &= -2;
            }
            if ((abstractC0038g.f198c & 3) != 3) {
                c0029a.f180b = i2;
                c0029a.m138a();
                abstractC0038g.m166c(c0029a);
                c0029a.m150g(abstractC0038g.f201f);
                c0029a.m149f(0);
                c0029a.m149f(abstractC0038g.mo125b());
            }
            if ((abstractC0038g.f198c & 2) != 2) {
                mo163a(bArr, i2, abstractC0038g.f199d);
                i2 = i3 + i2;
            } else {
                return i2;
            }
        }
        throw new IOException();
    }
}
