package com.example.selfmade.ui.account;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.example.selfmade.AccountSettingsActivity;
import com.example.selfmade.ProjectCreatorActivity;
import com.example.selfmade.databinding.FragmentAccountBinding;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class AccountFragment extends Fragment {

    private AccountViewModel accountViewModel;
    private FragmentAccountBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        accountViewModel =
                new ViewModelProvider(this).get(AccountViewModel.class);

        binding = FragmentAccountBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        //CollapsingToolbarLayout toolBarLayout = binding.toolbarLayout1;
        //toolBarLayout.setTitle("Title");

        FloatingActionButton fab = binding.fab1;
        fab.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(), AccountSettingsActivity.class);
            view.getContext().startActivity(intent);});

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}