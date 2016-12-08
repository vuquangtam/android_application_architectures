package com.binpossible.training.mvptraining.DataSources;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.binpossible.training.mvptraining.Models.Task;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by ThanhTrinh on 12/6/16.
 */

public class TaskDataSourceImpl implements TaskDataSource {

    private Set<Task> mTaskSet;

    public TaskDataSourceImpl() {
        super();
        mTaskSet = new HashSet<>();
    }

    @Nullable
    @Override
    public Task getTask(@NonNull String id) {
        return null;
    }

    @NonNull
    @Override
    public List<Task> getTask() {
        mTaskSet.add(new Task("asd", "asdasd", false));
        return new ArrayList<>(mTaskSet);
    }

    @Override
    public boolean createTask(@NonNull Task task) {
        return false;
    }

    @Override
    public boolean updateTaskCompletion(@NonNull String id, boolean isComplete) {
        return false;
    }

    @Nullable
    @Override
    public Task removeTask(@NonNull String id) {
        return null;
    }

    @NonNull
    @Override
    public Task updateTask(@NonNull Task task) {
        return null;
    }

    public Set<Task> getTaskSet() {
        return mTaskSet;
    }

    @Deprecated
    public void setTaskSet(Set<Task> taskSet) {
        mTaskSet = taskSet;
    }
}
