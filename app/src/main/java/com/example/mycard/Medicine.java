package com.example.mycard;

public class Medicine {

    private String MedicineName;
    private String AlarmTimes;

    public Medicine(String medicineName, String alarmTimes) {
        MedicineName = medicineName;
        AlarmTimes = alarmTimes;
    }

    public String getMedicineName() {
        return MedicineName;
    }

    public void setMedicineName(String medicineName) {
        MedicineName = medicineName;
    }

    public String getAlarmTimes() {
        return AlarmTimes;
    }

    public void setAlarmTimes(String alarmTimes) {
        AlarmTimes = alarmTimes;
    }
}
