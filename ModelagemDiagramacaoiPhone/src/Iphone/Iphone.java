package Iphone;

import Iphone.Funcionalidades.AparelhoTelefonico;
import Iphone.Funcionalidades.NavegadorInternet;
import Iphone.Funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    public static void main(String[] args) {
        // Instancia um objeto da classe Iphone
        Iphone meuIphone = new Iphone();

        // Testa os métodos da interface AparelhoTelefonico
        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando " + numero);    }

    @Override
    public void atender() {
        System.out.println("Ligação atendida");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exindo página " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public  void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada " + musica);
    }


}