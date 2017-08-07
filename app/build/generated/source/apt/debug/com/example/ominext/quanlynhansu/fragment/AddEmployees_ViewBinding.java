// Generated code from Butter Knife. Do not modify!
package com.example.ominext.quanlynhansu.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.ominext.quanlynhansu.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class AddEmployees_ViewBinding<T extends AddEmployees> implements Unbinder {
  protected T target;

  private View view2131492968;

  private View view2131492969;

  private View view2131492972;

  private View view2131492973;

  @UiThread
  public AddEmployees_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.edtName = Utils.findRequiredViewAsType(source, R.id.edt_name, "field 'edtName'", EditText.class);
    view = Utils.findRequiredView(source, R.id.cb_man, "field 'cbMan' and method 'onViewClicked'");
    target.cbMan = Utils.castView(view, R.id.cb_man, "field 'cbMan'", CheckBox.class);
    view2131492968 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.cb_woman, "field 'cbWoman' and method 'onViewClicked'");
    target.cbWoman = Utils.castView(view, R.id.cb_woman, "field 'cbWoman'", CheckBox.class);
    view2131492969 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.edtDateOfBirth = Utils.findRequiredViewAsType(source, R.id.edt_dateOfBirth, "field 'edtDateOfBirth'", EditText.class);
    target.edtPhone = Utils.findRequiredViewAsType(source, R.id.edt_phone, "field 'edtPhone'", EditText.class);
    view = Utils.findRequiredView(source, R.id.save, "field 'save' and method 'onViewClicked'");
    target.save = Utils.castView(view, R.id.save, "field 'save'", Button.class);
    view2131492972 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    view = Utils.findRequiredView(source, R.id.esc, "field 'esc' and method 'onViewClicked'");
    target.esc = Utils.castView(view, R.id.esc, "field 'esc'", Button.class);
    view2131492973 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked(p0);
      }
    });
    target.edtId = Utils.findRequiredViewAsType(source, R.id.edt_id, "field 'edtId'", EditText.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.edtName = null;
    target.cbMan = null;
    target.cbWoman = null;
    target.edtDateOfBirth = null;
    target.edtPhone = null;
    target.save = null;
    target.esc = null;
    target.edtId = null;

    view2131492968.setOnClickListener(null);
    view2131492968 = null;
    view2131492969.setOnClickListener(null);
    view2131492969 = null;
    view2131492972.setOnClickListener(null);
    view2131492972 = null;
    view2131492973.setOnClickListener(null);
    view2131492973 = null;

    this.target = null;
  }
}
