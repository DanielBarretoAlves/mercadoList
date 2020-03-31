package app;

/**
 * No
 */
public class No {

    private Produto item;
    private No prox;

    public No(Produto item)
    {
        this.item = item;
        this.prox = null;
    }//-----------------------------------constructor

    public Produto getItem() {
        return item;
    }

    public void setItem(Produto item) {
        this.item = item;
    }

    public No getProx() {
        return prox;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }
    
    
}