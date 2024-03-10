public class CDPrinter implements ItemVisitor {
    public void visit(Book m){
        
    }

    public void visit(CD m){
        System.out.println("CD visit : "+ m)
    }
}