package cep.consult.entitiesXml;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder={"cep", "logradouro", "bairro","cidade", "estado", "estadoInfo", "cidadeInfo"})
public class CepXml {

	private String cep;

	private String logradouro;

	private String bairro;
	
	private String cidade;

	private String estado;

	private EstadoInfoXml estadoInfo;
	
	private CidadeInfoXml cidadeInfo;
	
	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@XmlElement(name="estado_info")
	public EstadoInfoXml getEstadoInfo() {
		return estadoInfo;
	}

	public void setEstadoInfo(EstadoInfoXml estadoInfo) {
		this.estadoInfo = estadoInfo;
	}

	public CidadeInfoXml getCidadeInfo() {
		return cidadeInfo;
	}
	
	@XmlElement(name="cidade_info")
	public void setCidadeInfo(CidadeInfoXml cidadeInfo) {
		this.cidadeInfo = cidadeInfo;
	}
}