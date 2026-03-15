package net.mcoto.models;

import java.util.UUID;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class ProductModel {

	private UUID idDepartment;
	private UUID idCategory;
	private UUID idItem;
	private String departmentName;
	private String categoryName;
	private String description;
	private Double costumerPrice;
	private Boolean isMaster;
	private String size;
	private String color;
	private String style;
}
