package org.bouncycastle.c.a;

import java.math.BigInteger;
import javax.crypto.interfaces.DHPrivateKey;

/* JADX INFO: loaded from: classes.dex */
public interface e extends DHPrivateKey, d {
    @Override // javax.crypto.interfaces.DHPrivateKey
    BigInteger getX();
}
