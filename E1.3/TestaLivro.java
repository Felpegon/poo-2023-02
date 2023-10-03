public class TestaLivro { 
    public static void main(String[] args) { 
        Livro livro1 = new Livro("A Vila dos Tecidos", "Anne Jacobs", "2023", "Editora Arqueiro"); 
        Livro livro2 = new Livro("Arrume a sua cama: Pequenas coisas que podem mudar a sua vida...E talvez o mundo", "Willian H. Mcraven", "2023", "None");
        Livro livro3 = new Livro("A coragem de não agradar: Como a filosofia pode ajudar você a se libertar da opinião dos outros, superar suas limitações e se tornar a pessoa que deseja", "Ichiro Kishimi", "2018", "Editora Sextante");
        
        System.out.println("Livro 1:\n" + livro1);
        System.out.println("\nLivro 2:\n" + livro2);
        System.out.println("\nLivro 3:\n" + livro3);
    }
}