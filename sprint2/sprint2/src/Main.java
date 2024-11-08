import Manutencao.*;
import Estacao.Estacao;
import InfraestruturaVia.InfraestruturaVia;
import Linha.Linha;
import Notificacao.Notificacao;
import Passagem.Passagem;
import RegistroDeIncidente.RegistroDeIncidente;
import Reserva.Reserva;
import TransporteFerroviario.TransporteFerroviario;
import Usuario.Usuario;

import java.util.Scanner;

import static AssistenteVirtual.AssistenteVirtual.responder;

public class Main {
    public static void main(String[] args) {

        //instanciando as classes

        Usuario usuario1 = new Usuario("1","Renato","12345678901","masculino","06/12/2002");
        Usuario usuario2 = new Usuario("2","Gabriel", "23456789101","masculino","01/01/2005");
        Usuario usuario3 = new Usuario("3","Fabio","34567890120","masculino","02/02/1990");

        Estacao estacao1 = new Estacao("1","Trianon-Masp","verde");
        Estacao estacao2 = new Estacao("2","Capão Redondo","lilás");

        Linha linha1 = new Linha("1","Linha 2-verde","verde");
        Linha linha2 = new Linha("2","Linha 5-lilás","lilás");

        Passagem pagamento1 = new Passagem("1","Renato",5.00,"pix","10:01");
        Passagem pagamento2 = new Passagem("2","Fabio",2.50,"débito","6:13");

        InfraestruturaVia infraestrutura1 = new InfraestruturaVia("1","Santo Amaro","bom","1/11/2024","lilás");
        InfraestruturaVia infraestrutura2 = new InfraestruturaVia("2","Ana Rosa","ruim","1/01/2024","verde");

        Manutencao manutencao1 = new Manutencao("1","conserto da via","Felipe","trilho com problema","Linha Verde->na estacao Ana Rosa");

        Notificacao notificacao1 = new Notificacao("1",usuario2,"A Santo Amaro está congestionada","03/11/2024");

        RegistroDeIncidente registroDeIncidente1 = new RegistroDeIncidente("1","11/08/2024","Manutencao", "TransporteFerroviario");

        Reserva reserva1 = new Reserva("1",usuario1,estacao2,estacao1,"06/11/2024",true); //True para confirmado a reserva , e False para reserva não confirmado

        TransporteFerroviario trem1 = new TransporteFerroviario("1",10,100,1,"lilás","10:00","10:30");

       //exibindo os metódos das classes

        usuario1.exibirDados();
        usuario2.exibirDados();
        usuario3.exibirDados();

        estacao1.exibirEstacoes();
        estacao2.exibirEstacoes();

        linha1.exibirDetalhes();
        linha2.exibirDetalhes();

        pagamento1.exibirDetalhes();
        pagamento2.exibirDetalhes();

        infraestrutura1.exibirInformacao();
        infraestrutura2.exibirInformacao();

        manutencao1.exibirManutencao();

        notificacao1.exibirNotificacao();
        notificacao1.enviarNotificacao();

        registroDeIncidente1.exibirIncidente();

        reserva1.exibirDetalhesDaReserva();
        reserva1.confirmarReserva();

        trem1.exibirDetalhes();

        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Qual dessas pergunta você gostaria de saber ?\n1-quanto custa uma passagem ?\n2-demora quanto tempo da estação capão redondo até chacara klabin\n3-quais o horário que o metro funciona ?\n4-o metro tem acessibilidade para pessoas com deficiência ?\n5-quais são as formas de pagamento no metrô ?\n6-posso levar minha bicicleta no metrô ?\n7-para sair do programa");
            int pergunta = scanner.nextInt();
            scanner.nextLine();
            //utilizei a classe AssistenteVirtual para responder as perguntas
            if(pergunta == 1){
                System.out.println(responder("quanto custa uma passagem ?"));

            } else if (pergunta == 2) {
                System.out.println(responder("demora quanto tempo da estação capão redondo até chacara klabin"));
            } else if (pergunta == 3) {
                System.out.println(responder("qual o horário que o metrô funciona ?"));
            } else if (pergunta == 4) {
                System.out.println(responder("o metrô tem acessibilidade para pessoas com deficiência ?"));
            } else if (pergunta == 5) {
                System.out.println(responder("quais são as formas de pagamento no metrô ?"));
            } else if (pergunta == 6) {
                System.out.println(responder("posso levar minha bicicleta no metrô ?"));
            }else if (pergunta == 7) {
                System.out.println("Saindo do programa...");
                break;
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();

    }
}