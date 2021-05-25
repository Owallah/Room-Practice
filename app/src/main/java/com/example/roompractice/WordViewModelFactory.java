package com.example.roompractice;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

public class WordViewModelFactory implements ViewModelProvider.Factory {

    private Application mApplication;

    public WordViewModelFactory(Application application){
        mApplication = application;
    }
    @NonNull
    @Override
    public <T extends ViewModel> T create(@NonNull Class<T> modelClass) {
        return (T) new WordViewModel(mApplication);
    }
}
