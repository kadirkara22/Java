public class Course {
    String name;
    String code;
    String prefix;
    Teacher teacher;
    int note;
    int perNote;

    Course(String name,String code, String prefix){
        this.name=name;
        this.code=code;
        this.prefix=prefix;
        this.note=0;
        this.perNote=0;
}
        void addTeacher(Teacher teacher){
        if (teacher.branch.equals(this.prefix)){
        this.teacher=teacher;
        }else{
                System.out.println("Öğretmen ve ders bölümleri eşleşmiyor.");
        }
}
       void printTeacherInfo(){
          this.teacher.printf();
        }
}
