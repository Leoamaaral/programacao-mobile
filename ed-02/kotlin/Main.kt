fun main() {
    val contaPoupanca = ContaPoupanca("Leonardo Amaral", 1000.0, "12345", "001")
    val contaCorrente = ContaCorrente("Marcio H. Amaral", 1500.0, "67890", "002")

    contaPoupanca.aplicarJuros(10)
    contaCorrente.aplicarJuros(5)

    contaPoupanca.imprimirExtrato()
    println()
    contaCorrente.imprimirExtrato()
}