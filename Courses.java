public class Courses {
    public static void main(String[] args) {

        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.kimya.addViva(100, 0.5);
        s1.mat.addViva(100, 0.4);
        s1.fizik.addViva(100, 0.6);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.isPass();

    }
}

class Student {
    String name,stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course kimya;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat,Course fizik,Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int fizik, int kimya) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.fizik.calculateAvg();
        this.mat.calculateAvg();
        this.kimya.calculateAvg();
        this.avarage = (this.fizik.avg + this.kimya.avg + this.mat.avg) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote(){
        this.mat.calculateAvg();
        this.kimya.calculateAvg();
        this.fizik.calculateAvg();
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Ortalaması : " + this.mat.avg);
        System.out.println("Fizik Ortalaması : " + this.fizik.avg);
        System.out.println("Kimya Ortalaması : " + this.kimya.avg);
    }

}


class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int vivaNote;
    double vivaPercentage;
    double avg;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.vivaNote = 0;
        this.vivaPercentage = 0.0;
    }

    public void addViva(int vivaNote, double vivaPercentage) {
        this.vivaNote = vivaNote;
        this.vivaPercentage = vivaPercentage;
    }

    public void calculateAvg() {
        System.out.println(this.name + "Sözlü notu: " + (this.vivaNote*this.vivaPercentage));
        System.out.println(this.name + "Yazılı notu: " + (this.note*(1-this.vivaPercentage)));
        this.avg = (this.vivaNote*this.vivaPercentage) + (this.note*(1-this.vivaPercentage));
    }

    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Akademisyeni bu dersi veremez.");
        }
    }

    public void printTeacher() {
        if (courseTeacher != null) {
            System.out.println(this.name + " dersinin Akademisyeni : " + courseTeacher.name);
        } else {
            System.out.println(this.name + " dersine Akademisyen atanmamıştır.");
        }
    }
}


class Teacher {
    String name;
    String mpno;
    String branch;

    public Teacher(String name, String mpno, String branch) {
        this.name = name;
        this.mpno = mpno;
        this.branch = branch;
    }

}

