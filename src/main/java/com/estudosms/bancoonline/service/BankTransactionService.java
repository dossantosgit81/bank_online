package com.estudosms.bancoonline.service;

public interface BankTransactionService {
    //Verificar se a conta patrocinadora existe
        //Se não existir, lança um erro de Entidade não existente. Enviei o nome da lasse nesse erro para o front identificar a classe

    //Verificar se saldo da conta patrocinadora é maior igual o valor que ele quer enviar
        //Se o saldo da conta patrocinadora for menor  que o valor que ele está enviando, lança um erro de

    //Verficar se a conta beneficiaria existe
        //Se não existir, lança um erro de Entidade não existente

    //Atualizar valor do saldo da conta beneficiaria se os passos anteriores foram bem sucedidos

    //Cliente não pode realizar o operação de transferencia bancaria para conta dele mesmo

    //Transações do tipo DOC é uma transferência bancária limitada a R$ 4.999,99

    /*Transferencias do tipo TED não possuem limite de transferencia. O valor cai na conta do beneficiário poucos minutos após a autorização, se a transferência for feita antes das 17h.
    Se você fizer o agendamento depois desse horário, o valor só aparecerá na conta do beneficiado no dia seguinte.
    */


    /*
    * Já o valor transferido por DOC só é efetivado no dia útil seguinte, para transações feitas até as 21h59.
    * Depois desse horário, o dinheiro só vai cair na conta do beneficiário no segundo dia útil.
    *Funciona assim: se o DOC for programado às 23h de segunda-feira, ele só vai cair na conta da pessoa na quarta. Isso se nenhum desses dias for feriado.
    * Mas se você agendar às 21h, o valor já ficará disponível na terça-feira. Também é preciso ficar de olho na confirmação, porque o prazo só começa a valer depois de confirmado o agendamento.
    * */

    //O cliente tem limite de três transações diárias gratuitas

    /*Uma dica é fazer DOC e TED nos caixas eletrônicos ou pela internet. Nesses dois canais, as taxas são mais baratas do que se for em um caixa presencial.
    Nos principais bancos, as transferências pela internet ou no caixa eletrônico custam entre R$ 9,40 e R$ 9,75.
    Já as transferências pessoais (na boca do caixa) custam entre R$ 17,40 e R$ 18,70.*/

    //TED para conta poupança. Porém, no caso de DOC, não são todos os bancos que permitem para esse tipo de conta.

}
