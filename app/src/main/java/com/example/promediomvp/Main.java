package com.example.promediomvp;

public interface Main {
    public interface Vista{
        public void MostrarResultado(String r);
    }

    public interface Presentador{
        public void MostrarResultado(String r);
        public void CalcularResultado(Double n1, Double n2, Double n3);
    }

    public interface Model{
        public void CalcularResultado(Double n1, Double n2, Double n3);
    }
}
