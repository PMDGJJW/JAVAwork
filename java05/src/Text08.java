public class Text08 {
    public static void main(String[] args) {
        Book book=new Book();
        Book book1=new Book();
        Book book2=new Book();
        book.setName( "No0003" );
        book1.setName( "No0004" );
        book2.setName( "No0005" );
        book.setBookname("javaWed实战");
        book1.setBookname("jquery实战");
        book2.setBookname("vue实战");
        book.setISBN("  ISBN02131541231");
        book1.setISBN("  ISBN8976441231");
        book2.setISBN("  ISBN1565441231");
        book.setPrice(58.5);
        book1.setPrice(39.5);
        book2.setPrice(28.5);
        book.setDate("2017-1-05");
        book1.setDate("2018-1-05");
        book2.setDate("2018-3-05");
        Book B=book;
      if (book.getPrice()<book1.getPrice()){
          B=book1;
      }if (book2.getPrice()>book1.getPrice()){
          B=book2;
        }
        System.out.println("最贵的书是："+B.getName()+","+B.getBookname()+","+B.getISBN() +" "+ B.getPrice()+","+B.getDate());
    }
}
