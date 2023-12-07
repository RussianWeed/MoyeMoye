package com.devking.workout_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements workout_listFragment.WorkoutListListner {
    public static final class Workout {
        private String name;
        private  String description;
        public static final  Workout[] workouts= {
                new Workout("Limb","5 - hand stand pushup\n10 one leg swat\n15 pull ups"),
                new Workout("Wimb","10 - hand stand pushup\n20 one leg swat\n30 pull ups"),
                new Workout("Strength and Length","20 - hand stand pushup\n40 one leg swat\n60 pull ups"),
        };
        private Workout(String name,String description){
            this.name = name;
            this.description = description;
        }
        public String getname(){
            return name;
        }
        public String getDescription(){
            return  description;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void itemclick(long id){

    }
}