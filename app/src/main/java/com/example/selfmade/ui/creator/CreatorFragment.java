package com.example.selfmade.ui.creator;

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
import com.example.selfmade.databinding.FragmentCreatorBinding;

public class CreatorFragment extends Fragment {

    private CreatorViewModel creatorViewModel;
    private FragmentCreatorBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        creatorViewModel =
                new ViewModelProvider(this).get(CreatorViewModel.class);

        binding = FragmentCreatorBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textCreator;
        creatorViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}