package edu.jsu.mcis.cs408.tablayoutdemo1;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class TabLayoutFragment extends Fragment {

    // Instances of this class are used for the individual fragments within the tabbed layout

    public static final String ARG_ID = "id";

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.tab_fragment, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {

        // Get numeric ID from parameter list
        Bundle args = getArguments();
        String id = Integer.toString(args.getInt(ARG_ID));

        // Display numeric ID in TextView in fragment layout
        ((TextView) view.findViewById(R.id.fragment_id)).setText(id);

    }

}