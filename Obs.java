
public class Obs {

    public static void main(String[] args) {
        Course mat = new Course("Matematik", "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course biyo = new Course("Biyoloji", "BIO101", "BIO");

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MAT");
        Teacher t2 = new Teacher("Fatma Ayşe", "90550000001", "FZK");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "BIO");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        biyo.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", 4, "140144015", mat, fizik, biyo);
        s1.addBulkExamNote(50, 20, 40);
        s1.addBulkQuizNote(100, 50, 70);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", 4, "2211133", mat, fizik, biyo);
        s2.addBulkExamNote(100, 50, 40);
        s2.addBulkQuizNote(70, 80, 80);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", 4, "221121312", mat, fizik, biyo);
        s3.addBulkExamNote(100, 20, 40);
        s3.addBulkQuizNote(25, 80, 70);
        s3.isPass();
    }
}

class Course {

    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int quiz;

    public Course(String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.quiz = 0;
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

class Student {

    String name, stuNo;
    int classes;
    Course mat;
    Course fizik;
    Course biyo;
    double avarage;
    boolean isPass;

    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course biyo) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.fizik = fizik;
        this.biyo = biyo;
        this.isPass = false;
    }

    public double avarageMat(Course mat) { // %20 quiz  %80 exam

        return mat.note * (0.8) + mat.quiz * (0.2);
    }

    public double avaragFiz(Course fizik) { // %30 quiz  %70 exam

        return fizik.note * (0.7) + fizik.quiz * (0.3);
    }

    public double avarageBio(Course biyo) { // %20 quiz  %80 exam

        return biyo.note * (0.8) + biyo.quiz * (0.2);
    }

    public void addBulkExamNote(int mat, int fizik, int biyo) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }

        if (biyo >= 0 && biyo <= 100) {
            this.biyo.note = biyo;
        }

    }

    public void addBulkQuizNote(int mat, int fizik, int biyo) {

        if (mat >= 0 && mat <= 100) {
            this.mat.quiz = mat;
        }

        if (fizik >= 0 && fizik <= 100) {
            this.fizik.quiz = fizik;
        }

        if (biyo >= 0 && biyo <= 100) {
            this.biyo.quiz = biyo;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.biyo.note == 0 || this.mat.quiz == 0 || this.fizik.quiz == 0 || this.biyo.quiz == 0) {
            System.out.println("Notlar ve sözlüler tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (avaragFiz(fizik) + avarageMat(mat) + avarageBio(biyo)) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + avarageMat(mat));
        System.out.println("Fizik Notu : " + avaragFiz(fizik));
        System.out.println("Biyoloji Notu : " + avarageBio(biyo));
    }

}
