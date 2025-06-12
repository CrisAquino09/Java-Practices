package Conversor;

public enum TipoMoneda implements Conversor{
    DOLAR{
        public double convertir(double cantidad){
                return cantidad / 19.31;
        }
    },

    EURO{
        public double convertir(double cantidad) {
            return cantidad / 21.77;
        }
    },
    YEN{
        public double convertir(double cantidad) {
            return cantidad / 0.13;
        }
    };

}
