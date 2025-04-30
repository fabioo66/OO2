package ar.edu.unlp.objetos.dos.ejercicio14;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler extends Prenda{
	private LocalDate comienzoContrato;
	private LocalDate finContrato;
	private double costoMensual;
	
	public Alquiler(LocalDate comienzoContrato, LocalDate finContrato, double costoMensual) {
		super(0.9);
		this.comienzoContrato = comienzoContrato;
		this.finContrato = finContrato;
		this.costoMensual = costoMensual;
	}

	@Override
	public double calcularValor() {
        long mesesRestantes = ChronoUnit.MONTHS.between(LocalDate.now().withDayOfMonth(1), this.finContrato.withDayOfMonth(1));
        mesesRestantes = Math.max(mesesRestantes, 0);
        return mesesRestantes * this.costoMensual;
	}
}
