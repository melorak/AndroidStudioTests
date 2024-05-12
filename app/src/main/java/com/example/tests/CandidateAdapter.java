package com.example.tests;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class CandidateAdapter extends ArrayAdapter<Candidate> {

    private Context context;
    private List<Candidate> candidateList;

    public CandidateAdapter(Context context, List<Candidate> candidateList) {
        super(context, R.layout.list_item_candidate, candidateList);
        this.context = context;
        this.candidateList = candidateList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;

        if (view == null) {
            LayoutInflater inflater = LayoutInflater.from(context);
            view = inflater.inflate(R.layout.list_item_candidate, null);
        }

        Candidate candidate = candidateList.get(position);

        ImageView imageViewPhoto = view.findViewById(R.id.imageViewPhoto);
        TextView textViewName = view.findViewById(R.id.textViewName);
        TextView textViewPosition = view.findViewById(R.id.textViewPosition);
        TextView textViewExperience = view.findViewById(R.id.textViewExperience);

        imageViewPhoto.setImageResource(candidate.getPhotoResId());
        textViewName.setText(candidate.getName());
        textViewPosition.setText(candidate.getPosition());
        textViewExperience.setText(candidate.getExperience());

        return view;
    }
}
