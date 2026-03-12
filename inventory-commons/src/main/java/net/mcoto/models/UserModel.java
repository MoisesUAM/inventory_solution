package net.mcoto.models;

import java.util.List;
import java.util.UUID;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import net.mcoto.enums.RolesEnum;

@Data
@Getter
@Setter
public class UserModel {
	
	private UUID id;
	private String userName;
	private String firstName;
	private String lastName;
	private String password;
	private Boolean isActive;
	private List<RolesEnum> roles;
	

}
