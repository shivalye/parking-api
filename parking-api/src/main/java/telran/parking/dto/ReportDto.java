package telran.parking.dto;

import java.time.LocalDateTime;

public record ReportDto(long carNumber,long cameraId,String cameraAdress,LocalDateTime timeStamp,long ownerId,String ownerEnail,double adressFinePrice,FineStatus fineStatus,String ownerFirstName,String ownerLastName) {


}
