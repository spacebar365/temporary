package org.bouncycastle.b.k;

import java.util.Hashtable;

/* JADX INFO: loaded from: classes.dex */
public final class bo implements org.bouncycastle.b.i {
    private Hashtable a;

    public bo() {
        this(new Hashtable());
    }

    private bo(Hashtable hashtable) {
        this.a = hashtable;
    }

    /* synthetic */ bo(Hashtable hashtable, byte b) {
        this(hashtable);
    }

    public final Hashtable a() {
        return this.a;
    }

    public final byte[] b() {
        return (byte[]) this.a.get(0);
    }
}
