package a.d.e.b;

import a.h;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: Smb2QueryDirectoryRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a.d.e.c<b> implements a.d.e.a {
    private byte a;
    private byte b;
    private int c;
    private byte[] d;
    private int e;
    private String f;

    public a(h hVar) {
        this(hVar, a.d.e.e.a);
    }

    public a(h hVar, byte[] bArr) {
        super(hVar, 14);
        this.a = (byte) 3;
        this.e = (hVar.ae() - 72) & (-8);
        this.d = bArr;
    }

    @Override // a.d.e.a
    public final void a(byte[] bArr) {
        this.d = bArr;
    }

    public final void k() {
        this.b = (byte) 4;
    }

    public final void k(int i) {
        this.c = i;
    }

    public final void a(String str) {
        this.f = str;
    }

    @Override // a.d.c
    public final int l_() {
        return i((this.f != null ? this.f.length() * 2 : 0) + 96);
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        a.d.f.a.a(33L, bArr, i);
        bArr[i + 2] = this.a;
        bArr[i + 3] = this.b;
        int i2 = i + 4;
        a.d.f.a.b(this.c, bArr, i2);
        int i3 = i2 + 4;
        System.arraycopy(this.d, 0, bArr, i3, 16);
        int i4 = i3 + 16;
        int i5 = i4 + 2;
        int i6 = i4 + 4;
        a.d.f.a.b(this.e, bArr, i6);
        int length = i6 + 4;
        if (this.f == null) {
            a.d.f.a.a(0L, bArr, i4);
            a.d.f.a.a(0L, bArr, i5);
        } else {
            byte[] bytes = this.f.getBytes(StandardCharsets.UTF_16LE);
            a.d.f.a.a(length - M(), bArr, i4);
            a.d.f.a.a(bytes.length, bArr, i5);
            System.arraycopy(bytes, 0, bArr, length, bytes.length);
            length += bytes.length;
        }
        return length - i;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.c
    protected final /* synthetic */ a.d.e.d c(a.c cVar) {
        return new b(cVar.a(), this.a);
    }
}
