package Modelo;
/**
 *
 * @author Heitor
 */
public class converte_Caracter {
/*
     * Os valores 16, 32 e 64 apontam para o bit que vai liberar o motor.
     * O valor 16 libera o motor da primeira linha, o 32 da segunda e o 64 da terceira linha.
     * No caracter temos 2 colunas para o caracter e 2 para representar que tipo ele é (por caracter não por palavra, ainda)
     * 
     */
    static int m1 = 16;
    static int m2 = 32;
    static int m3 = 64;
//nesta classe vamos fzer a conversão do caracter para código binário;

    /**
     * 
     * @param Passe um caractere para ser transformado em codigo braille.
     * @return Retorna um caractere pronto para ser impresso no display.
     */
    public caracter ativa_colunas(char tica) {
        caracter ai = new caracter();
        //Aqui verifico se o caracter é Maiusculo.
        if (Character.isUpperCase(tica)){
            ai.setExisteColsAnt(true);
            ai.setColunaA(0);
            ai.setColunaB(m1+m3);
        }
        //Verifico se é Número
        if (Character.isDigit(tica)){
            ai.setExisteColsAnt(true);
            ai.setColunaA(m3);
            ai.setColunaB(m1+m2+m3);
        }
        //Aqui transformo a letra em minusculo
        tica=Character.toLowerCase(tica);

        switch (tica) {
            case 'a':
                ai.setMotor_primeira_coluna(m1);
                ai.setMotor_segunda_coluna(0);
                break;

            case 'b':
                ai.setMotor_primeira_coluna(m1+m2);
                ai.setMotor_segunda_coluna(0);
                break;


            case 'c':
                ai.setMotor_primeira_coluna(m1);
                ai.setMotor_segunda_coluna(m1);
                break;

            case 'd':
                ai.setMotor_primeira_coluna(m1);
                ai.setMotor_segunda_coluna(m1+m2);
                break;

            case 'e':
                ai.setMotor_primeira_coluna(m1);
                ai.setMotor_segunda_coluna(m2);
                break;

            case 'f':
                ai.setMotor_primeira_coluna(m1+m2);
                ai.setMotor_segunda_coluna(m1);
                break;

            case 'g':
                ai.setMotor_primeira_coluna(m1+m2);
                ai.setMotor_segunda_coluna(m1+m2);
                break;

            case 'h':
                ai.setMotor_primeira_coluna(m1+m2);
                ai.setMotor_segunda_coluna(m2);
                break;

            case 'i':
                ai.setMotor_primeira_coluna(m2);
                ai.setMotor_segunda_coluna(m1);
                break;

            case 'j':
                ai.setMotor_primeira_coluna(m2);
                ai.setMotor_segunda_coluna(m1+m2);
                break;

            case 'k':
                ai.setMotor_primeira_coluna(m1+m3);
                ai.setMotor_segunda_coluna(0);
                break;

            case 'l':
                ai.setMotor_primeira_coluna(m1+m2+m3);
                ai.setMotor_segunda_coluna(0);
                break;

            case 'm':
                ai.setMotor_primeira_coluna(m1+m3);
                ai.setMotor_segunda_coluna(m1);
                break;

            case 'n':
                ai.setMotor_primeira_coluna(m1+m3);
                ai.setMotor_segunda_coluna(m1+m2);
                break;

            case 'o':
                ai.setMotor_primeira_coluna(m1+m3);
                ai.setMotor_segunda_coluna(m2);
                break;

            case 'p':
                ai.setMotor_primeira_coluna(m1+m2+m3);
                ai.setMotor_segunda_coluna(m1);
                break;

            case 'q':
                ai.setMotor_primeira_coluna(m1+m2+m3);
                ai.setMotor_segunda_coluna(m1+m2);
                break;

            case 'r':
                ai.setMotor_primeira_coluna(m1+m2+m3);
                ai.setMotor_segunda_coluna(m2);
                break;

            case 's':
                ai.setMotor_primeira_coluna(m2+m3);
                ai.setMotor_segunda_coluna(m1);
                break;

            case 't':
                ai.setMotor_primeira_coluna(m2+m3);
                ai.setMotor_segunda_coluna(m1+m2);
                break;

            case 'u':
                ai.setMotor_primeira_coluna(m1+m3);
                ai.setMotor_segunda_coluna(m3);
                break;

            case 'v':
                ai.setMotor_primeira_coluna(m1+m2+m3);
                ai.setMotor_segunda_coluna(m3);
                break;

            case 'w':
                ai.setMotor_primeira_coluna(m2);
                ai.setMotor_segunda_coluna(m1+m2+m3);
                break;

            case 'y':
                ai.setMotor_primeira_coluna(m1+m3);
                ai.setMotor_segunda_coluna(m1+m2+m3);
                break;

            case 'x':
                ai.setMotor_primeira_coluna(m1+m3);
                ai.setMotor_segunda_coluna(m1+m3);
                break;

            case 'z':
                ai.setMotor_primeira_coluna(m1+m3);
                ai.setMotor_segunda_coluna(m2+m3);
                break;
//Números

            case '0':
                ai.setMotor_primeira_coluna(m2);
                ai.setMotor_segunda_coluna(m1+m2);
                break;

            case '1':
                ai.setMotor_primeira_coluna(m1);
                ai.setMotor_segunda_coluna(0);
                break;

            case '2':
                ai.setMotor_primeira_coluna(m1+m2);
                ai.setMotor_segunda_coluna(0);
                break;

            case '3':
                ai.setMotor_primeira_coluna(m1);
                ai.setMotor_segunda_coluna(m1);
                break;

            case '4':
                ai.setMotor_primeira_coluna(m1);
                ai.setMotor_segunda_coluna(m1+m2);
                break;

            case '5':
                ai.setMotor_primeira_coluna(m1);
                ai.setMotor_segunda_coluna(m2);
                break;

            case '6':
                ai.setMotor_primeira_coluna(m1+m2);
                ai.setMotor_segunda_coluna(m1);
                break;

            case '7':
                ai.setMotor_primeira_coluna(m1+m2);
                ai.setMotor_segunda_coluna(m1+m2);
                break;

            case '8':
                ai.setMotor_primeira_coluna(m1+m2);
                ai.setMotor_segunda_coluna(m2);
                break;

            case '9':
                ai.setMotor_primeira_coluna(m2);
                ai.setMotor_segunda_coluna(m1);
                break;

            case 'é':
                ai.setMotor_primeira_coluna(m1+m2+m3);
                ai.setMotor_segunda_coluna(m1+m2+m3);
                break;

            case 'á':
                ai.setMotor_primeira_coluna(m1+m2+m3);
                ai.setMotor_segunda_coluna(m2+m3);
                break;

            case 'è':
                ai.setMotor_primeira_coluna(m2+m3);
                ai.setMotor_segunda_coluna(m1+m3);
                break;
            case 'à':
                ai.setMotor_primeira_coluna(m1+m2);
                ai.setMotor_segunda_coluna(m1+m3);
                break;

            case 'â':
                ai.setMotor_primeira_coluna(m1);
                ai.setMotor_segunda_coluna(m3);
                break;

            case 'ê':
                ai.setMotor_primeira_coluna(m1+m2);
                ai.setMotor_segunda_coluna(m3);
                break;
            case 'ç':
                ai.setMotor_primeira_coluna(m1+m2+m3);
                ai.setMotor_segunda_coluna(m1+m3);
                break;

            case 'ú':
                ai.setMotor_primeira_coluna(m2+m3);
                ai.setMotor_segunda_coluna(m1+m2+m3);
                break;

            case 'ì':
                ai.setMotor_primeira_coluna(m1);
                ai.setMotor_segunda_coluna(m1+m3);
                break;
            case 'ô':
                ai.setMotor_primeira_coluna(m1);
                ai.setMotor_segunda_coluna(m1+m2+m3);
                break;

            case 'ù':
                ai.setMotor_primeira_coluna(m1);
                ai.setMotor_segunda_coluna(m2+m3);
                break;

            case 'ï':
                ai.setMotor_primeira_coluna(m1+m2);
                ai.setMotor_segunda_coluna(m1+m2+m3);
                break;
            case 'ü':
                ai.setMotor_primeira_coluna(m1+m2);
                ai.setMotor_segunda_coluna(m2+m3);
                break;

            case 'õ':
                ai.setMotor_primeira_coluna(m2);
                ai.setMotor_segunda_coluna(m1+m3);
                break;

            case 'ò':
                ai.setMotor_primeira_coluna(m2);
                ai.setMotor_segunda_coluna(m1+m2+m3);
                break;
            case 'í':
                ai.setMotor_primeira_coluna(m3);
                ai.setMotor_segunda_coluna(m1);
                break;

            case 'ã':
                ai.setMotor_primeira_coluna(m3);
                ai.setMotor_segunda_coluna(m1+m2);
                break;

            case 'ó':
                ai.setMotor_primeira_coluna(m3);
                ai.setMotor_segunda_coluna(m1+m3);
                break;
            case ',':
                ai.setMotor_primeira_coluna(m2);
                ai.setMotor_segunda_coluna(0);
                break;

            case ';':
                ai.setMotor_primeira_coluna(m2+m3);
                ai.setMotor_segunda_coluna(0);
                break;

            case '!':
                ai.setMotor_primeira_coluna(m2+m3);
                ai.setMotor_segunda_coluna(m2);
                break;
            case '*':
                ai.setMotor_primeira_coluna(m3);
                ai.setMotor_segunda_coluna(m2);
                break;

            case '$':
                ai.setMotor_primeira_coluna(0);
                ai.setMotor_segunda_coluna(m2+m3);
                break;

            case ':':
                ai.setMotor_primeira_coluna(m2);
                ai.setMotor_segunda_coluna(m2);
                break;
            case '?':
                ai.setMotor_primeira_coluna(m2);
                ai.setMotor_segunda_coluna(m3);
                break;

            case '#':
                ai.setMotor_primeira_coluna(m3);
                ai.setMotor_segunda_coluna(m1+m2+m3);
                break;

            case '.':
                ai.setMotor_primeira_coluna(m3);
                ai.setMotor_segunda_coluna(0);
                break;
            case '-':
                ai.setExisteColsAnt(true);
                ai.setColunaA(m3);
                ai.setColunaB(m3);
                ai.setMotor_primeira_coluna(m3);
                ai.setMotor_segunda_coluna(m3);
                break;

            case '"':
                ai.setMotor_primeira_coluna(m2+m3);
                ai.setMotor_segunda_coluna(m3);
                break;

            case '(':
                ai.setExisteColsAnt(true);
                ai.setColunaA(m1+m2);
                ai.setColunaB(m3);
                ai.setMotor_primeira_coluna(m3);
                ai.setMotor_segunda_coluna(0);
                break;
            case ')':
                ai.setExisteColsAnt(true);
                ai.setColunaA(0);
                ai.setColunaB(m3);
                ai.setMotor_primeira_coluna(m3);
                ai.setMotor_segunda_coluna(m1+m2);
                break;

            case '[':
                ai.setMotor_primeira_coluna(m1+m2+m3);
                ai.setMotor_segunda_coluna(m2+m3);
                break;

            case ']':
                ai.setMotor_primeira_coluna(m2+m3);
                ai.setMotor_segunda_coluna(m1+m2+m3);
                break;
            case '&':
                ai.setMotor_primeira_coluna(m1+m2+m3);
                ai.setMotor_segunda_coluna(m1+m3);
                break;

            case '/':
                ai.setExisteColsAnt(true);
                ai.setColunaA(m2);
                ai.setColunaB(0);
                ai.setMotor_primeira_coluna(0);
                ai.setMotor_segunda_coluna(m3);
                break;

            case '|':
                ai.setMotor_primeira_coluna(0);
                ai.setMotor_segunda_coluna(m1+m2+m3);
                break;
            case '%':
                ai.setExisteColsAnt(true);
                ai.setColunaA(0);
                ai.setColunaB(m1+m2+m3);
                ai.setMotor_primeira_coluna(m3);
                ai.setMotor_segunda_coluna(m2+m3);
                break;

            case '+':
                ai.setMotor_primeira_coluna(m2+m3);
                ai.setMotor_segunda_coluna(m2);
                break;

            case '=':
                ai.setMotor_primeira_coluna(m2+m3);
                ai.setMotor_segunda_coluna(m2+m3);
                break;
            case ' ':
                ai.setMotor_primeira_coluna(0);
                ai.setMotor_segunda_coluna(0);
                break;

            case '\n':
                ai.setMotor_primeira_coluna(0);
                ai.setMotor_segunda_coluna(0);
                break;

            case '\'':
                ai.setMotor_primeira_coluna(m3);
                ai.setMotor_segunda_coluna(0);
                break;
        }
        return ai;
    }
}
