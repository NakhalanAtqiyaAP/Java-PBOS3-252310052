public class Students {
    private int NPM;
    private String Fullname;
    private String ClassName;
    private int Semester;
    private float GPA;

    public void setNpm(int npm){
        this.NPM = npm;
    }

    public int getNpm(){
        return this.NPM;
    }


    public void setFullname(String fullName){
        this.Fullname = fullName;
    }

     public String getFullname(){
        return this.Fullname;
    }


    public void setClassName(String className){
        this.ClassName = className;
    }
     public String getClassName(){
        return this.ClassName;
    }


    public void setSemester(int semester){
        this.Semester = semester;
    }

     public int getSemester(){
        return this.Semester;
    }


    public void setGpa(float gpa){
        this.GPA = gpa;
    }

      public float getGpa(){
        return this.GPA;
    }
}