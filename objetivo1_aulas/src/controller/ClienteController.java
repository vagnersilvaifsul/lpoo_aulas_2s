package controller;

import model.Cliente;

import java.util.*;

public class ClienteController {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setId(1L);
        System.out.println(c1);
        Cliente c2 = new Cliente(2L, "111.222.333-23", "Ana", "Silva", "Rua das Flores, 10", "96000-000", "5355551234", "email@mail.com");
        System.out.println(c2);
        Cliente c3 = new Cliente(3L, "666.555.222-21", "Rafael", "Silveira");
        System.out.println(c3);

        //Declara e cria um objeto do tipo Collection
        List<Cliente> clientesList = new ArrayList<>();
        //adicionando objetos na coleção
        clientesList.add(c3);
        clientesList.add(c1);
        clientesList.add(c2);

        //imprime a collection
        System.out.println("********** List");
        System.out.println(clientesList);
        //busca e imprime o objeto de id=3
        System.out.print("busca e imprime o objeto de id=3");
        System.out.println(clientesList.get(2));

        System.out.print("busca e imprime o objeto de id=3, pesquisa por força bruta");
        //Algoritmo da força bruta
        for(Cliente cliente : clientesList){ //forEach até o JDK 7
           if(cliente.getId() == 3){
               System.out.println(cliente);
           }
        }
        clientesList.forEach(cliente -> { //forEach até o JDK +
            if(cliente.getId() == 3){
                System.out.println(cliente);
            }
        });
//        for (int i = 0; i <= 8 ; i++) {
//
//        }
        System.out.print("busca e imprime o objeto de id=3, pesquisa binária");
        //ordenação em ordem crescerte
        clientesList.sort(Comparator.comparing(Cliente::getId));
        int index =
            Collections.binarySearch( //utiliza o método binarySearch da classe utilitária Collections
                clientesList, //coleção que deseja pesquisar
                c3, //qual objeto devo localizar
                Comparator.comparing(Cliente::getId) //qual o critério de pesquisa (campo identificador no objeto detro da coleção)
                );
        System.out.println(clientesList.get(index));

        /*
            A Programação Funcional é outro paradigma da progarmação, o Paradigma Funcional
         */
        System.out.print("busca e imprime o objeto de id=3, por programação funcional");
        Cliente clienteFind = clientesList.stream() //1. Cria um fluxo para a estrutura de dados
            .filter(c -> c.getId() == 3) //2. Filtra pela chave de pesquisa
            .findAny() //3. Produre o primeiro que achar na coleção
            .orElse(null); //4. Se não localizar, entre null
        System.out.println(clienteFind);

        //ordenação, ordem descrescente (exemplo de como fazer ordenação decrescente)
        System.out.println("List em ordem decrescente:");
        clientesList.sort(Comparator.comparing(Cliente::getId).reversed());
        System.out.println(clientesList);

        //ordenação, ordem descrescente (exemplo de como fazer ordenação decrescente)
        System.out.println("List em ordem crescente:");
        clientesList.sort(Comparator.comparing(Cliente::getId));
        System.out.println(clientesList);

        //Declara e cria um objeto do tipo Collection
        Map<Long, Cliente> clientesMap = new HashMap<>();
        //adicionando objetos na coleção
        clientesMap.put(c1.getId(), c1);
        clientesMap.put(c2.getId(), c2);
        clientesMap.put(c3.getId(), c3);
        System.out.println("********** Map");
        System.out.println(clientesMap);
        //busca e imprime o objeto de id=3
        System.out.print("busca e imprime o objeto de id=3");
        System.out.println(clientesMap.get(c3.getId()));
        //Não permite ordenação dos dados

    }
}
