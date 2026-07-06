package com.al.dlnaserver.customs;

import android.R$layout;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Build$VERSION;
import android.os.Environment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.Toast;
import com.al.dlnaserver.App;
import com.al.dlnaserver.R$id;
import com.al.dlnaserver.R$string;
import com.al.dlnaserver.b.bl;
import com.al.dlnaserver.b.n;
import java.util.ArrayList;
import org.fileexplorer.FileDialog;
import org.fileexplorer.FileDialogTV;

/* JADX INFO: compiled from: CustomListAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class c extends ArrayAdapter<String> {
    private ArrayList<String> a;
    private LayoutInflater b;
    private Activity c;
    private boolean d;

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final /* synthetic */ Object getItem(int i) {
        return a(i);
    }

    static /* synthetic */ ArrayList a(c cVar) {
        return cVar.a;
    }

    static /* synthetic */ Activity b(c cVar) {
        return cVar.c;
    }

    public c(Context context, ArrayList<String> arrayList, boolean z) {
        super(context, R$layout.simple_list_item_1, arrayList);
        this.c = (Activity) context;
        this.a = arrayList;
        this.b = LayoutInflater.from(context);
        this.d = z || bl.a(context);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final int getCount() {
        return this.a.size();
    }

    private String a(int i) {
        return this.a.get(i);
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    @SuppressLint({"InflateParams"})
    public final View getView(int i, View view, ViewGroup viewGroup) {
        String strA = a(i);
        if (view == null) {
            if (this.d) {
                view = this.b.inflate(com.al.dlnaserver.R$layout.list_row_tv, (ViewGroup) null);
            } else {
                view = this.b.inflate(com.al.dlnaserver.R$layout.list_row, (ViewGroup) null);
            }
        }
        EditText editText = (EditText) view.findViewById(R$id.path);
        editText.setText(strA);
        editText.setOnKeyListener(new d(this));
        editText.setOnFocusChangeListener(new e(this));
        ((ImageButton) view.findViewById(R$id.btton_remove)).setOnClickListener(new f(this));
        ((ImageButton) view.findViewById(R$id.btton_clear)).setOnClickListener(new g(this));
        ((ImageButton) view.findViewById(R$id.btton_browse)).setOnClickListener(new h(this));
        view.setTag(String.valueOf(i));
        return view;
    }

    static /* synthetic */ void a(c cVar, View view) {
        int i = Integer.parseInt(((LinearLayout) view.getParent()).getTag().toString());
        String strReplace = ((EditText) view).getText().toString().replace("\n", "").replace("\r", "");
        if (strReplace.isEmpty() || i >= cVar.a.size() || i < 0) {
            return;
        }
        cVar.a.set(i, strReplace);
        n.a(cVar.c, "pathsList", cVar.a);
    }

    static /* synthetic */ void a(c cVar, View view, int i) {
        Intent intent;
        Intent intent2;
        if (i == 12346) {
            App.q = Integer.parseInt(((LinearLayout) view.getParent()).getTag().toString());
            if (Build$VERSION.SDK_INT < 19) {
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
                cVar.c.startActivityForResult(intent2, i);
                return;
            } catch (ActivityNotFoundException e) {
                e.printStackTrace();
                Toast.makeText(cVar.c, cVar.c.getString(R$string.no_app_to_open), 1).show();
                return;
            }
        }
        int i2 = Integer.parseInt(((LinearLayout) view.getParent()).getTag().toString());
        App.q = i2;
        if (cVar.d) {
            intent = new Intent(cVar.c, (Class<?>) FileDialogTV.class);
        } else {
            intent = new Intent(cVar.c, (Class<?>) FileDialog.class);
        }
        intent.putExtra("START_PATH", Environment.getExternalStorageDirectory().getAbsolutePath());
        if (i == 12345) {
            intent.putExtra("SELECTION_MODE", 1);
            intent.putExtra("CAN_SELECT_DIR", true);
        }
        intent.putExtra("LIST_ITEM", i2);
        intent.putExtra("LIST_INDEX", App.p);
        intent.putExtra("LIST_TOP", App.o);
        cVar.c.startActivityForResult(intent, i);
    }
}
