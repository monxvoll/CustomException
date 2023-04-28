public class Carro {
    private int numberOfWheels = 0;

    public Carro(int numberOfWheels) throws MyExeption {
        if (numberOfWheels != 4) {
            throw new MyExeption(numberOfWheels+" no es un numero de ruedas posibles para un auto");
        }

        this.numberOfWheels = numberOfWheels;
    }
}
