package com.binpossible.training.mvptraining.Modules.List;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.binpossible.training.mvptraining.Models.Task;
import com.binpossible.training.mvptraining.R;

import java.util.List;


public class ListTasksFragment extends Fragment implements ListTasksContract.View {

    private ListTasksContract.Presenter mPresenter;

    private ListTaskAdapter mListTaskAdapter;

    private LinearLayoutManager mLinearLayoutManager;

    private RecyclerView mListTaskView;

    public ListTasksFragment() {

    }

    public static ListTasksFragment newInstance() {
        ListTasksFragment fragment = new ListTasksFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_list_tasks, container, false);

        mListTaskAdapter = new ListTaskAdapter();
        mLinearLayoutManager = new LinearLayoutManager(getContext(), LinearLayoutManager
                .VERTICAL, false);
        mListTaskView = (RecyclerView) view.findViewById(R.id.fragment_list_tasks_view);
        mListTaskView.setLayoutManager(mLinearLayoutManager);
        mListTaskView.setAdapter(mListTaskAdapter);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mPresenter.loadTasks();
    }

    public void onButtonPressed(Uri uri) {

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);

    }

    @Override
    public void onDetach() {
        super.onDetach();

    }

    @Override
    public void showTask(List<Task> tasks) {
        mListTaskAdapter.setTaskList(tasks);
        mListTaskAdapter.notifyDataSetChanged();
    }

    public ListTasksContract.Presenter getPresenter() {
        return mPresenter;
    }

    public void setPresenter(ListTasksContract.Presenter presenter) {
        mPresenter = presenter;
    }
}
