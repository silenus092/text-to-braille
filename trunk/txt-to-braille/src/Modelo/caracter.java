package Modelo;

/**
 *
 * @author Heitor
 */
public class caracter {
private int motor_primeira_coluna;
private int motor_segunda_coluna;

private int colunaA;
private int colunaB;
private boolean existeColsAnt=false;
    public caracter() {
    }

    public caracter(int motor_primeira_coluna, int motor_segunda_coluna) {
        this.motor_primeira_coluna = motor_primeira_coluna;
        this.motor_segunda_coluna = motor_segunda_coluna;
        this.colunaA = 0;
        this.colunaB = 0;
        this.existeColsAnt = false;
    }

    public caracter(int motor_primeira_coluna, int motor_segunda_coluna, int colunaA, int colunaB) {
        this.motor_primeira_coluna = motor_primeira_coluna;
        this.motor_segunda_coluna = motor_segunda_coluna;
        this.colunaA = colunaA;
        this.colunaB = colunaB;
        this.existeColsAnt = true;
    }

    public int getColunaA() {
        return colunaA;
    }

    public void setColunaA(int colunaA) {
        this.colunaA = colunaA;
    }

    public int getColunaB() {
        return colunaB;
    }

    public void setColunaB(int colunaB) {
        this.colunaB = colunaB;
    }

    public boolean isExisteColsAnt() {
        return existeColsAnt;
    }

    public void setExisteColsAnt(boolean existeColsAnt) {
        this.existeColsAnt = existeColsAnt;
    }


    public void setMotor_primeira_coluna(int motor_primeira_coluna) {
        this.motor_primeira_coluna = motor_primeira_coluna;
    }

    public int getMotor_segunda_coluna() {
        return motor_segunda_coluna;
    }

    public void setMotor_segunda_coluna(int motor_segunda_coluna) {
        this.motor_segunda_coluna = motor_segunda_coluna;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final caracter other = (caracter) obj;
        if (this.motor_primeira_coluna != other.motor_primeira_coluna) {
            return false;
        }
        if (this.motor_segunda_coluna != other.motor_segunda_coluna) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + this.motor_primeira_coluna;
        hash = 67 * hash + this.motor_segunda_coluna;
        return hash;
    }

    @Override
    public String toString() {
        return "caracter{" + "motor_primeira_coluna=" + motor_primeira_coluna + "motor_segunda_coluna=" + motor_segunda_coluna + "colunaA=" + colunaA + "colunaB=" + colunaB + "existeColsAnt=" + existeColsAnt + '}';
    }

 


}
