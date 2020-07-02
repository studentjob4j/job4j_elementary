package ru.job4j.pojo;

public class College {

    public static void main(String[] args) {
        Student student = new Student();
        student.setDataPostuplenia(2020);
        student.setFamily("Ivanov");
        student.setNumberGroop(2);
        student.setName("Ivan");
        System.out.println(student.getName() + " " + student.getFamily() + " " + "поступил в " + student.getDataPostuplenia()
        + " в группу номер " + student.getNumberGroop());

    }
}
