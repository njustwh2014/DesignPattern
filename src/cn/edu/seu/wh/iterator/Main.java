package cn.edu.seu.wh.iterator;

public class Main {
    //iterator遍历
    
    public static void main(String[] args){  
        BookShelf bookshelf=new BookShelf(10);
        bookshelf.appendBook(new Book("围城"));
        bookshelf.appendBook(new Book("月亮与六便士"));
        bookshelf.appendBook(new Book("三国演义"));
        bookshelf.appendBook(new Book("末日巨塔"));
        Iterator iterator=bookshelf.iterator();
        while(iterator.hasNext()){
            Book book=(Book) iterator.next();//注意向上转型
            System.out.println(book.getName());
        }
    }
}
