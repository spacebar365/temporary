package org.bouncycastle.jcajce.provider.symmetric;

import org.bouncycastle.a.s.n;

/* JADX INFO: loaded from: classes.dex */
public class DESede$PBEWithSHAAndDES2KeyFactory extends DES$DESPBEKeyFactory {
    public DESede$PBEWithSHAAndDES2KeyFactory() {
        super("PBEwithSHAandDES2Key-CBC", n.bG, 2, 1, 128);
    }
}
