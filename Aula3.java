import java.util.HashMap;

public class Aula3 {
  public static void main(String[] args) {
    HashMap<Integer, String> produtos = new HashMap<>();
      produtos.put(67, "Notebook"); 
      produtos.put(102, "mouse"); 
      produtos.put(103, "Teclado");
      produtos.put(107, "antimatéria");
      produtos.put(108, "demiurgo");
            System.out.println("Produto 67: " + produtos.get(67));
            System.out.println("Produto 102: " + produtos.get(102));
      if (produtos.containsKey(117)) { 
          System.out.println("Produto: " + produtos.get(117));
      }
      else {
         System.out.println("Produto não encontrado!");
      }
      produtos.remove(102);
      System.out.println("Depois de remover: " + produtos);   
  }
}