package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.s.n;

/* JADX INFO: loaded from: classes.dex */
public class DESede$PBEWithSHAAndDES3KeyFactory extends DES$DESPBEKeyFactory {
    public DESede$PBEWithSHAAndDES3KeyFactory() {
        super("PBEwithSHAandDES3Key-CBC", n.bF, 2, 1, 192);
    }
}
