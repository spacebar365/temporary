package org.bouncycastle.jcajce.provider.drbg;

import java.io.InputStream;
import java.net.URL;
import java.security.AccessController;
import java.security.SecureRandom;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: loaded from: classes.dex */
public class DRBG$URLSeededSecureRandom extends SecureRandom {
    private final InputStream a;

    DRBG$URLSeededSecureRandom(URL url) {
        super(null, new DRBG$HybridRandomProvider());
        this.a = (InputStream) AccessController.doPrivileged(new DRBG$URLSeededSecureRandom$1(this, url));
    }

    static /* synthetic */ InputStream a(DRBG$URLSeededSecureRandom dRBG$URLSeededSecureRandom) {
        return dRBG$URLSeededSecureRandom.a;
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void setSeed(long j) {
    }

    @Override // java.security.SecureRandom
    public void setSeed(byte[] bArr) {
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i) {
        byte[] bArr;
        synchronized (this) {
            bArr = new byte[i];
            int i2 = 0;
            while (i2 != i) {
                int iIntValue = ((Integer) AccessController.doPrivileged(new DRBG$URLSeededSecureRandom$2(this, bArr, i2, i - i2))).intValue();
                if (iIntValue < 0) {
                    break;
                }
                i2 = iIntValue + i2;
            }
            if (i2 != i) {
                throw new InternalError("unable to fully read random source");
            }
        }
        return bArr;
    }
}
