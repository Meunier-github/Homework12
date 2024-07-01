public class Main {
    public static void main(String[] args) {

        Author pushkin = new Author("Александр", "Пушкин");
        Author tolstoi = new Author("Лев", "Толстой");

        Book kapitanskayDochka = new Book("Капитанская дочка",pushkin,2013);
        Book voinaImir = new Book("Война и мир",tolstoi,2020);


        System.out.println("kapitanskayDochka.getTitleBook() = " + kapitanskayDochka.getTitleBook());
        System.out.println("kapitanskayDochka.getAuthor() = " +
                    kapitanskayDochka.getAuthor().getNameAuthor() + " "+
                    kapitanskayDochka.getAuthor().getSurnameAuthor());

        System.out.println("kapitanskayDochka.getYearOfPublication() = " + kapitanskayDochka.getYearOfPublication());

        System.out.println("voinaImir.getTitleBook() = " + voinaImir.getTitleBook());
        System.out.println("voinaImir.getAuthor() = " +
                        voinaImir.getAuthor().getNameAuthor()+" "+
                        voinaImir.getAuthor().getSurnameAuthor()
                );
        System.out.println("voinaImir.getYearOfPublication() = " + voinaImir.getYearOfPublication());

        voinaImir.setYearOfPublication(2021);

        System.out.println("voinaImir.getYearOfPublication() = " + voinaImir.getYearOfPublication());


    }
}