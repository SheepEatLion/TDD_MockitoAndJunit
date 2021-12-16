package domain;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 20211216L;     // 직렬화를 위한 SUID 설정 코드

    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
