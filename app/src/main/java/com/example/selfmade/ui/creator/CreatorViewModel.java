package com.example.selfmade.ui.creator;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class CreatorViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public CreatorViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is creator fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}