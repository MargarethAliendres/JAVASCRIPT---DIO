package variaveis;


public class Carro {
    public static void main(String[] args) {
    }
        String cor;
        String modelo;
        double capacidadeTanque;

    public Carro() {
        }

        public String getCor () {
            return cor;
        }

        public String getModelo () {
            return modelo;
        }

        public double getCapacidadeTanque () {
            return capacidadeTanque;
        }

        public void setCor(String cor){
            this.cor = cor;
        }

        public void setModelo (String modelo){
            this.modelo = modelo;
        }

        public void setCapacidadeTanque ( double capacidadeTanque){
            this.capacidadeTanque = capacidadeTanque;
        }

        /* metodo do negocio */

        double totalValorTanque ( double valorCombustivel){
            return capacidadeTanque * valorCombustivel;
        }

    }









