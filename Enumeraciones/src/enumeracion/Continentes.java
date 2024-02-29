package enumeracion;

public enum Continentes {
	
	AMERICA(34),
	AFRICA(53),
	ASIA(44),
	EUROPA(46),
	OCEANIA(14);
	
	private final int paises;
	
	Continentes(int paises){
		this.paises = paises;
	}
	
	public int getPaises() {
		return this.paises;
	}

}
