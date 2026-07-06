package org.bouncycastle.f.b.a;

import java.io.BufferedWriter;
import java.io.Writer;
import org.bouncycastle.f.k;

/* JADX INFO: loaded from: classes.dex */
public final class e extends BufferedWriter {
    private final int a;
    private char[] b;

    public e(Writer writer) {
        super(writer);
        this.b = new char[64];
        String strA = k.a();
        if (strA != null) {
            this.a = strA.length();
        } else {
            this.a = 2;
        }
    }

    private void a(byte[] bArr) {
        byte[] bArrA = org.bouncycastle.f.a.a.a(bArr);
        int length = 0;
        while (length < bArrA.length) {
            int i = 0;
            while (i != this.b.length && length + i < bArrA.length) {
                this.b[i] = (char) bArrA[length + i];
                i++;
            }
            write(this.b, 0, i);
            newLine();
            length += this.b.length;
        }
    }

    public final void a(d dVar) {
        c cVarD = dVar.d();
        write("-----BEGIN " + cVarD.a() + "-----");
        newLine();
        if (!cVarD.b().isEmpty()) {
            for (b bVar : cVarD.b()) {
                write(bVar.a());
                write(": ");
                write(bVar.b());
                newLine();
            }
            newLine();
        }
        a(cVarD.c());
        write("-----END " + cVarD.a() + "-----");
        newLine();
    }
}
