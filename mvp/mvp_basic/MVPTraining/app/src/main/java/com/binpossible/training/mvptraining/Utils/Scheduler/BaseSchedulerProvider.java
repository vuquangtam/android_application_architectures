package com.binpossible.training.mvptraining.Utils.Scheduler;

import android.support.annotation.NonNull;

import rx.Scheduler;

/**
 * Created by ThanhTrinh on 12/6/16.
 */

public interface BaseSchedulerProvider {

    @NonNull
    Scheduler computation();

    @NonNull
    Scheduler io();

    @NonNull
    Scheduler ui();
}
