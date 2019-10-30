package com.example.registeration;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONObject;

import java.util.List;

public class RankListAdapter extends BaseAdapter {
    private Context context;
    private List<Course> courseList;
    private Fragment parent;


    public RankListAdapter(Context context, List<Course> courseList, Fragment parent) {
        this.context = context;
        this.courseList = courseList;
        this.parent = parent;


    }

    @Override
    public int getCount() {
        return courseList.size();
    }

    @Override
    public Object getItem(int position) {
        return courseList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, final ViewGroup viewGroup) {
        View v = View.inflate(context,R.layout.rank,null);
        TextView rankTextView = (TextView)v.findViewById(R.id.rankTextView);
        TextView courseGrade = (TextView)v.findViewById(R.id.courseGrade);
        TextView courseCredit = (TextView)v.findViewById(R.id.courseCredit);
        TextView courseTitle = (TextView)v.findViewById(R.id.courseTitle);
        TextView courseDivide = (TextView)v.findViewById(R.id.courseDivide);
        TextView coursePersonnel = (TextView)v.findViewById(R.id.coursePersonnel);
        TextView courseProfessor = (TextView)v.findViewById(R.id.courseProfessor);
        TextView courseTime = (TextView)v.findViewById(R.id.courseTime);

        rankTextView.setText((position+1)+"위");
        if( position != 0){
            rankTextView.setBackgroundColor(parent.getResources().getColor(R.color.colorPrimary));
        }


        if(courseList.get(position).getCourseGrade().equals("제한 없음")||courseList.get(position).getCourseGrade().equals("")){
            courseGrade.setText("모든 학년");
        }else{
            courseGrade.setText(courseList.get(position).getCourseGrade()+"학년");
        }
        courseTitle.setText(courseList.get(position).getCourseTitle());
        courseCredit.setText(courseList.get(position).getCourseCredit()+"학점");
        courseDivide.setText(courseList.get(position).getCourseDivide()+"분반");
        if(courseList.get(position).getCoursePersonnel()==0){
            coursePersonnel.setText("인원 제한 없음");

        }else{
            coursePersonnel.setText("제한 인원 :"+ courseList.get(position).getCoursePersonnel()+"명");



        }
        if(courseList.get(position).getCourseProfessor().equals("")){
            courseProfessor.setText("개인 연구");
        }else {
            courseProfessor.setText(courseList.get(position).getCourseProfessor()+ "교수님");
        }

        courseTime.setText(courseList.get(position).getCourseTime()+"");
        v.setTag(courseList.get(position).getCourseID());


        return v;

    }


}
