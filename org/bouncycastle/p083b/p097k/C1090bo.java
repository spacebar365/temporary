package org.bouncycastle.p083b.p097k;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.p083b.InterfaceC1003i;

/* JADX INFO: renamed from: org.bouncycastle.b.k.bo */
/* JADX INFO: loaded from: classes.dex */
public final class C1090bo implements InterfaceC1003i {

    /* JADX INFO: renamed from: a */
    private Hashtable f4443a;

    public C1090bo() {
        this(new Hashtable());
    }

    private C1090bo(Hashtable hashtable) {
        this.f4443a = hashtable;
    }

    /* synthetic */ C1090bo(Hashtable hashtable, byte b) {
        this(hashtable);
    }

    /* JADX INFO: renamed from: a */
    public final Hashtable m2633a() {
        return this.f4443a;
    }

    /* JADX INFO: renamed from: org.bouncycastle.b.k.bo$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private Hashtable f4444a = new Hashtable();

        public a() {
        }

        public a(Hashtable hashtable) {
            Enumeration enumerationKeys = hashtable.keys();
            while (enumerationKeys.hasMoreElements()) {
                Integer num = (Integer) enumerationKeys.nextElement();
                this.f4444a.put(num, hashtable.get(num));
            }
        }

        /* JADX INFO: renamed from: a */
        public final C1090bo m2636a() {
            return new C1090bo(this.f4444a, (byte) 0);
        }

        /* JADX INFO: renamed from: a */
        public final a m2635a(byte[] bArr) {
            if (bArr == null) {
                throw new IllegalArgumentException("Parameter value must not be null.");
            }
            this.f4444a.put(0, bArr);
            return this;
        }
    }

    /* JADX INFO: renamed from: b */
    public final byte[] m2634b() {
        return (byte[]) this.f4443a.get(0);
    }
}
