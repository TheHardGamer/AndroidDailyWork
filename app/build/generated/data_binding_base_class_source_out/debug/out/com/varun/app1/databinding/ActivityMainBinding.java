// Generated by view binder compiler. Do not edit!
package com.varun.app1.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.varun.app1.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button allsensors;

  @NonNull
  public final TextView batt;

  @NonNull
  public final Button changelang;

  @NonNull
  public final ConstraintLayout constr;

  @NonNull
  public final Button exitt;

  @NonNull
  public final Button firstactbtn;

  @NonNull
  public final Button fragact;

  @NonNull
  public final ImageView imagev;

  @NonNull
  public final Button intentactbtn;

  @NonNull
  public final Button lifecycl;

  @NonNull
  public final Button logact;

  @NonNull
  public final Button mapsact;

  @NonNull
  public final Button playmusic;

  @NonNull
  public final Button proxi;

  @NonNull
  public final Button recycleract;

  @NonNull
  public final Button spinact;

  @NonNull
  public final Button stopm;

  @NonNull
  public final TextView textView3;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button allsensors,
      @NonNull TextView batt, @NonNull Button changelang, @NonNull ConstraintLayout constr,
      @NonNull Button exitt, @NonNull Button firstactbtn, @NonNull Button fragact,
      @NonNull ImageView imagev, @NonNull Button intentactbtn, @NonNull Button lifecycl,
      @NonNull Button logact, @NonNull Button mapsact, @NonNull Button playmusic,
      @NonNull Button proxi, @NonNull Button recycleract, @NonNull Button spinact,
      @NonNull Button stopm, @NonNull TextView textView3) {
    this.rootView = rootView;
    this.allsensors = allsensors;
    this.batt = batt;
    this.changelang = changelang;
    this.constr = constr;
    this.exitt = exitt;
    this.firstactbtn = firstactbtn;
    this.fragact = fragact;
    this.imagev = imagev;
    this.intentactbtn = intentactbtn;
    this.lifecycl = lifecycl;
    this.logact = logact;
    this.mapsact = mapsact;
    this.playmusic = playmusic;
    this.proxi = proxi;
    this.recycleract = recycleract;
    this.spinact = spinact;
    this.stopm = stopm;
    this.textView3 = textView3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.allsensors;
      Button allsensors = ViewBindings.findChildViewById(rootView, id);
      if (allsensors == null) {
        break missingId;
      }

      id = R.id.batt;
      TextView batt = ViewBindings.findChildViewById(rootView, id);
      if (batt == null) {
        break missingId;
      }

      id = R.id.changelang;
      Button changelang = ViewBindings.findChildViewById(rootView, id);
      if (changelang == null) {
        break missingId;
      }

      ConstraintLayout constr = (ConstraintLayout) rootView;

      id = R.id.exitt;
      Button exitt = ViewBindings.findChildViewById(rootView, id);
      if (exitt == null) {
        break missingId;
      }

      id = R.id.firstactbtn;
      Button firstactbtn = ViewBindings.findChildViewById(rootView, id);
      if (firstactbtn == null) {
        break missingId;
      }

      id = R.id.fragact;
      Button fragact = ViewBindings.findChildViewById(rootView, id);
      if (fragact == null) {
        break missingId;
      }

      id = R.id.imagev;
      ImageView imagev = ViewBindings.findChildViewById(rootView, id);
      if (imagev == null) {
        break missingId;
      }

      id = R.id.intentactbtn;
      Button intentactbtn = ViewBindings.findChildViewById(rootView, id);
      if (intentactbtn == null) {
        break missingId;
      }

      id = R.id.lifecycl;
      Button lifecycl = ViewBindings.findChildViewById(rootView, id);
      if (lifecycl == null) {
        break missingId;
      }

      id = R.id.logact;
      Button logact = ViewBindings.findChildViewById(rootView, id);
      if (logact == null) {
        break missingId;
      }

      id = R.id.mapsact;
      Button mapsact = ViewBindings.findChildViewById(rootView, id);
      if (mapsact == null) {
        break missingId;
      }

      id = R.id.playmusic;
      Button playmusic = ViewBindings.findChildViewById(rootView, id);
      if (playmusic == null) {
        break missingId;
      }

      id = R.id.proxi;
      Button proxi = ViewBindings.findChildViewById(rootView, id);
      if (proxi == null) {
        break missingId;
      }

      id = R.id.recycleract;
      Button recycleract = ViewBindings.findChildViewById(rootView, id);
      if (recycleract == null) {
        break missingId;
      }

      id = R.id.spinact;
      Button spinact = ViewBindings.findChildViewById(rootView, id);
      if (spinact == null) {
        break missingId;
      }

      id = R.id.stopm;
      Button stopm = ViewBindings.findChildViewById(rootView, id);
      if (stopm == null) {
        break missingId;
      }

      id = R.id.textView3;
      TextView textView3 = ViewBindings.findChildViewById(rootView, id);
      if (textView3 == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, allsensors, batt, changelang,
          constr, exitt, firstactbtn, fragact, imagev, intentactbtn, lifecycl, logact, mapsact,
          playmusic, proxi, recycleract, spinact, stopm, textView3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
