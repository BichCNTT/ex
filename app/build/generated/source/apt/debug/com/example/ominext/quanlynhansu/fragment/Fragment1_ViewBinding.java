// Generated code from Butter Knife. Do not modify!
package com.example.ominext.quanlynhansu.fragment;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import butterknife.Unbinder;
import butterknife.internal.DebouncingOnClickListener;
import butterknife.internal.Utils;
import com.example.ominext.quanlynhansu.R;
import java.lang.IllegalStateException;
import java.lang.Override;

public class Fragment1_ViewBinding<T extends Fragment1> implements Unbinder {
  protected T target;

  private View view2131492965;

  @UiThread
  public Fragment1_ViewBinding(final T target, View source) {
    this.target = target;

    View view;
    target.rvListEmployees = Utils.findRequiredViewAsType(source, R.id.rv_listEmployees, "field 'rvListEmployees'", RecyclerView.class);
    view = Utils.findRequiredView(source, R.id.bt_add, "field 'btAdd' and method 'onViewClicked'");
    target.btAdd = Utils.castView(view, R.id.bt_add, "field 'btAdd'", Button.class);
    view2131492965 = view;
    view.setOnClickListener(new DebouncingOnClickListener() {
      @Override
      public void doClick(View p0) {
        target.onViewClicked();
      }
    });
    target.text = Utils.findRequiredViewAsType(source, R.id.text, "field 'text'", TextView.class);
    target.frameAddEmployees = Utils.findRequiredViewAsType(source, R.id.frame_add_employees, "field 'frameAddEmployees'", FrameLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.rvListEmployees = null;
    target.btAdd = null;
    target.text = null;
    target.frameAddEmployees = null;

    view2131492965.setOnClickListener(null);
    view2131492965 = null;

    this.target = null;
  }
}
