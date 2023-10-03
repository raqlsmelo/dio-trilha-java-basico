public class ComputadorPedrinho {
    public static void main(String[] args) {
    ServicoMensagemInstantanea smi = null;
    //não se sabe qual app - mas qualquer um deverá enviar e receber mensagem
    String appEscolhido = "fcb";
    if(appEscolhido.equals("msn"))
        smi = new MSNMessenger();
    else if(appEscolhido.equals("fcb"))
        smi = new FacebookMessenger();
    else if(appEscolhido.equals("tlg"))
        smi = new Telegram();

    smi.enviarMensagem();
    smi.receberMensagem();
        }
}
