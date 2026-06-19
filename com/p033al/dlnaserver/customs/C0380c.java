package com.p033al.dlnaserver.customs;

import android.R;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.p033al.dlnaserver.App;
import com.p033al.dlnaserver.C0303R;
import com.p033al.dlnaserver.p035b.C0347bl;
import com.p033al.dlnaserver.p035b.C0360n;
import java.util.ArrayList;
import org.fileexplorer.FileDialog;
import org.fileexplorer.FileDialogTV;

/* JADX INFO: renamed from: com.al.dlnaserver.customs.c */
/* JADX INFO: compiled from: CustomListAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0380c extends ArrayAdapter<String> {

    /* JADX INFO: renamed from: a */
    private ArrayList<String> f1453a;

    /* JADX INFO: renamed from: b */
    private LayoutInflater f1454b;

    /* JADX INFO: renamed from: c */
    private Activity f1455c;

    /* JADX INFO: renamed from: d */
    private boolean f1456d;

    public C0380c(Context context, ArrayList<String> arrayList, boolean z) {
        super(context, R.layout.simple_list_item_1, arrayList);
        this.f1455c = (Activity) context;
        this.f1453a = arrayList;
        this.f1454b = LayoutInflater.from(context);
        this.f1456d = z || C0347bl.m1015a(context);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.f1453a.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String getItem(int i) {
        return this.f1453a.get(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @SuppressLint({"InflateParams"})
    public final View getView(int i, View view, ViewGroup viewGroup) {
        String item = getItem(i);
        if (view == null) {
            if (this.f1456d) {
                view = this.f1454b.inflate(C0303R.layout.list_row_tv, (ViewGroup) null);
            } else {
                view = this.f1454b.inflate(C0303R.layout.list_row, (ViewGroup) null);
            }
        }
        EditText editText = (EditText) view.findViewById(C0303R.id.path);
        editText.setText(item);
        editText.setOnKeyListener(new ViewOnKeyListenerC0381d(this));
        editText.setOnFocusChangeListener(new ViewOnFocusChangeListenerC0382e(this));
        ((ImageButton) view.findViewById(C0303R.id.btton_remove)).setOnClickListener(new ViewOnClickListenerC0383f(this));
        ((ImageButton) view.findViewById(C0303R.id.btton_clear)).setOnClickListener(new ViewOnClickListenerC0384g(this));
        ((ImageButton) view.findViewById(C0303R.id.btton_browse)).setOnClickListener(new ViewOnClickListenerC0385h(this));
        view.setTag(String.valueOf(i));
        return view;
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m1081a(C0380c c0380c, View view) {
        int i = Integer.parseInt(((LinearLayout) view.getParent()).getTag().toString());
        String strReplace = ((EditText) view).getText().toString().replace("\n", "").replace("\r", "");
        if (strReplace.isEmpty() || i >= c0380c.f1453a.size() || i < 0) {
            return;
        }
        c0380c.f1453a.set(i, strReplace);
        C0360n.m1048a(c0380c.f1455c, "pathsList", c0380c.f1453a);
    }

    /* JADX INFO: renamed from: a */
    static /* synthetic */ void m1082a(C0380c c0380c, View view, int i) {
        Intent intent;
        Intent intent2;
        if (i == 12346) {
            App.f1285q = Integer.parseInt(((LinearLayout) view.getParent()).getTag().toString());
            if (Build.VERSION.SDK_INT < 19) {
                intent2 = new Intent();
                intent2.setAction("android.intent.action.GET_CONTENT");
                intent2.setType("*/*");
            } else {
                intent2 = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent2.addCategory("android.intent.category.OPENABLE");
                intent2.setType("*/*");
            }
            intent2.putExtra("android.content.extra.SHOW_ADVANCED", true);
            intent2.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            try {
                c0380c.f1455c.startActivityForResult(intent2, i);
                return;
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
                Toast.makeText(c0380c.f1455c, c0380c.f1455c.getString(C0303R.string.no_app_to_open), 1).show();
                return;
            }
        }
        int i2 = Integer.parseInt(((LinearLayout) view.getParent()).getTag().toString());
        App.f1285q = i2;
        if (c0380c.f1456d) {
            intent = new Intent(c0380c.f1455c, (Class<?>) FileDialogTV.class);
        } else {
            intent = new Intent(c0380c.f1455c, (Class<?>) FileDialog.class);
        }
        intent.putExtra("START_PATH", Environment.getExternalStorageDirectory().getAbsolutePath());
        if (i == 12345) {
            intent.putExtra("SELECTION_MODE", 1);
            intent.putExtra("CAN_SELECT_DIR", true);
        }
        intent.putExtra("LIST_ITEM", i2);
        intent.putExtra("LIST_INDEX", App.f1284p);
        intent.putExtra("LIST_TOP", App.f1283o);
        c0380c.f1455c.startActivityForResult(intent, i);
    }
}
