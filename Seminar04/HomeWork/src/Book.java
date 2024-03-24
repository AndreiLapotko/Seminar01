/*Создайте обобщенный класс Book<T>, который представляет книгу в библиотеке. Каждая книга должна содержать параметр типа T для ее названия.
Создайте обобщенный класс LibraryCard<K, V>, который представляет библиотечную карточку для определенной книги. Каждая карточка должна содержать параметры типов K для номера карточки и V для информации о книге.
Создайте класс Library, который будет представлять библиотеку. У этого класса должны быть методы для добавления книг и выдачи библиотечных карточек.
Добавьте метод для вывода информации о всех выданных книгах с их библиотечными карточками.*/

public class Book<T> {
    private T name;
    private String author;

    public Book(T name, String author) {
        this.name = name;
        this.author = author;
    }

    public T getName() {
        return name;
    }

//    public void setName(T name) {
//        this.name = name;
//    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "книга: " + "'" + name + "'" +
        ". Автор: " + author;
    }
}
