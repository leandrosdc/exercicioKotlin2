class aposentadoria(
    val idade:Int,
    val sexo:String,
    val anosContrinuicao:Int
) {
    fun calculaAposentadora(){
        when{
            this.sexo == "F" && this.idade >= 60 && this.anosContrinuicao >= 30 -> println("Elegivel a Aposentadoria")
            this.sexo == "M" && this.idade >= 65 && this.anosContrinuicao >= 30 -> println("Elegivel a Aposentadoria")
            this.sexo != "F" && this.sexo != "M" -> println("ERRO: Sexo Informado Errado")
            this.idade <= this.anosContrinuicao -> println("ERRO: Anos de contribuição maior ou igual que idade")
            this.idade - this.anosContrinuicao < 18 -> println("ERRO: Anos de contribuição maior ou igual que idade minima para trabalho")
            else -> println("Não Elegivel a Aposentadoria")
        }
    }
}