package com.binpossible.training.mvptraining.Modules.List;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.binpossible.training.mvptraining.R;

public class MainActivity extends AppCompatActivity {

    private  ListTasksContract.Presenter mPresenter;

    private Button mAddButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager supportFragmentManager = getSupportFragmentManager();

        Fragment listTasksFragment = supportFragmentManager.findFragmentByTag("listTasksFragment");
        if(listTasksFragment == null){
            ListTasksFragment newListTasksFragment = ListTasksFragment.newInstance();
            mPresenter = new ListTasksPresenter(newListTasksFragment);
            supportFragmentManager.beginTransaction().add(R.id.activity_main_list_tasks, newListTasksFragment,
                    "listTasksFragment").commit();
        }
        mAddButton = (Button) findViewById(R.id.activity_main_add_button);
        mAddButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onAddButtonClick();
            }
        });
    }

    public void onAddButtonClick(){

    }
}
