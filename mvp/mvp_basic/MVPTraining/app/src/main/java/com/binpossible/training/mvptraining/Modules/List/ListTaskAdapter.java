package com.binpossible.training.mvptraining.Modules.List;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.binpossible.training.mvptraining.Models.Task;
import com.binpossible.training.mvptraining.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ThanhTrinh on 12/6/16.
 */

public class ListTaskAdapter extends RecyclerView.Adapter<ListTaskItem>{

    private List<Task> mTaskList;

    public ListTaskAdapter(){
        mTaskList = new ArrayList<>();
    }

    @Override
    public ListTaskItem onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout
                .layout_list_task_item, parent, false);

        return new ListTaskItem(view, parent.getContext());
    }

    @Override
    public void onBindViewHolder(ListTaskItem holder, int position) {
        holder.bindingData(mTaskList.get(position));
    }

    @Override
    public int getItemCount() {
        return mTaskList.size();
    }

    public void setTaskList(List<Task> taskList) {
        mTaskList = taskList;
    }
}
