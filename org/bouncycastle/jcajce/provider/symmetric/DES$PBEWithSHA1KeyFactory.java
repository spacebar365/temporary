package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.s.n;

/* JADX INFO: loaded from: classes.dex */
public class DES$PBEWithSHA1KeyFactory extends DES$DESPBEKeyFactory {
    public DES$PBEWithSHA1KeyFactory() {
        super("PBEwithSHA1andDES", n.y, 0, 1, 64);
    }
}
