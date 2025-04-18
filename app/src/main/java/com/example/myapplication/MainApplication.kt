package com.example.myapplication

import android.app.Application
import androidx.room.Room
import com.example.myapplication.db.TodoDatabase

class MainApplication : Application() {

    companion object{
        lateinit var todoDatebase: TodoDatabase
    }

    override fun onCreate(){
        super.onCreate()
        todoDatebase = Room.databaseBuilder(
            applicationContext,
            TodoDatabase :: class.java,
            TodoDatabase.NAME

        )
            .addMigrations(TodoDatabase.MIGRATION_1_2)
            .build()

    }
}