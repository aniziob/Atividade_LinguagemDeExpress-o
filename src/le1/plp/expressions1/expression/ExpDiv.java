package le1.plp.expressions1.expression;

import le1.plp.expressions1.util.Tipo;
import le1.plp.expressions1.util.TipoPrimitivo;
import le1.plp.expressions2.memory.AmbienteCompilacao;
import le1.plp.expressions2.memory.AmbienteExecucao;

public class ExpDiv extends ExpBinaria {

	public ExpDiv(Expressao esq, Expressao dir) {
		super(esq, dir, "/");
	}
		// TODO Auto-generated constructor stub
	

	public Valor avaliar(AmbienteExecucao amb) {
		return new ValorInteiro(
			((ValorInteiro) getEsq().avaliar(amb)).valor() /
			((ValorInteiro) getDir().avaliar(amb)).valor() );
	}

	protected boolean checaTipoElementoTerminal(AmbienteCompilacao amb) {
		return (getEsq().getTipo(amb).eInteiro() && getDir().getTipo(amb).eInteiro());
	}

	
	public Tipo getTipo(AmbienteCompilacao amb) {
		return TipoPrimitivo.INTEIRO;
	}

}