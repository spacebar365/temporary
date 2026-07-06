package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.s.n;

/* JADX INFO: loaded from: classes.dex */
public class DES$PBEWithMD5KeyFactory extends DES$DESPBEKeyFactory {
    public DES$PBEWithMD5KeyFactory() {
        super("PBEwithMD5andDES", n.w, 0, 0, 64);
    }
}
