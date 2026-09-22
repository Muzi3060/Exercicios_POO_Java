package Poo_Exercicios_Polimorfismo.Exercicios001.Exercicios007;

import com.google.gson.Gson;

public class Json {

    public String exportar(Object dados) {
            Gson gson = new Gson();

            String json = gson.toJson(dados);
            return json;
        }
    }

