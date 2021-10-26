fun main(args: Array<String>) {

    print ("Quanto você vendeu em R$: ")
    var vendas = readLine()!!.toDouble()


    if (vendas > 10000){
        println("Sua comissão é de: ${(vendas * 30)/100}")
    }else if (vendas >= 5001.0 && vendas <= 9999.0){
        println("Sua comissão é de: ${(vendas * 20)/100}")
    }else if (vendas >= 1001.0 && vendas <= 4999.0){
        println("Sua comissão é de: ${(vendas * 10)/100}")
    }else
        println("N/D - Sem comissão")
}