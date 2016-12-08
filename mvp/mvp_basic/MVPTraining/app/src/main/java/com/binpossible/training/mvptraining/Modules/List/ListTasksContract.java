package com.binpossible.training.mvptraining.Modules.List;

import android.support.annotation.NonNull;

import com.binpossible.training.mvptraining.Models.Task;

import java.util.List;

/**
 * Created by ThanhTrinh on 12/6/16.
 */

public class ListTasksContract {

    public interface Presenter{
        void updateCompletion(@NonNull String id, boolean isComplete);
        void loadTasks();
    }

    public interface View{
        void showTask(List<Task> tasks);
        void setPresenter(Presenter presenter);
    }

}
