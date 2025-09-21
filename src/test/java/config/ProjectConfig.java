package config;

import org.aeonbits.owner.Config;
import org.aeonbits.owner.ConfigFactory;

@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "classpath:project.properties"
})
public interface ProjectConfig extends Config {

    ProjectConfig projectConfig = ConfigFactory.create(ProjectConfig.class);

    @Key("base.url")
    String baseUrl();

    @Key("browser")
    String browser();

    @Key("page.loadS.strategy")
    String pageLoadStrategy();

    @Key("timeout")
    long timeout();

    @Key("remote.url")
    String remoteUrl();

    @Key("enable.vnc")
    boolean enableVnc();

    @Key("enable.video")
    boolean enableVideo();

    @Key("demoqa.url")
    String demoqaUrl();
}
