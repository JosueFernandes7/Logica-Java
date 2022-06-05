package Listas.Lista3;

import java.util.Scanner;

public class Ex8 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String codigoCerto = "1234", senhaCerta = "9999";
        System.out.print("Digite o codigo: ");
        String codigo = in.next();

        if (codigo.equals(codigoCerto)) {
            System.out.print("Digite a senha: ");
            String senha = in.next();
            if (senha.equals(senhaCerta)) {
                System.out.println("Acesso Permitido");
            } else {
                System.out.println("senha incorreta");
            }
        } else {
            System.out.println("Usuario invalido");
        }
    }
}
