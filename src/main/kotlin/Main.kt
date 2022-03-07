fun main() {
  //  println("Digite  1- Sim    2- Não ")
// val detetive = detetive()


}


fun triangulo(): Unit {
    println("Digite o primeiro lado do triangulo: ")
    val n1 = readLine()!!.toFloat()
    println("Digite o segundo lado do triangulo: ")
    val n2 = readLine()!!.toFloat()
    println("Digite o terceiro lado do triangulo: ")
    val n3 = readLine()!!.toFloat()
    if (n1 == n2 && n2 == n3) {
        println(" Seu triangulo é Equilátero pois possui tres lados iguais")
    } else if (n1 != n2 && n2 != n3 && n1 != n3) {
        println("Seu triangulo é Escaleno pois possui tres lados diferentes")
    } else {
        println("Seu triangulo é Isósceles pois todos os lados são diferentes")
    }

}

fun bissexto(): Unit {
    println("Digite um ano que deseja:")
    val ano = readLine()!!.toInt()
    if (ano % 4 == 0 && ano % 100 != 0) {
        println("Este ano é um ano Bissexto!")
    } else if (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0) {
        println("Este ano é um ano Bissexto")
    } else{
        println("Este ano não é Bissexto")
    }
}

fun detetive() {

    var contagem = 0
    println("Você telefonou para a vitima? ")
    if(readLine()!!.toInt()  == 1) contagem++

    println("Você esteve no local do crime? ")
    if(readLine()!!.toInt() == 1) contagem++

    println("Você mora perto da vitima? ")
    if(readLine()!!.toInt() == 1) contagem++

    println("Você devia para a vitima? ")
    if(readLine()!!.toInt() == 1) contagem++

    println("Você já trabalhou com a vitima? ")
    if(readLine()!!.toInt() == 1) contagem++

    if (contagem == 5) {
        println("Você é um assasino!")

    } else if (contagem < 2) {
        println("Você é inocente!")

    } else if (contagem == 2) {
        println("Você é um suspeito!")

    } else if (contagem == 3 ||  contagem == 4)
        println("Você é um Cúmplice!")

}

fun posto() {

    println("Qual o combustivel desejado? ")
    var alcool = readLine()!!.toFloat()
    var gasosa = readLine()!!.toFloat()
    var combustivel = readLine()!!.toFloat()
    println("Quantos litros você deseja? ")
    var litro = readLine()!!.toFloat()
    var desconto1 = readLine()!!.toFloat()
    var desconto2 = readLine()!!.toFloat()
    var desconto3 = readLine()!!.toFloat()
    var desconto4 = readLine()!!.toFloat()
    var valor = readLine()!!.toFloat()
    var gasolina = readLine()!!.toFloat()

    if ((combustivel == alcool) && (litro <= 20) && (valor == 3.5F))
        desconto1 = (valor * 0.03f) / 100

    println("Desconto do Combustivel")

    // 3.5 PREÇO DO ALCOOL

    if ((combustivel== alcool) && (litro >= 20 ) && (valor == 4.6F))
        desconto2 = (valor * 0.05f) / 100

    println("Desconto de Combustivel")

    // 4.6 PREÇO Do ALCOOL

    if  ((combustivel == gasosa ) && (litro<=20 ) && (valor ==5.3F))
        desconto3 = (valor * 0.04f)/100

    else ((combustivel == valor) && (litro>=20) && (valor ==5.6F))
    desconto4 = (valor * 0.06f) / 100

    }





//fun bissexto(): Unit {
//    println("Digite um ano que deseja:")
//    val ano = readLine()!!.toInt()
//    if (ano % 4 == 0 && ano % 100 != 0) {
//        println("Este ano é um ano Bissexto!")
//    } else if (ano % 4 == 0 && ano % 100 == 0 && ano % 400 == 0) {
//        println("Este ano é um ano Bissexto")
//    } else{
//        println("Este ano não é Bissexto")