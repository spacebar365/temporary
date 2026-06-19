package org.fileexplorer;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
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
import com.p033al.dlnaserver.App;
import com.p033al.dlnaserver.C0303R;
import com.p033al.dlnaserver.p035b.C0335b;
import com.p033al.dlnaserver.p035b.C0345bj;
import com.p033al.dlnaserver.p035b.C0350d;
import com.p033al.dlnaserver.p035b.C0359m;
import com.p033al.dlnaserver.p035b.C0360n;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes.dex */
public class FileDialogTV extends ListActivity {

    /* JADX INFO: renamed from: a */
    private static final String f6554a;

    /* JADX INFO: renamed from: c */
    private TextView f6556c;

    /* JADX INFO: renamed from: d */
    private EditText f6557d;

    /* JADX INFO: renamed from: e */
    private ArrayList<HashMap<String, Object>> f6558e;

    /* JADX INFO: renamed from: f */
    private int f6559f;

    /* JADX INFO: renamed from: g */
    private ImageButton f6560g;

    /* JADX INFO: renamed from: h */
    private LinearLayout f6561h;

    /* JADX INFO: renamed from: i */
    private InputMethodManager f6562i;

    /* JADX INFO: renamed from: j */
    private String f6563j;

    /* JADX INFO: renamed from: p */
    private File f6569p;

    /* JADX INFO: renamed from: u */
    private int f6574u;

    /* JADX INFO: renamed from: v */
    private int f6575v;

    /* JADX INFO: renamed from: b */
    private List<String> f6555b = null;

    /* JADX INFO: renamed from: k */
    private String f6564k = f6554a;

    /* JADX INFO: renamed from: l */
    private int f6565l = 0;

    /* JADX INFO: renamed from: m */
    private String[] f6566m = null;

    /* JADX INFO: renamed from: n */
    private boolean f6567n = false;

    /* JADX INFO: renamed from: o */
    private boolean f6568o = false;

    /* JADX INFO: renamed from: q */
    private HashMap<String, Integer> f6570q = new HashMap<>();

    /* JADX INFO: renamed from: r */
    private int f6571r = -1;

    /* JADX INFO: renamed from: s */
    private int f6572s = 0;

    /* JADX INFO: renamed from: t */
    private long f6573t = 0;

