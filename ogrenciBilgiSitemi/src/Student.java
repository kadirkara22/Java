public class Student {
    Course c1;
    Course c2;
    Course c3;
    String name;
    String stuNo;
    String classes;
    double avarage;
    boolean isPass;

    Student(String name,String stuNo,String classes,Course c1, Course c2, Course c3){
        this.c1=c1;
        this.c2=c2;
        this.c3=c3;
        this.name=name;
        this.stuNo=stuNo;
        this.classes=classes;
        this.avarage=0.0;
        this.isPass=false;
    }

    void addBulkExamNote(int note1,int note2,int note3, int perNote1,int perNote2,int perNote3){
        if(note1>=0 && note1<=100){
            this.c1.note=note1;

        }
        if(perNote1>=0 && perNote1<=100) {
            this.c1.perNote = perNote1;
        }
        if(note2>=0 && note2<=100){
            this.c2.note=note2;

        }
        if(perNote2>=0 && perNote2<=100) {
            this.c2.perNote = perNote2;
        }
        if(note3>=0 && note3<=100){
            this.c3.note=note3;

        }
        if(perNote3>=0 && perNote3<=100) {
            this.c3.perNote = perNote3;
        }


    }

    void isPass(){
        this.avarage=((this.c1.note*0.80 + this.c1.perNote*0.20)+
                (this.c2.note*0.80+this.c2.perNote*0.20)+(this.c3.note*0.80+this.c3.perNote*0.20))/3.0;
        if(this.avarage>55){
            System.out.println("Başarılı");
        }else{
            System.out.println("Kaldı");
        }
        printNote();
    }

    void printNote(){
        System.out.println(this.c1.name+" Notu\t: "+this.c1.note);
        System.out.println(this.c1.name+" Sozlu Notu\t: "+this.c1.perNote);
        System.out.println(this.c2.name+" Notu\t: "+this.c2.note);
        System.out.println(this.c2.name+" Sozlu Notu\t: "+this.c2.perNote);
        System.out.println(this.c3.name+" Notu\t: "+this.c3.note);
        System.out.println(this.c3.name+" Sozlu Notu\t: "+this.c3.perNote);
        System.out.println("Ortalamanız: "+this.avarage);
    }
}

