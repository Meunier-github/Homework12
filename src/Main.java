public class Main {
    public static void main(String[] args) {

        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoi = new Author("Лев", "Толстой");

        Book kapitanskayDochka = new Book("Капитанская дочка",pushkin,2013);
        Book voinaImir = new Book("Война и мир",tolstoi,2020);


        System.out.println("kapitanskayDochka.toString() = " + kapitanskayDochka.toString());
        System.out.println("voinaImir.toString() = " + voinaImir.toString());

        voinaImir.setYearOfPublication(2021);

        System.out.println("voinaImir.toString() = " + voinaImir.toString());



    }
}

