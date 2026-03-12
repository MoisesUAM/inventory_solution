package net.mcoto.records;

import java.io.Serializable;
import java.util.UUID;

public record UserRecordResponse(UUID id, String userName, String firstName) implements Serializable{

}
