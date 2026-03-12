package net.mcoto.records;

import java.util.List;
import java.util.UUID;

import net.mcoto.enums.RolesEnum;

public record UserRecordRequest(
		UUID id,
		String userName,
		String firstName,
		String lastName,
		String password,
		Boolean isActive,
		List<RolesEnum> roles
		) {

}
