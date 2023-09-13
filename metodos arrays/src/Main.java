import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
// como adicionar elementos no array?

        names.add("Nome1");
        names.add("Nome2");
        names.add("Nome3");
        names.add("Nome4");


// como buscar um elemento especifico pelo indice get();
        for (int i = 0 ; i < names.size(); i++){
            System.out.println(names.get(i));

        }
// buscar o indice a partir de um elemento;
       int index = names.indexOf("Nome1");
        System.out.println(index);

// verifica se a lista está vazia;
        System.out.println(names.isEmpty());

// verifica se a lista contém algum elemento;
        System.out.println(names.contains("Nome12"));

// verifica o tamanho da lista;
        System.out.println(names.size());

//  limpa a lista de vez (remove todos os elementos;
        names.clear();
        System.out.println(names.isEmpty());
    }
}