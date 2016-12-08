package com.binpossible.training.mvptraining.DataSources;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import com.binpossible.training.mvptraining.Models.Task;

import java.util.List;

/**
 * Created by ThanhTrinh on 12/6/16.
 */

public interface TaskDataSource {

    @Nullable
    Task getTask(@NonNull String id);

    @NonNull
    List<Task> getTask();

    boolean createTask(@NonNull Task task);

    boolean updateTaskCompletion(@NonNull String id, boolean isComplete);

    @Nullable
    Task removeTask(@NonNull String id);

    @NonNull
    Task updateTask(@NonNull Task task);

}
