package lambda;

public class Person {

    private String name; //set없다고 name에 노란 줄로 표현된 이유? 변수 할당했는데 변수 사용X(return이 아닌 assign이 없음)
    private int age; //name,age는 생성자를 통해 값을 설정하면 더이상 변경시킬 수 없다를 명시적으로 표시,,_1
                        //final이 붙으면 값 변경 불가(상수화), final 지우면 set을 추가해서 이 class안에서 변수를 사용할 수 있도록

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }

}
