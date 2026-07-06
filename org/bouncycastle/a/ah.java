package org.bouncycastle.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Vector;

/* JADX INFO: loaded from: classes.dex */
public final class ah extends q {
    private final int b;
    private final q[] c;

    public ah(byte[] bArr) {
        this(bArr, (byte) 0);
    }

    private ah(byte[] bArr, byte b) {
        this(bArr, (q[]) null);
    }

    private ah(byte[] bArr, q[] qVarArr) {
        super(bArr);
        this.c = qVarArr;
        this.b = 1000;
    }

    public ah(q[] qVarArr) {
        this(qVarArr, (byte) 0);
    }

    private ah(q[] qVarArr, byte b) {
        this(a(qVarArr), qVarArr);
    }

    private static byte[] a(q[] qVarArr) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 == qVarArr.length) {
                return byteArrayOutputStream.toByteArray();
            }
            try {
                byteArrayOutputStream.write(((be) qVarArr[i2]).c());
                i = i2 + 1;
            } catch (IOException e) {
                throw new IllegalArgumentException("exception converting octets " + e.toString());
            } catch (ClassCastException e2) {
                throw new IllegalArgumentException(qVarArr[i2].getClass().getName() + " found in input should only contain DEROctetString");
            }
        }
    }

    static /* synthetic */ q[] a(ah ahVar) {
        return ahVar.c;
    }

    @Override // org.bouncycastle.a.q, org.bouncycastle.a.u
    public final void a(s sVar) throws IOException {
        sVar.b(36);
        sVar.b(128);
        Enumeration enumerationF = f();
        while (enumerationF.hasMoreElements()) {
            sVar.a((f) enumerationF.nextElement());
        }
        sVar.b(0);
        sVar.b(0);
    }

    @Override // org.bouncycastle.a.u
    final boolean a() {
        return true;
    }

    @Override // org.bouncycastle.a.q
    public final byte[] c() {
        return this.a;
    }

    @Override // org.bouncycastle.a.u
    final int e() {
        int iE = 0;
        Enumeration enumerationF = f();
        while (true) {
            int i = iE;
            if (!enumerationF.hasMoreElements()) {
                return i + 2 + 2;
            }
            iE = ((f) enumerationF.nextElement()).i().e() + i;
        }
    }

    public final Enumeration f() {
        if (this.c != null) {
            return new ai(this);
        }
        Vector vector = new Vector();
        int i = 0;
        while (i < this.a.length) {
            byte[] bArr = new byte[(this.b + i > this.a.length ? this.a.length : this.b + i) - i];
            System.arraycopy(this.a, i, bArr, 0, bArr.length);
            vector.addElement(new be(bArr));
            i += this.b;
        }
        return vector.elements();
    }
}
