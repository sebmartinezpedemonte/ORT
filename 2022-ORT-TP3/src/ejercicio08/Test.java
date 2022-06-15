package ejercicio08;

public class Test {
	public static void main(String[] args) {
		AgendaMedica agenda = new AgendaMedica(4);
		
		agenda.registrarTurno("123456789", "Sebastian", "Martinez", "1553145903");
		//agenda.registrarTurno("123456789", "Sebastian", "Martinez", "1553145903");
		//agenda.registrarTurno("123456789", "Sebastian", "Martinez", "1553145903");
		agenda.registrarTurno("200000000", "Carlos", "Perez", "1553145903");
		agenda.registrarTurno("300000000", "Maria", "Gomez", "1553145903");
		agenda.registrarTurno("400000000", "Esteban", "Reina", "1553145903");
		agenda.registrarTurno("500000000", "Florencia", "Pedemonte", "1553145903");
		
		
		agenda.darPresente("123456789");
		agenda.darPresente("200000000");
		agenda.listarTurnosAsignados();
		agenda.anularTurno("123456789");
		agenda.anularTurno("300000000");
		agenda.listarTurnosAsignados();
		agenda.registrarTurno("500000000", "Florencia", "Pedemonte", "1553145903");
		agenda.registrarTurno("400000000", "Esteban", "Reina", "1553145903");
		agenda.registrarTurno("123456789", "Sebastian", "Martinez", "1553145903");
		agenda.darPresente("123456789");
		agenda.obtenerAusentes();
		
	}
}
