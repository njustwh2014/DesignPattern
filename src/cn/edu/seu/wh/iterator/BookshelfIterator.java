package cn.edu.seu.wh.iterator;

public class BookshelfIterator implements Iterator {
    private BookShelf bookShelf;
    private Integer index=0;

    public BookshelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    @Override
    public boolean hasNext() {
        if(index>=bookShelf.getLength()){
            return false;
        }
        return true;
    }

    @Override
    public Object next() {
        Book ret=null;
        ret=bookShelf.getBookAt(index);
        index++;
        return ret;
    }
}
