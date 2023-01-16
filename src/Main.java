import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        Author levTolsoi = new Author("Лев ", "Толстой");
        System.out.println("Автор1 = " + levTolsoi.getFirstName() + levTolsoi.getLastName());

        Author kizaru = new Author("Олег ", "Нечипоренко");
        System.out.println("Автор2 = " + kizaru.getFirstName() + kizaru.getLastName());

        //Книга №1
        Book warAndPeace = new Book("Война и мир", levTolsoi, 1876);
        System.out.println("Название = " + warAndPeace.getName());
        System.out.println("Автор книги = " + levTolsoi.getFirstName() + levTolsoi.getLastName());
        System.out.println("Релиз = " + warAndPeace.getYearOfPublication());

        //Книга №2
        Book dejavu = new Book("Дежавю", kizaru, 2022);
        System.out.println("Название = " + dejavu.getName());
        System.out.println("Автор = " + kizaru.getFirstName() + kizaru.getLastName());
        System.out.println("Релиз = " + dejavu.getYearOfPublication());
        dejavu.setYearOfPublication(2023);
        System.out.println("Проверка " + dejavu.getYearOfPublication());
        System.out.println("///////////////");
        //Часть 2!!!!!
        System.out.println("Часть 2");
        System.out.println(warAndPeace.toString());
        System.out.println(dejavu.toString());
        System.out.println(levTolsoi.toString());

        System.out.println("hashCode автора книги 'Дежавю' = " + dejavu.hashCode());
        System.out.println("hashCode автора книги 'Война и мир' = " + warAndPeace.hashCode());

        System.out.println("hashCode автора Лев Толстой - " + levTolsoi.hashCode());
        System.out.println("hashCode автора Лев Дежавю - " + kizaru.hashCode());

        System.out.println("Книги одинаковые? - " + dejavu.equals(warAndPeace));
        System.out.println("Авторы книг разные? -" + kizaru.equals(levTolsoi));
    }
}