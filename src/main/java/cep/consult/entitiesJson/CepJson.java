package cep.consult.entitiesJson;


public class CepJson {

	private String bairro;
	private String cidade;
	private String logradouro;
	private EstadoInfoJson estado_info;
	private String cep;
	private CidadeInfoJson cidade_info;
	private String estado;

	/**
	 * 
	 * @return The bairro
	 */
	public String getBairro() {
		return bairro;
	}

	/**
	 * 
	 * @param bairro
	 *            The bairro
	 */
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	/**
	 * 
	 * @return The cidade
	 */
	public String getCidade() {
		return cidade;
	}

	/**
	 * 
	 * @param cidade
	 *            The cidade
	 */
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	/**
	 * 
	 * @return The logradouro
	 */
	public String getLogradouro() {
		return logradouro;
	}

	/**
	 * 
	 * @param logradouro
	 *            The logradouro
	 */
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	/**
	 * 
	 * @return The estado_info
	 */
	public EstadoInfoJson getEstado_info() {
		return estado_info;
	}

	/**
	 * 
	 * @param estado_info
	 *            The estado_info
	 */
	public void setEstado_info(EstadoInfoJson estado_info) {
		this.estado_info = estado_info;
	}

	/**
	 * 
	 * @return The cep
	 */
	public String getCep() {
		return cep;
	}

	/**
	 * 
	 * @param cep
	 *            The cep
	 */
	public void setCep(String cep) {
		this.cep = cep;
	}

	/**
	 * 
	 * @return The cidade_info
	 */
	public CidadeInfoJson getCidade_info() {
		return cidade_info;
	}

	/**
	 * 
	 * @param cidade_info
	 *            The cidade_info
	 */
	public void setCidade_info(CidadeInfoJson cidade_info) {
		this.cidade_info = cidade_info;
	}

	/**
	 * 
	 * @return The estado
	 */
	public String getEstado() {
		return estado;
	}

	/**
	 * 
	 * @param estado
	 *            The estado
	 */
	public void setEstado(String estado) {
		this.estado = estado;
	}


}