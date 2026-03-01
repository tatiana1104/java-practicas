
package repaso_2;

public class Libro {
    int ISBN, Paginas;
    String Titulo, Autor;

    public Libro(int ISBN, int Paginas, String Titulo, String Autor) {
        this.ISBN = ISBN;
        this.Paginas = Paginas;
        this.Titulo = Titulo;
        this.Autor = Autor;
    }

    public int getISBN() {
        return ISBN;
    }

    public int getPaginas() {
        return Paginas;
    }

    public String getTitulo() {
        return Titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    @Override
    public String toString() {
        return "El libro" + Titulo +  " con ISBN " + ISBN + " creado por " + Autor + " tiene " + Paginas + " páginas.";
    }
    
   
}
