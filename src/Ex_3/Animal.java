//Використовуючи Intelij IDEA, створити проект, пакет. Створити клас Animal з ім'ям String, int віком, хвостом Boolean.
//        У класі перевизначити метод toString, щоб висновок був наступним
//        «Ім'я: Васька, вік: 45, хвіст: ні». У класі Animal перевизначити методи equals & hashCode.

package Ex_3;

import java.util.Objects;

public class Animal {
    private String name;
    private int age;
    private boolean tail;

    @Override
    public String toString() {
        return "Ім'я: " + name +
                ", вік: " + age +
                ", хвіст: " + tail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return age == animal.age && tail == animal.tail && name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, tail);
    }
}
