package com.binpossible.training.mvptraining.Modules.List;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.AppCompatCheckBox;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.binpossible.training.mvptraining.Models.Task;
import com.binpossible.training.mvptraining.R;

import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by ThanhTrinh on 12/6/16.
 */

public class ListTaskItem extends RecyclerView.ViewHolder {

    private View mView;

    private Context mContext;

    private AppCompatCheckBox mCheckbox;

    private TextView mTaskName;

    private TextView mTaskDescription;

    public ListTaskItem(View itemView) {
        super(itemView);
    }


    public ListTaskItem(@NonNull View itemView, @NonNull Context context){
        super(itemView);
        checkNotNull(itemView);
        checkNotNull(context);
        mView = itemView;
        mContext = context;
    }

    public void bindingData(@NonNull Task task){
        checkNotNull(task);

        mCheckbox = (AppCompatCheckBox) mView.findViewById(R.id.layout_list_task_item_checkbox);
        mTaskName = (TextView) mView.findViewById(R.id.layout_list_task_item_task_name);
        mTaskDescription = (TextView) mView.findViewById(R.id
                .layout_list_task_item_task_description);

        mCheckbox.setChecked(task.isComplete());
        mTaskDescription.setText(task.getTaskDescription() != null ? task.getTaskDescription() :"");
        mTaskName.setText(task.getTaskName());
    }



}
