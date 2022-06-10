package com.hrio.springboot.configprop.prpoperties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * 属性配置类
 *
 * @author Hrio
 * @date 2022/05/14
 */
@Data
@ConfigurationProperties(prefix = "music")
@Component
public class MusicProperties {
    /**
     * 专辑名
     */
    private String collectName;

    /**
     * 歌曲
     */
    private List<Song> songs;

    @Data
    public static class Song {
        private String name;

        private String description;
    }
}
