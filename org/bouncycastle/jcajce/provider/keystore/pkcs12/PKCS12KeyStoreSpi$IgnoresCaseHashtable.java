package org.bouncycastle.jcajce.provider.keystore.pkcs12;

import java.util.Enumeration;
import java.util.Hashtable;
import org.bouncycastle.f.k;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class PKCS12KeyStoreSpi$IgnoresCaseHashtable {
    private Hashtable a;
    private Hashtable b;

    private PKCS12KeyStoreSpi$IgnoresCaseHashtable() {
        this.a = new Hashtable();
        this.b = new Hashtable();
    }

    /* synthetic */ PKCS12KeyStoreSpi$IgnoresCaseHashtable(byte b) {
        this();
    }

    public final Object a(String str) {
        String str2 = (String) this.b.remove(str == null ? null : k.c(str));
        if (str2 == null) {
            return null;
        }
        return this.a.remove(str2);
    }

    public final Enumeration a() {
        return this.a.keys();
    }

    public final void a(String str, Object obj) {
        String strC = str == null ? null : k.c(str);
        String str2 = (String) this.b.get(strC);
        if (str2 != null) {
            this.a.remove(str2);
        }
        this.b.put(strC, str);
        this.a.put(str, obj);
    }

    public final Object b(String str) {
        String str2 = (String) this.b.get(str == null ? null : k.c(str));
        if (str2 == null) {
            return null;
        }
        return this.a.get(str2);
    }

    public final Enumeration b() {
        return this.a.elements();
    }
}
