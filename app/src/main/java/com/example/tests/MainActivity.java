package com.example.tests;

import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listViewCandidates = findViewById(R.id.listViewCandidates);

        // Создаем список кандидатов
        List<Candidate> candidateList = new ArrayList<>();
        candidateList.add(new Candidate("Рыбкин Алексей", "Разработчик", "3 года", R.drawable.catphoto1));
        candidateList.add(new Candidate("Бодкаблучный Петр", "Тестировщик", "2 года", R.drawable.catphoto2));
        candidateList.add(new Candidate("Джава Скрипт", "Менеджер", "5 лет", R.drawable.catphoto3));
        // Добавьте остальных кандидатов

        // Создаем адаптер
        CandidateAdapter adapter = new CandidateAdapter(this, candidateList);

        // Устанавливаем адаптер для ListView
        listViewCandidates.setAdapter(adapter);
    }
}