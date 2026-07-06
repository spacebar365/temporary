package org.bouncycastle.jcajce.provider.symmetric;

import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import org.bouncycastle.a.d.b;
import org.bouncycastle.a.u;
import org.bouncycastle.jcajce.provider.symmetric.util.ClassUtil;

/* JADX INFO: loaded from: classes.dex */
class GcmSpecUtil {
    static final Class a = ClassUtil.a(GcmSpecUtil.class, "javax.crypto.spec.GCMParameterSpec");

    GcmSpecUtil() {
    }

    static boolean a() {
        return a != null;
    }

    static boolean a(Class cls) {
        return a == cls;
    }

    static boolean a(AlgorithmParameterSpec algorithmParameterSpec) {
        return a != null && a.isInstance(algorithmParameterSpec);
    }

    static b b(AlgorithmParameterSpec algorithmParameterSpec) throws InvalidParameterSpecException {
        try {
            return new b((byte[]) a.getDeclaredMethod("getIV", new Class[0]).invoke(algorithmParameterSpec, new Object[0]), ((Integer) a.getDeclaredMethod("getTLen", new Class[0]).invoke(algorithmParameterSpec, new Object[0])).intValue() / 8);
        } catch (Exception e) {
            throw new InvalidParameterSpecException("Cannot process GCMParameterSpec");
        }
    }

    static AlgorithmParameterSpec a(u uVar) throws InvalidParameterSpecException {
        try {
            b bVarA = b.a(uVar);
            return (AlgorithmParameterSpec) a.getConstructor(Integer.TYPE, byte[].class).newInstance(Integer.valueOf(bVarA.b() * 8), bVarA.a());
        } catch (NoSuchMethodException e) {
            throw new InvalidParameterSpecException("No constructor found!");
        } catch (Exception e2) {
            throw new InvalidParameterSpecException("Construction failed: " + e2.getMessage());
        }
    }
}
