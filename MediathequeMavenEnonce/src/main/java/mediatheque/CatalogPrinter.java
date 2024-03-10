public class CatalogPrinter implements ItemVisitor {
    public void visit(Book m){
        System.out.println("Book visit : "+ m)
    }

    public void visit(CD m){
        System.out.println("CD visit : "+ m)
    }
}