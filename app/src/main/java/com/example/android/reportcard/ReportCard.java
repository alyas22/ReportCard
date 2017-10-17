package com.example.android.reportcard;

import android.util.Log;

/**
 * Created by Toshiba on 30/07/17.
 */

public class ReportCard {

    String mName , message;
    private int mEnglish,mMath,mChemistry,mBiology,mPhysics;
    private int sum;
    private int totalGrade;

    public ReportCard(String name,int english,int math,int chemistry,int biology,int physics){
        mName = name;
        mEnglish = english;
        mMath = math;
        mChemistry = chemistry;
        mBiology = biology;
        mPhysics = physics;
    }

    public String getname() {
        return mName;
    }

    public void setname(String studentName) {
        mName = studentName;
    }

    public int getenglish() {
        return mEnglish;
    }

    public void setenglish(int englishGrade) {
        mEnglish = englishGrade;
    }

    public int getmath() {
        return mEnglish;
    }

    public void setmath(int mathGrade) {
        mMath = mathGrade;
    }

    public int getchemistry() {
        return mChemistry;
    }

    public void setchemistry(int chemistryGrade) {
        mChemistry = chemistryGrade;
    }
    public int getbiology() {
        return mBiology;
    }

    public void setbiology(int biologyGrade) {
        mBiology = biologyGrade;
    }
    public int getphysics() {
        return mPhysics;
    }

    public void setphysics(int physicsGrade) {
        mPhysics = physicsGrade;
    }

    public String getMessage() {
        char grade= getGrade();
        if (grade == 'F'){
            message = " Fail ";
        }
        if (grade == 'D'){
            message = " try Harder ";
        }
        if (grade == 'C'){
            message = " Good ";
        }
        if (grade == 'B'){
            message = " Very Good ";
        }
        if (grade == 'A'){
            message = " Excellent ";
        }
        return message;
    }

    public void setMessage(String message) {
         message = message;
    }

    public int getAverage(int english, int math, int chemistry, int biology, int physics)
    {
        sum = english + math + chemistry +  biology + physics;
        totalGrade = sum / 5;
        return totalGrade;
    }

    public char getGrade() {
          totalGrade = getAverage(mEnglish,mMath,mChemistry,mBiology,mPhysics);

        char grade = 'A';
        if (totalGrade < 60) {
            grade = 'F';
        } else if (totalGrade < 70 && totalGrade >= 60) {
            grade = 'D';
        } else if (totalGrade < 80 && totalGrade >= 70) {
            grade = 'C';
        } else if (totalGrade < 90 && totalGrade >= 80) {
            grade = 'B';
        } else if (totalGrade >= 100 && totalGrade >= 90 ) {
            grade = 'A';
        }
        Log.i("ReportCard", "totalGrade " + totalGrade);
        return grade;
    }


    @Override
    public String toString() {
        return "Report Card\n" +
                "Your Name : " + mName +
                "\n English : " + mEnglish +
                "\n Math : " + mMath +
                "\n Chemistry : " + mChemistry +
                "\n Biology : " + mBiology +
                "\n Physics : " + mPhysics +
                "\n \n Total : " + getGrade() + '\n'+ getMessage();
    }}
