public class Main {
    public static void main(String[] args) {
Teacher t1=new Teacher("kadir","05555555555","MAT");
Teacher t2=new Teacher("Turker","05555555554","FZK");
Teacher t3=new Teacher("Cansu","05555555553","KIM");

Course matematik= new Course("Matematik","101","MAT");
Course fizik= new Course("Fizik","102","FZK");
Course kimya= new Course("Kimya","103","KIM");
matematik.addTeacher(t1);
fizik.addTeacher(t2);
kimya.addTeacher(t3);

Student s1=new Student("Timur","91","1",matematik,kimya,fizik);
s1.addBulkExamNote(100,200,75,25,100,75);
s1.isPass();
    }
}
