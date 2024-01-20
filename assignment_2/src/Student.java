public class Student extends Person{
    private double gpa;
    String toStr(){
        return"Student: " + getId() + ". " + getName() + " " +getSurname();
    }
    double getGpa(){
        return gpa;
    }
    void setGpa(double gpaInput){
        gpa = gpaInput;
    }
    Student(){

    }
    Student (String name1, String surname1, double gpa1){
        setName(name1);
        setSurname(surname1);
        setGpa(gpa1);
    }
    public double getPaymentAmount(){
        if(gpa > 2.67){
            return 36660;
        }
        return 0;
    }
}
