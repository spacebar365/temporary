package a.d.e.h;

import a.h;
import java.nio.charset.StandardCharsets;

/* JADX INFO: compiled from: Smb2TreeConnectRequest.java */
/* JADX INFO: loaded from: classes.dex */
public final class a extends a.d.e.c<b> {
    private int a;
    private String b;

    public a(h hVar, String str) {
        super(hVar, 3);
        this.b = str;
    }

    @Override // a.d.e.b
    public final boolean a(a.d.e.b bVar) {
        bVar.f(-1);
        return super.a(bVar);
    }

    @Override // a.d.c
    public final int l_() {
        return i((this.b.length() * 2) + 72);
    }

    @Override // a.d.e.b
    protected final int d(byte[] bArr, int i) {
        a.d.f.a.a(9L, bArr, i);
        a.d.f.a.a(this.a, bArr, i + 2);
        int i2 = i + 4;
        byte[] bytes = this.b.getBytes(StandardCharsets.UTF_16LE);
        a.d.f.a.a(bytes.length, bArr, i2 + 2);
        int i3 = i2 + 4;
        a.d.f.a.a(i3 - M(), bArr, i2);
        System.arraycopy(bytes, 0, bArr, i3, bytes.length);
        return (bytes.length + i3) - i;
    }

    @Override // a.d.e.b
    protected final int e(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.e.c
    protected final /* synthetic */ a.d.e.d c(a.c cVar) {
        return new b(cVar.a());
    }
}
