package org.fileexplorer;

import android.annotation.SuppressLint;
import android.app.AlertDialog$Builder;
import android.app.ListActivity;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build$VERSION;
import android.os.Bundle;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;
import android.widget.Toast;
import com.al.dlnaserver.App;
import com.al.dlnaserver.R$drawable;
import com.al.dlnaserver.R$id;
import com.al.dlnaserver.R$layout;
import com.al.dlnaserver.R$string;
import com.al.dlnaserver.b.bj;
import com.al.dlnaserver.b.bj$a;
import com.al.dlnaserver.b.n;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class FileDialogTV extends ListActivity {
    private static final String a;
    private TextView c;
    private EditText d;
    private ArrayList<HashMap<String, Object>> e;
    private int f;
    private ImageButton g;
    private LinearLayout h;
    private InputMethodManager i;
    private String j;
    private File p;
    private int u;
    private int v;
    private List<String> b = null;
    private String k = a;
    private int l = 0;
    private String[] m = null;
    private boolean n = false;
    private boolean o = false;
    private HashMap<String, Integer> q = new HashMap<>();
    private int r = -1;
    private int s = 0;
    private long t = 0;

    static {
        a = Build$VERSION.SDK_INT <= 23 ? "/" : "/storage";
    }

    static /* synthetic */ TextView g(FileDialogTV fileDialogTV) {
        return fileDialogTV.c;
    }

    static /* synthetic */ EditText a(FileDialogTV fileDialogTV) {
        return fileDialogTV.d;
    }

    static /* synthetic */ int c(FileDialogTV fileDialogTV) {
        return fileDialogTV.f;
    }

    static /* synthetic */ String b(FileDialogTV fileDialogTV) {
        return fileDialogTV.k;
    }

    static /* synthetic */ File f(FileDialogTV fileDialogTV) {
        return fileDialogTV.p;
    }

    static /* synthetic */ int d(FileDialogTV fileDialogTV) {
        return fileDialogTV.u;
    }

    static /* synthetic */ int e(FileDialogTV fileDialogTV) {
        return fileDialogTV.v;
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        com.al.dlnaserver.b.d.a(this);
        setResult(0, getIntent());
        setContentView(R$layout.file_dialog_main_tv);
        this.c = (TextView) findViewById(R$id.path);
        this.d = (EditText) findViewById(R$id.fdEditTextFile);
        this.i = (InputMethodManager) getSystemService("input_method");
        this.l = getIntent().getIntExtra("SELECTION_MODE", 0);
        this.m = getIntent().getStringArrayExtra("FORMAT_FILTER");
        this.n = getIntent().getBooleanExtra("CAN_SELECT_DIR", false);
        this.u = getIntent().getIntExtra("LIST_INDEX", 0);
        this.v = getIntent().getIntExtra("LIST_TOP", 0);
        this.f = getIntent().getIntExtra("LIST_ITEM", -1);
        this.h = (LinearLayout) findViewById(R$id.fdLinearLayoutCreate);
        this.h.setVisibility(8);
        ((ImageButton) findViewById(R$id.action_tv_close)).setOnClickListener(new i(this));
        this.g = (ImageButton) findViewById(R$id.action_tv_select);
        this.g.setOnClickListener(new j(this));
        ((ImageButton) findViewById(R$id.action_tv_new)).setOnClickListener(new k(this));
        ((ImageButton) findViewById(R$id.action_tv_home)).setOnClickListener(new l(this));
        ((ImageButton) findViewById(R$id.action_tv_open)).setOnClickListener(new m(this));
        ((ImageButton) findViewById(R$id.action_tv_new)).setVisibility(this.l != 1 ? 0 : 8);
        if (this.n || this.p != null) {
            a(true);
        } else {
            a(false);
        }
        ((Button) findViewById(R$id.fdButtonCancel)).setOnClickListener(new e(this));
        ((Button) findViewById(R$id.fdButtonCreate)).setOnClickListener(new f(this));
        if (Build$VERSION.SDK_INT >= 23 && !com.al.dlnaserver.b.m.a(this, 1, true)) {
            this.o = false;
        } else {
            this.o = true;
        }
        a(bundle);
        if (this.u != 0 && this.v != 0) {
            getListView().post(new g(this));
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) throws Throwable {
        super.onActivityResult(i, i2, intent);
        if (i == 12345 && i2 == -1) {
            ClipData clipData = Build$VERSION.SDK_INT >= 16 ? intent.getClipData() : null;
            Uri data = intent.getData();
            if (clipData != null) {
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                    Uri uri = clipData.getItemAt(i3).getUri();
                    String strA = com.al.dlnaserver.b.b.a(this, uri);
                    if (strA == null) {
                        strA = a(uri, intent);
                    }
                    arrayList.add(strA);
                }
                getIntent().putExtra("RESULT_PATHS_LIST", (String[]) arrayList.toArray(new String[0]));
                if (arrayList.size() > 0) {
                    getIntent().putExtra("RESULT_PATH", (String) arrayList.get(0));
                }
                setResult(-1, getIntent());
                finish();
                return;
            }
            if (data != null) {
                String strA2 = com.al.dlnaserver.b.b.a(this, data);
                if (strA2 == null) {
                    strA2 = a(data, intent);
                }
                getIntent().putExtra("RESULT_PATH", strA2);
                setResult(-1, getIntent());
                finish();
            }
        }
    }

    @Override // android.app.ListActivity, android.app.Activity
    protected void onDestroy() {
        this.u = getListView().getFirstVisiblePosition();
        View childAt = getListView().getChildAt(0);
        this.v = childAt != null ? childAt.getTop() - getListView().getPaddingTop() : 0;
        n.a(this, "lastPath", this.k);
        App.o = this.v;
        App.p = this.u;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("currentPath", this.k);
        bundle.putString("selectedFileName", this.p != null ? this.p.getName() : null);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.ListActivity
    protected void onListItemClick(ListView listView, View view, int i, long j) throws Throwable {
        String str = this.b.get(i);
        if (str.equalsIgnoreCase("/storage/emulated")) {
            str = String.valueOf(str) + "/0";
        }
        File file = new File(str);
        a(view);
        if (a.equals(str) && Build$VERSION.SDK_INT >= 29) {
            a(a);
            this.p = null;
            return;
        }
        if (file.isDirectory()) {
            a(false);
            if (file.canRead()) {
                this.q.put(this.k, Integer.valueOf(i));
                a(str);
                if (this.n) {
                    a(i);
                    this.p = file;
                    view.setSelected(true);
                    a(true);
                    return;
                }
                this.p = null;
                return;
            }
            new AlertDialog$Builder(this).setIcon(R$drawable.icon).setTitle("[" + file.getName() + "] " + ((Object) getText(R$string.cant_read_folder))).setPositiveButton(getString(R$string.positive_button), new h(this)).show();
            a(a);
            if (this.n) {
                view.setSelected(true);
                a(true);
                return;
            } else {
                this.p = null;
                return;
            }
        }
        a(i);
        this.p = file;
        view.setSelected(true);
        a(true);
        this.c.setText(((Object) getText(R$string.location)) + ": " + this.k + "/" + file.getName() + " (" + a(file.length()) + ")");
    }

    @Override // android.app.Activity, android.view.KeyEvent$Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) throws Throwable {
        if (i == 4) {
            a(false);
            if (this.h.getVisibility() == 0) {
                this.h.setVisibility(8);
            } else if (this.j != null && !this.k.equals(a)) {
                a(this.j);
            } else {
                return super.onKeyDown(i, keyEvent);
            }
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) throws Throwable {
        switch (i) {
            case 1:
                if (iArr.length > 0 && iArr[0] == 0) {
                    this.o = true;
                    a((Bundle) null);
                } else {
                    Toast.makeText(this, R$string.permission_access_denined, 0).show();
                    this.o = false;
                }
                break;
        }
    }

    private String a(Uri uri, Intent intent) {
        String string = uri.toString();
        if (Build$VERSION.SDK_INT >= 19) {
            try {
                getContentResolver().takePersistableUriPermission(uri, intent.getFlags() & 1);
            } catch (SecurityException e) {
                e.printStackTrace();
                Toast.makeText(this, R$string.some_errors_content, 1).show();
            }
        }
        return string;
    }

    private void a(int i) {
        if (this.r == i) {
            this.s++;
            if (this.s == 2 && System.currentTimeMillis() - this.t <= 500) {
                if (this.p != null) {
                    getIntent().putExtra("RESULT_PATH", this.p.getPath());
                    setResult(-1, getIntent());
                    finish();
                }
                this.s = 1;
                return;
            }
            return;
        }
        this.r = i;
        this.s = 1;
        this.t = System.currentTimeMillis();
    }

    private void a(Bundle bundle) throws Throwable {
        String stringExtra;
        String string;
        if (this.o) {
            if (bundle != null) {
                stringExtra = bundle.getString("currentPath");
            } else {
                stringExtra = getIntent().getStringExtra("START_PATH");
            }
            String strB = n.b(this, "lastPath");
            if (stringExtra == null) {
                stringExtra = a;
            } else if (!strB.isEmpty()) {
                stringExtra = strB;
            }
            if (this.n) {
                this.p = new File(stringExtra);
            }
            a(stringExtra);
            if (bundle != null && (string = bundle.getString("selectedFileName")) != null) {
                this.p = new File(String.valueOf(this.k) + "/" + string);
                this.c.setText(((Object) getText(R$string.location)) + ": " + this.k + "/" + string + " (" + a(this.p.length()) + ")");
            }
        }
    }

    private void a(String str) throws Throwable {
        boolean z = str.length() < this.k.length();
        Integer num = this.q.get(this.j);
        if (Build$VERSION.SDK_INT >= 29 && a.equals(str)) {
            c(str);
        } else {
            b(str);
        }
        if (num != null && z) {
            getListView().setSelection(num.intValue());
        }
    }

    @SuppressLint({"DefaultLocale"})
    private void b(String str) {
        boolean z;
        this.k = str;
        ArrayList arrayList = new ArrayList();
        this.b = new ArrayList();
        this.e = new ArrayList<>();
        File file = new File(this.k);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            this.k = a;
            file = new File(this.k);
            fileArrListFiles = file.listFiles();
        }
        this.c.setText(((Object) getText(R$string.location)) + ": " + this.k);
        if (!this.k.equals(a)) {
            arrayList.add("/");
            a("/", R$drawable.folder);
            this.b.add(a);
            this.j = file.getParent();
            if (this.j != null) {
                arrayList.add("../");
                a("../", R$drawable.folder);
                if (this.j.equalsIgnoreCase("/storage/emulated")) {
                    this.j = a;
                }
                this.b.add(this.j);
            }
        }
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        TreeMap treeMap2 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        TreeMap treeMap3 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        TreeMap treeMap4 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    String name = file2.getName();
                    treeMap.put(name, name);
                    treeMap2.put(name, file2.getPath());
                } else {
                    String name2 = file2.getName();
                    String lowerCase = name2.toLowerCase();
                    if (this.m != null) {
                        int i = 0;
                        while (true) {
                            if (i >= this.m.length) {
                                z = false;
                                break;
                            } else if (!lowerCase.endsWith(this.m[i].toLowerCase())) {
                                i++;
                            } else {
                                z = true;
                                break;
                            }
                        }
                        if (z) {
                            treeMap3.put(name2, name2);
                            treeMap4.put(name2, file2.getPath());
                        }
                    } else {
                        treeMap3.put(name2, name2);
                        treeMap4.put(name2, file2.getPath());
                    }
                }
            }
        }
        arrayList.addAll(treeMap.tailMap("").values());
        arrayList.addAll(treeMap3.tailMap("").values());
        this.b.addAll(treeMap2.tailMap("").values());
        this.b.addAll(treeMap4.tailMap("").values());
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, this.e, R$layout.file_dialog_row, new String[]{"key", "image"}, new int[]{R$id.fdrowtext, R$id.fdrowimage});
        Iterator it = treeMap.tailMap("").values().iterator();
        while (it.hasNext()) {
            a((String) it.next(), R$drawable.folder);
        }
        Iterator it2 = treeMap3.tailMap("").values().iterator();
        while (it2.hasNext()) {
            a((String) it2.next(), R$drawable.file);
        }
        simpleAdapter.notifyDataSetChanged();
        setListAdapter(simpleAdapter);
    }

    private void a(String str, int i) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("key", str);
        map.put("image", Integer.valueOf(i));
        this.e.add(map);
    }

    static /* synthetic */ void a(FileDialogTV fileDialogTV, View view) {
        fileDialogTV.a(view);
    }

    private void a(View view) {
        this.h.setVisibility(8);
        this.i.hideSoftInputFromWindow(view.getWindowToken(), 0);
        if (this.n) {
            a(true);
        } else {
            a(false);
        }
    }

    private void a(boolean z) {
        this.g.setVisibility(z ? 0 : 8);
    }

    @SuppressLint({"DefaultLocale"})
    private static String a(long j) {
        if (j < 1024) {
            return String.valueOf(j) + " B";
        }
        int iLog = (int) (Math.log(j) / Math.log(1024.0d));
        return String.format("%.1f %sB", Double.valueOf(j / Math.pow(1024.0d, iLog)), String.valueOf("KMGTPE".charAt(iLog - 1)) + "i");
    }

    private void c(String str) throws Throwable {
        this.k = str;
        ArrayList arrayList = new ArrayList();
        this.b = new ArrayList();
        this.e = new ArrayList<>();
        this.c.setText(((Object) getText(R$string.location)) + ": " + this.k);
        List<bj$a> listA = bj.a();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        TreeMap treeMap2 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (bj$a bj_a : listA) {
            String strA = bj_a.a();
            treeMap.put(strA, strA);
            treeMap2.put(strA, bj_a.a);
        }
        arrayList.addAll(treeMap.tailMap("").values());
        this.b.addAll(treeMap2.tailMap("").values());
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, this.e, R$layout.file_dialog_row, new String[]{"key", "image"}, new int[]{R$id.fdrowtext, R$id.fdrowimage});
        Iterator it = treeMap.tailMap("").values().iterator();
        while (it.hasNext()) {
            a((String) it.next(), R$drawable.folder);
        }
        simpleAdapter.notifyDataSetChanged();
        setListAdapter(simpleAdapter);
    }

    static /* synthetic */ void b(FileDialogTV fileDialogTV, View view) {
        fileDialogTV.h.setVisibility(0);
        fileDialogTV.i.hideSoftInputFromWindow(view.getWindowToken(), 0);
        fileDialogTV.a(false);
    }

    static /* synthetic */ void h(FileDialogTV fileDialogTV) throws Throwable {
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        if (fileDialogTV.n) {
            fileDialogTV.p = new File(absolutePath);
            fileDialogTV.a(true);
        } else {
            fileDialogTV.a(false);
        }
        fileDialogTV.a(absolutePath);
    }
}
