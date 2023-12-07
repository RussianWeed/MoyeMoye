package com.devking.workout_app;

import android.app.Activity;
import android.os.Bundle;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.ListFragment;


public class workout_listFragment extends ListFragment {

    public workout_listFragment() {

    }
    static interface WorkoutListListner{
        void itemclick(long id);
    };
    private WorkoutListListner listener;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        String[] names = new String[MainActivity.Workout.workouts.length];
        for (int i = 0; i < names.length; i++) {
            names[i] = MainActivity.Workout.workouts[i].getname();
        }
        ArrayAdapter<String> adapter = new ArrayAdapter<>(inflater.getContext(),
                android.R.layout.simple_list_item_1, names);
        setListAdapter(adapter);
        return super.onCreateView(inflater,container,savedInstanceState);
    }


    @Override
    public void onListItemClick(ListView l, View v, int position, long id) {
        if (listener != null){
            listener.itemclick(id);
        }
    }
}
