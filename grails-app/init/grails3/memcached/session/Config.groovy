package grails3.memcached.session

import org.apache.catalina.Context
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import de.javakaffee.web.msm.MemcachedBackupSessionManager

@Configuration
public class Config {

    @Bean
    public EmbeddedServletContainerFactory tomcat() {
        return new TomcatEmbeddedServletContainerFactory() {

            @Override
            protected void postProcessContext(Context context) {
                MemcachedBackupSessionManager manager = new MemcachedBackupSessionManager()
                manager.setMemcachedNodes("n1:localhost:11211")
                context.setManager(manager)
            }

        }
    }
}
