package com.devking.workout_app;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Workout_detailFragment extends Fragment {
    public long workoutId ;
    public Workout_detailFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_workout_detail, container, false);
    }

    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null) {
            TextView name = (TextView) view.findViewById(R.id.name);
            MainActivity.Workout workout = MainActivity.Workout.workouts[(int) workoutId];
            name.setText(workout.getname());
            TextView description = (TextView) view.findViewById(R.id.description);
            description.setText(workout.getDescription());
        }
    }
    public void setWork(Long id){
        workoutId = id;
    }
}
