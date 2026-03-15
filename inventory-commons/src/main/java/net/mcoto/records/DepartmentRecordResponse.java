package net.mcoto.records;

import java.io.Serializable;
import java.util.UUID;

public record DepartmentRecordResponse(UUID idDepartment, String departementName) implements Serializable {

}
