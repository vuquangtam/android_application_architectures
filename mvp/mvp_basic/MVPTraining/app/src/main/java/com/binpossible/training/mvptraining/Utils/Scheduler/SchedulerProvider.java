package com.binpossible.training.mvptraining.Utils.Scheduler;

/**
 * Created by ThanhTrinh on 12/6/16.
 */

public class SchedulerProvider {

    private BaseSchedulerProvider mBaseSchedulerProvider;

    private static SchedulerProvider mShareInstance = null;

    private SchedulerProvider(){
        mBaseSchedulerProvider = new ImmediateSchedulerProvider();
    }

    public synchronized static SchedulerProvider getInstance(){
        if(mShareInstance == null){
            mShareInstance = new SchedulerProvider();
        }

        return mShareInstance;
    }


    public BaseSchedulerProvider getBaseSchedulerProvider() {
        return mBaseSchedulerProvider;
    }


}
