package Task3;

public class Author {

    private String nameOfAuthor;

    public void setNameOfAuthor(String nameOfAuthor) {
        this.nameOfAuthor = nameOfAuthor;
    }

    public String getNameOfAuthor() {
        return nameOfAuthor;
    }

    public void show(){
        System.out.println(getNameOfAuthor());
    }
}
