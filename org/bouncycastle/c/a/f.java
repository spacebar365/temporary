package org.bouncycastle.c.a;

import java.math.BigInteger;
import javax.crypto.interfaces.DHPublicKey;

/* JADX INFO: loaded from: classes.dex */
public interface f extends DHPublicKey, d {
    @Override // javax.crypto.interfaces.DHPublicKey
    BigInteger getY();
}
