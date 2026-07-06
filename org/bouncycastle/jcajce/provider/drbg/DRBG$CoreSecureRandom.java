package org.bouncycastle.jcajce.provider.drbg;

import java.security.Provider;
import java.security.SecureRandom;
import java.security.SecureRandomSpi;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class DRBG$CoreSecureRandom extends SecureRandom {
    DRBG$CoreSecureRandom() {
        super((SecureRandomSpi) DRBG.a()[1], (Provider) DRBG.a()[0]);
    }
}
