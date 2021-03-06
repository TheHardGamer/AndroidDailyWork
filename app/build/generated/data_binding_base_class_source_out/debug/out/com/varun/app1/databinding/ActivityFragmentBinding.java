// Generated by view binder compiler. Do not edit!
package com.varun.app1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.varun.app1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityFragmentBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button fragmentbt1;

  @NonNull
  public final Button fragmentbt2;

  @NonNull
  public final FrameLayout framelayout;

  private ActivityFragmentBinding(@NonNull ConstraintLayout rootView, @NonNull Button fragmentbt1,
      @NonNull Button fragmentbt2, @NonNull FrameLayout framelayout) {
    this.rootView = rootView;
    this.fragmentbt1 = fragmentbt1;
    this.fragmentbt2 = fragmentbt2;
    this.framelayout = framelayout;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityFragmentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityFragmentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_fragment, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityFragmentBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.fragmentbt1;
      Button fragmentbt1 = ViewBindings.findChildViewById(rootView, id);
      if (fragmentbt1 == null) {
        break missingId;
      }

      id = R.id.fragmentbt2;
      Button fragmentbt2 = ViewBindings.findChildViewById(rootView, id);
      if (fragmentbt2 == null) {
        break missingId;
      }

      id = R.id.framelayout;
      FrameLayout framelayout = ViewBindings.findChildViewById(rootView, id);
      if (framelayout == null) {
        break missingId;
      }

      return new ActivityFragmentBinding((ConstraintLayout) rootView, fragmentbt1, fragmentbt2,
          framelayout);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
