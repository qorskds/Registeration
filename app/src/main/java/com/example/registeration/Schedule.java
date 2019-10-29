package com.example.registeration;

import android.content.Context;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Schedule {

    private String monday[] = new String[14];
    private String tuseday[] = new String[14];
    private String wednesday[] = new String[14];
    private String thursday[] = new String[14];
    private String friday[] = new String[14];

    public Schedule() {
        for (int i = 0; i < 14; i++) {
            monday[i] = "";
            tuseday[i] = "";
            wednesday[i] = "";
            thursday[i] = "";
            friday[i] = "";
        }
    }

    public void addSchedule(String scheduleText) {
        int tmp;

        if ((tmp = scheduleText.indexOf("월")) > -1) {
            tmp += 2;
            int startPoint = tmp;

            int endPoint = tmp;
            for (int i = tmp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if (scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if (scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    monday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "수업";

                }
            }
        }
        if ((tmp = scheduleText.indexOf("화")) > -1) {
            tmp += 2;
            int startPoint = tmp;
            int endPoint = tmp;
            for (int i = tmp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if (scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if (scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    tuseday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "수업";

                }
            }
        }
        if ((tmp = scheduleText.indexOf("수")) > -1) {
            tmp += 2;
            int startPoint = tmp;
            int endPoint = tmp;
            for (int i = tmp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if (scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if (scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    wednesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "수업";

                }
            }
        }
        if ((tmp = scheduleText.indexOf("목")) > -1) {
            tmp += 2;
            int startPoint = tmp;
            int endPoint = tmp;
            for (int i = tmp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if (scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if (scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    thursday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "수업";

                }
            }
        }
        if ((tmp = scheduleText.indexOf("금")) > -1) {
            tmp += 2;
            int startPoint = tmp;
            int endPoint = tmp;
            for (int i = tmp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if (scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if (scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    friday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "수업";

                }
            }
        }
    }

    public void addSchedule(String scheduleText,String courseTitle,String courseProfessor) {
        String professor;
        if(courseProfessor.equals("")){
            professor="";
        }else
        {
            professor="("+courseProfessor+")";
        }
        int tmp;
        //월 :[3][4][5]
        if ((tmp = scheduleText.indexOf("월")) > -1) {
            tmp += 2;
            int startPoint = tmp;
            int endPoint = tmp;
            for (int i = tmp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if (scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if (scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    monday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = courseTitle+professor;

                }
            }
        }
        if ((tmp = scheduleText.indexOf("화")) > -1) {
            tmp += 2;
            int startPoint = tmp;
            int endPoint = tmp;
            for (int i = tmp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if (scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if (scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    tuseday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = courseTitle+professor;

                }
            }
        }
        if ((tmp = scheduleText.indexOf("수")) > -1) {
            tmp += 2;
            int startPoint = tmp;
            int endPoint = tmp;
            for (int i = tmp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if (scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if (scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    wednesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = courseTitle+professor;

                }
            }
        }
        if ((tmp = scheduleText.indexOf("목")) > -1) {
            tmp += 2;
            int startPoint = tmp;
            int endPoint = tmp;
            for (int i = tmp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if (scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if (scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    thursday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = courseTitle+professor;

                }
            }
        }
        if ((tmp = scheduleText.indexOf("금")) > -1) {
            tmp += 2;
            int startPoint = tmp;
            int endPoint = tmp;
            for (int i = tmp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if (scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if (scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    friday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = courseTitle+professor;

                }
            }
        }
    }

    public boolean validate(String scheduleText) {
        if (scheduleText.equals("")) {
            return true;
        }
        int tmp;
        if ((tmp = scheduleText.indexOf("월")) > -1) {
            tmp += 2;
            int startPoint = tmp;
            int endPoint = tmp;
            for (int i = tmp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if (scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if (scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    if (!monday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals("")) {
                        return false;
                    }
                }
            }
        }
        if ((tmp = scheduleText.indexOf("화")) > -1) {
            tmp += 2;
            int startPoint = tmp;
            int endPoint = tmp;
            for (int i = tmp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if (scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if (scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    if (!tuseday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals("")) {
                        return false;
                    }
                }
            }
        }
        if ((tmp = scheduleText.indexOf("수")) > -1) {
            tmp += 2;
            int startPoint = tmp;
            int endPoint = tmp;
            for (int i = tmp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if (scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if (scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    if (!wednesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals("")) {
                        return false;
                    }
                }
            }
        }
        if ((tmp = scheduleText.indexOf("목")) > -1) {
            tmp += 2;
            int startPoint = tmp;
            int endPoint = tmp;
            for (int i = tmp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if (scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if (scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    if (!thursday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals("")) {
                        return false;
                    }
                }
            }
        }
        if ((tmp = scheduleText.indexOf("금")) > -1) {
            tmp += 2;
            int startPoint = tmp;
            int endPoint = tmp;
            for (int i = tmp; i < scheduleText.length() && scheduleText.charAt(i) != ':'; i++) {
                if (scheduleText.charAt(i) == '[') {
                    startPoint = i;
                }
                if (scheduleText.charAt(i) == ']') {
                    endPoint = i;
                    if (!friday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals("")) {
                        return false;
                    }
                }
            }
        }
        return true;

    }
    public  void  setting(TextView[] monday, TextView[] tuseday, TextView[] wednesday, TextView[] thursday, TextView[] friday, Context context){
        for(int i = 0 ; i < 14; i++){
            if(!this.monday[i].equals("")){
                monday[i].setText(this.monday[i]);
                monday[i].setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
            }
            if(!this.tuseday[i].equals("")){
                tuseday[i].setText(this.tuseday[i]);
                tuseday[i].setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
            }
            if(!this.wednesday[i].equals("")){
                wednesday[i].setText(this.wednesday[i]);
                wednesday[i].setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
            }
            if(!this.thursday[i].equals("")){
                thursday[i].setText(this.thursday[i]);
                thursday[i].setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
            }
            if(!this.friday[i].equals("")){
                friday[i].setText(this.friday[i]);
                friday[i].setBackgroundColor(context.getResources().getColor(R.color.colorPrimary));
            }

        }

    }
}

