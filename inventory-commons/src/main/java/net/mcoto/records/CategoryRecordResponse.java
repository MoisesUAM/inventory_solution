package net.mcoto.records;

import java.io.Serializable;
import java.util.UUID;

public record CategoryRecordResponse(UUID idCategory, String categoryName) implements Serializable {

}