    static {
        f6554a = Build.VERSION.SDK_INT <= 23 ? "/" : "/storage";
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        C0350d.m1030a(this);
        setResult(0, getIntent());
        setContentView(C0303R.layout.file_dialog_main_tv);
        this.f6556c = (TextView) findViewById(C0303R.id.path);
        this.f6557d = (EditText) findViewById(C0303R.id.fdEditTextFile);
        this.f6562i = (InputMethodManager) getSystemService("input_method");
        this.f6565l = getIntent().getIntExtra("SELECTION_MODE", 0);
        this.f6566m = getIntent().getStringArrayExtra("FORMAT_FILTER");
        this.f6567n = getIntent().getBooleanExtra("CAN_SELECT_DIR", false);
        this.f6574u = getIntent().getIntExtra("LIST_INDEX", 0);
        this.f6575v = getIntent().getIntExtra("LIST_TOP", 0);
        this.f6559f = getIntent().getIntExtra("LIST_ITEM", -1);
        this.f6561h = (LinearLayout) findViewById(C0303R.id.fdLinearLayoutCreate);
        this.f6561h.setVisibility(8);
        ((ImageButton) findViewById(C0303R.id.action_tv_close)).setOnClickListener(new ViewOnClickListenerC1765i(this));
        this.f6560g = (ImageButton) findViewById(C0303R.id.action_tv_select);
        this.f6560g.setOnClickListener(new ViewOnClickListenerC1766j(this));
        ((ImageButton) findViewById(C0303R.id.action_tv_new)).setOnClickListener(new ViewOnClickListenerC1767k(this));
        ((ImageButton) findViewById(C0303R.id.action_tv_home)).setOnClickListener(new ViewOnClickListenerC1768l(this));
        ((ImageButton) findViewById(C0303R.id.action_tv_open)).setOnClickListener(new ViewOnClickListenerC1769m(this));
        ((ImageButton) findViewById(C0303R.id.action_tv_new)).setVisibility(this.f6565l != 1 ? 0 : 8);
        if (this.f6567n || this.f6569p != null) {
            m5203a(true);
        } else {
            m5203a(false);
        }
        ((Button) findViewById(C0303R.id.fdButtonCancel)).setOnClickListener(new ViewOnClickListenerC1761e(this));
        ((Button) findViewById(C0303R.id.fdButtonCreate)).setOnClickListener(new ViewOnClickListenerC1762f(this));
        if (Build.VERSION.SDK_INT >= 23 && !C0359m.m1045a(this, 1, true)) {
            this.f6568o = false;
        } else {
            this.f6568o = true;
        }
        m5198a(bundle);
        if (this.f6574u != 0 && this.f6575v != 0) {
            getListView().post(new RunnableC1763g(this));
        }
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 12345 && i2 == -1) {
            ClipData clipData = Build.VERSION.SDK_INT >= 16 ? intent.getClipData() : null;
            Uri data = intent.getData();
            if (clipData != null) {
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                    Uri uri = clipData.getItemAt(i3).getUri();
                    String strM1010a = C0335b.m1010a(this, uri);
                    if (strM1010a == null) {
                        strM1010a = m5196a(uri, intent);
                    }
                    arrayList.add(strM1010a);
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
                String strM1010a2 = C0335b.m1010a(this, data);
                if (strM1010a2 == null) {
                    strM1010a2 = m5196a(data, intent);
                }
                getIntent().putExtra("RESULT_PATH", strM1010a2);
                setResult(-1, getIntent());
                finish();
            }
        }
    }

    @Override // android.app.ListActivity, android.app.Activity
    protected void onDestroy() {
        this.f6574u = getListView().getFirstVisiblePosition();
        View childAt = getListView().getChildAt(0);
        this.f6575v = childAt != null ? childAt.getTop() - getListView().getPaddingTop() : 0;
        C0360n.m1047a(this, "lastPath", this.f6564k);
        App.f1283o = this.f6575v;
        App.f1284p = this.f6574u;
        super.onDestroy();
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("currentPath", this.f6564k);
        bundle.putString("selectedFileName", this.f6569p != null ? this.f6569p.getName() : null);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.ListActivity
    protected void onListItemClick(ListView listView, View view, int i, long j) throws Throwable {
        String str = this.f6555b.get(i);
        if (str.equalsIgnoreCase("/storage/emulated")) {
            str = String.valueOf(str) + "/0";
        }
        File file = new File(str);
        m5199a(view);
        if (f6554a.equals(str) && Build.VERSION.SDK_INT >= 29) {
            m5200a(f6554a);
            this.f6569p = null;
            return;
        }
        if (file.isDirectory()) {
            m5203a(false);
            if (file.canRead()) {
                this.f6570q.put(this.f6564k, Integer.valueOf(i));
                m5200a(str);
                if (this.f6567n) {
                    m5197a(i);
                    this.f6569p = file;
                    view.setSelected(true);
                    m5203a(true);
                    return;
                }
                this.f6569p = null;
                return;
            }
            new AlertDialog.Builder(this).setIcon(C0303R.drawable.icon).setTitle("[" + file.getName() + "] " + ((Object) getText(C0303R.string.cant_read_folder))).setPositiveButton(getString(C0303R.string.positive_button), new DialogInterfaceOnClickListenerC1764h(this)).show();
            m5200a(f6554a);
            if (this.f6567n) {
                view.setSelected(true);
                m5203a(true);
                return;
            } else {
                this.f6569p = null;
                return;
            }
        }
        m5197a(i);
        this.f6569p = file;
        view.setSelected(true);
        m5203a(true);
        this.f6556c.setText(((Object) getText(C0303R.string.location)) + ": " + this.f6564k + "/" + file.getName() + " (" + m5195a(file.length()) + ")");
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) throws Throwable {
        if (i == 4) {
            m5203a(false);
            if (this.f6561h.getVisibility() == 0) {
                this.f6561h.setVisibility(8);
            } else if (this.f6563j != null && !this.f6564k.equals(f6554a)) {
                m5200a(this.f6563j);
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
                    this.f6568o = true;
                    m5198a((Bundle) null);
                } else {
                    Toast.makeText(this, C0303R.string.permission_access_denined, 0).show();
                    this.f6568o = false;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m5196a(Uri uri, Intent intent) {
        String string = uri.toString();
        if (Build.VERSION.SDK_INT >= 19) {
            try {
                getContentResolver().takePersistableUriPermission(uri, intent.getFlags() & 1);
            } catch (SecurityException e) {
                e.printStackTrace();
                Toast.makeText(this, C0303R.string.some_errors_content, 1).show();
            }
        }
        return string;
    }

    /* JADX INFO: renamed from: a */
    private void m5197a(int i) {
        if (this.f6571r == i) {
            this.f6572s++;
            if (this.f6572s == 2 && System.currentTimeMillis() - this.f6573t <= 500) {
                if (this.f6569p != null) {
                    getIntent().putExtra("RESULT_PATH", this.f6569p.getPath());
                    setResult(-1, getIntent());
                    finish();
                }
                this.f6572s = 1;
                return;
            }
            return;
        }
        this.f6571r = i;
        this.f6572s = 1;
        this.f6573t = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    private void m5198a(Bundle bundle) throws Throwable {
        String stringExtra;
        String string;
        if (this.f6568o) {
            if (bundle != null) {
                stringExtra = bundle.getString("currentPath");
            } else {
                stringExtra = getIntent().getStringExtra("START_PATH");
            }
            String strM1051b = C0360n.m1051b(this, "lastPath");
            if (stringExtra == null) {
                stringExtra = f6554a;
            } else if (!strM1051b.isEmpty()) {
                stringExtra = strM1051b;
            }
            if (this.f6567n) {
                this.f6569p = new File(stringExtra);
            }
            m5200a(stringExtra);
            if (bundle != null && (string = bundle.getString("selectedFileName")) != null) {
                this.f6569p = new File(String.valueOf(this.f6564k) + "/" + string);
                this.f6556c.setText(((Object) getText(C0303R.string.location)) + ": " + this.f6564k + "/" + string + " (" + m5195a(this.f6569p.length()) + ")");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5200a(String str) throws Throwable {
        boolean z = str.length() < this.f6564k.length();
        Integer num = this.f6570q.get(this.f6563j);
        if (Build.VERSION.SDK_INT >= 29 && f6554a.equals(str)) {
            m5208c(str);
        } else {
            m5205b(str);
        }
        if (num != null && z) {
            getListView().setSelection(num.intValue());
        }
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: b */
    private void m5205b(String str) {
        boolean z;
        this.f6564k = str;
        ArrayList arrayList = new ArrayList();
        this.f6555b = new ArrayList();
        this.f6558e = new ArrayList<>();
        File file = new File(this.f6564k);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            this.f6564k = f6554a;
            file = new File(this.f6564k);
            fileArrListFiles = file.listFiles();
        }
        this.f6556c.setText(((Object) getText(C0303R.string.location)) + ": " + this.f6564k);
        if (!this.f6564k.equals(f6554a)) {
            arrayList.add("/");
            m5201a("/", C0303R.drawable.folder);
            this.f6555b.add(f6554a);
            this.f6563j = file.getParent();
            if (this.f6563j != null) {
                arrayList.add("../");
                m5201a("../", C0303R.drawable.folder);
                if (this.f6563j.equalsIgnoreCase("/storage/emulated")) {
                    this.f6563j = f6554a;
                }
                this.f6555b.add(this.f6563j);
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
                    if (this.f6566m != null) {
                        int i = 0;
                        while (true) {
                            if (i >= this.f6566m.length) {
                                z = false;
                                break;
                            } else if (!lowerCase.endsWith(this.f6566m[i].toLowerCase())) {
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
        this.f6555b.addAll(treeMap2.tailMap("").values());
        this.f6555b.addAll(treeMap4.tailMap("").values());
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, this.f6558e, C0303R.layout.file_dialog_row, new String[]{"key", "image"}, new int[]{C0303R.id.fdrowtext, C0303R.id.fdrowimage});
        Iterator it = treeMap.tailMap("").values().iterator();
        while (it.hasNext()) {
            m5201a((String) it.next(), C0303R.drawable.folder);
        }
        Iterator it2 = treeMap3.tailMap("").values().iterator();
        while (it2.hasNext()) {
            m5201a((String) it2.next(), C0303R.drawable.file);
        }
        simpleAdapter.notifyDataSetChanged();
        setListAdapter(simpleAdapter);
    }

    /* JADX INFO: renamed from: a */
    private void m5201a(String str, int i) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("key", str);
        map.put("image", Integer.valueOf(i));
        this.f6558e.add(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m5199a(View view) {
        this.f6561h.setVisibility(8);
        this.f6562i.hideSoftInputFromWindow(view.getWindowToken(), 0);
        if (this.f6567n) {
            m5203a(true);
        } else {
            m5203a(false);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5203a(boolean z) {
        this.f6560g.setVisibility(z ? 0 : 8);
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: a */
    private static String m5195a(long j) {
        if (j < 1024) {
            return String.valueOf(j) + " B";
        }
        int iLog = (int) (Math.log(j) / Math.log(1024.0d));
        return String.format("%.1f %sB", Double.valueOf(j / Math.pow(1024.0d, iLog)), String.valueOf("KMGTPE".charAt(iLog - 1)) + "i");
    }

    /* JADX INFO: renamed from: c */
    private void m5208c(String str) throws Throwable {
        this.f6564k = str;
        ArrayList arrayList = new ArrayList();
        this.f6555b = new ArrayList();
        this.f6558e = new ArrayList<>();
        this.f6556c.setText(((Object) getText(C0303R.string.location)) + ": " + this.f6564k);
        List<C0345bj.a> listM1012a = C0345bj.m1012a();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        TreeMap treeMap2 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C0345bj.a aVar : listM1012a) {
            String strM1013a = aVar.m1013a();
            treeMap.put(strM1013a, strM1013a);
            treeMap2.put(strM1013a, aVar.f1399a);
        }
        arrayList.addAll(treeMap.tailMap("").values());
        this.f6555b.addAll(treeMap2.tailMap("").values());
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, this.f6558e, C0303R.layout.file_dialog_row, new String[]{"key", "image"}, new int[]{C0303R.id.fdrowtext, C0303R.id.fdrowimage});
        Iterator it = treeMap.tailMap("").values().iterator();
        while (it.hasNext()) {
            m5201a((String) it.next(), C0303R.drawable.folder);
        }
        simpleAdapter.notifyDataSetChanged();
        setListAdapter(simpleAdapter);
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ void m5206b(FileDialogTV fileDialogTV, View view) {
        fileDialogTV.f6561h.setVisibility(0);
        fileDialogTV.f6562i.hideSoftInputFromWindow(view.getWindowToken(), 0);
        fileDialogTV.m5203a(false);
    }

    /* JADX INFO: renamed from: h */
    static /* synthetic */ void m5213h(FileDialogTV fileDialogTV) throws Throwable {
        String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
        if (fileDialogTV.f6567n) {
            fileDialogTV.f6569p = new File(absolutePath);
            fileDialogTV.m5203a(true);
        } else {
            fileDialogTV.m5203a(false);
        }
        fileDialogTV.m5200a(absolutePath);
    }
}
