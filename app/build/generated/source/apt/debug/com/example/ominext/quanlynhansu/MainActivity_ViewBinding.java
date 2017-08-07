// Generated code from Butter Knife. Do not modify!
package com.example.ominext.quanlynhansu;

import android.support.annotation.CallSuper;
import android.support.annotation.UiThread;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ListView;
import butterknife.Unbinder;
import butterknife.internal.Utils;
import java.lang.IllegalStateException;
import java.lang.Override;

public class MainActivity_ViewBinding<T extends MainActivity> implements Unbinder {
  protected T target;

  @UiThread
  public MainActivity_ViewBinding(T target, View source) {
    this.target = target;

    target.slidingMenu = Utils.findRequiredViewAsType(source, R.id.sliding_menu, "field 'slidingMenu'", ListView.class);
    target.drawerLayout = Utils.findRequiredViewAsType(source, R.id.drawer_layout, "field 'drawerLayout'", DrawerLayout.class);
    target.frameLayout = Utils.findRequiredViewAsType(source, R.id.frame_layout, "field 'frameLayout'", FrameLayout.class);
  }

  @Override
  @CallSuper
  public void unbind() {
    T target = this.target;
    if (target == null) throw new IllegalStateException("Bindings already cleared.");

    target.slidingMenu = null;
    target.drawerLayout = null;
    target.frameLayout = null;

    this.target = null;
  }
}
