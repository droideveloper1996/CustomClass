package customclass.project.com.customclass;

/**
 * Created by Abhishek on 14/04/2017.
 */

public class ReportCard {


    public static final double TOTAL = 6.0d;

    private String studentName;
    private int rollNumber;

    private int englishMarks;
    private int mathMarks;
    private int physicsMarks;
    private int chemistryMarks;
    private int socialMarks;
    private int computerMarks;
    private int sum;
    private double percentage;

    public ReportCard(String studentName, int rollNumber, int socialMarks, int chemistryMarks, int physicsMarks, int mathMarks, int englishMarks, int computerMarks) {
        this.socialMarks = socialMarks;
        this.chemistryMarks = chemistryMarks;
        this.physicsMarks = physicsMarks;
        this.mathMarks = mathMarks;
        this.englishMarks = englishMarks;
        this.computerMarks = computerMarks;
        this.studentName = studentName;
        this.rollNumber = rollNumber;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public int getEnglishMarks() {
        return englishMarks;
    }

    public void setEnglishMarks(int englishMarks) {
        this.englishMarks = englishMarks;
    }

    public int getMathMarks() {
        return mathMarks;
    }

    public void setMathMarks(int mathMarks) {
        this.mathMarks = mathMarks;
    }

    public int getPhysicsMarks() {
        return physicsMarks;
    }

    public void setPhysicsMarks(int physicsMarks) {
        this.physicsMarks = physicsMarks;
    }

    public int getChemistryMarks() {
        return chemistryMarks;
    }

    public void setChemistryMarks(int chemistryMarks) {
        this.chemistryMarks = chemistryMarks;
    }

    public int getSocialMarks() {
        return socialMarks;
    }

    public void setSocialMarks(int socialMarks) {
        this.socialMarks = socialMarks;
    }

    public int getComputerMarks() {
        return computerMarks;
    }

    public void setComputerMarks(int computerMarks) {
        this.computerMarks = computerMarks;
    }


    private String getGrade(int eng,
                            int math,
                            int phy,
                            int chem,
                            int social,
                            int comp) {
        String grade;
        sum = eng + math + phy + chem + social + comp;
        percentage = sum / TOTAL;

        if (percentage >= 90.0) {
            grade = "A";
        } else if (percentage < 90.0 && percentage >= 80.0) {
            grade = "B";
        } else if (percentage < 80.0 && percentage >= 70.0) {
            grade = "C";
        } else if (percentage < 70.0 && percentage >= 60.0) {
            grade = "D";
        } else if (percentage < 60.0) {
            grade = "Fail";
        } else {
            grade = "error";
        }
        return grade;
    }

     public String displayResult() {
         return
                 "Student Name: " + getStudentName() + '\n' +
                         "Roll Number: " + getRollNumber() + '\n' +
                         "English Marks: " + getEnglishMarks() + '\n' +
                         "Math Marks: " + getMathMarks() + '\n' +
                         "Physics Marks: " + getPhysicsMarks() + '\n' +
                         "Chemistry Marks: " + getChemistryMarks() + '\n' +
                         "Social Marks: " + getSocialMarks() + '\n' +
                         "Computer Marks: " + getComputerMarks() + '\n' +
                         "Grade: " + getGrade(englishMarks, mathMarks, physicsMarks, chemistryMarks, socialMarks, computerMarks);
     }

}

