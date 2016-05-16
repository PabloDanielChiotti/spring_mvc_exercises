package bean.training.autowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;


public class BookBeanAutowiredAnnotationConstructor {

  private String title;
  private String author;
  private double price;
  private String isbn;
  private String edition;
  
  private PublisherBean publisher;

  @Autowired
  public BookBeanAutowiredAnnotationConstructor(PublisherBean publisher) {
    super();
    this.publisher = publisher;
  }
  
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public double getPrice() {
    return price;
  }

  public void setPrice(double price) {
    this.price = price;
  }

  public String getIsbn() {
    return isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getEdition() {
    return edition;
  }

  public void setEdition(String edition) {
    this.edition = edition;
  }
  
  public PublisherBean getPublisher() {
    return publisher;
  }

  public void setPublisher(PublisherBean publisher) {
    this.publisher = publisher;
  }

  public String getPublisherInfo() {
    return "BookBean [title=" + title + ", author=" + author + ", price=" + price + ", isbn="
        + isbn + ", edition=" + edition + ", publisher=" + publisher.getPublisherInfo() + "]";
  }
  
}
