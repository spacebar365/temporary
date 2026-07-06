package org.bouncycastle.a;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class z {
    private final InputStream a;
    private final int b;
    private final byte[][] c;

    public z(InputStream inputStream) {
        this(inputStream, ch.a(inputStream));
    }

    public z(InputStream inputStream, int i) {
        this.a = inputStream;
        this.b = i;
        this.c = new byte[11][];
    }

    final u a(boolean z, int i) throws IOException {
        if (!z) {
            return new bn(false, i, new be(((ca) this.a).b()));
        }
        g gVarB = b();
        return this.a instanceof cc ? gVarB.a() == 1 ? new ap(true, i, gVarB.a(0)) : new ap(false, i, ag.a(gVarB)) : gVarB.a() == 1 ? new bn(true, i, gVarB.a(0)) : new bn(false, i, ax.a(gVarB));
    }

    final g b() throws IOException {
        g gVar = new g();
        while (true) {
            f fVarA = a();
            if (fVarA == null) {
                return gVar;
            }
            if (fVarA instanceof cb) {
                gVar.a(((cb) fVarA).d());
            } else {
                gVar.a(fVarA.i());
            }
        }
    }

    public final f a() throws IOException {
        int i = this.a.read();
        if (i == -1) {
            return null;
        }
        if (this.a instanceof cc) {
            ((cc) this.a).a(false);
        }
        int iA = l.a(this.a, i);
        boolean z = (i & 32) != 0;
        int iB = l.b(this.a, this.b);
        if (iB < 0) {
            if (!z) {
                throw new IOException("indefinite-length primitive encoding encountered");
            }
            z zVar = new z(new cc(this.a, this.b), this.b);
            if ((i & 64) != 0) {
                return new af(iA, zVar);
            }
            if ((i & 128) != 0) {
                return new aq(true, iA, zVar);
            }
            switch (iA) {
                case 4:
                    return new aj(zVar);
                case 8:
                    return new aw(zVar);
                case 16:
                    return new am(zVar);
                case 17:
                    return new ao(zVar);
                default:
                    throw new i("unknown BER object encountered: 0x" + Integer.toHexString(iA));
            }
        }
        ca caVar = new ca(this.a, iB);
        if ((i & 64) != 0) {
            return new bs(z, iA, caVar.b());
        }
        if ((i & 128) != 0) {
            return new aq(z, iA, new z(caVar));
        }
        if (!z) {
            switch (iA) {
                case 4:
                    return new bf(caVar);
                default:
                    try {
                        return l.a(iA, caVar, this.c);
                    } catch (IllegalArgumentException e) {
                        throw new i("corrupted stream detected", e);
                    }
            }
        }
        switch (iA) {
            case 4:
                return new aj(new z(caVar));
            case 8:
                return new aw(new z(caVar));
            case 16:
                return new bj(new z(caVar));
            case 17:
                return new bl(new z(caVar));
            default:
                throw new IOException("unknown tag " + iA + " encountered");
        }
    }
}
