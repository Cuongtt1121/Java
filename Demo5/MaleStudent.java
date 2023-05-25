package Demo5;

public class MaleStudent extends Student implements IStudent, IMale{
    public MaleStudent(int id, String name, int age){
        super(id, name, age);
    }

    @Override
    public void playFootball() {

    }

}

