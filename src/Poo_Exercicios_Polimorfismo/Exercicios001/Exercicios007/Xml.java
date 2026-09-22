package Poo_Exercicios_Polimorfismo.Exercicios001.Exercicios007;

import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class Xml {

    public String exportar(Object dados) {

        try {
            // Instancia o mapeador de XML do Jacson
            XmlMapper xmlMapper = new XmlMapper();

            // Converte qualquer objeto dirtamente para String XML
            return xmlMapper.writeValueAsString(dados);

        } catch (Exception e) {
            // O Jacson pode lançar exceções de E/S ao processar
            throw new RuntimeException("Erro ao converter objeto para XML: ", e);
        }
    }


}
