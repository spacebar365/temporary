package org.fileexplorer;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.ListActivity;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
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
public class FileDialog extends ListActivity {

    /* JADX INFO: renamed from: a */
    private static final String f6532a;

    /* JADX INFO: renamed from: c */
    private TextView f6534c;

    /* JADX INFO: renamed from: d */
    private EditText f6535d;

    /* JADX INFO: renamed from: e */
    private ArrayList<HashMap<String, Object>> f6536e;

    /* JADX INFO: renamed from: f */
    private int f6537f;

    /* JADX INFO: renamed from: g */
    private MenuItem f6538g;

    /* JADX INFO: renamed from: h */
    private LinearLayout f6539h;

    /* JADX INFO: renamed from: i */
    private InputMethodManager f6540i;

    /* JADX INFO: renamed from: j */
    private String f6541j;

    /* JADX INFO: renamed from: p */
    private File f6547p;

    /* JADX INFO: renamed from: u */
    private int f6552u;

    /* JADX INFO: renamed from: v */
    private int f6553v;

    /* JADX INFO: renamed from: b */
    private List<String> f6533b = null;

    /* JADX INFO: renamed from: k */
    private String f6542k = f6532a;

    /* JADX INFO: renamed from: l */
    private int f6543l = 0;

    /* JADX INFO: renamed from: m */
    private String[] f6544m = null;

    /* JADX INFO: renamed from: n */
    private boolean f6545n = false;

    /* JADX INFO: renamed from: o */
    private boolean f6546o = false;

    /* JADX INFO: renamed from: q */
    private HashMap<String, Integer> f6548q = new HashMap<>();

    /* JADX INFO: renamed from: r */
    private int f6549r = -1;

    /* JADX INFO: renamed from: s */
    private int f6550s = 0;

    /* JADX INFO: renamed from: t */
    private long f6551t = 0;

