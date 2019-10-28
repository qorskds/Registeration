package com.example.registeration;

public class Schedule {

    private String monday[] = new String[14];
    private String tuseday[] = new String[14];
    private String wendesday[] = new String[14];
    private String thursday[] = new String[14];
    private String friday[] = new String[14];

    public Schedule() {
        for (int i = 0; i < 14; i++) {
            monday[i] = "";
            tuseday[i] = "";
            wendesday[i] = "";
            thursday[i] = "";
            friday[i] = "";
        }
    }

    public void addSchedule(String scheduleText) {
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
                    wendesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))] = "수업";

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
                    if (!wendesday[Integer.parseInt(scheduleText.substring(startPoint + 1, endPoint))].equals("")) {
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
}

