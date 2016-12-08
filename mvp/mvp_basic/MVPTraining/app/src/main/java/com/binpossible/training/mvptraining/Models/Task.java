package com.binpossible.training.mvptraining.Models;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import java.util.Calendar;
import java.util.Date;
import java.util.Objects;
import java.util.UUID;

/**
 * Created by ThanhTrinh on 12/6/16.
 */


public class Task {

    @NonNull
    private String mId;

    @NonNull
    private String mTaskName;

    @Nullable
    private String mTaskDescription;

    @NonNull
    private Date mCreatedDate;

    @NonNull
    private Date mLatestModifyDate;

    private boolean mIsComplete;

    public Task() {

    }

    public Task(@NonNull String taskName, @Nullable String taskDescription,
                boolean isComplete) {
        mId = UUID.randomUUID().toString();
        mTaskName = taskName;
        mTaskDescription = taskDescription;
        mTaskDescription = taskDescription;
        mIsComplete = isComplete;
        mCreatedDate = Calendar.getInstance().getTime();
        mLatestModifyDate = Calendar.getInstance().getTime();
    }


    @NonNull
    public String getId() {
        return mId;
    }

    public void setId(@NonNull String id) {
        mId = id;
    }

    @NonNull
    public String getTaskName() {
        return mTaskName;
    }

    public void setTaskName(@NonNull String taskName) {
        mTaskName = taskName;
    }

    @Nullable
    public String getTaskDescription() {
        return mTaskDescription;
    }

    public void setTaskDescription(@Nullable String taskDescription) {
        mTaskDescription = taskDescription;
    }

    @NonNull
    public Date getCreatedDate() {
        return mCreatedDate;
    }

    public void setCreatedDate(@NonNull Date createdDate) {
        mCreatedDate = createdDate;
    }

    @NonNull
    public Date getLatestModifyDate() {
        return mLatestModifyDate;
    }

    public void setLatestModifyDate(@NonNull Date latestModifyDate) {
        mLatestModifyDate = latestModifyDate;
    }

    public boolean isComplete() {
        return mIsComplete;
    }

    public void setComplete(boolean complete) {
        mIsComplete = complete;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mId, mTaskName);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (!(obj instanceof Task)) return false;
        Task other = (Task) obj;
        return other.getId().equals(Task.this.getId());
    }
}
