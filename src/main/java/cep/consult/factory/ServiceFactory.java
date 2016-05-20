package cep.consult.factory;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;

public class ServiceFactory {
	
	private static final Long STATUS_OK = 200L;
	
	/**
	 * Responsavel por criar um pool de conexao com a url do WS
	 * @param url
	 * @param classeResposta
	 * @return
	 */
	public static <E> E consultarGet(String url, Class<E> classeResposta) {
		Client client = Client.create();
		WebResource resource = client.resource(url);
		return acessarGet(classeResposta, resource);
	}
	/**
	 * Responsavel por receber o WS e fazer a conversao da classe de resposta
	 * @param classeResposta
	 * @param resource
	 * @return
	 */
	private static <E> E acessarGet(Class<E> classeResposta, WebResource resource) {
		ClientResponse response = resource.type(MediaType.APPLICATION_XML).get(ClientResponse.class);
		if (response.getStatus() == STATUS_OK) {
			return response.getEntity(classeResposta);
		} else {
			throw new RuntimeException("HTTP fatal error : " + response.getStatus() + "\n" + response.getEntity(String.class));
		}
	}

}