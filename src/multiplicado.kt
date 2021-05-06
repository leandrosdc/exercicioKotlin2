class multiplicado (var lista:List<Int>){

    fun multiplicador(){
        var x:Int = 1
        lista.forEach{
            x = x * it
        }
        println("")
        println("RESULTADO CLASSE MULTIPLICADO")
        println("O resultado da multiplicação é: " + x)
    }

    fun teste(){
        println("")
        println("RESULTADO CLASSE MULTIPLICADO USANDO REDUCE")
        println("O resultado da multiplicação é: " + lista.reduce {a, b -> a * b})
    }
}