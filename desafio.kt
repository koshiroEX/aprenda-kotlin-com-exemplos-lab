// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANÇADO }

data class Usuario (val nome: String, val id: Int)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, var nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} foi matriculado na Formação: $nome")
        println("Lista de Alunos Matriculados em $nome: $inscritos")
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    
    val aluno1 = Usuario("Koshiro", 1)
    val aluno2 = Usuario("Galahad", 2)
    val aluno3 = Usuario("TK", 3)
    val aluno4 = Usuario("Jiritsu", 4)
    val aluno5 = Usuario("Vahr", 5)

    //Conteudos curso Desenvolvimento Web
    val content1 = ConteudoEducacional("HTML")
    val content2 = ConteudoEducacional("CSS")
    val content3 = ConteudoEducacional("Javascript", 120)

    //Conteudos curso Kotlin
    val content4 = ConteudoEducacional("Funções")
    val content5 = ConteudoEducacional("Variaveis", 30)
    val content6 = ConteudoEducacional("Coleções", 45)
    
    //Conteudos Curso C#
    val content7 = ConteudoEducacional("Introdução", 30)
    val content8 = ConteudoEducacional("Lógica", 120)
    val content9 = ConteudoEducacional("OOP - Object Oriented Programming", 80)

    val formacao1 = Formacao("Desenvolvimento Web",listOf(content1, content2, content3), Nivel.BASICO)
    val formacao2 = Formacao("Kotlin", listOf(content4, content5, content6), Nivel.INTERMEDIARIO)
    val formacao3 = Formacao("C#", listOf(content7, content8, content9), Nivel.AVANÇADO)


    println("Formações Atualmente Disponíveis: \n $formacao1 \n $formacao2 \n $formacao3 \n")
    
    
    formacao1.matricular(aluno1)
    formacao1.matricular(aluno2)
    
    formacao2.matricular(aluno3)
    formacao2.matricular(aluno4)
    
    formacao3.matricular(aluno5)




    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
