
public class ClasseCaminhoes extends ClasseAutomotores{
	float cargaSuportadaAt;
	
	//super
	public ClasseCaminhoes(String corPar, String marcaPar, String modeloPar, String tipoPar, int cargaSuportadaPar) {
		super(corPar, marcaPar, modeloPar, tipoPar);
		
		
		this.cargaSuportadaAt = cargaSuportadaPar;
	}

}
