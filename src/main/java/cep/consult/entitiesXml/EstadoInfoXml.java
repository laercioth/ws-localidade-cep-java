package cep.consult.entitiesXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EstadoInfoXml {
	
	private String areaKm2;
	
	private String codigoIbge;
	
	private String nome;

	@XmlElement(name="area_km2")
	public String getAreaKm2() {
		return areaKm2;
	}

	public void setAreaKm2(String areaKm2) {
		this.areaKm2 = areaKm2;
	}

	@XmlElement(name="codigo_ibge")
	public String getCodigoIbge() {
		return codigoIbge;
	}

	public void setCodigoIbge(String codigoIbge) {
		this.codigoIbge = codigoIbge;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
