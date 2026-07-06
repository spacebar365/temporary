package a.d.d.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: SmbComNegotiate.java */
/* JADX INFO: loaded from: classes.dex */
public final class j extends a.d.d.c implements a.d.k {
    private final boolean n;
    private String[] o;

    public j(a.h hVar, boolean z) {
        super(hVar, (byte) 114);
        this.n = z;
        e(hVar.M());
        if (hVar.f().a()) {
            this.o = new String[]{"SMB 2.???", "SMB 2.002"};
        } else if (hVar.g().a()) {
            this.o = new String[]{"NT LM 0.12", "SMB 2.???", "SMB 2.002"};
        } else {
            this.o = new String[]{"NT LM 0.12"};
        }
    }

    @Override // a.d.k
    public final boolean g_() {
        return this.n;
    }

    @Override // a.d.d.c
    protected final int f(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    protected final int g(byte[] bArr, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        for (String str : this.o) {
            byteArrayOutputStream.write(2);
            try {
                byteArrayOutputStream.write(a.i.f.b(str));
                byteArrayOutputStream.write(0);
            } catch (IOException e) {
                throw new a.u(e);
            }
        }
        System.arraycopy(byteArrayOutputStream.toByteArray(), 0, bArr, i, byteArrayOutputStream.size());
        return byteArrayOutputStream.size();
    }

    @Override // a.d.d.c
    protected final int h(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    protected final int i(byte[] bArr, int i) {
        return 0;
    }

    @Override // a.d.d.c
    public final String toString() {
        return new String("SmbComNegotiate[" + super.toString() + ",wordCount=" + this.i + ",dialects=NT LM 0.12]");
    }
}
