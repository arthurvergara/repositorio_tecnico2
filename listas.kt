fun main() {
    val listaFrutas = mutableListOf("Maça", "Banana", "Uva", "Morango");
    listaFrutas.add("Melancia");
    listaFrutas.remove("Uva");
    println(listaFrutas[0]);
    
    for(fruta in listaFrutas){
        println(fruta);
    }
    
    var tamanho: Int = listaFrutas.size;
    println("Tamanho da lista: ${tamanho}");
}