    static {
        f6532a = Build.VERSION.SDK_INT <= 23 ? "/" : "/storage";
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        super.onCreate(bundle);
        C0350d.m1030a(this);
        setResult(0, getIntent());
        setContentView(C0303R.layout.file_dialog_main);
        this.f6534c = (TextView) findViewById(C0303R.id.path);
        this.f6535d = (EditText) findViewById(C0303R.id.fdEditTextFile);
        this.f6540i = (InputMethodManager) getSystemService("input_method");
        this.f6543l = getIntent().getIntExtra("SELECTION_MODE", 0);
        this.f6544m = getIntent().getStringArrayExtra("FORMAT_FILTER");
        this.f6545n = getIntent().getBooleanExtra("CAN_SELECT_DIR", false);
        this.f6552u = getIntent().getIntExtra("LIST_INDEX", 0);
        this.f6553v = getIntent().getIntExtra("LIST_TOP", 0);
        this.f6537f = getIntent().getIntExtra("LIST_ITEM", -1);
        this.f6539h = (LinearLayout) findViewById(C0303R.id.fdLinearLayoutCreate);
        this.f6539h.setVisibility(8);
        ((Button) findViewById(C0303R.id.fdButtonCancel)).setOnClickListener(new ViewOnClickListenerC1757a(this));
        ((Button) findViewById(C0303R.id.fdButtonCreate)).setOnClickListener(new ViewOnClickListenerC1758b(this));
        if (Build.VERSION.SDK_INT >= 23 && !C0359m.m1045a(this, 1, true)) {
            this.f6546o = false;
        } else {
            this.f6546o = true;
        }
        m5182a(bundle);
        if (this.f6552u != 0 && this.f6553v != 0) {
            getListView().post(new RunnableC1759c(this));
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(C0303R.menu.menu_fileexplorer, menu);
        menu.findItem(C0303R.id.action_new).setVisible(this.f6543l != 1);
        this.f6538g = menu.findItem(C0303R.id.action_select);
        if (this.f6545n || this.f6547p != null) {
            m5187a(true);
        } else {
            m5187a(false);
        }
        return true;
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
                        strM1010a = m5180a(uri, intent);
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
                    strM1010a2 = m5180a(data, intent);
                }
                getIntent().putExtra("RESULT_PATH", strM1010a2);
                setResult(-1, getIntent());
                finish();
            }
        }
    }

    @Override // android.app.ListActivity, android.app.Activity
    protected void onDestroy() {
        this.f6552u = getListView().getFirstVisiblePosition();
        View childAt = getListView().getChildAt(0);
        this.f6553v = childAt != null ? childAt.getTop() - getListView().getPaddingTop() : 0;
        C0360n.m1047a(this, "lastPath", this.f6542k);
        App.f1283o = this.f6553v;
        App.f1284p = this.f6552u;
        super.onDestroy();
    }

    @Override // android.app.Activity
    @SuppressLint({"InlinedApi"})
    public boolean onOptionsItemSelected(MenuItem menuItem) throws Throwable {
        Intent intent;
        switch (menuItem.getItemId()) {
            case C0303R.id.action_close /* 2131361857 */:
                finish();
                return true;
            case C0303R.id.action_select /* 2131361858 */:
                if (this.f6547p != null) {
                    getIntent().putExtra("RESULT_PATH", this.f6547p.getPath());
                    setResult(-1, getIntent());
                    finish();
                }
                return true;
            case C0303R.id.action_new /* 2131361859 */:
                TextView textView = this.f6534c;
                this.f6539h.setVisibility(0);
                this.f6540i.hideSoftInputFromWindow(textView.getWindowToken(), 0);
                m5187a(false);
                this.f6535d.setText("");
                this.f6535d.requestFocus();
                return true;
            case C0303R.id.action_home /* 2131361860 */:
                String absolutePath = Environment.getExternalStorageDirectory().getAbsolutePath();
                if (this.f6545n) {
                    this.f6547p = new File(absolutePath);
                    m5187a(true);
                } else {
                    m5187a(false);
                }
                m5184a(absolutePath);
                return true;
            case C0303R.id.action_open /* 2131361861 */:
                if (Build.VERSION.SDK_INT < 19) {
                    intent = new Intent();
                    intent.setAction("android.intent.action.GET_CONTENT");
                    intent.setType("*/*");
                } else {
                    intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                    intent.addCategory("android.intent.category.OPENABLE");
                    intent.setType("*/*");
                }
                intent.putExtra("android.content.extra.SHOW_ADVANCED", true);
                intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
                try {
                    startActivityForResult(intent, 12345);
                    break;
                } catch (ActivityNotFoundException e) {
                    e.printStackTrace();
                    Toast.makeText(this, C0303R.string.no_app_to_open, 1).show();
                }
                return true;
            default:
                return super.onOptionsItemSelected(menuItem);
        }
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        bundle.putString("currentPath", this.f6542k);
        bundle.putString("selectedFileName", this.f6547p != null ? this.f6547p.getName() : null);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.ListActivity
    protected void onListItemClick(ListView listView, View view, int i, long j) throws Throwable {
        String str = this.f6533b.get(i);
        if (str.equalsIgnoreCase("/storage/emulated")) {
            str = String.valueOf(str) + "/0";
        }
        File file = new File(str);
        m5183a(view);
        if (f6532a.equals(str) && Build.VERSION.SDK_INT >= 29) {
            m5184a(f6532a);
            this.f6547p = null;
            return;
        }
        if (file.isDirectory()) {
            m5187a(false);
            if (file.canRead()) {
                this.f6548q.put(this.f6542k, Integer.valueOf(i));
                m5184a(str);
                if (this.f6545n) {
                    m5181a(i);
                    this.f6547p = file;
                    view.setSelected(true);
                    m5187a(true);
                    return;
                }
                this.f6547p = null;
                return;
            }
            new AlertDialog.Builder(this).setIcon(C0303R.drawable.icon).setTitle("[" + file.getName() + "] " + ((Object) getText(C0303R.string.cant_read_folder))).setPositiveButton(getString(C0303R.string.positive_button), new DialogInterfaceOnClickListenerC1760d(this)).show();
            m5184a(f6532a);
            if (this.f6545n) {
                view.setSelected(true);
                m5187a(true);
                return;
            } else {
                this.f6547p = null;
                return;
            }
        }
        m5181a(i);
        this.f6547p = file;
        view.setSelected(true);
        m5187a(true);
        this.f6534c.setText(((Object) getText(C0303R.string.location)) + ": " + this.f6542k + "/" + file.getName() + " (" + m5179a(file.length()) + ")");
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) throws Throwable {
        if (i == 4) {
            m5187a(false);
            if (this.f6539h.getVisibility() == 0) {
                this.f6539h.setVisibility(8);
            } else if (this.f6541j != null && !this.f6542k.equals(f6532a)) {
                m5184a(this.f6541j);
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
                    this.f6546o = true;
                    m5182a((Bundle) null);
                } else {
                    Toast.makeText(this, C0303R.string.permission_access_denined, 0).show();
                    this.f6546o = false;
                }
                break;
        }
    }

    /* JADX INFO: renamed from: a */
    private String m5180a(Uri uri, Intent intent) {
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
    private void m5181a(int i) {
        if (this.f6549r == i) {
            this.f6550s++;
            if (this.f6550s == 2 && System.currentTimeMillis() - this.f6551t <= 500) {
                if (this.f6547p != null) {
                    getIntent().putExtra("RESULT_PATH", this.f6547p.getPath());
                    setResult(-1, getIntent());
                    finish();
                }
                this.f6550s = 1;
                return;
            }
            return;
        }
        this.f6549r = i;
        this.f6550s = 1;
        this.f6551t = System.currentTimeMillis();
    }

    /* JADX INFO: renamed from: a */
    private void m5182a(Bundle bundle) throws Throwable {
        String stringExtra;
        String string;
        if (this.f6546o) {
            if (bundle != null) {
                stringExtra = bundle.getString("currentPath");
            } else {
                stringExtra = getIntent().getStringExtra("START_PATH");
            }
            String strM1051b = C0360n.m1051b(this, "lastPath");
            if (stringExtra == null) {
                stringExtra = f6532a;
            } else if (!strM1051b.isEmpty()) {
                stringExtra = strM1051b;
            }
            if (this.f6545n) {
                this.f6547p = new File(stringExtra);
            }
            m5184a(stringExtra);
            if (bundle != null && (string = bundle.getString("selectedFileName")) != null) {
                this.f6547p = new File(String.valueOf(this.f6542k) + "/" + string);
                this.f6534c.setText(((Object) getText(C0303R.string.location)) + ": " + this.f6542k + "/" + string + " (" + m5179a(this.f6547p.length()) + ")");
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5184a(String str) throws Throwable {
        boolean z = str.length() < this.f6542k.length();
        Integer num = this.f6548q.get(this.f6541j);
        if (Build.VERSION.SDK_INT >= 29 && f6532a.equals(str)) {
            m5191c(str);
        } else {
            m5189b(str);
        }
        if (num != null && z) {
            getListView().setSelection(num.intValue());
        }
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: b */
    private void m5189b(String str) {
        boolean z;
        this.f6542k = str;
        ArrayList arrayList = new ArrayList();
        this.f6533b = new ArrayList();
        this.f6536e = new ArrayList<>();
        File file = new File(this.f6542k);
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles == null) {
            this.f6542k = f6532a;
            file = new File(this.f6542k);
            fileArrListFiles = file.listFiles();
        }
        this.f6534c.setText(((Object) getText(C0303R.string.location)) + ": " + this.f6542k);
        if (!this.f6542k.equals(f6532a)) {
            arrayList.add("/");
            m5185a("/", C0303R.drawable.folder);
            this.f6533b.add(f6532a);
            this.f6541j = file.getParent();
            if (this.f6541j != null) {
                arrayList.add("../");
                m5185a("../", C0303R.drawable.folder);
                if (this.f6541j.equalsIgnoreCase("/storage/emulated")) {
                    this.f6541j = f6532a;
                }
                this.f6533b.add(this.f6541j);
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
                    if (this.f6544m != null) {
                        int i = 0;
                        while (true) {
                            if (i >= this.f6544m.length) {
                                z = false;
                                break;
                            } else if (!lowerCase.endsWith(this.f6544m[i].toLowerCase())) {
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
        this.f6533b.addAll(treeMap2.tailMap("").values());
        this.f6533b.addAll(treeMap4.tailMap("").values());
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, this.f6536e, C0303R.layout.file_dialog_row, new String[]{"key", "image"}, new int[]{C0303R.id.fdrowtext, C0303R.id.fdrowimage});
        Iterator it = treeMap.tailMap("").values().iterator();
        while (it.hasNext()) {
            m5185a((String) it.next(), C0303R.drawable.folder);
        }
        Iterator it2 = treeMap3.tailMap("").values().iterator();
        while (it2.hasNext()) {
            m5185a((String) it2.next(), C0303R.drawable.file);
        }
        simpleAdapter.notifyDataSetChanged();
        setListAdapter(simpleAdapter);
    }

    /* JADX INFO: renamed from: a */
    private void m5185a(String str, int i) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("key", str);
        map.put("image", Integer.valueOf(i));
        this.f6536e.add(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m5183a(View view) {
        this.f6539h.setVisibility(8);
        this.f6540i.hideSoftInputFromWindow(view.getWindowToken(), 0);
        if (this.f6545n) {
            m5187a(true);
        } else {
            m5187a(false);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m5187a(boolean z) {
        this.f6538g.setEnabled(z);
        if (!z) {
            this.f6538g.setIcon(C0303R.drawable.ic_check_grey);
        } else {
            this.f6538g.setIcon(C0303R.drawable.ic_check_normal);
        }
    }

    @SuppressLint({"DefaultLocale"})
    /* JADX INFO: renamed from: a */
    private static String m5179a(long j) {
        if (j < 1024) {
            return String.valueOf(j) + " B";
        }
        int iLog = (int) (Math.log(j) / Math.log(1024.0d));
        return String.format("%.1f %sB", Double.valueOf(j / Math.pow(1024.0d, iLog)), String.valueOf("KMGTPE".charAt(iLog - 1)) + "i");
    }

    /* JADX INFO: renamed from: c */
    private void m5191c(String str) throws Throwable {
        this.f6542k = str;
        ArrayList arrayList = new ArrayList();
        this.f6533b = new ArrayList();
        this.f6536e = new ArrayList<>();
        this.f6534c.setText(((Object) getText(C0303R.string.location)) + ": " + this.f6542k);
        List<C0345bj.a> listM1012a = C0345bj.m1012a();
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        TreeMap treeMap2 = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        for (C0345bj.a aVar : listM1012a) {
            String strM1013a = aVar.m1013a();
            treeMap.put(strM1013a, strM1013a);
            treeMap2.put(strM1013a, aVar.f1399a);
        }
        arrayList.addAll(treeMap.tailMap("").values());
        this.f6533b.addAll(treeMap2.tailMap("").values());
        SimpleAdapter simpleAdapter = new SimpleAdapter(this, this.f6536e, C0303R.layout.file_dialog_row, new String[]{"key", "image"}, new int[]{C0303R.id.fdrowtext, C0303R.id.fdrowimage});
        Iterator it = treeMap.tailMap("").values().iterator();
        while (it.hasNext()) {
            m5185a((String) it.next(), C0303R.drawable.folder);
        }
        simpleAdapter.notifyDataSetChanged();
        setListAdapter(simpleAdapter);
    }
}
