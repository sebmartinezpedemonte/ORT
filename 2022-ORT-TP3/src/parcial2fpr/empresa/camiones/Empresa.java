package parcial2fpr.empresa.camiones;

import java.util.ArrayList;

public class Empresa {
	private String nombre;
	private ArrayList<Paquete> paquetesListosParaSerCargados;
	private ArrayList<Camion> camiones;
	private ArrayList<Provincia> provincias;
	private ArrayList<Pendiente> registros;

	public Empresa(String nombre) {
		this.nombre = nombre;
		paquetesListosParaSerCargados = new ArrayList<>();
		camiones = new ArrayList<>();
		provincias = new ArrayList<>();
		registros = new ArrayList<>();
	}

	public void cargarPaquetes() {
		Paquete paqueteRemover = null;
		for (Camion camion : camiones) {
			for (int i = 0; i < paquetesListosParaSerCargados.size(); i++) {
				if (!camion.hayCapacidad(paquetesListosParaSerCargados.get(i).getPeso())) {
					paqueteRemover = paquetesListosParaSerCargados.remove(i);
					Pendiente pendienteAgregar = new Pendiente(Motivo.NO_HAY_LUGAR_EN_EL_CAMION, paqueteRemover);
					registros.add(pendienteAgregar);
					System.out.println("Se ha agregado al registro " + pendienteAgregar);
				} else if (camion.getProvinciaAsignada().getNombreProvincia() == null) {
					paqueteRemover = paquetesListosParaSerCargados.remove(i);
					Pendiente pendienteAgregar = new Pendiente(Motivo.NO_HAY_CAMION_ASIGNADO, paqueteRemover);
					registros.add(pendienteAgregar);
					System.out.println("Se ha agregado al registro " + pendienteAgregar);
				}
			}
		}
	}
	//Por alguna razon este anda mal...
	public void cargarPaquetesBis() {	
		for (Camion camion : camiones) {
			for (Paquete paquete : paquetesListosParaSerCargados) {
				if (!camion.hayCapacidad(paquete.getPeso())) {					
					Pendiente pendienteAgregar = new Pendiente(Motivo.NO_HAY_LUGAR_EN_EL_CAMION, paquete);
					registros.add(pendienteAgregar);
					System.out.println("Se ha agregado al registro " + pendienteAgregar);
					//paquetesListosParaSerCargados.remove(paquete);
				} else if (camion.getProvinciaAsignada().getNombreProvincia() == null) {					
					Pendiente pendienteAgregar = new Pendiente(Motivo.NO_HAY_CAMION_ASIGNADO, paquete);
					registros.add(pendienteAgregar);
					System.out.println("Se ha agregado al registro " + pendienteAgregar);
					//paquetesListosParaSerCargados.remove(remover);
				}				
				
			}

		}
	}

	public void reincorporarPaquetes() {
		for (Pendiente pendiente : registros) {
			Paquete paqueteReincorporar = pendiente.getPaquetePendiente();
			if (pendiente.getMotivo() == Motivo.NO_HAY_LUGAR_EN_EL_CAMION) {
				paquetesListosParaSerCargados.add(paqueteReincorporar);
				// paquetesListosParaSerCargados.add(pendiente.getPaquetePendiente());
				System.out.println("Se reincorporo el paquete " + paqueteReincorporar);
			}
		}
	}

	public void agregarTodo(Paquete paquete, Camion camion, Provincia provincia) {
		paquetesListosParaSerCargados.add(paquete);
		camiones.add(camion);
		provincias.add(provincia);
		// private ArrayList<Pendiente> registros;
	}

	@Override
	public String toString() {
		return "Empresa [nombre=" + nombre + ", paquetesListosParaSerCargados=" + paquetesListosParaSerCargados
				+ ", camiones=" + camiones + ", provincias=" + provincias + ", registros=" + registros + "]";
	}

}
