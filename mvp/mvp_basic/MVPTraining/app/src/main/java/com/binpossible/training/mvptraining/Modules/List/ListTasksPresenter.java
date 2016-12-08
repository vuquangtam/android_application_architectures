package com.binpossible.training.mvptraining.Modules.List;

import android.support.annotation.NonNull;

import com.binpossible.training.mvptraining.DataSources.TaskDataSource;
import com.binpossible.training.mvptraining.DataSources.TaskLocalRepository;
import com.binpossible.training.mvptraining.Utils.Scheduler.BaseSchedulerProvider;
import com.binpossible.training.mvptraining.Utils.Scheduler.SchedulerProvider;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by ThanhTrinh on 12/6/16.
 */

public class ListTasksPresenter implements ListTasksContract.Presenter {

    @NonNull
    private final ListTasksContract.View mView;

    @NonNull
    private final TaskDataSource mTaskDataSource;

    @NonNull
    private final BaseSchedulerProvider mBaseSchedulerProvider;

    private CompositeSubscription mSubscriptions;

    public ListTasksPresenter(@NonNull ListTasksContract.View view){
        mView = view;
        mView.setPresenter(this);
        mTaskDataSource = checkNotNull(TaskLocalRepository.getIntance().getTaskDataSource());
        mBaseSchedulerProvider = checkNotNull(SchedulerProvider.getInstance()
                .getBaseSchedulerProvider());
        mSubscriptions = new CompositeSubscription();
    }

    @Override
    public void loadTasks() {
        mView.showTask(mTaskDataSource.getTask());
    }

    @Override
    public void updateCompletion(@NonNull String id, boolean isComplete) {

    }
}
