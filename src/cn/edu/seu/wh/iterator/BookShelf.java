package cn.edu.seu.wh.iterator;

public class BookShelf implements Aggregate{
    private Book[] books;
    private Integer last=0;

    public BookShelf(Integer maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(Integer index){
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last]=book;
        last++;
    }

    public Integer getLength(){
        return last;
    }

    @Override
    public Iterator iterator() {
        return new BookshelfIterator(this);
    }

}
