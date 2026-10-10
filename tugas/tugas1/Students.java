public class Students {
    int NPM;
    String Fullname;
    String ClassName;
    int Semester;
    float GPA;

    public int getNpm(int npm){
        this.NPM = npm;
        return this.NPM;
    }

    public String getFullname(String fullName){
        this.Fullname = fullName;
        return this.Fullname;
    }


    public String getClassName(String className){
        this.ClassName = className;
        return this.ClassName;
    }


    public int getSemester(int semester){
        this.Semester = semester;
        return this.Semester;
    }


    public float getGpa(float gpa){
        this.GPA = gpa;
        return this.GPA;
    }
}