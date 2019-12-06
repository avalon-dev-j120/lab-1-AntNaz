package ru.avalon.java.j20.labs.models;

/**
 * Представление о человеке.
 */
public class Person {
    /**
     * Имя.
     */
    private final String name;
    /**
     * Фамилия.
     */
    private final String surname;

    /**
     * Создаёт экземпляр класса на основании имени и даты
     * рождения.
     *
     * @param name имя человека
     * @param surname дата рождения человека
     */
    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    /**
     * возвращает имя человека.
     *
     * @return имя человека
     */
    public String getName() {
        return name;
    }

    /**
     * Возвращает фамилию человека.
     *
     * @return фамилия человека
     */
    public String getSurname() {
        return surname;
    }
    @Override
    public boolean equals(Object obj){
        if(obj == null || this.getClass() != obj.getClass()) return false;
        
        Person other = (Person) obj;        
        return ((name == other.name)&&(surname == other.surname));
    }
    @Override
    
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME*result + name.hashCode();
        result = PRIME*result + surname.hashCode();
        return result;
    }
    
}
