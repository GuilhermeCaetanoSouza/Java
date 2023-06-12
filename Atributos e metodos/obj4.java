/*Descrição: Crie uma classe chamada "VOVOh" que tenha um método contrutor.

*Autor:  Guilherme Caetano

*Ultima atualização: 12/06/2025

*/




public class OrObj4{

    public static void main (String[]args){
        VOVOh veio = new VOVOh(aparência: "lindo" );
        System.out.println(veio.aparência);
    }

}




class VOVOh{
    int idade;
    Boolean anda;
    String aparência;

    VOVOh(Boolean anda, String aparência){
        this.anda= false;
        this.aparência = "lindooo";
    }



}