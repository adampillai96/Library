/**
 * Created by Dr.Thiru on 4/10/2017.
 */
public class Marvel {

    String Title;
    String Author;
    String Publisher;
    String Publication_Date;
    String Pages;
    String Description;

    public Marvel(){}


    //getter
    public String getTitle(){
        return Title;
    }


    //setter
    public void setTitle(String Title){
            this.Title = Title;
    }

    public String getAuthor(){
        return Author;
    }

    public void setAuthor(String Author){
        this.Author = Author;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        this.Publisher = Publisher;
    }

    public String getPublication_Date() {
        return Publication_Date;
    }

    public void setPublication_Date(String publication_Date) {
        this.Publication_Date = Publication_Date;
    }

    public String getPages() {
        return Pages;
    }

    public void setPages(String pages) {
        this.Pages = Pages;
    }


    public String getDescription() {
        return Description;
    }


    public void setDescription(String description) {
        this.Description = Description;
    }
}
