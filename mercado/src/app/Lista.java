package app;

/**
 * Lista
 */
public class Lista {

    private No prim;
    private No ult;
    private int qtd;

    public Lista()
    {
        this.prim = null;
        this.ult = null;
        this.qtd = 0;
    }

    public No getPrim() {
        return prim;
    }

    public void setPrim(No prim) {
        this.prim = prim;
    }

    public No getUlt() {
        return ult;
    }

    public void setUlt(No ult) {
        this.ult = ult;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }//----------------------------------------------GETS AND SETTERS

    public void insertFirst(Produto item)
    {
        No novoNO = new No(item);
        if (this.isEmpity()) {
            this.ult = novoNO;
        }
        novoNO.setProx(this.prim);
        this.prim = novoNO;
        this.qtd++;

    }//--------------------------------------------------------INSERT AT START NODE

    public boolean isEmpity(){return(this.prim == null);}//----IS EMPTY

    public void insertLast(Produto item) {
        No novoNo = No(item);
        if (this.isEmpity()) {
            this.prim = novoNo;
        } else {
            this.ult.setProx(novoNo);
        }
        this.ult = novoNo;
        this.qtd++;
    }//--------------------------------------------------------INSERT AT LAST POSITION

    


    




}