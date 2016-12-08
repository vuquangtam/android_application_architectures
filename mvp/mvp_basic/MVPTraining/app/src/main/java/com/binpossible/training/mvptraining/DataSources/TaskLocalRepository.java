package com.binpossible.training.mvptraining.DataSources;

/**
 * Created by ThanhTrinh on 12/6/16.
 */

public class TaskLocalRepository {

    private TaskDataSource mTaskDataSource;

    private static TaskLocalRepository mTaskLocalRepository = null;

    private TaskLocalRepository() {
        mTaskDataSource = new TaskDataSourceImpl();
    }

    public synchronized static TaskLocalRepository getIntance() {
        if (mTaskLocalRepository == null) {
            mTaskLocalRepository = new TaskLocalRepository();
        }
        return mTaskLocalRepository;
    }

    public TaskDataSource getTaskDataSource() {
        return mTaskDataSource;
    }

}
