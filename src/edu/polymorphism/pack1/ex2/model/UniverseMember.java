package edu.polymorphism.pack1.ex2.model;

/**
 * 부모 클래스
 * name, id, toString 작성
 *
 */
public class UniverseMember {
    // 필드
    protected String name;
    protected String id;

    /* 메서드 */
    // 기본생성자
    public UniverseMember() {
    }
    // 매개변수 생성자
    public UniverseMember(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // getter, setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UniverseMember{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
