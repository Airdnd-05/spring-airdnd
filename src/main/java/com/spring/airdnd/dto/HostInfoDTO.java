package com.spring.airdnd.dto;

import com.spring.airdnd.entity.Host;
import com.spring.airdnd.entity.User;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import java.time.LocalDate;

@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class HostInfoDTO {
    private int hostExperience;
    private boolean hostIsSuper;
    private float hostRate;
    private int hostResponseRate;
    private int hostResponseTime;
    private int hostReviewCount;
    private Integer hostStartingYear;
    private Long hostId;
    private User userId;
    private String hostDescription;
    private String hostLanguage;
    private String hostLocation;
    private String hostUrl;

    public static HostInfoDTO from(Host host){
        return new HostInfoDTO(
                host.getHostExperience(),
                host.getHostIsSuper(),
                host.getHostRate(),
                host.getHostResponseRate(),
                host.getHostResponseTime(),
                host.getHostReviewCount(),
                host.getHostStartingYear(),
                host.getHostId(),
                host.getUser(),
                host.getHostDescription(),
                host.getHostLanguage(),
                host.getHostLocation(),
                host.getHostUrl()
        );
    }
}
