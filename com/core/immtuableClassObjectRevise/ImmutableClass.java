package com.core.immtuableClassObjectRevise;

// IMMUTABLE - PARTIAL -( as changed by other class reference even if it's private)
class MastersStd
{
    private int mId;
    private String mName;

    // But what if we have a separate class for College Address


    private MCollege collegeDetails;

    MastersStd(int mId, String mName, MCollege collegeDetails)
    {
        this.mId = mId;
        this.mName = mName;
        this.collegeDetails = collegeDetails;
    }

    public int getmId() {
        return mId;
    }
     public String getmName() {
        return mName;
     }

     public MCollege getCollegeInfo()
     {
         return collegeDetails;
     }

    @Override
    public String toString() {
        return "MastersStd{" +
                "mId=" + mId +
                ", mName='" + mName + '\'' +
                ", collegeDetails=" + collegeDetails +
                '}';
    }
}


// mutable
class MCollege
{
    int collegeId;
    String collegeName;
    MCollege(int collegeId, String collegeName)
    {
        this.collegeId = collegeId;
        this.collegeName = collegeName;

    }

    public int getCollegeId() {
        return collegeId;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeId(int collegeId) {
        this.collegeId = collegeId;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }
}

public class ImmutableClass {
    public static void main(String[] args) {

        /*
           First foremost thing is that, immutable object means
             once a class variable and method has initialized it can be modifiable again


             // Ways to do so:
             1) making class as final - restricts the inheritance to override the parent class method
             2) making the fields (variables) as private and final
             3) shouldn't provide setter to update the fields

                // but this is not enough as above example
         */

//        MastersStd  std  = new MastersStd(111, "rituraj");
        // only for the first time during constructor call one time value we set
        // but if we try to override
//        std.mId = 11111;   // saying private access



        // even if the college is private but still it's a outer class object
        MCollege college = new MCollege(101, "IIT G");
        MastersStd std2= new MastersStd(111121, "raja mohan",college);
//        System.out.println( std2.getCollegeInfo().getCollegeName());


        // even if the field for College Detail inside the MasterStd is private
        System.out.println("Before change : ");
        System.out.println( std2.getCollegeInfo().getCollegeName());
        std2.getCollegeInfo().setCollegeName("CUTM, bbsr");
        System.out.println("Now the actual std was affected by it");
        System.out.println("after change : ");
        System.out.println( std2.getCollegeInfo().getCollegeName());
   // Shallow copy  - next tomorrow onward about immutability






    }
}
