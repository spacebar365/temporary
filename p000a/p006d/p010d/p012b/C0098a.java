package p000a.p006d.p010d.p012b;

import java.io.UnsupportedEncodingException;
import p000a.InterfaceC0267h;
import p000a.p006d.p010d.p013c.AbstractC0104a;
import p000a.p006d.p025f.C0173a;

/* JADX INFO: renamed from: a.d.d.b.a */
/* JADX INFO: compiled from: NetServerEnum2.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0098a extends AbstractC0104a {

    /* JADX INFO: renamed from: n */
    static final String[] f454n = {"WrLehDO\u0000B16BBDz\u0000", "WrLehDz\u0000B16BBDz\u0000"};

    /* JADX INFO: renamed from: o */
    String f455o;

    /* JADX INFO: renamed from: p */
    String f456p;

    /* JADX INFO: renamed from: q */
    int f457q;

    public C0098a(InterfaceC0267h interfaceC0267h, String str, int i) {
        super(interfaceC0267h, (byte) 37, (byte) 104);
        this.f456p = null;
        this.f455o = str;
        this.f457q = i;
        this.f513G = "\\PIPE\\LANMAN";
        this.f508B = 8;
        this.f509C = 16384;
        this.f510D = (byte) 0;
        this.f512F = 0;
        this.f511E = 5000;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: a */
    public final void mo318a(int i, String str) {
        super.mo217e_();
        this.f456p = str;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: j */
    protected final int mo319j(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: k */
    protected final int mo320k(byte[] bArr, int i) {
        char c = m381X() == 104 ? (char) 0 : (char) 1;
        try {
            byte[] bytes = f454n[c].getBytes("ASCII");
            C0173a.m510a(m381X() & 255, bArr, i);
            int i2 = i + 2;
            System.arraycopy(bytes, 0, bArr, i2, bytes.length);
            int length = bytes.length + i2;
            C0173a.m510a(1L, bArr, length);
            int i3 = length + 2;
            C0173a.m510a(this.f509C, bArr, i3);
            int i4 = i3 + 2;
            C0173a.m512b(this.f457q, bArr, i4);
            int i5 = i4 + 4;
            int iA = i5 + m347a(this.f455o.toUpperCase(), bArr, i5, false);
            return (c == 1 ? m347a(this.f456p.toUpperCase(), bArr, iA, false) + iA : iA) - i;
        } catch (UnsupportedEncodingException e) {
            return 0;
        }
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a
    /* JADX INFO: renamed from: l */
    protected final int mo321l(byte[] bArr, int i) {
        return 0;
    }

    @Override // p000a.p006d.p010d.p013c.AbstractC0104a, p000a.p006d.p010d.AbstractC0103c
    public final String toString() {
        return new String("NetServerEnum2[" + super.toString() + ",name=" + this.f513G + ",serverTypes=" + (this.f457q == -1 ? "SV_TYPE_ALL" : "SV_TYPE_DOMAIN_ENUM") + "]");
    }
}
