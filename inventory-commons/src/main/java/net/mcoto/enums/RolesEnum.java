package net.mcoto.enums;

public enum RolesEnum {
	// 1. Definición de las constantes con sus valores
	ADMIN(1, "Administrador"), 
	CLIENT(2, "Cliente"), 
	EMPLOYEE(3, "Empleado"), 
	MANAGER(4, "Gerente"),
	SUPERVISOR(5, "Supervisor");

	// 2. Atributos finales (inmutables)
	private final int id;
	private final String descripcion;

	// 3. Constructor privado (obligatorio para Enums)
	private RolesEnum(int id, String descripcion) {
		this.id = id;
		this.descripcion = descripcion;
	}

	// 4. Métodos Getter
	public int getId() {
		return id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	// 5. Método de búsqueda inversa (Útil para la API)
	public static RolesEnum fromId(int id) {
		for (RolesEnum role : RolesEnum.values()) {
			if (role.id == id) {
				return role;
			}
		}
		throw new IllegalArgumentException("ID de Rol no válido: " + id);
	}
}
