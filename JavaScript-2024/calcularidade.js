function calcularIdade() {
    const anoNascimento = document.getElementById('anoNascimento').value;
    const anoAtual = new Date().getFullYear();

    if (isNaN(anoNascimento) || anoNascimento > anoAtual) {
        document.getElementById('resultado').textContent = "Por favor, insira um ano de nascimento válido (número menor que o ano atual).";
        return;
    }

    const idade = anoAtual - anoNascimento;

    if (idade < 18) {
        document.getElementById('resultado').textContent = `Você tem ${idade} anos. Ainda é muito jovem!`;
    } else if (idade >= 18 && idade < 30) {
        document.getElementById('resultado').textContent = `Você tem ${idade} anos. Está na flor da idade!`;
    } else if (idade >= 30 && idade < 60) {
        document.getElementById('resultado').textContent = `Você tem ${idade} anos. Experiência e sabedoria andam juntas!`;
    } else {
        document.getElementById('resultado').textContent = `Você tem ${idade} anos. Uma idade para celebrar a vida!`;
    }
}