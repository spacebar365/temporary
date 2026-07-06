package a.c;

import a.g.ai;
import a.g.ak;
import java.io.IOException;

/* JADX INFO: compiled from: DcerpcPipeHandle.java */
/* JADX INFO: loaded from: classes.dex */
public final class h extends f {
    private ai b;
    private ak c;

    public h(String str, a.c cVar) {
        super(cVar, f.a(str));
        b bVarA = a();
        String str2 = "smb://" + bVarA.a() + "/IPC$/" + bVarA.b().substring(6);
        String str3 = (String) bVarA.a("server");
        String str4 = str3 != null ? "&server=" + str3 : "";
        String str5 = (String) bVarA.a("address");
        str4 = str5 != null ? str4 + "&address=" + str5 : str4;
        this.b = new ai(str4.length() > 0 ? str2 + "?" + str4.substring(1) : str2, cVar);
        this.c = (ak) this.b.r().a(ak.class);
    }

    @Override // a.c.f
    protected final int a(byte[] bArr, int i, int i2, byte[] bArr2) throws IOException {
        if (this.c.a()) {
            throw new IOException("DCERPC pipe is no longer open");
        }
        int iA = this.c.a(bArr, i, i2, bArr2, b());
        short sA = a.i.c.a(bArr2, 8);
        if (sA > b()) {
            throw new IOException("Unexpected fragment length: ".concat(String.valueOf((int) sA)));
        }
        while (iA < sA) {
            int iA2 = this.c.a(bArr2, iA, sA - iA);
            if (iA2 == 0) {
                throw new IOException("Unexpected EOF");
            }
            iA += iA2;
        }
        return iA;
    }

    @Override // a.c.f
    protected final void a(byte[] bArr, int i, int i2) throws IOException {
        if (this.c.a()) {
            throw new IOException("DCERPC pipe is no longer open");
        }
        this.c.b(bArr, i, i2);
    }

    @Override // a.c.f
    protected final int a(byte[] bArr) throws IOException {
        if (bArr.length < b()) {
            throw new IllegalArgumentException("buffer too small");
        }
        int iA = this.c.a(bArr, 0, bArr.length);
        if (bArr[0] != 5 || bArr[1] != 0) {
            throw new IOException("Unexpected DCERPC PDU header");
        }
        short sA = a.i.c.a(bArr, 8);
        if (sA > b()) {
            throw new IOException("Unexpected fragment length: ".concat(String.valueOf((int) sA)));
        }
        while (iA < sA) {
            int iA2 = this.c.a(bArr, iA, sA - iA);
            if (iA2 == 0) {
                throw new IOException("Unexpected EOF");
            }
            iA += iA2;
        }
        return iA;
    }

    @Override // a.c.f, java.lang.AutoCloseable
    public final void close() {
        super.close();
        try {
            this.c.close();
        } finally {
            this.b.close();
        }
    }
}
