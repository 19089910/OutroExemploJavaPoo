package entities;

public class product {
    public String name;
    public Double price;
    public Integer quantity;

    public double totalValueInStock() {
        return  quantity * price;//preco unitario * quantidade = quanto vai ser o preco total no
    }

    public void addProducts(int quantity) {//nao vai retornar nada, so alterar o valor da quantidade
        this.quantity += quantity;//anbiguidade pois tem 2 variavel quantity, this se refere a que ja existe
        //outro quantity sera de fora dessa classe e assim soma com a ja existente
    }

    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString(){//<type> <objeto>; nao sei por que mais quando instaciamos no program o product recebeu novas funcoes <objeto>
        // <funcao objeto toString>:  faz  com que tranfome algo em string, seja ela ponteiro, valor ou etc..
        return name + ", $ " + String.format("%.2f", price) + ", " + quantity + " units, Total: $ " + String.format("%.2f", totalValueInStock());
    }
}