abstract class Marks {
    //We have to calculate the average of marks obtained in three subjects
    //by student A and by student B. Create class 'Marks' with an abstract
    //method 'getPercentage' that will be returning the average percentage
    //of marks. Provide implementation of abstract method in classes 'A'
    //and 'B'. The constructor of student A takes the marks in three
    //subjects as its parameters and the marks in four subjects as its
    //parameters for student B. Test your code

    abstract double getPercentage();
}
    class A extends Marks {
        private double subject1marks;
        private double subject2marks;
        private double subject3marks;

        public A(double subject1marks, double subject2marks, double subject3marks) {
            this.subject1marks = subject1marks;
            this.subject2marks = subject2marks;
            this.subject3marks = subject3marks;
        }

        @Override
        double getPercentage() {
            return(subject1marks+subject2marks+subject3marks)/3.0;
        }
    }
class B extends Marks {
    private double subject1marks;
    private double subject2marks;
    private double subject3marks;
    private double subject4marks;

    public B(double subject1marks, double subject2marks, double subject3marks,double subject4marks) {
        this.subject1marks = subject1marks;
        this.subject2marks = subject2marks;
        this.subject3marks = subject3marks;
        this.subject4marks = subject4marks;
    }

    @Override
    double getPercentage() {
        return(subject1marks+subject2marks+subject3marks+subject4marks)/4.0;
    }

    public static void main(String[] args) {
        A studentA=new A(78,58,98);
        System.out.println("Student A average is "+studentA.getPercentage() +"%");
        B studentB=new B(87,45,54,97);
        System.out.println("Student B average is "+studentB.getPercentage() +"%");
    }
}
