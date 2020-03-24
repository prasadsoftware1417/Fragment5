package com.example.fragement2;

import android.os.Parcel;
import android.os.Parcelable;

public class AllFragment implements Parcelable {

    private String name;
    private String fullname;

    public AllFragment() {
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getS3() {
        return s3;
    }

    public void setS3(String s3) {
        this.s3 = s3;
    }

    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        this.d1 = d1;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    public String getD3() {
        return d3;
    }

    public void setD3(String d3) {
        this.d3 = d3;
    }

    public String getB1() {
        return b1;
    }

    public void setB1(String b1) {
        this.b1 = b1;
    }

    public String getB2() {
        return b2;
    }

    public void setB2(String b2) {
        this.b2 = b2;
    }

    public String getB3() {
        return b3;
    }

    public void setB3(String b3) {
        this.b3 = b3;
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public String getJobprofile() {
        return jobprofile;
    }

    public void setJobprofile(String jobprofile) {
        this.jobprofile = jobprofile;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    private String dob;
    private String mobile;
    private String email;
    private String schoolname;
    private String s1;
    private String s2;
    private String s3;
    private String d1;
    private String d2;
    private String d3;
    private String b1;
    private String b2;
    private String b3;
    private String companyname;
    private String jobprofile;
    private String salary;

    protected AllFragment(Parcel in) {
        name = in.readString();
        fullname = in.readString();
        dob = in.readString();
        mobile = in.readString();
        email = in.readString();
        schoolname = in.readString();
        s1 = in.readString();
        s2 = in.readString();
        s3 = in.readString();
        d1 = in.readString();
        d2 = in.readString();
        d3 = in.readString();
        b1 = in.readString();
        b2 = in.readString();
        b3 = in.readString();
        companyname = in.readString();
        jobprofile = in.readString();
        salary = in.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(fullname);
        dest.writeString(dob);
        dest.writeString(mobile);
        dest.writeString(email);
        dest.writeString(schoolname);
        dest.writeString(s1);
        dest.writeString(s2);
        dest.writeString(s3);
        dest.writeString(d1);
        dest.writeString(d2);
        dest.writeString(d3);
        dest.writeString(b1);
        dest.writeString(b2);
        dest.writeString(b3);
        dest.writeString(companyname);
        dest.writeString(jobprofile);
        dest.writeString(salary);
    }

    @SuppressWarnings("unused")
    public static final Creator<AllFragment> CREATOR = new Creator<AllFragment>() {
        @Override
        public AllFragment createFromParcel(Parcel in) {
            return new AllFragment(in);
        }

        @Override
        public AllFragment[] newArray(int size) {
            return new AllFragment[size];
        }
    };
}