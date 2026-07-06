package a.g;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: Access modifiers changed from: private */
/* JADX INFO: compiled from: DfsImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class c$a<T> {
    long a;
    Map<String, T> b = new ConcurrentHashMap();

    c$a(long j) {
        this.a = System.currentTimeMillis() + (1000 * j);
    }
}
