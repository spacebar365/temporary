package org.bouncycastle.b.k;

import java.util.Enumeration;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public class bo$a {
    private Hashtable a = new Hashtable();

    public bo$a() {
    }

    public bo$a(Hashtable hashtable) {
        Enumeration enumerationKeys = hashtable.keys();
        while (enumerationKeys.hasMoreElements()) {
            Integer num = (Integer) enumerationKeys.nextElement();
            this.a.put(num, hashtable.get(num));
        }
    }

    public final bo a() {
        return new bo(this.a, (byte) 0);
    }

    public final bo$a a(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Parameter value must not be null.");
        }
        this.a.put(0, bArr);
        return this;
    }
}
