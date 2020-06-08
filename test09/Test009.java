package test09;

import java.util.EnumMap;

public class Test009 {
    public static void main(String[] args) {
        Person a=new Person("zhangsan",22);
        Employee a1=new Employee();
        a1.setName("lisi");
        System.out.println(a1.getName());
        Person a2=new Employee();
        //        Student a4=(Student)a2;ClassCastException，注意，如果数组不兼容无法抛出异常

    }
}
