package Zadanie_1;

import java.util.Objects;

public class Towar {
    private String name;
    private int id;

    public Towar(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Towar{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Towar)) return false;
        Towar towar = (Towar) o;
        return getId() == towar.getId() &&
                Objects.equals(getName(), towar.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }

}
