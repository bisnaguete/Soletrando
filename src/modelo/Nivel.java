/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author Bisnaguete
 */
public class Nivel {
    private ArrayList<Palavra> palavras;
    private int nivel;

    public Nivel(int nivel){
        String caminhoRelativo = "audio\\";
        this.nivel = nivel;
        palavras = new ArrayList<Palavra>();
        switch (nivel) {
            case 1:{
                palavras.add(new Palavra("Filamento", "Fio de pequeníssimo diâmetro", "O * da lâmpanda rompeu, melhor troca-la.", "Ligamento",caminhoRelativo + "101_filamento.mp3")) ;
                palavras.add(new Palavra("Erosão", "Corroer pouco a pouco", "Desmatamento acaba por contribuir com a * do solo.", "Despojamento", caminhoRelativo + "102_erosao.mp3")) ;
                palavras.add(new Palavra("Provisório", "Temporário", "O documento é apenas *, retire o permanente dentro de 15 dias.", "Temporário", caminhoRelativo +"103_provisorio.mp3")) ;
//                palavras.add(new Palavra("Praguejar", "Dizer pragas", "Aquela mulher não para de *, não aguento mais escutá-la!", "Amaldiçoar", caminhoRelativo +"")) ;
//                palavras.add(new Palavra("Balística", "Ciência que estuda movimento dos projéteis", "Só após o teste de * que será possível investigar o crime", "Ciência dos Projéteis", caminhoRelativo +"")) ;
//                palavras.add(new Palavra("Trincheira", " Vala de proteção em combate", "Soldados que retornam da guerra ainda temem a *.", "Tranqueira", caminhoRelativo +"")) ;
//                palavras.add(new Palavra("Inadimplente", "Não cumpridor de um contrato ou de qualquer de suas condições", "Uma das causas da falência daquela empresa foi aquele comprador *", "Devedor", caminhoRelativo +"")) ;
//                palavras.add(new Palavra("Abdicar", "Renunciar voluntariamente a algo", "Ele * ao consumismo ao realizar um voto de pobreza", "Renunciar", caminhoRelativo +"")) ;
//                palavras.add(new Palavra("Vexaminoso", "Que causa vexame ou vergonha", "* os resultados apresentados por seu setor.", "Vergonhoso", caminhoRelativo +"")) ;
//                palavras.add(new Palavra("Fiscalização", "Ato ou efeito de  fiscalizar / verificar", "Ele foi pego pela *  por sonegar impostos", "Vistoria", caminhoRelativo +"")) ;
            }
//            case 2:{
//                palavras.add(new Palavra("Diplopia","Visão dupla de um objeto","O paciente sofria de diplopia no momento que perdeu o controle do carro.","Circunspecto",caminhoRelativo +""));
//                palavras.add(new Palavra("Corruptor","Quem corrompe","Aquele senhor com cara de inocente era um corruptor de menores.","Subornador",caminhoRelativo +""));
//                palavras.add(new Palavra("Pragmática","Conjunto de regras cerimonial","Já foi resolvida toda a pragmática da missa do galo.","Subornador",caminhoRelativo +""));
//                palavras.add(new Palavra("Construtivismo","Doutrina oposta a escultura tradicional","Ela passou o final de semana fazendo um trabalho sobre o * ","Droutina",caminhoRelativo +""));
//                palavras.add(new Palavra("Transmissão","Ato ou efeito de transmitir","A transmissão não foi ao ar por problemas técnicos.","Comunicação",caminhoRelativo +""));
//                palavras.add(new Palavra("Lebracho","Macho da lebre, ainda não adulto","O Fazendeiro procurando um * para sua criação de lebres","Lebre",caminhoRelativo +""));
//                palavras.add(new Palavra("Impotabilidade","Qualidade de impotável","Toda essa sujeira explica a impotabilidade deste riacho.","Impossibilidade de beber",caminhoRelativo +""));
//                palavras.add(new Palavra("Disanagnosia","Dificuldade de reconhecer certas palavras","Após um minuncioso exame a criança foi diagnosticada com *","Dislexia",caminhoRelativo +""));
//                palavras.add(new Palavra("Hodiernidade"," Qualidade de hodierno","A tese daquele professor foi baseada nos poetas da *","Modernindade",caminhoRelativo +""));
//                palavras.add(new Palavra("Pracejar","Fazer praça de","Ele estava a * seus feitos no trabalho","Ostentar",caminhoRelativo +""));
//            }
//            case 3:{
//                palavras.add(new Palavra("Psamobiídeos","Família de molusculos","O biólogo megulhou até as profundesas do mar estudar os *","Sanguinolarídeos",caminhoRelativo +""));
//                palavras.add(new Palavra("Omancia","Adivianhação por meio de ovos","Se voce não acredita em videntes, imaginem em um praticante de *","Adivinhação",caminhoRelativo +""));
//                palavras.add(new Palavra("Microbicida","Substância que destrói micróbios","Este podruto possui uma substância *","Germicida",caminhoRelativo +""));
//                palavras.add(new Palavra("Dilapidação","Gastar demasiadamente","Ainda não acredito na * daquele famoso quadro.","Esbanjar",caminhoRelativo +""));
//                palavras.add(new Palavra("Provençalesco","Relativo a poesia provencial","Aquele poeta * me impressiona a cada verso...","de Provença",caminhoRelativo +""));
//                palavras.add(new Palavra("Irreelegibilidade","Qualidade de irrelegível","A * daquele candidato não o impede de tornar-se ministro.","Não pode ser reeleito",caminhoRelativo +""));
//                palavras.add(new Palavra("Serosidade","Aspecto de soro em algum líquido","Plasma sanguíneo é um exemplo de solução com muita *.","",caminhoRelativo +""));
//                palavras.add(new Palavra("Miscigenação","Cruzamento inter-racial","Não conheço país com maior * que o Brasil.","Mestiçagem",caminhoRelativo +""));
//                palavras.add(new Palavra("Hecatombe","Sacrificio em massa","As guerras mudiais foram nada mais que uma grande *","Carnificina",caminhoRelativo +""));
//                palavras.add(new Palavra("Antidisrítmico","Medicamento para disritmia","Meu cardiologista receitou um * que não me faz bem.","",caminhoRelativo +""));
//
//            }
        }
    }
    public int getNivel(){
        return nivel;
    }
    
    public Palavra getPalavra(int contadorRodada) {
        return palavras.get(contadorRodada-1);
    }
}
