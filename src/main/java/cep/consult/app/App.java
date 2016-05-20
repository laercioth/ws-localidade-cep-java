package cep.consult.app;

import cep.consult.entitiesJson.CepJson;
import cep.consult.entitiesXml.CepXml;
import cep.consult.factory.ServiceFactory;

/**
 * Classe teste, simulando a aplicacao,classe, metodo que poderia estar invocando o servico
 */
public class App {

	public static void main(String[] args) {
		/**
		 * Cep a ser buscado
		 */
		String nrCep = "38407481";
		
		/**
		 * Chamadas dos ws em xml e json
		 */
		CepXml cepXml = ServiceFactory.consultarGet("http://api.postmon.com.br/v1/cep/"+nrCep+"?format=xml", CepXml.class);
		CepJson cepJson = ServiceFactory.consultarGet("http://api.postmon.com.br/v1/cep/"+nrCep+"?format=json", CepJson.class);
		
		System.out.printf("%-30s %-30s %-30s\n\n","Propriedades do objeto", "Retorno em XML", "Retorno em JSON");
		System.out.printf("%-30s %-30s %-30s\n","Cep", cepXml.getCep(), cepJson.getCep());
		System.out.printf("%-30s %-30s %-30s\n", "Logradouro", cepXml.getLogradouro(), cepJson.getLogradouro());
		System.out.printf("%-30s %-30s %-30s\n", "Bairro", cepXml.getBairro(), cepJson.getBairro());
		System.out.printf("%-30s %-30s %-30s\n", "Cidade", cepXml.getCidade(), cepJson.getCidade());
		System.out.printf("%-30s %-30s %-30s\n", "UF", cepXml.getEstado(), cepJson.getEstado());
		System.out.printf("%-30s %-30s %-30s\n", "Nome do estado", cepXml.getEstadoInfo().getNome(), cepJson.getEstado_info().getNome());
		System.out.printf("%-30s %-30s %-30s\n", "Área em km² da cidade", cepXml.getCidadeInfo().getAreaKm2(), cepJson.getCidade_info().getArea_km2());
	}
}
