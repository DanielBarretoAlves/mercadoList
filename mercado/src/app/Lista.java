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

    public void setPrim(final No prim) {
        this.prim = prim;
    }

    public No getUlt() {
        return ult;
    }

    public void setUlt(final No ult) {
        this.ult = ult;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(final int qtd) {
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

    public void insertLast(final Produto item) {
         No novoNo = No(item);
        if (this.isEmpity()) {
            this.prim = novoNo;
        } else {
            this.ult.setProx(novoNo);
        }
        this.ult = novoNo;
        this.qtd++;
    }//--------------------------------------------------------INSERT AT LAST POSITION

    public boolean removeItem(final int id)
    {
        No current = this.prim;
        No preview = null;
        if (isEmpity()) {
            return null;
        } else {
            while (current != null && (current.getItem().getId() != id)) {
                preview = current;
                current = current.getProx();
            }
            if (current == this.prim) {
                if (prim == ult) {
                    this.ult = null;
                }
                this.prim = this.prim.getProx();
            } else {
                if(current == this.ult)
                {
                    this.ult = preview;
                }
                preview.setProx(current.getProx());
                
                
            }
            this.qtd--;
            return true;
        }
    }//-----------------------------------------------------------------------REMOVE NODE

    public String search(int id)
    {
         String msg="";
        final No current = this.prim;
        while (current != null && (current.getItem().getId() != id)) {
            current = current.getProx();
            
        }
    }

    // public String pesquisarNo(String nome)
    // {
    //     String msg ="";
    //     No atual = this.prim;
    //     while ((atual != null) && (!atual.getP().getNome().equals(nome))) {
    //         atual = atual.getProx();
    //     }
    //     return msg = "Nome: " + atual.getP().getNome() + "\n"+
    //                 "Sexo: " + atual.getP().getSexo() + "\n"+
    //                 "Idade: " + atual.getP().getIdade();
    // }//-----------------------------------------------------------Pesquisar NO


   





    




}