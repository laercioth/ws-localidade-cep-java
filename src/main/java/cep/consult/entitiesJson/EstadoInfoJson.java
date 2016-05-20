package cep.consult.entitiesJson;

import java.util.HashMap;
import java.util.Map;

public class EstadoInfoJson {

	private String area_km2;
	private String codigo_ibge;
	private String nome;
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The area_km2
	 */
	public String getArea_km2() {
		return area_km2;
	}

	/**
	 * 
	 * @param area_km2
	 *            The area_km2
	 */
	public void setArea_km2(String area_km2) {
		this.area_km2 = area_km2;
	}

	/**
	 * 
	 * @return The codigo_ibge
	 */
	public String getCodigo_ibge() {
		return codigo_ibge;
	}

	/**
	 * 
	 * @param codigo_ibge
	 *            The codigo_ibge
	 */
	public void setCodigo_ibge(String codigo_ibge) {
		this.codigo_ibge = codigo_ibge;
	}

	/**
	 * 
	 * @return The nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * 
	 * @param nome
	 *            The nome
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

}