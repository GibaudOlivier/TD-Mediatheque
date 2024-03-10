public class BookPrinter implements ItemVisitor {
    public void visit(Book m){
        System.out.println("Book visit : "+ m)
    }

    public void visit(CD m){}
}