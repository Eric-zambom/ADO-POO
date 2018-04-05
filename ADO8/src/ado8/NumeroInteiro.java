package ado8;

public class NumeroInteiro {  
    
    private int x;
    private int som = 0;
    private int sub = 0;
    private int mult = 0;
    private int div = 0;
    
    public NumeroInteiro(int x) {
        this.x = x;
    }
    
    public void soma(int y) {
        try {
            som = x + y;
            System.out.println("A soma resulta em: " + som);
        } catch (NumberFormatException e) {
            System.out.println("ERRO: Insira um int");
        }
    }
    
    public void subtracao(int y) {
        try {
            sub = x - y;
            System.out.println("A subtração resulta em: " + sub); 
        } catch (NumberFormatException e) {
            System.out.println("ERRO: Insira um int");
        }
    }
    
    public void multiplicacao(int y) {
        try {
            mult = x * y;
            System.out.println("A multiplicação resulta em: " + mult);
        } catch (NumberFormatException e) {
            System.out.println("ERRO: Insira um int");
        } 
    }
    
    public void divisao(int y) {
        try {
            div = x / y;
            System.out.println("A divisao resulta em: " + div);
        } catch (ArithmeticException e) {
            System.out.println("ERRO: Impossível dividir por zero");
        } catch (NumberFormatException e) {
            System.out.println("ERRO: Insira um int");
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getSom() {
        return som;
    }

    public int getSub() {
        return sub;
    }

    public int getMult() {
        return mult;
    }

    public int getDiv() {
        return div;
    }
    
    
    
}

//extends Exception não usa aqui, só usa em caso de criação de uma nova exceção
