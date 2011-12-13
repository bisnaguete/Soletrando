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
                palavras.add(new Palavra("Abdicar", "Renunciar voluntariamente a algo", "Ele * ao consumismo ao realizar um voto de pobreza", "Renunciar", caminhoRelativo +"101_abdicar.mp3")) ;
                palavras.add(new Palavra("Balística", "Ciência que estuda movimento dos projéteis", "Só após o teste de * que será possível investigar o crime", "Ciência dos Projéteis", caminhoRelativo +"102_balistica.mp3")) ;
                palavras.add(new Palavra("Erosão", "Corroer pouco a pouco", "Desmatamento acaba por contribuir com a * do solo.", "Despojamento", caminhoRelativo + "103_erosao.mp3")) ;
                palavras.add(new Palavra("Filamento", "Fio de pequeníssimo diâmetro", "O * da lâmpanda rompeu, melhor troca-la.", "Ligamento",caminhoRelativo + "104_filamento.mp3")) ;
                palavras.add(new Palavra("Fiscalização", "Ato ou efeito de  fiscalizar / verificar", "Ele foi pego pela *  por sonegar impostos", "Vistoria", caminhoRelativo +"105_fiscalizacao.mp3")) ;
                palavras.add(new Palavra("Inadimplente", "Não cumpridor de um contrato ou de qualquer de suas condições", "Uma das causas da falência daquela empresa foi aquele comprador *", "Devedor", caminhoRelativo +"106_inadimplente.mp3")) ;
                palavras.add(new Palavra("Praguejar", "Dizer pragas", "Aquela mulher não para de *, não aguento mais escutá-la!", "Amaldiçoar", caminhoRelativo +"107_praguejar.mp3")) ;
                palavras.add(new Palavra("Provisório", "Passageiro", "O documento é apenas *, retire o permanente dentro de 15 dias.", "Temporário", caminhoRelativo +"108_provisorio.mp3")) ;
                palavras.add(new Palavra("Trincheira", " Vala de proteção em combate", "Soldados que retornam da guerra ainda temem a *.", "Tranqueira", caminhoRelativo +"109_trincheira.mp3")) ;
                palavras.add(new Palavra("Vexaminoso", "Que causa vexame ou vergonha", "* os resultados apresentados por seu setor.", "Vergonhoso", caminhoRelativo +"110_vexaminoso.mp3")) ;
            }
            case 2:{
                palavras.add(new Palavra("Construtivismo","Doutrina oposta a escultura tradicional","Ela passou o final de semana fazendo um trabalho sobre o * ","Droutina",caminhoRelativo +"201_construtivismo.mp3"));
                palavras.add(new Palavra("Corruptor","Quem corrompe","Aquele senhor com cara de inocente era um * de menores.","Subornador",caminhoRelativo +"202_corruptor.mp3"));
                palavras.add(new Palavra("Diplopia","Visão dupla de um objeto","O paciente sofria de * no momento que perdeu o controle do carro.","Circunspecto",caminhoRelativo +"203_diplopia.mp3"));
                palavras.add(new Palavra("Disanagnosia","Dificuldade de reconhecer certas palavras","Após um minuncioso exame a criança foi diagnosticada com *","Dislexia",caminhoRelativo +"204_disanagnosia.mp3"));
                palavras.add(new Palavra("Hodiernidade"," Qualidade de hodierno","A tese daquele professor foi baseada nos poetas da *","Modernindade",caminhoRelativo +"205_hodiernidade.mp3"));
                palavras.add(new Palavra("Impotabilidade","Qualidade de impotável","Toda essa sujeira explica a * deste riacho.","Impossibilidade de beber",caminhoRelativo +"206_impotabilidade.mp3"));
                palavras.add(new Palavra("Lebracho","Macho da lebre, ainda não adulto","O Fazendeiro procurando um * para sua criação de lebres","Lebre",caminhoRelativo +"207_lebracho.mp3"));
                palavras.add(new Palavra("Pracejar","Fazer praça de","Ele estava a * seus feitos no trabalho","Ostentar",caminhoRelativo +"208_pracejar.mp3"));
                palavras.add(new Palavra("Pragmática","Conjunto de regras cerimonial","Já foi resolvida toda a * da missa do galo.","Formalidade",caminhoRelativo +"209_pragmatica.mp3"));
                palavras.add(new Palavra("Transmissão","Ato ou efeito de transmitir","A * não foi ao ar por problemas técnicos.","Comunicação",caminhoRelativo +"210_transmissao.mp3"));
            }
            case 3:{
                palavras.add(new Palavra("Antidisrítmico","Medicamento para disritmia","Meu cardiologista receitou um * que não me faz bem.","",caminhoRelativo +"301_antidisritmico.mp3"));
                palavras.add(new Palavra("Dilapidação","Gastar demasiadamente","Ainda não acredito na * daquele famoso quadro.","Esbanjar",caminhoRelativo +"302_dilapidacao.mp3"));
                palavras.add(new Palavra("Hecatombe","Sacrificio em massa","As guerras mudiais foram nada mais que uma grande *","Carnificina",caminhoRelativo +"303_hecatombe.mp3"));
                palavras.add(new Palavra("Irreelegibilidade","Qualidade de irrelegível","A * daquele candidato não o impede de tornar-se ministro.","Não pode ser reeleito",caminhoRelativo +"304_irreelegibilidade.mp3"));
                palavras.add(new Palavra("Microbicida","Substância que destrói micróbios","Este podruto possui uma substância *","Germicida",caminhoRelativo +"305_microbicida.mp3"));
                palavras.add(new Palavra("Miscigenação","Cruzamento inter-racial","Não conheço país com maior * que o Brasil.","Mestiçagem",caminhoRelativo +"306_miscigenacao.mp3"));
                palavras.add(new Palavra("Oomancia","Adivianhação por meio de ovos","Se voce não acredita em videntes, imaginem em um praticante de *","Adivinhação",caminhoRelativo +"307_oomancia.mp3"));
                palavras.add(new Palavra("Provençalesco","Relativo a poesia provencial","Aquele poeta * me impressiona a cada verso...","de Provença",caminhoRelativo +"308_provencalesco.mp3"));
                palavras.add(new Palavra("Psamobiídeos","Família de molusculos","O biólogo megulhou até as profundesas do mar estudar os *","Sanguinolarídeos",caminhoRelativo +"309_psamobiideos.mp3"));
                palavras.add(new Palavra("Serosidade","Aspecto de soro em algum líquido","Plasma sanguíneo é um exemplo de solução com muita *.","Viscosidade",caminhoRelativo +"310_serosidade.mp3"));
            }
        }
    }
    public int getNivel(){
        return nivel;
    }
    
    public Palavra getPalavra(int contadorRodada) {
        int a = contadorRodada;
        return palavras.get(contadorRodada-1);
    }
}
