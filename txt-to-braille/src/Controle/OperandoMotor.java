package Controle;

import parport.ParallelPort;

/**
 *
 * @author Heitor
 */
public class OperandoMotor {

    public void marca_PontoColuna(int linha) {
        int Deslocamento=200;               //+++++++++++++     CALIBRAR MOTOR PARA DAR UMA VOLTA COMPLETA
        ParallelPort porta = new ParallelPort(0x378);
        int giro = 1;

        for (int i=0;i<Deslocamento;i++){
            if (giro>8)
                giro=1;
            giro = giro * 2;
            porta.write(linha+giro);
            try {
                    Thread.sleep(200);    //VER SE O TEMPO É MUITO CURTO.
                } catch (Exception e) {
                }
        }
    }

    public void desloca_Motor_Mesa(){
        int Motor = 128;
        int Deslocamento=200;               //+++++++++++++      CALIBRAR MOTOR PARA ANDAR 1,5 CM
        ParallelPort porta = new ParallelPort(0x378);
        int giro = 1;
        for (int i=0;i<Deslocamento;i++){
            if (giro>8)
                giro=1;
            giro = giro * 2;
            porta.write(Motor+giro);           
            try {
                    Thread.sleep(200);    //VER SE O TEMPO É MUITO CURTO.
                } catch (Exception e) {
                }
        }
    }

//    public static void meche() {
//        //Acessa endereço da porta.
//        ParallelPort porta = new ParallelPort(0x378);
//        for (;;) {
//            for (int i = 0; i < 9; i++) {
//                int valor = 0;
//                if (i == 0) {
//                    valor = 1;
//                } else if (i == 1) {
//                    valor = 2;
//                } else if (i == 2) {
//                    valor = 4;
//                } else if (i == 3) {
//                    valor = 8;
//                } else if (i == 4) {
//                    valor = 16;
//                } else if (i == 5) {
//                    valor = 32;
//                } else if (i == 6) {
//                    valor = 64;
//                } else if (i == 7) {
//                    valor = 128;
//                } else if (i == 8) {
//                    valor = 255;
//                }
//                porta.write(valor);
//                try {
//                    Thread.sleep(500);
//                } catch (Exception e) {
//                }
//            }
//            try {
//                Thread.sleep(1000);
//            } catch (Exception e) {
//            }
//            porta.write(0);
//            System.out.println("Foi");
//        }
//
//    }

}
