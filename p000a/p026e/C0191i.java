package p000a.p026e;

import p000a.C0044d;

/* JADX INFO: renamed from: a.e.i */
/* JADX INFO: compiled from: NbtException.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0191i extends C0044d {

    /* JADX INFO: renamed from: a */
    public int f906a;

    /* JADX INFO: renamed from: b */
    public int f907b;

    /* JADX INFO: renamed from: a */
    private static String m570a(int i, int i2) {
        switch (i) {
            case 0:
                return "SUCCESS";
            case 1:
                String str = "ERR_NAM_SRVC/";
                switch (i2) {
                    case 1:
                        str = str + "FMT_ERR: Format Error";
                        break;
                }
                return str + "Unknown error code: " + i2;
            case 2:
                String str2 = "ERR_SSN_SRVC/";
                switch (i2) {
                    case -1:
                        return str2 + "Connection refused";
                    case 128:
                        return str2 + "Not listening on called name";
                    case 129:
                        return str2 + "Not listening for calling name";
                    case 130:
                        return str2 + "Called name not present";
                    case 131:
                        return str2 + "Called name present, but insufficient resources";
                    case 143:
                        return str2 + "Unspecified error";
                    default:
                        return str2 + "Unknown error code: " + i2;
                }
            default:
                return "unknown error class: " + i;
        }
    }

    public C0191i(int i) {
        super(m570a(2, i));
        this.f906a = 2;
        this.f907b = i;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return new String("errorClass=" + this.f906a + ",errorCode=" + this.f907b + ",errorString=" + m570a(this.f906a, this.f907b));
    }
}
