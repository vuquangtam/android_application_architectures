package com.binpossible.training.mvptraining.Utils.Scheduler;

import android.support.annotation.NonNull;

import rx.Scheduler;
import rx.schedulers.Schedulers;

/**
 * Created by ThanhTrinh on 12/6/16.
 */

public class ImmediateSchedulerProvider implements BaseSchedulerProvider {
    @NonNull
    @Override
    public Scheduler computation() {
        return Schedulers.immediate();
    }

    @NonNull
    @Override
    public Scheduler io() {
        return Schedulers.immediate();
    }

    @NonNull
    @Override
    public Scheduler ui() {
        return Schedulers.immediate();
    }
}
